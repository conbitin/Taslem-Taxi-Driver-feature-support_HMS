package org.xms.g.auth.api.credentials;




public class CredentialsClient extends org.xms.g.common.api.ExtensionApi<org.xms.g.auth.api.Auth.AuthCredentialsOptions> {
    
    
    
    public CredentialsClient(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> delete(org.xms.g.auth.api.credentials.Credential param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsClient.delete(org.xms.g.auth.api.credentials.Credential)");
            return new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, new org.xms.g.auth.TaskEmptyImpl()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialsClient) this.getGInstance()).delete(((com.google.android.gms.auth.api.credentials.Credential) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.auth.api.credentials.CredentialsClient) this.getGInstance()).delete(((com.google.android.gms.auth.api.credentials.Credential) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> disableAutoSignIn() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsClient.disableAutoSignIn()");
            return new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, new org.xms.g.auth.TaskEmptyImpl()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialsClient) this.getGInstance()).disableAutoSignIn()");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.auth.api.credentials.CredentialsClient) this.getGInstance()).disableAutoSignIn();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public android.app.PendingIntent getHintPickerIntent(org.xms.g.auth.api.credentials.HintRequest param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<org.xms.g.auth.api.credentials.CredentialRequestResponse> request(org.xms.g.auth.api.credentials.CredentialRequest param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsClient.request(org.xms.g.auth.api.credentials.CredentialRequest)");
            return new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, new org.xms.g.auth.TaskEmptyImpl()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialsClient) this.getGInstance()).request(((com.google.android.gms.auth.api.credentials.CredentialRequest) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.auth.api.credentials.CredentialsClient) this.getGInstance()).request(((com.google.android.gms.auth.api.credentials.CredentialRequest) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> save(org.xms.g.auth.api.credentials.Credential param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsClient.save(org.xms.g.auth.api.credentials.Credential)");
            return new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, new org.xms.g.auth.TaskEmptyImpl()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialsClient) this.getGInstance()).save(((com.google.android.gms.auth.api.credentials.Credential) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.auth.api.credentials.CredentialsClient) this.getGInstance()).save(((com.google.android.gms.auth.api.credentials.Credential) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public java.lang.Object getApiKey() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.api.credentials.CredentialsClient dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.auth.api.credentials.CredentialsClient) {
            return ((org.xms.g.auth.api.credentials.CredentialsClient) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.auth.api.credentials.CredentialsClient gReturn = ((com.google.android.gms.auth.api.credentials.CredentialsClient) ((org.xms.g.utils.XGettable) param0).getGInstance());
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsClient.dynamicCast(java.lang.Object)");
            java.lang.Object hReturn = ((org.xms.g.utils.XGettable) param0).getHInstance();
            return new org.xms.g.auth.api.credentials.CredentialsClient(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.auth.api.credentials.CredentialsClient) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsClient.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.credentials.CredentialsClient;
        }
    }
}