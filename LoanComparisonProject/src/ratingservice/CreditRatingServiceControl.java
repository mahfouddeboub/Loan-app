package ratingservice;
import com.bea.control.ServiceControl;

import org.apache.beehive.controls.api.events.EventSet;
import org.apache.beehive.controls.api.bean.ControlExtension;

@ServiceControl.Location(urls = {"http://localhost:7001/LoanComparisonProject/CreditRating"})
@ServiceControl.HttpSoapProtocol
@ServiceControl.SOAPBinding(style = ServiceControl.SOAPBinding.Style.DOCUMENT, use = ServiceControl.SOAPBinding.Use.LITERAL, parameterStyle = ServiceControl.SOAPBinding.ParameterStyle.WRAPPED)
@ServiceControl.WSDL(resourcePath = "ratingservice/CreditRatingService.wsdl", service = "CreditRatingService")
@ControlExtension
public interface CreditRatingServiceControl extends ServiceControl
{
    static final long serialVersionUID = 1L;

    public java.lang.String creditResult(boolean emp_arg,int salary_arg,int ni_arg);

   /** This event set interface provides support for the onAsyncFailure event.
    */
   @EventSet(unicast=true)
   public interface Callback extends ServiceControl.Callback {};
}