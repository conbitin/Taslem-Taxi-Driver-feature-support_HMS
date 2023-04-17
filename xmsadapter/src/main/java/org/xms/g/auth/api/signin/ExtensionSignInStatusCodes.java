package org.xms.g.auth.api.signin;

public final class ExtensionSignInStatusCodes extends org.xms.g.common.api.CommonStatusCodes {
    
    public ExtensionSignInStatusCodes(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static int getSIGN_IN_CANCELLED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.result.HuaweiIdAuthResultCode.RESULT_CODE_CANCELLED");
            return com.huawei.hms.support.hwid.result.HuaweiIdAuthResultCode.RESULT_CODE_CANCELLED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_CANCELLED");
            return com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_CANCELLED;
        }
    }
    
    public static int getSIGN_IN_CURRENTLY_IN_PROGRESS() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.result.HuaweiIdAuthResultCode.RESULT_CODE_EXECUTING");
            return com.huawei.hms.support.hwid.result.HuaweiIdAuthResultCode.RESULT_CODE_EXECUTING;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS");
            return com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS;
        }
    }
    
    public static int getSIGN_IN_FAILED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.result.HuaweiIdAuthResultCode.RESULT_CODE_FAILED");
            return com.huawei.hms.support.hwid.result.HuaweiIdAuthResultCode.RESULT_CODE_FAILED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_FAILED");
            return com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_FAILED;
        }
    }
    
    public static java.lang.String getStatusCodeString(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.result.HuaweiIdAuthResultCode.getResultDescription(param0)");
            return com.huawei.hms.support.hwid.result.HuaweiIdAuthResultCode.getResultDescription(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.getStatusCodeString(param0)");
            return com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.getStatusCodeString(param0);
        }
    }
    
    public static org.xms.g.auth.api.signin.ExtensionSignInStatusCodes dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.signin.ExtensionSignInStatusCodes) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.hwid.result.HuaweiIdAuthResultCode;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
        }
    }
}