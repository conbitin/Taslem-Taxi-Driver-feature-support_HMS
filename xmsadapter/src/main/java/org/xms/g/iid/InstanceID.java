package org.xms.g.iid;

/**
 * Instance ID provides a unique identifier for each app instance and a mechanism to authenticate and authorize actions(for example, sending a GCM message).<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.iid.InstanceID: Instance ID provides a unique identifier for each app instance and a mechanism to authenticate and authorize actions(for example, sending a GCM message).<br/>
 */
public class InstanceID extends org.xms.g.utils.XObject {
    
    /**
     * org.xms.g.iid.InstanceID.InstanceID(org.xms.g.utils.XBox) constructor of InstanceID with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public InstanceID(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    /**
     * org.xms.g.iid.InstanceID.getERROR_MAIN_THREAD() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.iid.InstanceID.ERROR_MAIN_THREAD: <a href="https://developers.google.com/android/reference/com/google/android/gms/iid/InstanceID#public-static-final-string-error_main_thread">https://developers.google.com/android/reference/com/google/android/gms/iid/InstanceID#public-static-final-string-error_main_thread</a><br/>
     *
     * @return Constant Value Blocking methods must not be called on the main thread
     */
    public static java.lang.String getERROR_MAIN_THREAD() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.iid.InstanceID.getERROR_MISSING_INSTANCEID_SERVICE() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.iid.InstanceID.ERROR_MISSING_INSTANCEID_SERVICE: <a href="https://developers.google.com/android/reference/com/google/android/gms/iid/InstanceID#public-static-final-string-error_missing_instanceid_service">https://developers.google.com/android/reference/com/google/android/gms/iid/InstanceID#public-static-final-string-error_missing_instanceid_service</a><br/>
     *
     * @return Constant Value Tokens can't be generated Only devices with Google Play are supported
     */
    public static java.lang.String getERROR_MISSING_INSTANCEID_SERVICE() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.iid.InstanceID.getERROR_SERVICE_NOT_AVAILABLE() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.iid.InstanceID.ERROR_SERVICE_NOT_AVAILABLE: <a href="https://developers.google.com/android/reference/com/google/android/gms/iid/InstanceID#public-static-final-string-error_service_not_available">https://developers.google.com/android/reference/com/google/android/gms/iid/InstanceID#public-static-final-string-error_service_not_available</a><br/>
     *
     * @return Constant Value The device cannot read the response or there was a server error
     */
    public static java.lang.String getERROR_SERVICE_NOT_AVAILABLE() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.iid.InstanceID.getERROR_TIMEOUT() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.iid.InstanceID.ERROR_TIMEOUT: <a href="https://developers.google.com/android/reference/com/google/android/gms/iid/InstanceID#public-static-final-string-error_timeout">https://developers.google.com/android/reference/com/google/android/gms/iid/InstanceID#public-static-final-string-error_timeout</a><br/>
     *
     * @return Constant Value Timeout waiting for a response
     */
    public static java.lang.String getERROR_TIMEOUT() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public void deleteInstanceID() throws java.io.IOException {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public void deleteToken(java.lang.String param0, java.lang.String param1) throws java.io.IOException {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public long getCreationTime() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public java.lang.String getId() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public static org.xms.g.iid.InstanceID getInstance(android.content.Context param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public java.lang.String getToken(java.lang.String param0, java.lang.String param1) throws java.io.IOException {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public java.lang.String getToken(java.lang.String param0, java.lang.String param1, android.os.Bundle param2) throws java.io.IOException {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.iid.InstanceID.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.iid.InstanceID.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted InstanceID object
     */
    public static org.xms.g.iid.InstanceID dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.iid.InstanceID.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
}