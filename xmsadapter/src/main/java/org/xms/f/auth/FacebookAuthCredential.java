package org.xms.f.auth;




public class FacebookAuthCredential extends org.xms.f.auth.AuthCredential {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.f.auth.FacebookAuthCredential createFromParcel(android.os.Parcel param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.f.auth.FacebookAuthCredential[] newArray(int param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    };
    
    
    
    public FacebookAuthCredential(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public java.lang.String getProvider() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.FacebookAuthCredential.getProvider()");
            return String.valueOf(((com.huawei.agconnect.auth.AGConnectAuthCredential) this.getHInstance()).getProvider());
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FacebookAuthCredential) this.getGInstance()).getProvider()");
            return ((com.google.firebase.auth.FacebookAuthCredential) this.getGInstance()).getProvider();
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
    
    public static org.xms.f.auth.FacebookAuthCredential dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.f.auth.FacebookAuthCredential) {
            return ((org.xms.f.auth.FacebookAuthCredential) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.firebase.auth.FacebookAuthCredential gReturn = ((com.google.firebase.auth.FacebookAuthCredential) ((org.xms.g.utils.XGettable) param0).getGInstance());
            
            throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
        }
        return ((org.xms.f.auth.FacebookAuthCredential) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.FacebookAuthCredential;
        }
    }
}