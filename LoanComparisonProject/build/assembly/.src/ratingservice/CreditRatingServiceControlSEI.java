package ratingservice;

public interface CreditRatingServiceControlSEI extends java.rmi.Remote
{

    public java.lang.String creditResult(boolean emp,int salary,int ni) throws java.rmi.RemoteException;

}