package loanservice;

import org.apache.beehive.controls.system.jdbc.JdbcControl;
import org.apache.beehive.controls.api.bean.ControlExtension;

@ControlExtension
@JdbcControl.ConnectionDataSource(jndiName = "JNDI-Loan")
public interface LoanControl extends JdbcControl {

	static final long serialVersionUID = 1L;
	/*
	 * An sql statement to query the Loandb database.
	 */
	@JdbcControl.SQL(statement="SELECT * FROM loandetails WHERE MINLoan = {minLoan} AND Period = {period}")
	/*
	 * A database Control method to return an array of Loan objects.
	 */
	public Loan [] findLoan(int minLoan, int period);
}