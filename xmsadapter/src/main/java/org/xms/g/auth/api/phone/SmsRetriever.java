package org.xms.g.auth.api.phone;




public final class SmsRetriever extends org.xms.g.utils.XObject {
    
    
    
    public SmsRetriever(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static java.lang.String getEXTRA_CONSENT_INTENT() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static java.lang.String getEXTRA_SIM_SUBSCRIPTION_ID() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static java.lang.String getEXTRA_SMS_MESSAGE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.sms.common.ReadSmsConstant.EXTRA_SMS_MESSAGE");
            return com.huawei.hms.support.sms.common.ReadSmsConstant.EXTRA_SMS_MESSAGE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.phone.SmsRetriever.EXTRA_SMS_MESSAGE");
            return com.google.android.gms.auth.api.phone.SmsRetriever.EXTRA_SMS_MESSAGE;
        }
    }
    
    public static java.lang.String getEXTRA_STATUS() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.sms.common.ReadSmsConstant.EXTRA_STATUS");
            return com.huawei.hms.support.sms.common.ReadSmsConstant.EXTRA_STATUS;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.phone.SmsRetriever.EXTRA_STATUS");
            return com.google.android.gms.auth.api.phone.SmsRetriever.EXTRA_STATUS;
        }
    }
    
    public static java.lang.String getSEND_PERMISSION() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static java.lang.String getSMS_RETRIEVED_ACTION() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.sms.common.ReadSmsConstant.READ_SMS_BROADCAST_ACTION");
            return com.huawei.hms.support.sms.common.ReadSmsConstant.READ_SMS_BROADCAST_ACTION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.phone.SmsRetriever.SMS_RETRIEVED_ACTION");
            return com.google.android.gms.auth.api.phone.SmsRetriever.SMS_RETRIEVED_ACTION;
        }
    }
    
    public static org.xms.g.auth.api.phone.SmsRetrieverClient getClient(android.app.Activity param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            if (param0 == null) {
                return null;
            }
            return new org.xms.g.auth.api.phone.SmsRetrieverClient.XImpl(null, null, param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.phone.SmsRetriever.getClient(param0)");
            com.google.android.gms.auth.api.phone.SmsRetrieverClient gReturn = com.google.android.gms.auth.api.phone.SmsRetriever.getClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.phone.SmsRetrieverClient.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.api.phone.SmsRetrieverClient getClient(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            if (param0 == null) {
                return null;
            }
            return new org.xms.g.auth.api.phone.SmsRetrieverClient.XImpl(null, null, param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.phone.SmsRetriever.getClient(param0)");
            com.google.android.gms.auth.api.phone.SmsRetrieverClient gReturn = com.google.android.gms.auth.api.phone.SmsRetriever.getClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.phone.SmsRetrieverClient.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.api.phone.SmsRetriever dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.phone.SmsRetriever) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.sms.common.ReadSmsConstant;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.phone.SmsRetriever;
        }
    }
}