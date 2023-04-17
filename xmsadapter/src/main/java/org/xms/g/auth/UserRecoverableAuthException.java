package org.xms.g.auth;




public class UserRecoverableAuthException extends org.xms.g.auth.ExtensionAuthException {
    private boolean wrapper = true;
    
    
    
    public UserRecoverableAuthException(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }
    
    public UserRecoverableAuthException(java.lang.String param0, android.content.Intent param1) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.UserRecoverableAuthException.UserRecoverableAuthException(java.lang.Stringandroid.content.Intent)");
        } else {
            this.setGInstance(new GImpl(param0, param1));
        }
        wrapper = false;
    }
    
    public android.content.Intent getIntent() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.UserRecoverableAuthException.getIntent()");
                return new android.content.Intent();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.UserRecoverableAuthException) this.getGInstance()).getIntent()");
                return ((com.google.android.gms.auth.UserRecoverableAuthException) this.getGInstance()).getIntent();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "HImpl org.xms.g.auth.UserRecoverableAuthException.getIntent()");
                return new android.content.Intent();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.auth.UserRecoverableAuthException) this.getGInstance())).getIntentCallSuper()");
                return ((GImpl) ((com.google.android.gms.auth.UserRecoverableAuthException) this.getGInstance())).getIntentCallSuper();
            }
        }
    }
    
    public static org.xms.g.auth.UserRecoverableAuthException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.UserRecoverableAuthException) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.UserRecoverableAuthException.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.UserRecoverableAuthException;
        }
    }
    
    private class GImpl extends com.google.android.gms.auth.UserRecoverableAuthException {
        
        public android.content.Intent getIntent() {
            return org.xms.g.auth.UserRecoverableAuthException.this.getIntent();
        }
        
        public android.content.Intent getIntentCallSuper() {
            return super.getIntent();
        }
        
        public GImpl(java.lang.String param0, android.content.Intent param1) {
            super(param0, param1);
        }
    }
}