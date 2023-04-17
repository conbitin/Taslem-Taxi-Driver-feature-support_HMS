package org.xms.f.iid;

/**
 * WakefulBroadcastReceiver that receives InstanceId and Messaging events and delivers them to the application-specific InstanceIdService subclass.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.firebase.iid.FirebaseInstanceIdReceiver: WakefulBroadcastReceiver that receives FirebaseInstanceId and FirebaseMessaging events and delivers them to the application-specific FirebaseInstanceIdService subclass.<br/>
 */
public final class ExtensionInstanceIdReceiver extends androidx.legacy.content.WakefulBroadcastReceiver implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;
    
    /**
     * org.xms.f.iid.ExtensionInstanceIdReceiver.ExtensionInstanceIdReceiver(org.xms.g.utils.XBox) constructor of ExtensionInstanceIdReceiver with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ExtensionInstanceIdReceiver(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public void onReceive(android.content.Context param0, android.content.Intent param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.f.iid.ExtensionInstanceIdReceiver.setGInstance(java.lang.Object) set the gms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 this param is gInstance
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }
    
    /**
     * org.xms.f.iid.ExtensionInstanceIdReceiver.setHInstance(java.lang.Object) set the hms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 this param is hInstance
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }
    
    /**
     * org.xms.f.iid.ExtensionInstanceIdReceiver.getGInstance() get the gms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return this param is gInstance
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }
    
    /**
     * org.xms.f.iid.ExtensionInstanceIdReceiver.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return this param is hInstance
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }
    
    /**
     * org.xms.f.iid.ExtensionInstanceIdReceiver.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.f.iid.ExtensionInstanceIdReceiver.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ExtensionInstanceIdReceiver object
     */
    public static org.xms.f.iid.ExtensionInstanceIdReceiver dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.f.iid.ExtensionInstanceIdReceiver.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
}