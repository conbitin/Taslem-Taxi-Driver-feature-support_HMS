package org.xms.g.auth;




public class UserRecoverableNotifiedException extends org.xms.g.auth.ExtensionAuthException {
    private boolean wrapper = true;
    
    
    
    public UserRecoverableNotifiedException(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }
    
    public UserRecoverableNotifiedException(java.lang.String param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.UserRecoverableNotifiedException.UserRecoverableNotifiedException(java.lang.String)");
        } else {
            this.setGInstance(new GImpl(param0));
        }
        wrapper = false;
    }
    
    public static org.xms.g.auth.UserRecoverableNotifiedException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.UserRecoverableNotifiedException) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.UserRecoverableNotifiedException.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.UserRecoverableNotifiedException;
        }
    }
    
    private class GImpl extends com.google.android.gms.auth.UserRecoverableNotifiedException {
        
        public GImpl(java.lang.String param0) {
            super(param0);
        }
    }
}