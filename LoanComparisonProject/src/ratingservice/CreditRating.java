package ratingservice;

import javax.jws.*;
import org.apache.beehive.controls.api.bean.Control;

@WebService
public class CreditRating {
/*
* A database control to query the database.
*/
@Control
	private BankruptcyControl bankruptcyControl;
/* 
 * A Web Service method to return a credit rating of an applicant.
 */
@WebMethod
	public String creditResult(boolean emp, int salary, int ni) {
		String creditRating = "";
        if((emp ==true || emp ==false) && (salary > 0) && (ni > 0)){
		     if(bankruptcyControl.findApplicant(ni) != null)
			      creditRating = "bad";
		     else {
		          CalcCreditRating c_rating = new CalcCreditRating(emp, salary);
		          int result = c_rating.getRating(emp, salary);
		          if(result == 0)
			          creditRating = "bad";
	              if(result == 1)
			          creditRating = "good";
		          if(result == 2)
			          creditRating = "verygood";
		     }
        }
        else
        	creditRating = "invalid input";
		return creditRating;
	}
}