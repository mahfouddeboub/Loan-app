package loanservice;

import javax.jws.*;

import org.apache.beehive.controls.api.bean.Control;
import ratingservice.CreditRatingServiceControl;

@WebService
public class CompareLoanWS {

/*
 * A database control to query the database.
 */
@Control
	private LoanControl loanControl;

/* A Service control to be used to communicate
 * with the CreditRating Web Service.
 */
@Control
    private CreditRatingServiceControl creditRatingServiceControl;

/* 
 * A Web Service method to return a list of best loan quotes.
 */
@WebMethod
	public Loan[] requestLoan(int minLoan, int period) {
	
	    return loanControl.findLoan(minLoan, period);
	   
	}

/*
 * A Web Service method to return the credit rating.
 */
@WebMethod
    public String checkCreditRating(boolean emp, int salary, int ni) {
	
	     return creditRatingServiceControl.creditResult(emp, salary, ni) ;
    }
}