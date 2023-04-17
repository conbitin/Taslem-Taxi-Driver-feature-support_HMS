package org.xms.f.auth;




public final class ExtensionAuthInvalidUserException extends org.xms.f.auth.ExtensionAuthException {
    
    
    
    public ExtensionAuthInvalidUserException(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public ExtensionAuthInvalidUserException(java.lang.String param0, java.lang.String param1) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            this.setHInstance(new com.huawei.agconnect.auth.AGCAuthException(param1, com.huawei.agconnect.auth.AGCAuthException.SIGNIN_USER_STATUS_ERROR));
        } else {
            this.setGInstance(new com.google.firebase.auth.FirebaseAuthInvalidUserException(param0, param1));
        }
    }
    
    public static org.xms.f.auth.ExtensionAuthInvalidUserException dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.ExtensionAuthInvalidUserException) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.FirebaseAuthInvalidUserException;
        }
    }
}