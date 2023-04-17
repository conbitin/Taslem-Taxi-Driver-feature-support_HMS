package org.xms.f.auth;




public abstract class AuthCredential extends org.xms.g.utils.XObject implements android.os.Parcelable {
    
    
    
    public AuthCredential(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public abstract java.lang.String getProvider();
    
    public abstract java.lang.String getSignInMethod();
    
    public static org.xms.f.auth.AuthCredential dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.AuthCredential) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.agconnect.auth.AGConnectAuthCredential;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.AuthCredential;
        }
    }
    
    public static class XImpl extends org.xms.f.auth.AuthCredential {
        public static final android.os.Parcelable.Creator CREATOR = null;
        
        
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public java.lang.String getProvider() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.AuthCredential.XImpl.getProvider()");
                return String.valueOf(((com.huawei.agconnect.auth.AGConnectAuthCredential) this.getHInstance()).getProvider());
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.AuthCredential) this.getGInstance()).getProvider()");
                return ((com.google.firebase.auth.AuthCredential) this.getGInstance()).getProvider();
            }
        }
        
        public java.lang.String getSignInMethod() {
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