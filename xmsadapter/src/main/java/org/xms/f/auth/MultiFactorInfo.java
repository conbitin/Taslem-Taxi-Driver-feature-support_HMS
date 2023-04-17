package org.xms.f.auth;




public abstract class MultiFactorInfo extends org.xms.g.utils.XObject implements android.os.Parcelable {
    
    private static final String MUITI_KEY = "factorIdKey";
    
    public MultiFactorInfo(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public MultiFactorInfo() {
        super(((org.xms.g.utils.XBox) null));
    }
    
    public static java.lang.String getFACTOR_ID_KEY() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.MultiFactorInfo.getFACTOR_ID_KEY");
            return MUITI_KEY;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.MultiFactorInfo.FACTOR_ID_KEY");
            return com.google.firebase.auth.MultiFactorInfo.FACTOR_ID_KEY;
        }
    }
    
    public abstract java.lang.String getUid();
    
    public abstract java.lang.String getDisplayName();
    
    public abstract long getEnrollmentTimestamp();
    
    public abstract java.lang.String getFactorId();
    
    public static org.xms.f.auth.MultiFactorInfo dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.MultiFactorInfo) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.MultiFactorInfo;
        }
    }
    
    public static class XImpl extends org.xms.f.auth.MultiFactorInfo {
        public static final android.os.Parcelable.Creator CREATOR = null;
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public java.lang.String getUid() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String getDisplayName() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public long getEnrollmentTimestamp() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String getFactorId() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public int describeContents() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}