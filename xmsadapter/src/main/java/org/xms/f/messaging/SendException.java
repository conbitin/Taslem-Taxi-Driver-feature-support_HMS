package org.xms.f.messaging;

/**
 * Message send exception.<br/>
 * Combination of com.huawei.hms.push.SendException and com.google.firebase.messaging.SendException.<br/>
 * com.huawei.hms.push.SendException: Hms message send exception.<br/>
 * com.google.firebase.messaging.SendException: Firebase message send exception.<br/>
 */
public final class SendException extends java.lang.Exception implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;
    
    /**
     * org.xms.f.messaging.SendException.SendException(org.xms.g.utils.XBox) constructor of SendException with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public SendException(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }
    
    /**
     * org.xms.f.messaging.SendException.getERROR_INVALID_PARAMETERS() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.firebase.messaging.SendException.ERROR_INVALID_PARAMETERS: <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/SendException#public-static-final-int-error_invalid_parameters">https://developers.google.com/android/reference/com/google/firebase/messaging/SendException#public-static-final-int-error_invalid_parameters</a><br/>
     *
     * @return Message was sent with invalid parameters
     */
    public static int getERROR_INVALID_PARAMETERS() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.push.SendException.ERROR_INVALID_PARAMETERS");
            return com.huawei.hms.push.SendException.ERROR_INVALID_PARAMETERS;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.messaging.SendException.ERROR_INVALID_PARAMETERS");
            return com.google.firebase.messaging.SendException.ERROR_INVALID_PARAMETERS;
        }
    }
    
    /**
     * org.xms.f.messaging.SendException.getERROR_SIZE() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.firebase.messaging.SendException.ERROR_SIZE: <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/SendException#public-static-final-int-error_size">https://developers.google.com/android/reference/com/google/firebase/messaging/SendException#public-static-final-int-error_size</a><br/>
     *
     * @return Message exceeded the maximum payload size
     */
    public static int getERROR_SIZE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.push.SendException.ERROR_SIZE");
            return com.huawei.hms.push.SendException.ERROR_SIZE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.messaging.SendException.ERROR_SIZE");
            return com.google.firebase.messaging.SendException.ERROR_SIZE;
        }
    }
    
    /**
     * org.xms.f.messaging.SendException.getERROR_TOO_MANY_MESSAGES() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.firebase.messaging.SendException.ERROR_TOO_MANY_MESSAGES: <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/SendException#public-static-final-int-error_too_many_messages">https://developers.google.com/android/reference/com/google/firebase/messaging/SendException#public-static-final-int-error_too_many_messages</a><br/>
     *
     * @return App has too many pending messages so this one was dropped
     */
    public static int getERROR_TOO_MANY_MESSAGES() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.push.SendException.ERROR_TOO_MANY_MESSAGES");
            return com.huawei.hms.push.SendException.ERROR_TOO_MANY_MESSAGES;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.messaging.SendException.ERROR_TOO_MANY_MESSAGES");
            return com.google.firebase.messaging.SendException.ERROR_TOO_MANY_MESSAGES;
        }
    }
    
    /**
     * org.xms.f.messaging.SendException.getERROR_TTL_EXCEEDED() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.firebase.messaging.SendException.ERROR_TTL_EXCEEDED: <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/SendException#public-static-final-int-error_ttl_exceeded">https://developers.google.com/android/reference/com/google/firebase/messaging/SendException#public-static-final-int-error_ttl_exceeded</a><br/>
     *
     * @return Message time to live(TTL) was exceeded before the message could be sent
     */
    public static int getERROR_TTL_EXCEEDED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.push.SendException.ERROR_TTL_EXCEEDED");
            return com.huawei.hms.push.SendException.ERROR_TTL_EXCEEDED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.messaging.SendException.ERROR_TTL_EXCEEDED");
            return com.google.firebase.messaging.SendException.ERROR_TTL_EXCEEDED;
        }
    }
    
    /**
     * org.xms.f.messaging.SendException.getERROR_UNKNOWN() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.firebase.messaging.SendException.ERROR_UNKNOWN: <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/SendException#public-static-final-int-error_unknown">https://developers.google.com/android/reference/com/google/firebase/messaging/SendException#public-static-final-int-error_unknown</a><br/>
     *
     * @return Unknown error
     */
    public static int getERROR_UNKNOWN() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.push.SendException.ERROR_UNKNOWN");
            return com.huawei.hms.push.SendException.ERROR_UNKNOWN;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.messaging.SendException.ERROR_UNKNOWN");
            return com.google.firebase.messaging.SendException.ERROR_UNKNOWN;
        }
    }
    
    /**
     * org.xms.f.messaging.SendException.getErrorCode() get Error Code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.firebase.messaging.SendException.getErrorCode(): <a href="https://developers.google.com/android/reference/com/google/firebase/messaging/SendException#public-int-geterrorcode">https://developers.google.com/android/reference/com/google/firebase/messaging/SendException#public-int-geterrorcode</a><br/>
     *
     * @return Error Code of the SendException
     */
    public final int getErrorCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.push.SendException) this.getHInstance()).getErrorCode()");
            return ((com.huawei.hms.push.SendException) this.getHInstance()).getErrorCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.messaging.SendException) this.getGInstance()).getErrorCode()");
            return ((com.google.firebase.messaging.SendException) this.getGInstance()).getErrorCode();
        }
    }
    
    /**
     * org.xms.f.messaging.SendException.setGInstance(java.lang.Object) set the gms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 this param is gInstance
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }
    
    /**
     * org.xms.f.messaging.SendException.setHInstance(java.lang.Object) set the hms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 this param is hInstance
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }
    
    /**
     * org.xms.f.messaging.SendException.getGInstance() get the gms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return this param is gInstance
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }
    
    /**
     * org.xms.f.messaging.SendException.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return this param is hInstance
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }
    
    /**
     * org.xms.f.messaging.SendException.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.f.messaging.SendException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted SendException object
     */
    public static org.xms.f.messaging.SendException dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.messaging.SendException) param0);
    }
    
    /**
     * org.xms.f.messaging.SendException.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.push.SendException;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.messaging.SendException;
        }
    }
}