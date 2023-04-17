package org.xms.g.gcm;

/**
 * Container of parameters handed off to the client app in onRunTask(TaskParams).<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.gcm.TaskParams: Container of parameters handed off to the client app in onRunTask(TaskParams).<br/>
 */
public class TaskParams extends org.xms.g.utils.XObject {
    
    /**
     * org.xms.g.gcm.TaskParams.TaskParams(org.xms.g.utils.XBox) constructor of TaskParams with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public TaskParams(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    /**
     * org.xms.g.gcm.TaskParams.TaskParams(java.lang.String) constructor of TaskParams with String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.gcm.TaskParams.TaskParams(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/TaskParams#public-taskparams-string-tag">https://developers.google.com/android/reference/com/google/android/gms/gcm/TaskParams#public-taskparams-string-tag</a><br/>
     *
     * @param param0 this param is String
     */
    public TaskParams(java.lang.String param0) {
        super(((org.xms.g.utils.XBox) null));
    }
    
    /**
     * org.xms.g.gcm.TaskParams.TaskParams(java.lang.String,android.os.Bundle) constructor of TaskParams with String and Bundle.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.gcm.TaskParams.TaskParams(java.lang.String,android.os.Bundle): <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/TaskParams#public-taskparams-string-tag,-bundle-extras">https://developers.google.com/android/reference/com/google/android/gms/gcm/TaskParams#public-taskparams-string-tag,-bundle-extras</a><br/>
     *
     * @param param0 this param is param
     * @param param1 this param is extras
     */
    public TaskParams(java.lang.String param0, android.os.Bundle param1) {
        super(((org.xms.g.utils.XBox) null));
    }
    
    /**
     * org.xms.g.gcm.TaskParams.TaskParams(java.lang.String,android.os.Bundle,java.util.List<android.net.Uri>) constructor of TaskParams with String Bundle and Uris.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.gcm.TaskParams.TaskParams(java.lang.String,android.os.Bundle,java.util.List<android.net.Uri>): <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/TaskParams#public-taskparams-string-tag,-bundle-extras,-listuri-triggereduris">https://developers.google.com/android/reference/com/google/android/gms/gcm/TaskParams#public-taskparams-string-tag,-bundle-extras,-listuri-triggereduris</a><br/>
     *
     * @param param0 this param is String
     * @param param1 this param is extras
     * @param param2 this param is triggeredUris
     */
    public TaskParams(java.lang.String param0, android.os.Bundle param1, java.util.List<android.net.Uri> param2) {
        super(((org.xms.g.utils.XBox) null));
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public android.os.Bundle getExtras() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public java.lang.String getTag() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.TaskParams.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.gcm.TaskParams.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted TaskParams object
     */
    public static org.xms.g.gcm.TaskParams dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.TaskParams.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
}