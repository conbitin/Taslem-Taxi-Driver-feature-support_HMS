package org.xms.g.auth.api.credentials;




public class CredentialRequestResponse extends org.xms.g.common.api.Response<org.xms.g.auth.api.credentials.CredentialRequestResult> {
    
    
    
    public CredentialRequestResponse(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public org.xms.g.auth.api.credentials.Credential getCredential() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialRequestResponse.getCredential()");
            return new org.xms.g.auth.api.credentials.Credential(new org.xms.g.utils.XBox(null, new java.lang.Object()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialRequestResponse) this.getGInstance()).getCredential()");
            com.google.android.gms.auth.api.credentials.Credential gReturn = ((com.google.android.gms.auth.api.credentials.CredentialRequestResponse) this.getGInstance()).getCredential();
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.Credential(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.api.credentials.CredentialRequestResponse dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.credentials.CredentialRequestResponse) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialRequestResponse.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.credentials.CredentialRequestResponse;
        }
    }
}