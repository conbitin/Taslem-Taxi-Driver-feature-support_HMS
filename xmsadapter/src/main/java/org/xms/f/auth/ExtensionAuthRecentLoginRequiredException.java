package org.xms.f.auth;




public final class ExtensionAuthRecentLoginRequiredException extends org.xms.g.utils.XObject {
    
    
    
    public ExtensionAuthRecentLoginRequiredException(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public ExtensionAuthRecentLoginRequiredException(java.lang.String param0, java.lang.String param1) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            this.setHInstance(new com.huawei.agconnect.auth.AGCAuthException(param1, com.huawei.agconnect.auth.AGCAuthException.SENSITIVE_OPERATION_TIMEOUT));
        } else {
            this.setGInstance(new com.google.firebase.auth.FirebaseAuthRecentLoginRequiredException(param0, param1));
        }
    }
    
    public static org.xms.f.auth.ExtensionAuthRecentLoginRequiredException dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.ExtensionAuthRecentLoginRequiredException) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.FirebaseAuthRecentLoginRequiredException;
        }
    }
}