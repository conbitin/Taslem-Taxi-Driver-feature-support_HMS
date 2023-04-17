package org.xms.g.auth.api.credentials;




public interface CredentialsApi extends org.xms.g.utils.XInterface {
    
    
    
    public static int getACTIVITY_RESULT_ADD_ACCOUNT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsApi.getACTIVITY_RESULT_ADD_ACCOUNT()");
            return 0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT");
            return com.google.android.gms.auth.api.credentials.CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        }
    }
    
    public static int getACTIVITY_RESULT_NO_HINTS_AVAILABLE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsApi.getACTIVITY_RESULT_NO_HINTS_AVAILABLE()");
            return 0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE");
            return com.google.android.gms.auth.api.credentials.CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE;
        }
    }
    
    public static int getACTIVITY_RESULT_OTHER_ACCOUNT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsApi.getACTIVITY_RESULT_OTHER_ACCOUNT()");
            return 0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.CredentialsApi.ACTIVITY_RESULT_OTHER_ACCOUNT");
            return com.google.android.gms.auth.api.credentials.CredentialsApi.ACTIVITY_RESULT_OTHER_ACCOUNT;
        }
    }
    
    public static int getCREDENTIAL_PICKER_REQUEST_CODE() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> delete(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.auth.api.credentials.Credential param1);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> disableAutoSignIn(org.xms.g.common.api.ExtensionApiClient param0);
    
    public android.app.PendingIntent getHintPickerIntent(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.auth.api.credentials.HintRequest param1);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.auth.api.credentials.CredentialRequestResult> request(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.auth.api.credentials.CredentialRequest param1);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> save(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.auth.api.credentials.Credential param1);
    
    default java.lang.Object getZInstanceCredentialsApi() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceCredentialsApi();
        } else {
            return getGInstanceCredentialsApi();
        }
    }
    
    default com.google.android.gms.auth.api.credentials.CredentialsApi getGInstanceCredentialsApi() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.auth.api.credentials.CredentialsApi) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.auth.api.credentials.CredentialsApi() {
            
            public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> delete(com.google.android.gms.common.api.GoogleApiClient param0, com.google.android.gms.auth.api.credentials.Credential param1) {
                org.xms.g.common.api.PendingResult xResult = org.xms.g.auth.api.credentials.CredentialsApi.this.delete(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.XImpl(new org.xms.g.utils.XBox(param0, null)))), ((param1) == null ? null : (new org.xms.g.auth.api.credentials.Credential(new org.xms.g.utils.XBox(param1, null)))));
                return ((com.google.android.gms.common.api.PendingResult) ((xResult) == null ? null : (xResult.getGInstance())));
            }
            
            public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> disableAutoSignIn(com.google.android.gms.common.api.GoogleApiClient param0) {
                org.xms.g.common.api.PendingResult xResult = org.xms.g.auth.api.credentials.CredentialsApi.this.disableAutoSignIn(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.XImpl(new org.xms.g.utils.XBox(param0, null)))));
                return ((com.google.android.gms.common.api.PendingResult) ((xResult) == null ? null : (xResult.getGInstance())));
            }
            
            public android.app.PendingIntent getHintPickerIntent(com.google.android.gms.common.api.GoogleApiClient param0, com.google.android.gms.auth.api.credentials.HintRequest param1) {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            public com.google.android.gms.common.api.PendingResult<com.google.android.gms.auth.api.credentials.CredentialRequestResult> request(com.google.android.gms.common.api.GoogleApiClient param0, com.google.android.gms.auth.api.credentials.CredentialRequest param1) {
                org.xms.g.common.api.PendingResult xResult = org.xms.g.auth.api.credentials.CredentialsApi.this.request(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.XImpl(new org.xms.g.utils.XBox(param0, null)))), ((param1) == null ? null : (new org.xms.g.auth.api.credentials.CredentialRequest(new org.xms.g.utils.XBox(param1, null)))));
                return ((com.google.android.gms.common.api.PendingResult) ((xResult) == null ? null : (xResult.getGInstance())));
            }
            
            public com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> save(com.google.android.gms.common.api.GoogleApiClient param0, com.google.android.gms.auth.api.credentials.Credential param1) {
                org.xms.g.common.api.PendingResult xResult = org.xms.g.auth.api.credentials.CredentialsApi.this.save(((param0) == null ? null : (new org.xms.g.common.api.ExtensionApiClient.XImpl(new org.xms.g.utils.XBox(param0, null)))), ((param1) == null ? null : (new org.xms.g.auth.api.credentials.Credential(new org.xms.g.utils.XBox(param1, null)))));
                return ((com.google.android.gms.common.api.PendingResult) ((xResult) == null ? null : (xResult.getGInstance())));
            }
        };
    }
    
    default java.lang.Object getHInstanceCredentialsApi() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((java.lang.Object) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new java.lang.Object();
    }
    
    public static org.xms.g.auth.api.credentials.CredentialsApi dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.credentials.CredentialsApi) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsApi.isInstance(java.lang.Object)");
            return false;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.credentials.CredentialsApi;
            }
        }
        return param0 instanceof org.xms.g.auth.api.credentials.CredentialsApi;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.auth.api.credentials.CredentialsApi {
        
        
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> delete(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.auth.api.credentials.Credential param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsApi.XImpl.delete(org.xms.g.common.api.ExtensionApiClientorg.xms.g.auth.api.credentials.Credential)");
                return new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(null, new org.xms.g.auth.PendingResultEmptyImpl()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialsApi) this.getGInstance()).delete(((com.google.android.gms.common.api.GoogleApiClient) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.auth.api.credentials.Credential) ((param1) == null ? null : (param1.getGInstance()))))");
                com.google.android.gms.common.api.PendingResult gReturn = ((com.google.android.gms.auth.api.credentials.CredentialsApi) this.getGInstance()).delete(((com.google.android.gms.common.api.GoogleApiClient) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.auth.api.credentials.Credential) ((param1) == null ? null : (param1.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> disableAutoSignIn(org.xms.g.common.api.ExtensionApiClient param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsApi.XImpl.disableAutoSignIn(org.xms.g.common.api.ExtensionApiClient)");
                return new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(null, new org.xms.g.auth.PendingResultEmptyImpl()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialsApi) this.getGInstance()).disableAutoSignIn(((com.google.android.gms.common.api.GoogleApiClient) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.common.api.PendingResult gReturn = ((com.google.android.gms.auth.api.credentials.CredentialsApi) this.getGInstance()).disableAutoSignIn(((com.google.android.gms.common.api.GoogleApiClient) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public android.app.PendingIntent getHintPickerIntent(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.auth.api.credentials.HintRequest param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.auth.api.credentials.CredentialRequestResult> request(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.auth.api.credentials.CredentialRequest param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsApi.XImpl.request(org.xms.g.common.api.ExtensionApiClientorg.xms.g.auth.api.credentials.CredentialRequest)");
                return new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(null, new org.xms.g.auth.PendingResultEmptyImpl()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialsApi) this.getGInstance()).request(((com.google.android.gms.common.api.GoogleApiClient) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.auth.api.credentials.CredentialRequest) ((param1) == null ? null : (param1.getGInstance()))))");
                com.google.android.gms.common.api.PendingResult gReturn = ((com.google.android.gms.auth.api.credentials.CredentialsApi) this.getGInstance()).request(((com.google.android.gms.common.api.GoogleApiClient) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.auth.api.credentials.CredentialRequest) ((param1) == null ? null : (param1.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> save(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.auth.api.credentials.Credential param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsApi.XImpl.save(org.xms.g.common.api.ExtensionApiClientorg.xms.g.auth.api.credentials.Credential)");
                return new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(null, new org.xms.g.auth.PendingResultEmptyImpl()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialsApi) this.getGInstance()).save(((com.google.android.gms.common.api.GoogleApiClient) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.auth.api.credentials.Credential) ((param1) == null ? null : (param1.getGInstance()))))");
                com.google.android.gms.common.api.PendingResult gReturn = ((com.google.android.gms.auth.api.credentials.CredentialsApi) this.getGInstance()).save(((com.google.android.gms.common.api.GoogleApiClient) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.auth.api.credentials.Credential) ((param1) == null ? null : (param1.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
}