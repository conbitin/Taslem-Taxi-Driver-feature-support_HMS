package org.xms.g.iid;

/**
 * Base class to handle Instance ID service notifications on token refresh.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.iid.InstanceIDListenerService: Base class to handle Instance ID service notifications on token refresh.<br/>
 */
public class InstanceIDListenerService extends android.app.Service implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;
    
    /**
     * org.xms.g.iid.InstanceIDListenerService.InstanceIDListenerService(org.xms.g.utils.XBox) constructor of InstanceIDListenerService.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.iid.InstanceIDListenerService.InstanceIDListenerService(): <a href="https://developers.google.com/android/reference/com/google/android/gms/iid/InstanceIDListenerService#public-instanceidlistenerservice">https://developers.google.com/android/reference/com/google/android/gms/iid/InstanceIDListenerService#public-instanceidlistenerservice</a><br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public InstanceIDListenerService(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }
    
    /**
     * org.xms.g.iid.InstanceIDListenerService.InstanceIDListenerService() constructor of InstanceIDListenerService.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.iid.InstanceIDListenerService.InstanceIDListenerService(): <a href="https://developers.google.com/android/reference/com/google/android/gms/iid/InstanceIDListenerService#public-instanceidlistenerservice">https://developers.google.com/android/reference/com/google/android/gms/iid/InstanceIDListenerService#public-instanceidlistenerservice</a><br/>
     *
     */
    public InstanceIDListenerService() {
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public void onTokenRefresh() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public android.os.IBinder onBind(android.content.Intent param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.iid.InstanceIDListenerService.setGInstance(java.lang.Object) set the gms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param is gInstance
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }
    
    /**
     * org.xms.g.iid.InstanceIDListenerService.setHInstance(java.lang.Object) set the hms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param is hInstance
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }
    
    /**
     * org.xms.g.iid.InstanceIDListenerService.getGInstance() get the gms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return the return object is gInstance
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }
    
    /**
     * org.xms.g.iid.InstanceIDListenerService.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return the return object is hInstance
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }
    
    /**
     * org.xms.g.iid.InstanceIDListenerService.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.iid.InstanceIDListenerService.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted InstanceIDListenerService object
     */
    public static org.xms.g.iid.InstanceIDListenerService dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.iid.InstanceIDListenerService.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
}