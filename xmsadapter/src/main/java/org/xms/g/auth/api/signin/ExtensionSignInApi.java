package org.xms.g.auth.api.signin;

public interface ExtensionSignInApi extends org.xms.g.utils.XInterface {
    
    public static java.lang.String getEXTRA_SIGN_IN_ACCOUNT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID");
            return com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT");
            return com.google.android.gms.auth.api.signin.GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT;
        }
    }
    
    public android.content.Intent getSignInIntent(org.xms.g.common.api.ExtensionApiClient param0);
    
    public org.xms.g.auth.api.signin.ExtensionSignInResult getSignInResultFromIntent(android.content.Intent param0);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> revokeAccess(org.xms.g.common.api.ExtensionApiClient param0);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> signOut(org.xms.g.common.api.ExtensionApiClient param0);
    
    public org.xms.g.common.api.OptionalPendingResult<org.xms.g.auth.api.signin.ExtensionSignInResult> silentSignIn(org.xms.g.common.api.ExtensionApiClient param0);
    
    default java.lang.Object getZInstanceExtensionSignInApi() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceExtensionSignInApi();
        } else {
            return getGInstanceExtensionSignInApi();
        }
    }
    
    default com.google.android.gms.auth.api.signin.GoogleSignInApi getGInstanceExtensionSignInApi() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.auth.api.signin.GoogleSignInApi) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.auth.api.signin.GoogleSignInApi() {
            
            public android.content.Intent getSignInIntent(com.google.android.gms.common.api.GoogleApiClient param0) {
                return org.xms.g.auth.api.signin.ExtensionSignInApi.this.getSignInIntent(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.XImpl(new org.xms.g.utils.XBox(param0, null)))));
            }
            
            public com.google.android.gms.auth.api.signin.GoogleSignInResult getSignInResultFromIntent(android.content.Intent param0) {
                org.xms.g.auth.api.signin.ExtensionSignInResult xResult = org.xms.g.auth.api.signin.ExtensionSignInApi.this.getSignInResultFromIntent(param0);
                return ((com.google.android.gms.auth.api.signin.GoogleSignInResult) ((xResult) == null ? null : (xResult.getGInstance())));
            }
            
            public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> revokeAccess(com.google.android.gms.common.api.GoogleApiClient param0) {
                org.xms.g.common.api.PendingResult xResult = org.xms.g.auth.api.signin.ExtensionSignInApi.this.revokeAccess(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.XImpl(new org.xms.g.utils.XBox(param0, null)))));
                return ((com.google.android.gms.common.api.PendingResult) ((xResult) == null ? null : (xResult.getGInstance())));
            }
            
            public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> signOut(com.google.android.gms.common.api.GoogleApiClient param0) {
                org.xms.g.common.api.PendingResult xResult = org.xms.g.auth.api.signin.ExtensionSignInApi.this.signOut(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.XImpl(new org.xms.g.utils.XBox(param0, null)))));
                return ((com.google.android.gms.common.api.PendingResult) ((xResult) == null ? null : (xResult.getGInstance())));
            }
            
            public com.google.android.gms.common.api.OptionalPendingResult<com.google.android.gms.auth.api.signin.GoogleSignInResult> silentSignIn(com.google.android.gms.common.api.GoogleApiClient param0) {
                org.xms.g.common.api.OptionalPendingResult xResult = org.xms.g.auth.api.signin.ExtensionSignInApi.this.silentSignIn(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.XImpl(new org.xms.g.utils.XBox(param0, null)))));
                return ((com.google.android.gms.common.api.OptionalPendingResult) ((xResult) == null ? null : (xResult.getGInstance())));
            }
        };
    }
    
    default com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService getHInstanceExtensionSignInApi() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService() {
            
            public android.content.Intent getSignInIntent(com.huawei.hms.api.HuaweiApiClient param0) {
                return org.xms.g.auth.api.signin.ExtensionSignInApi.this.getSignInIntent(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.XImpl(new org.xms.g.utils.XBox(null, param0)))));
            }
            
            public com.huawei.hms.support.hwid.result.HuaweiIdAuthResult parseHuaweiIdFromIntent(android.content.Intent param0) {
                org.xms.g.auth.api.signin.ExtensionSignInResult xResult = org.xms.g.auth.api.signin.ExtensionSignInApi.this.getSignInResultFromIntent(param0);
                return ((com.huawei.hms.support.hwid.result.HuaweiIdAuthResult) ((xResult) == null ? null : (xResult.getHInstance())));
            }
            
            public com.huawei.hms.support.api.client.PendingResult<com.huawei.hms.support.api.client.Status> cancelAuthorization(com.huawei.hms.api.HuaweiApiClient param0) {
                org.xms.g.common.api.PendingResult xResult = org.xms.g.auth.api.signin.ExtensionSignInApi.this.revokeAccess(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.XImpl(new org.xms.g.utils.XBox(null, param0)))));
                return ((com.huawei.hms.support.api.client.PendingResult) ((xResult) == null ? null : (xResult.getHInstance())));
            }
            
            public com.huawei.hms.support.api.client.PendingResult<com.huawei.hms.support.api.client.Status> signOut(com.huawei.hms.api.HuaweiApiClient param0) {
                org.xms.g.common.api.PendingResult xResult = org.xms.g.auth.api.signin.ExtensionSignInApi.this.signOut(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.XImpl(new org.xms.g.utils.XBox(null, param0)))));
                return ((com.huawei.hms.support.api.client.PendingResult) ((xResult) == null ? null : (xResult.getHInstance())));
            }
            
            public com.huawei.hms.common.api.OptionalPendingResult<com.huawei.hms.support.hwid.result.HuaweiIdAuthResult> silentSignIn(com.huawei.hms.api.HuaweiApiClient param0) {
                org.xms.g.common.api.OptionalPendingResult xResult = org.xms.g.auth.api.signin.ExtensionSignInApi.this.silentSignIn(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.XImpl(new org.xms.g.utils.XBox(null, param0)))));
                return ((com.huawei.hms.common.api.OptionalPendingResult) ((xResult) == null ? null : (xResult.getHInstance())));
            }
            
            public com.huawei.hms.support.api.client.PendingResult<com.huawei.hms.support.api.hwid.SignInResult> signIn(android.app.Activity param0, com.huawei.hms.api.HuaweiApiClient param1) {
                throw new java.lang.RuntimeException("Stub");
            }
            
            public com.huawei.hms.support.api.client.PendingResult<com.huawei.hms.support.api.hwid.SignInResult> signInBackend(com.huawei.hms.api.HuaweiApiClient param0) {
                throw new java.lang.RuntimeException("Stub");
            }
            
            public com.huawei.hms.support.api.hwid.SignInResult getHwIdSignInResultFromIntent(android.content.Intent param0) {
                throw new java.lang.RuntimeException("Stub");
            }
            
            public com.huawei.hms.support.api.client.PendingResult<com.huawei.hms.support.api.hwid.AddressResult> queryShippingAddress(com.huawei.hms.api.HuaweiApiClient param0, com.huawei.hms.support.hwid.result.AuthHuaweiId param1) {
                throw new java.lang.RuntimeException("Stub");
            }
        };
    }
    
    public static org.xms.g.auth.api.signin.ExtensionSignInApi dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.signin.ExtensionSignInApi) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.signin.GoogleSignInApi;
            }
        }
        return param0 instanceof org.xms.g.auth.api.signin.ExtensionSignInApi;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.auth.api.signin.ExtensionSignInApi {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public android.content.Intent getSignInIntent(org.xms.g.common.api.ExtensionApiClient param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService) this.getHInstance()).getSignInIntent(((com.huawei.hms.api.HuaweiApiClient) ((param0) == null ? null : (param0.getHInstance()))))");
                return ((com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService) this.getHInstance()).getSignInIntent(((com.huawei.hms.api.HuaweiApiClient) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInApi) this.getGInstance()).getSignInIntent(((com.google.android.gms.common.api.GoogleApiClient) ((param0) == null ? null : (param0.getGInstance()))))");
                return ((com.google.android.gms.auth.api.signin.GoogleSignInApi) this.getGInstance()).getSignInIntent(((com.google.android.gms.common.api.GoogleApiClient) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }
        
        public org.xms.g.auth.api.signin.ExtensionSignInResult getSignInResultFromIntent(android.content.Intent param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService) this.getHInstance()).parseHuaweiIdFromIntent(param0)");
                com.huawei.hms.support.hwid.result.HuaweiIdAuthResult hReturn = ((com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService) this.getHInstance()).parseHuaweiIdFromIntent(param0);
                return ((hReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInResult(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInApi) this.getGInstance()).getSignInResultFromIntent(param0)");
                com.google.android.gms.auth.api.signin.GoogleSignInResult gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInApi) this.getGInstance()).getSignInResultFromIntent(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInResult(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> revokeAccess(org.xms.g.common.api.ExtensionApiClient param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService) this.getHInstance()).cancelAuthorization(((com.huawei.hms.api.HuaweiApiClient) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.support.api.client.PendingResult hReturn = ((com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService) this.getHInstance()).cancelAuthorization(((com.huawei.hms.api.HuaweiApiClient) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInApi) this.getGInstance()).revokeAccess(((com.google.android.gms.common.api.GoogleApiClient) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.common.api.PendingResult gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInApi) this.getGInstance()).revokeAccess(((com.google.android.gms.common.api.GoogleApiClient) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> signOut(org.xms.g.common.api.ExtensionApiClient param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService) this.getHInstance()).signOut(((com.huawei.hms.api.HuaweiApiClient) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.support.api.client.PendingResult hReturn = ((com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService) this.getHInstance()).signOut(((com.huawei.hms.api.HuaweiApiClient) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInApi) this.getGInstance()).signOut(((com.google.android.gms.common.api.GoogleApiClient) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.common.api.PendingResult gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInApi) this.getGInstance()).signOut(((com.google.android.gms.common.api.GoogleApiClient) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.common.api.OptionalPendingResult<org.xms.g.auth.api.signin.ExtensionSignInResult> silentSignIn(org.xms.g.common.api.ExtensionApiClient param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService) this.getHInstance()).silentSignIn(((com.huawei.hms.api.HuaweiApiClient) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.common.api.OptionalPendingResult hReturn = ((com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService) this.getHInstance()).silentSignIn(((com.huawei.hms.api.HuaweiApiClient) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.common.api.OptionalPendingResult.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInApi) this.getGInstance()).silentSignIn(((com.google.android.gms.common.api.GoogleApiClient) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.common.api.OptionalPendingResult gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInApi) this.getGInstance()).silentSignIn(((com.google.android.gms.common.api.GoogleApiClient) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.OptionalPendingResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
}