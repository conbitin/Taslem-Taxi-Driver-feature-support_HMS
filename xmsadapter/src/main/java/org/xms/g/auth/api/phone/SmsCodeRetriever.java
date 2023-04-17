package org.xms.g.auth.api.phone;




public final class SmsCodeRetriever extends org.xms.g.utils.XObject {
    
    
    
    public SmsCodeRetriever(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static java.lang.String getEXTRA_SMS_CODE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.phone.SmsCodeRetriever.getEXTRA_SMS_CODE");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.phone.SmsCodeRetriever.EXTRA_SMS_CODE");
            return com.google.android.gms.auth.api.phone.SmsCodeRetriever.EXTRA_SMS_CODE;
        }
    }
    
    public static java.lang.String getEXTRA_STATUS() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.phone.SmsCodeRetriever.getEXTRA_STATUS");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.phone.SmsCodeRetriever.EXTRA_STATUS");
            return com.google.android.gms.auth.api.phone.SmsCodeRetriever.EXTRA_STATUS;
        }
    }
    
    public static java.lang.String getSMS_CODE_RETRIEVED_ACTION() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.phone.SmsCodeRetriever.getSMS_CODE_RETRIEVED_ACTION");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.phone.SmsCodeRetriever.SMS_CODE_RETRIEVED_ACTION");
            return com.google.android.gms.auth.api.phone.SmsCodeRetriever.SMS_CODE_RETRIEVED_ACTION;
        }
    }
    
    public static org.xms.g.auth.api.phone.SmsCodeAutofillClient getAutofillClient(android.app.Activity param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.api.phone.SmsCodeAutofillClient getAutofillClient(android.content.Context param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.api.phone.SmsCodeRetriever dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.phone.SmsCodeRetriever) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("HMS does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.phone.SmsCodeRetriever;
        }
    }
}