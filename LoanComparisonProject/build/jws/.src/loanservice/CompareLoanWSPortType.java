package loanservice;

/**
 * Generated interface, please do not edit.
 * Date: [Tue May 01 13:33:02 BST 2012]
 */

public interface CompareLoanWSPortType extends java.rmi.Remote {

  /**
   * Web Method: checkCreditRating ...
   */
  java.lang.String checkCreditRating(boolean emp,int salary,int ni)
      throws java.rmi.RemoteException;
  /**
   * Web Method: requestLoan ...
   */
  loanservice.Loan[] requestLoan(int minLoan,int period)
      throws java.rmi.RemoteException;
}
