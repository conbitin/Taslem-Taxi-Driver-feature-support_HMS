package org.xms.g.auth.api.signin;

public class ExtensionSignInClient extends org.xms.g.common.api.ExtensionApi<org.xms.g.auth.api.signin.ExtensionSignInOptions> {
    
    public ExtensionSignInClient(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public android.content.Intent getSignInIntent() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.service.HuaweiIdAuthService) this.getHInstance()).getSignInIntent()");
            return ((com.huawei.hms.support.hwid.service.HuaweiIdAuthService) this.getHInstance()).getSignInIntent();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInClient) this.getGInstance()).getSignInIntent()");
            return ((com.google.android.gms.auth.api.signin.GoogleSignInClient) this.getGInstance()).getSignInIntent();
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> revokeAccess() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.service.HuaweiIdAuthService) this.getHInstance()).cancelAuthorization()");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.support.hwid.service.HuaweiIdAuthService) this.getHInstance()).cancelAuthorization();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInClient) this.getGInstance()).revokeAccess()");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInClient) this.getGInstance()).revokeAccess();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> signOut() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.service.HuaweiIdAuthService) this.getHInstance()).signOut()");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.support.hwid.service.HuaweiIdAuthService) this.getHInstance()).signOut();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInClient) this.getGInstance()).signOut()");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInClient) this.getGInstance()).signOut();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.tasks.Task<org.xms.g.auth.api.signin.ExtensionSignInAccount> silentSignIn() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.service.HuaweiIdAuthService) this.getHInstance()).silentSignIn()");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.support.hwid.service.HuaweiIdAuthService) this.getHInstance()).silentSignIn();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInClient) this.getGInstance()).silentSignIn()");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInClient) this.getGInstance()).silentSignIn();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public java.lang.Object getApiKey() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.api.signin.ExtensionSignInClient dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.auth.api.signin.ExtensionSignInClient) {
            return ((org.xms.g.auth.api.signin.ExtensionSignInClient) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.auth.api.signin.GoogleSignInClient gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInClient) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.support.hwid.service.HuaweiIdAuthService hReturn = ((com.huawei.hms.support.hwid.service.HuaweiIdAuthService) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.auth.api.signin.ExtensionSignInClient(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.auth.api.signin.ExtensionSignInClient) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.hwid.service.HuaweiIdAuthService;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.signin.GoogleSignInClient;
        }
    }
}