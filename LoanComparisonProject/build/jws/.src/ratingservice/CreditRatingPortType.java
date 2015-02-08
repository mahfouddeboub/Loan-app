package ratingservice;

/**
 * Generated interface, please do not edit.
 * Date: [Tue May 01 13:33:02 BST 2012]
 */

public interface CreditRatingPortType extends java.rmi.Remote {

  /**
   * Web Method: creditResult ...
   */
  java.lang.String creditResult(boolean emp,int salary,int ni)
      throws java.rmi.RemoteException;
}
