package org.xms.g.gcm;

/**
 * Implemented by the client application to provide an endpoint for the GcmNetworkManager to call back to when a task is ready to be executed.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.gcm.GcmTaskService: Implemented by the client application to provide an endpoint for the GcmNetworkManager to call back to when a task is ready to be executed.<br/>
 */
public abstract class GcmTaskService extends android.app.Service implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;
    
    /**
     * org.xms.g.gcm.GcmTaskService.GcmTaskService(org.xms.g.utils.XBox) constructor of GcmTaskService with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public GcmTaskService(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }
    
    /**
     * org.xms.g.gcm.GcmTaskService.getSERVICE_PERMISSION() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.gcm.GcmTaskService.SERVICE_PERMISSION: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/GcmTaskService#public-static-final-string-service_permission">https://developers.google.com/android/reference/com/google/android/gms/gcm/GcmTaskService#public-static-final-string-service_permission</a><br/>
     *
     * @return Constant Value You must protect your service with this permission to avoid being bound to by an application other than Google Play Services
     */
    public static java.lang.String getSERVICE_PERMISSION() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.GcmTaskService.setGInstance(java.lang.Object) set the gms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 this param is gInstance
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }
    
    /**
     * org.xms.g.gcm.GcmTaskService.setHInstance(java.lang.Object) set the hms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 this param is hInstance
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }
    
    /**
     * org.xms.g.gcm.GcmTaskService.getGInstance() get the gms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return this param is gInstance
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }
    
    /**
     * org.xms.g.gcm.GcmTaskService.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return this param is hInstance
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }
    
    /**
     * org.xms.g.gcm.GcmTaskService.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.gcm.GcmTaskService.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted GcmTaskService object
     */
    public static org.xms.g.gcm.GcmTaskService dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.GcmTaskService.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * Implemented by the client application to provide an endpoint for the GcmNetworkManager to call back to when a task is ready to be executed.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.gcm.GcmTaskService: Implemented by the client application to provide an endpoint for the GcmNetworkManager to call back to when a task is ready to be executed.<br/>
     */
    public static class XImpl extends org.xms.g.gcm.GcmTaskService {
        
        /**
         * org.xms.g.gcm.GcmTaskService.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public android.os.IBinder onBind(android.content.Intent param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}