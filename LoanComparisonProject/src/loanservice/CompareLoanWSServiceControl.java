package loanservice;
import com.bea.control.ServiceControl;

import org.apache.beehive.controls.api.events.EventSet;
import org.apache.beehive.controls.api.bean.ControlExtension;

@ServiceControl.Location(urls = {"http://localhost:7001/LoanComparisonProject/CompareLoanWS"})
@ServiceControl.HttpSoapProtocol
@ServiceControl.SOAPBinding(style = ServiceControl.SOAPBinding.Style.DOCUMENT, use = ServiceControl.SOAPBinding.Use.LITERAL, parameterStyle = ServiceControl.SOAPBinding.ParameterStyle.WRAPPED)
@ServiceControl.WSDL(resourcePath = "loanservice/CompareLoanWSService.wsdl", service = "CompareLoanWSService")
@ControlExtension
public interface CompareLoanWSServiceControl extends ServiceControl
{
    static final long serialVersionUID = 1L;

    public java.lang.String checkCreditRating(boolean emp_arg,int salary_arg,int ni_arg);

    public loanservice.Loan[] requestLoan(int minLoan_arg,int period_arg);

   /** This event set interface provides support for the onAsyncFailure event.
    */
   @EventSet(unicast=true)
   public interface Callback extends ServiceControl.Callback {};
}