package ratingservice;

import org.apache.beehive.controls.system.jdbc.JdbcControl;
import org.apache.beehive.controls.api.bean.ControlExtension;
@ControlExtension
@JdbcControl.ConnectionDataSource(jndiName = "JNDIBankruptcy")
public interface BankruptcyControl extends JdbcControl {

	static final long serialVersionUID = 1L;
	/*
	 * An sql statement to query the Loandb database.
	 */	
	@JdbcControl.SQL(statement="SELECT LastName FROM bankruptcytb WHERE NI = {ni}")
	/*
	 * A database Control method to return an array of Loan objects.
	 */
	public String findApplicant(int ni);
}