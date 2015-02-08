
package ratingservice;

import java.lang.reflect.Field;
import org.apache.beehive.controls.api.ControlException;
import org.apache.beehive.controls.api.bean.Controls;
import org.apache.beehive.controls.api.versioning.VersionRequired;
import org.apache.beehive.controls.api.context.ControlBeanContext;
import org.apache.beehive.controls.runtime.bean.EventAdaptor;
import org.apache.beehive.controls.runtime.bean.AdaptorPersistenceDelegate;

@SuppressWarnings("all")
public class CreditRatingClientInitializer
extends org.apache.beehive.controls.runtime.bean.ClientInitializer
{
    static final Field _bankruptcyControlField;
    static
    {
        try
        {
            _bankruptcyControlField = ratingservice.CreditRating.class.getDeclaredField("bankruptcyControl");
            _bankruptcyControlField.setAccessible(true);
        }
        catch (NoSuchFieldException __bc_nsfe)
        {
            throw new ExceptionInInitializerError(__bc_nsfe);
        }
    }
    
    
    private static void initializeFields(ControlBeanContext cbc,
    ratingservice.CreditRating client)
    {
        try
        {
            String __bc_id;
            //
            // Initialize any nested controls used by the client
            //
            __bc_id = "bankruptcyControl";
            ratingservice.BankruptcyControlBean _bankruptcyControl = (cbc == null ? null : (ratingservice.BankruptcyControlBean)cbc.getBean(__bc_id));
            if (_bankruptcyControl == null)
            _bankruptcyControl = (ratingservice.BankruptcyControlBean) Controls.instantiate(ratingservice.BankruptcyControlBean.class, getAnnotationMap(cbc, _bankruptcyControlField), cbc, __bc_id );
            
            
            _bankruptcyControlField.set(client, _bankruptcyControl);
        }
        catch (RuntimeException __bc_re) { throw __bc_re; }
        catch (Exception __bc_e)
        {
            __bc_e.printStackTrace();
            throw new ControlException("Initializer failure", __bc_e);
        }
    }
    
    public static void initialize(ControlBeanContext cbc, ratingservice.CreditRating client)
    {
        
        initializeFields( cbc, client );
    }
}
