
package loanservice;

import java.lang.reflect.Field;
import org.apache.beehive.controls.api.ControlException;
import org.apache.beehive.controls.api.bean.Controls;
import org.apache.beehive.controls.api.versioning.VersionRequired;
import org.apache.beehive.controls.api.context.ControlBeanContext;
import org.apache.beehive.controls.runtime.bean.EventAdaptor;
import org.apache.beehive.controls.runtime.bean.AdaptorPersistenceDelegate;

@SuppressWarnings("all")
public class CompareLoanWSClientInitializer
extends org.apache.beehive.controls.runtime.bean.ClientInitializer
{
    static final Field _creditRatingServiceControlField;
    static final Field _loanControlField;
    static
    {
        try
        {
            _creditRatingServiceControlField = loanservice.CompareLoanWS.class.getDeclaredField("creditRatingServiceControl");
            _creditRatingServiceControlField.setAccessible(true);
            _loanControlField = loanservice.CompareLoanWS.class.getDeclaredField("loanControl");
            _loanControlField.setAccessible(true);
        }
        catch (NoSuchFieldException __bc_nsfe)
        {
            throw new ExceptionInInitializerError(__bc_nsfe);
        }
    }
    
    
    private static void initializeFields(ControlBeanContext cbc,
    loanservice.CompareLoanWS client)
    {
        try
        {
            String __bc_id;
            //
            // Initialize any nested controls used by the client
            //
            __bc_id = "creditRatingServiceControl";
            ratingservice.CreditRatingServiceControlBean _creditRatingServiceControl = (cbc == null ? null : (ratingservice.CreditRatingServiceControlBean)cbc.getBean(__bc_id));
            if (_creditRatingServiceControl == null)
            _creditRatingServiceControl = (ratingservice.CreditRatingServiceControlBean) Controls.instantiate(ratingservice.CreditRatingServiceControlBean.class, getAnnotationMap(cbc, _creditRatingServiceControlField), cbc, __bc_id );
            
            
            _creditRatingServiceControlField.set(client, _creditRatingServiceControl);
            __bc_id = "loanControl";
            loanservice.LoanControlBean _loanControl = (cbc == null ? null : (loanservice.LoanControlBean)cbc.getBean(__bc_id));
            if (_loanControl == null)
            _loanControl = (loanservice.LoanControlBean) Controls.instantiate(loanservice.LoanControlBean.class, getAnnotationMap(cbc, _loanControlField), cbc, __bc_id );
            
            
            _loanControlField.set(client, _loanControl);
        }
        catch (RuntimeException __bc_re) { throw __bc_re; }
        catch (Exception __bc_e)
        {
            __bc_e.printStackTrace();
            throw new ControlException("Initializer failure", __bc_e);
        }
    }
    
    public static void initialize(ControlBeanContext cbc, loanservice.CompareLoanWS client)
    {
        
        initializeFields( cbc, client );
    }
}
