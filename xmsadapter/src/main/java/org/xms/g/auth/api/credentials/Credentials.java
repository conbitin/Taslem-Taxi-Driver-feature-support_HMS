package org.xms.g.auth.api.credentials;




public class Credentials extends org.xms.g.utils.XObject {
    
    
    
    public Credentials(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public Credentials() {
        super(((org.xms.g.utils.XBox) null));
    }
    
    public static org.xms.g.auth.api.credentials.CredentialsClient getClient(android.content.Context param0, org.xms.g.auth.api.credentials.CredentialsOptions param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credentials.getClient(android.content.Contextorg.xms.g.auth.api.credentials.CredentialsOptions)");
            return new org.xms.g.auth.api.credentials.CredentialsClient(new org.xms.g.utils.XBox(null, new java.lang.Object()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.Credentials.getClient(param0, ((com.google.android.gms.auth.api.credentials.CredentialsOptions) ((param1) == null ? null : (param1.getGInstance()))))");
            com.google.android.gms.auth.api.credentials.CredentialsClient gReturn = com.google.android.gms.auth.api.credentials.Credentials.getClient(param0, ((com.google.android.gms.auth.api.credentials.CredentialsOptions) ((param1) == null ? null : (param1.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialsClient(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.api.credentials.CredentialsClient getClient(android.app.Activity param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credentials.getClient(android.app.Activity)");
            return new org.xms.g.auth.api.credentials.CredentialsClient(new org.xms.g.utils.XBox(null, new java.lang.Object()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.Credentials.getClient(param0)");
            com.google.android.gms.auth.api.credentials.CredentialsClient gReturn = com.google.android.gms.auth.api.credentials.Credentials.getClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialsClient(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.api.credentials.CredentialsClient getClient(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credentials.getClient(android.content.Context)");
            return new org.xms.g.auth.api.credentials.CredentialsClient(new org.xms.g.utils.XBox(null, new java.lang.Object()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.Credentials.getClient(param0)");
            com.google.android.gms.auth.api.credentials.CredentialsClient gReturn = com.google.android.gms.auth.api.credentials.Credentials.getClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialsClient(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.api.credentials.CredentialsClient getClient(android.app.Activity param0, org.xms.g.auth.api.credentials.CredentialsOptions param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credentials.getClient(android.app.Activityorg.xms.g.auth.api.credentials.CredentialsOptions)");
            return new org.xms.g.auth.api.credentials.CredentialsClient(new org.xms.g.utils.XBox(null, new java.lang.Object()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.Credentials.getClient(param0, ((com.google.android.gms.auth.api.credentials.CredentialsOptions) ((param1) == null ? null : (param1.getGInstance()))))");
            com.google.android.gms.auth.api.credentials.CredentialsClient gReturn = com.google.android.gms.auth.api.credentials.Credentials.getClient(param0, ((com.google.android.gms.auth.api.credentials.CredentialsOptions) ((param1) == null ? null : (param1.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialsClient(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.api.credentials.Credentials dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.credentials.Credentials) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credentials.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.credentials.Credentials;
        }
    }
}