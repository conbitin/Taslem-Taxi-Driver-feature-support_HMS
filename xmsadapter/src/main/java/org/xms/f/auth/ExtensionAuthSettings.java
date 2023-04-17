package org.xms.f.auth;




public abstract class ExtensionAuthSettings extends org.xms.g.utils.XObject {
    
    
    
    public ExtensionAuthSettings(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public ExtensionAuthSettings() {
        super(((org.xms.g.utils.XBox) null));
    }
    
    public abstract void setAutoRetrievedSmsCodeForPhoneNumber(java.lang.String param0, java.lang.String param1);
    
    public static org.xms.f.auth.ExtensionAuthSettings dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.ExtensionAuthSettings) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.FirebaseAuthSettings;
        }
    }
    
    public static class XImpl extends org.xms.f.auth.ExtensionAuthSettings {
        
        
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public void setAutoRetrievedSmsCodeForPhoneNumber(java.lang.String param0, java.lang.String param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ExtensionAuthSettings.XImpl.setAutoRetrievedSmsCodeForPhoneNumber(param0, param1)");
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuthSettings) this.getGInstance()).setAutoRetrievedSmsCodeForPhoneNumber(param0, param1)");
                ((com.google.firebase.auth.FirebaseAuthSettings) this.getGInstance()).setAutoRetrievedSmsCodeForPhoneNumber(param0, param1);
            }
        }
    }
}