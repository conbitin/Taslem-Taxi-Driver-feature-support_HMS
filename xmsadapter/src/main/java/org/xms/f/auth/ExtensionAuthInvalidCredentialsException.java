package org.xms.f.auth;




public class ExtensionAuthInvalidCredentialsException extends org.xms.f.auth.ExtensionAuthException {
    private boolean wrapper = true;
    
    
    
    public ExtensionAuthInvalidCredentialsException(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }
    
    public ExtensionAuthInvalidCredentialsException(java.lang.String param0, java.lang.String param1) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            this.setHInstance(new com.huawei.agconnect.auth.AGCAuthException(param1, com.huawei.agconnect.auth.AGCAuthException.SIGNIN_USER_STATUS_ERROR));
        } else {
            this.setGInstance(new GImpl(param0, param1));
        }
        wrapper = false;
    }
    
    public static org.xms.f.auth.ExtensionAuthInvalidCredentialsException dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.ExtensionAuthInvalidCredentialsException) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
        }
    }
    
    private class GImpl extends com.google.firebase.auth.FirebaseAuthInvalidCredentialsException {
        
        public GImpl(java.lang.String param0, java.lang.String param1) {
            super(param0, param1);
        }
    }
}