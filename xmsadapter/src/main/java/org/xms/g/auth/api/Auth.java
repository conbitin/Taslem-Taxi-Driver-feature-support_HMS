package org.xms.g.auth.api;




public final class Auth extends org.xms.g.utils.XObject {
    
    
    
    public Auth(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static org.xms.g.common.api.Api getCREDENTIALS_API() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.Auth.getCREDENTIALS_API()org.xms.g.common.api.Api");
            return new org.xms.g.common.api.Api(new org.xms.g.utils.XBox(null, new com.huawei.hms.api.Api("")));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.Auth.CREDENTIALS_API");
            com.google.android.gms.common.api.Api gReturn = null;
            gReturn = com.google.android.gms.auth.api.Auth.CREDENTIALS_API;
            return ((gReturn) == null ? null : (new org.xms.g.common.api.Api(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.api.credentials.CredentialsApi getCredentialsApi() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.Auth.getCredentialsApi()");
            return new org.xms.g.auth.api.credentials.CredentialsApi.XImpl(new org.xms.g.utils.XBox(null, new java.lang.Object()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.Auth.CredentialsApi");
            com.google.android.gms.auth.api.credentials.CredentialsApi gReturn = null;
            gReturn = com.google.android.gms.auth.api.Auth.CredentialsApi;
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialsApi.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.common.api.Api getGOOGLE_SIGN_IN_API() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.HuaweiIdAuthAPIManager.HUAWEI_OAUTH_API");
            com.huawei.hms.api.Api hReturn = null;
            hReturn = com.huawei.hms.support.hwid.HuaweiIdAuthAPIManager.HUAWEI_OAUTH_API;
            return ((hReturn) == null ? null : (new org.xms.g.common.api.Api(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API");
            com.google.android.gms.common.api.Api gReturn = null;
            gReturn = com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API;
            return ((gReturn) == null ? null : (new org.xms.g.common.api.Api(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.api.signin.ExtensionSignInApi getGoogleSignInApi() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.HuaweiIdAuthAPIManager.HuaweiIdAuthAPIService");
            com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService hReturn = null;
            hReturn = com.huawei.hms.support.hwid.HuaweiIdAuthAPIManager.HuaweiIdAuthAPIService;
            return ((hReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInApi.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.Auth.GoogleSignInApi");
            com.google.android.gms.auth.api.signin.GoogleSignInApi gReturn = null;
            gReturn = com.google.android.gms.auth.api.Auth.GoogleSignInApi;
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInApi.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.api.Auth dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.Auth) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.hwid.HuaweiIdAuthAPIManager;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.Auth;
        }
    }
    
    public static class AuthCredentialsOptions extends org.xms.g.utils.XObject implements org.xms.g.common.api.Api.ApiOptions.Optional {
        
        public AuthCredentialsOptions(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public boolean equals(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public int hashCode() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static org.xms.g.auth.api.Auth.AuthCredentialsOptions dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static class Builder extends org.xms.g.utils.XObject {
            
            public Builder(org.xms.g.utils.XBox param0) {
                super(param0);
            }
            
            public org.xms.g.auth.api.Auth.AuthCredentialsOptions.Builder forceEnableSaveDialog() {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            public static org.xms.g.auth.api.Auth.AuthCredentialsOptions.Builder dynamicCast(java.lang.Object param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            public static boolean isInstance(java.lang.Object param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
        }
    }
}