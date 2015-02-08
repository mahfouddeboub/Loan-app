package ratingservice;
/*
 * A class to calculate the  
 * credit rating of an applicant.
 */
public class CalcCreditRating {
/*
 * Member variables.
 */	
	public boolean emp;
	public int salary;
	
	public CalcCreditRating(boolean emp, int salary){
		emp = this.emp;
		salary = this.salary;
	}
/*
 * A method to calculate the credit rating.
 */
	public int getRating(boolean app_emp, int app_salary){
		int rating = 0;
		if(app_emp = false)
			rating = 0;
		if(app_salary >= 20000)
			rating = 1;
		if(app_salary >= 30000)
			rating = 2;
		if(app_salary < 20000)
			rating = 0;
		return rating;
	}
}