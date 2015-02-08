
package loanservice.clientPageFlow;

import java.lang.reflect.Field;
import org.apache.beehive.controls.api.ControlException;
import org.apache.beehive.controls.api.bean.Controls;
import org.apache.beehive.controls.api.versioning.VersionRequired;
import org.apache.beehive.controls.api.context.ControlBeanContext;
import org.apache.beehive.controls.runtime.bean.EventAdaptor;
import org.apache.beehive.controls.runtime.bean.AdaptorPersistenceDelegate;

@SuppressWarnings("all")
public class ClientPageFlowControllerClientInitializer
extends org.apache.beehive.controls.runtime.bean.ClientInitializer
{
    static final Field _compareLoanWSServiceControlField;
    static
    {
        try
        {
            _compareLoanWSServiceControlField = loanservice.clientPageFlow.ClientPageFlowController.class.getDeclaredField("compareLoanWSServiceControl");
            _compareLoanWSServiceControlField.setAccessible(true);
        }
        catch (NoSuchFieldException __bc_nsfe)
        {
            throw new ExceptionInInitializerError(__bc_nsfe);
        }
    }
    
    
    private static void initializeFields(ControlBeanContext cbc,
    loanservice.clientPageFlow.ClientPageFlowController client)
    {
        try
        {
            String __bc_id;
            //
            // Initialize any nested controls used by the client
            //
            __bc_id = client.getClass() + "@" + client.hashCode() + ".loanservice.CompareLoanWSServiceControl.compareLoanWSServiceControl";
            loanservice.CompareLoanWSServiceControlBean _compareLoanWSServiceControl = (cbc == null ? null : (loanservice.CompareLoanWSServiceControlBean)cbc.getBean(__bc_id));
            if (_compareLoanWSServiceControl == null)
            _compareLoanWSServiceControl = (loanservice.CompareLoanWSServiceControlBean) Controls.instantiate(loanservice.CompareLoanWSServiceControlBean.class, getAnnotationMap(cbc, _compareLoanWSServiceControlField), cbc, __bc_id );
            
            
            _compareLoanWSServiceControlField.set(client, _compareLoanWSServiceControl);
        }
        catch (RuntimeException __bc_re) { throw __bc_re; }
        catch (Exception __bc_e)
        {
            __bc_e.printStackTrace();
            throw new ControlException("Initializer failure", __bc_e);
        }
    }
    
    public static void initialize(ControlBeanContext cbc, loanservice.clientPageFlow.ClientPageFlowController client)
    {
        
        initializeFields( cbc, client );
    }
}
