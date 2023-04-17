package org.xms.f.auth;




public class PhoneMultiFactorGenerator extends org.xms.g.utils.XObject {
    
    private static final String PHONE_PROVIDER = "phone";
    
    public PhoneMultiFactorGenerator(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public PhoneMultiFactorGenerator() {
        super(((org.xms.g.utils.XBox) null));
    }
    
    public static java.lang.String getFACTOR_ID() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneMultiFactorGenerator.getFACTOR_ID");
            return PHONE_PROVIDER;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.PhoneMultiFactorGenerator.FACTOR_ID");
            return com.google.firebase.auth.PhoneMultiFactorGenerator.FACTOR_ID;
        }
    }
    
    public static org.xms.f.auth.PhoneMultiFactorAssertion getAssertion(org.xms.f.auth.PhoneAuthCredential param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.f.auth.PhoneMultiFactorGenerator dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.PhoneMultiFactorGenerator) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.PhoneMultiFactorGenerator;
        }
    }
}