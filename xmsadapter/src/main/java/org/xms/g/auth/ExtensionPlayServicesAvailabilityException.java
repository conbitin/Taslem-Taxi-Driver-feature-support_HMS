package org.xms.g.auth;




public class ExtensionPlayServicesAvailabilityException extends org.xms.g.auth.UserRecoverableAuthException {
    
    
    
    public ExtensionPlayServicesAvailabilityException(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public int getConnectionStatusCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.ExtensionPlayServicesAvailabilityException.getConnectionStatusCode()");
            return 0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.GooglePlayServicesAvailabilityException) this.getGInstance()).getConnectionStatusCode()");
            return ((com.google.android.gms.auth.GooglePlayServicesAvailabilityException) this.getGInstance()).getConnectionStatusCode();
        }
    }
    
    public static org.xms.g.auth.ExtensionPlayServicesAvailabilityException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.ExtensionPlayServicesAvailabilityException) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.ExtensionPlayServicesAvailabilityException.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
        }
    }
}