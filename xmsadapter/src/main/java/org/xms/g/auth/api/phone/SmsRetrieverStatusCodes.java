package org.xms.g.auth.api.phone;




public final class SmsRetrieverStatusCodes extends org.xms.g.common.api.CommonStatusCodes {
    
    
    
    public SmsRetrieverStatusCodes(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static int getAPI_NOT_AVAILABLE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.phone.SmsRetrieverStatusCodes.getAPI_NOT_AVAILABLE");
            return 0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.phone.SmsRetrieverStatusCodes.API_NOT_AVAILABLE");
            return com.google.android.gms.auth.api.phone.SmsRetrieverStatusCodes.API_NOT_AVAILABLE;
        }
    }
    
    public static int getPLATFORM_NOT_SUPPORTED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.phone.SmsRetrieverStatusCodes.getPLATFORM_NOT_SUPPORTED");
            return 0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.phone.SmsRetrieverStatusCodes.PLATFORM_NOT_SUPPORTED");
            return com.google.android.gms.auth.api.phone.SmsRetrieverStatusCodes.PLATFORM_NOT_SUPPORTED;
        }
    }
    
    public static int getUSER_PERMISSION_REQUIRED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.phone.SmsRetrieverStatusCodes.getUSER_PERMISSION_REQUIRED");
            return 0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.phone.SmsRetrieverStatusCodes.USER_PERMISSION_REQUIRED");
            return com.google.android.gms.auth.api.phone.SmsRetrieverStatusCodes.USER_PERMISSION_REQUIRED;
        }
    }
    
    public static java.lang.String getStatusCodeString(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.phone.SmsRetrieverStatusCodes.getStatusCodeString");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.phone.SmsRetrieverStatusCodes.getStatusCodeString(param0)");
            return com.google.android.gms.auth.api.phone.SmsRetrieverStatusCodes.getStatusCodeString(param0);
        }
    }
    
    public static org.xms.g.auth.api.phone.SmsRetrieverStatusCodes dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.phone.SmsRetrieverStatusCodes) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("HMS does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.phone.SmsRetrieverStatusCodes;
        }
    }
}