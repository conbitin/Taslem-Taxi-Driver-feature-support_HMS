package org.xms.g.auth.api.credentials;




public final class IdentityProviders extends org.xms.g.utils.XObject {
    
    
    
    public IdentityProviders(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static java.lang.String getFACEBOOK() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.IdentityProviders.getFACEBOOK()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.IdentityProviders.FACEBOOK");
            return com.google.android.gms.auth.api.credentials.IdentityProviders.FACEBOOK;
        }
    }
    
    public static java.lang.String getGOOGLE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.IdentityProviders.getGOOGLE()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.IdentityProviders.GOOGLE");
            return com.google.android.gms.auth.api.credentials.IdentityProviders.GOOGLE;
        }
    }
    
    public static java.lang.String getLINKEDIN() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.IdentityProviders.getLINKEDIN()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.IdentityProviders.LINKEDIN");
            return com.google.android.gms.auth.api.credentials.IdentityProviders.LINKEDIN;
        }
    }
    
    public static java.lang.String getMICROSOFT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.IdentityProviders.getMICROSOFT()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.IdentityProviders.MICROSOFT");
            return com.google.android.gms.auth.api.credentials.IdentityProviders.MICROSOFT;
        }
    }
    
    public static java.lang.String getPAYPAL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.IdentityProviders.getPAYPAL()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.IdentityProviders.PAYPAL");
            return com.google.android.gms.auth.api.credentials.IdentityProviders.PAYPAL;
        }
    }
    
    public static java.lang.String getTWITTER() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.IdentityProviders.getTWITTER()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.IdentityProviders.TWITTER");
            return com.google.android.gms.auth.api.credentials.IdentityProviders.TWITTER;
        }
    }
    
    public static java.lang.String getYAHOO() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.IdentityProviders.getYAHOO()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.IdentityProviders.YAHOO");
            return com.google.android.gms.auth.api.credentials.IdentityProviders.YAHOO;
        }
    }
    
    public static final java.lang.String getIdentityProviderForAccount(android.accounts.Account param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.api.credentials.IdentityProviders dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.credentials.IdentityProviders) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.IdentityProviders.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.credentials.IdentityProviders;
        }
    }
}