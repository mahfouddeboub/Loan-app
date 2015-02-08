package loanservice.clientPageFlow;

import javax.servlet.http.HttpSession;
import org.apache.beehive.netui.pageflow.PageFlowController;
import org.apache.beehive.netui.pageflow.annotations.Jpf;
import org.apache.beehive.controls.api.bean.Control;
import loanservice.CompareLoanWSServiceControl;
import org.apache.beehive.netui.pageflow.Forward;

@Jpf.Controller(simpleActions = { @Jpf.SimpleAction(name = "begin", path = "index.jsp") })
public class ClientPageFlowController extends PageFlowController {
	private static final long serialVersionUID = 1L;
	@Control
	private CompareLoanWSServiceControl compareLoanWSServiceControl;

	@Jpf.Action(forwards = { @Jpf.Forward(name = "success", path = "loandetails.jsp", actionOutputs = { @Jpf.ActionOutput(name = "requestLoanResult", type = loanservice.Loan[].class) }) })
	public Forward requestLoan(RequestLoanFormBean form) {
		Forward forward = new Forward("success");
		int minLoan_arg = form.getMinLoan_arg();
		int period_arg = form.getPeriod_arg();
		loanservice.Loan[] requestLoanResult = compareLoanWSServiceControl
				.requestLoan(minLoan_arg, period_arg);
		forward.addActionOutput("requestLoanResult", requestLoanResult);
		return forward;
	}

	/**
	 * @param form
	 * @return
	 */
	@Jpf.Action(forwards = { @Jpf.Forward(name = "success", path = "bankruptcypage.jsp", actionOutputs = { @Jpf.ActionOutput(name = "checkCreditRatingResult", type = java.lang.String.class) }) })
	public Forward checkCreditRating(CheckCreditRatingFormBean form) {
		Forward forward = new Forward("success");
		boolean emp_arg = form.isEmp_arg();
		int salary_arg = form.getSalary_arg();
		int ni_arg = form.getNi_arg();
		java.lang.String checkCreditRatingResult = compareLoanWSServiceControl
				.checkCreditRating(emp_arg, salary_arg, ni_arg);
		forward.addActionOutput("checkCreditRatingResult", checkCreditRatingResult);
		return forward;
	}

	/**
	 * Callback that is invoked when this controller instance is created.
	 */
	@Override
	protected void onCreate() {
	}

	/**
	 * Callback that is invoked when this controller instance is destroyed.
	 */
	@Override
	protected void onDestroy(HttpSession session) {
	}

	@Jpf.FormBean
	public static class RequestLoanFormBean implements java.io.Serializable {
		private static final long serialVersionUID = 1L;
	
		private int period_arg;
		private int minLoan_arg;
	
		public RequestLoanFormBean() {
		}
	
		public int getPeriod_arg() {
			return period_arg;
		}
	
		public void setPeriod_arg(int period_arg) {
			this.period_arg = period_arg;
		}
	
		public int getMinLoan_arg() {
			return minLoan_arg;
		}
	
		public void setMinLoan_arg(int minLoan_arg) {
			this.minLoan_arg = minLoan_arg;
		}
	}

	@Jpf.FormBean
	public static class CheckCreditRatingFormBean implements java.io.Serializable {
		private static final long serialVersionUID = 1L;
	
		private int salary_arg;
		private int ni_arg;
		private boolean emp_arg;
	
		public CheckCreditRatingFormBean() {
		}
	
		public int getSalary_arg() {
			return salary_arg;
		}
	
		public void setSalary_arg(int salary_arg) {
			this.salary_arg = salary_arg;
		}
	
		public int getNi_arg() {
			return ni_arg;
		}
	
		public void setNi_arg(int ni_arg) {
			this.ni_arg = ni_arg;
		}
	
		public boolean isEmp_arg() {
			return emp_arg;
		}
	
		public void setEmp_arg(boolean emp_arg) {
			this.emp_arg = emp_arg;
		}
	}
}