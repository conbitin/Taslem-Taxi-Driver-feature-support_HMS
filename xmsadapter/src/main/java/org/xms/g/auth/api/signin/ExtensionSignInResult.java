package org.xms.g.auth.api.signin;

public class ExtensionSignInResult extends org.xms.g.utils.XObject implements org.xms.g.common.api.Result {
    
    public ExtensionSignInResult(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public org.xms.g.auth.api.signin.ExtensionSignInAccount getSignInAccount() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.result.HuaweiIdAuthResult) this.getHInstance()).getHuaweiId()");
            com.huawei.hms.support.hwid.result.AuthHuaweiId hReturn = ((com.huawei.hms.support.hwid.result.HuaweiIdAuthResult) this.getHInstance()).getHuaweiId();
            return ((hReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInAccount(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInResult) this.getGInstance()).getSignInAccount()");
            com.google.android.gms.auth.api.signin.GoogleSignInAccount gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInResult) this.getGInstance()).getSignInAccount();
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInAccount(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.common.api.Status getStatus() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.result.HuaweiIdAuthResult) this.getHInstance()).getStatus()");
            com.huawei.hms.support.api.client.Status hReturn = ((com.huawei.hms.support.hwid.result.HuaweiIdAuthResult) this.getHInstance()).getStatus();
            return ((hReturn) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInResult) this.getGInstance()).getStatus()");
            com.google.android.gms.common.api.Status gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInResult) this.getGInstance()).getStatus();
            return ((gReturn) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public boolean isSuccess() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.result.HuaweiIdAuthResult) this.getHInstance()).isSuccess()");
            return ((com.huawei.hms.support.hwid.result.HuaweiIdAuthResult) this.getHInstance()).isSuccess();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInResult) this.getGInstance()).isSuccess()");
            return ((com.google.android.gms.auth.api.signin.GoogleSignInResult) this.getGInstance()).isSuccess();
        }
    }
    
    public static org.xms.g.auth.api.signin.ExtensionSignInResult dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.auth.api.signin.ExtensionSignInResult) {
            return ((org.xms.g.auth.api.signin.ExtensionSignInResult) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.auth.api.signin.GoogleSignInResult gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInResult) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.support.hwid.result.HuaweiIdAuthResult hReturn = ((com.huawei.hms.support.hwid.result.HuaweiIdAuthResult) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.auth.api.signin.ExtensionSignInResult(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.auth.api.signin.ExtensionSignInResult) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.signin.GoogleSignInResult;
        }
    }
}