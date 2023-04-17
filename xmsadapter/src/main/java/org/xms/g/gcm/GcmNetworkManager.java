package org.xms.g.gcm;

/**
 * Class to create apps with robust"send-to-sync", which is the mechanism to sync data with servers where new information is available.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.gcm.GcmNetworkManager: Class to create apps with robust"send-to-sync", which is the mechanism to sync data with servers where new information is available.<br/>
 */
public class GcmNetworkManager extends org.xms.g.utils.XObject {
    
    /**
     * org.xms.g.gcm.GcmNetworkManager.GcmNetworkManager(org.xms.g.utils.XBox) constructor of GcmNetworkManager with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public GcmNetworkManager(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    /**
     * org.xms.g.gcm.GcmNetworkManager.getRESULT_FAILURE() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.gcm.GcmNetworkManager.RESULT_FAILURE: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/GcmNetworkManager#public-static-final-int-result_failure">https://developers.google.com/android/reference/com/google/android/gms/gcm/GcmNetworkManager#public-static-final-int-result_failure</a><br/>
     *
     * @return Indicates a task has failed, but not to reschedule
     */
    public static int getRESULT_FAILURE() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.GcmNetworkManager.getRESULT_RESCHEDULE() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.gcm.GcmNetworkManager.RESULT_RESCHEDULE: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/GcmNetworkManager#public-static-final-int-result_reschedule">https://developers.google.com/android/reference/com/google/android/gms/gcm/GcmNetworkManager#public-static-final-int-result_reschedule</a><br/>
     *
     * @return Indicates a task has failed to execute, and must be retried with back-off
     */
    public static int getRESULT_RESCHEDULE() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.GcmNetworkManager.getRESULT_SUCCESS() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.gcm.GcmNetworkManager.RESULT_SUCCESS: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/GcmNetworkManager#public-static-final-int-result_success">https://developers.google.com/android/reference/com/google/android/gms/gcm/GcmNetworkManager#public-static-final-int-result_success</a><br/>
     *
     * @return Indicates a task has successfully been executed, and can be removed from the queue
     */
    public static int getRESULT_SUCCESS() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public void cancelAllTasks(java.lang.Class<? extends org.xms.g.gcm.GcmTaskService> param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public void cancelTask(java.lang.String param0, java.lang.Class<? extends org.xms.g.gcm.GcmTaskService> param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public static org.xms.g.gcm.GcmNetworkManager getInstance(android.content.Context param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public synchronized void schedule(org.xms.g.gcm.Task param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.GcmNetworkManager.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.gcm.GcmNetworkManager.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted GcmNetworkManager object
     */
    public static org.xms.g.gcm.GcmNetworkManager dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.GcmNetworkManager.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
}