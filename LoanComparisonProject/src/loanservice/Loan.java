package loanservice;
/*
 * A class to hold loan 
 * details returned from the Loandb database.
 */
public class Loan {
/*
 * Member variables.
 */
	public int loanId;
	public int maxLoan;
	public int minLoan;
	public int period;
	public int apr;
	public String bank;
	public Loan(int loanId, int maxLoan, int minLoan, int period, int apr, String bank) {
		this.loanId = loanId;
		this.maxLoan = maxLoan;
		this.minLoan = minLoan;
		this.period = period;
		this.apr = apr;
		this.bank = bank;
	}
	public Loan(){}
}
	
