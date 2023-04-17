package org.xms.f.auth;




public interface ExtensionUserMetadata extends org.xms.g.utils.XInterface, android.os.Parcelable {
    
    
    
    public long getCreationTimestamp();
    
    public long getLastSignInTimestamp();
    
    default java.lang.Object getZInstanceExtensionUserMetadata() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceExtensionUserMetadata();
        } else {
            return getGInstanceExtensionUserMetadata();
        }
    }
    
    default com.google.firebase.auth.FirebaseUserMetadata getGInstanceExtensionUserMetadata() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.firebase.auth.FirebaseUserMetadata) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.firebase.auth.FirebaseUserMetadata() {
            
            public long getCreationTimestamp() {
                return org.xms.f.auth.ExtensionUserMetadata.this.getCreationTimestamp();
            }
            
            public long getLastSignInTimestamp() {
                return org.xms.f.auth.ExtensionUserMetadata.this.getLastSignInTimestamp();
            }
            
            public int describeContents() {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            public void writeToParcel(android.os.Parcel param0, int param1) {
                throw new java.lang.RuntimeException("Not Supported");
            }
        };
    }
    
    default com.huawei.agconnect.auth.AGConnectUserExtra getHInstanceExtensionUserMetadata() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.agconnect.auth.AGConnectUserExtra) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.agconnect.auth.AGConnectUserExtra() {
            public String getCreateTime() {
                return String.valueOf(org.xms.f.auth.ExtensionUserMetadata.this.getCreationTimestamp());
            }
            public String getLastSignInTime() {
                return String.valueOf(org.xms.f.auth.ExtensionUserMetadata.this.getLastSignInTimestamp());
            }
        };
    }
    
    public static org.xms.f.auth.ExtensionUserMetadata dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.ExtensionUserMetadata) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.agconnect.auth.AGConnectUserExtra;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.FirebaseUserMetadata;
            }
        }
        return param0 instanceof org.xms.f.auth.ExtensionUserMetadata;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.f.auth.ExtensionUserMetadata {
        public static final android.os.Parcelable.Creator CREATOR = null;
        
        
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public long getCreationTimestamp() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "Integer.parseInt(((com.huawei.agconnect.auth.AGConnectUserExtra) this.getHInstance()).getCreateTime())");
                return Integer.parseInt(((com.huawei.agconnect.auth.AGConnectUserExtra) this.getHInstance()).getCreateTime());
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseUserMetadata) this.getGInstance()).getCreationTimestamp()");
                return ((com.google.firebase.auth.FirebaseUserMetadata) this.getGInstance()).getCreationTimestamp();
            }
        }
        
        public long getLastSignInTimestamp() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "Integer.parseInt(((com.huawei.agconnect.auth.AGConnectUserExtra) this.getHInstance()).getLastSignInTime())");
                return Integer.parseInt(((com.huawei.agconnect.auth.AGConnectUserExtra) this.getHInstance()).getLastSignInTime());
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseUserMetadata) this.getGInstance()).getLastSignInTimestamp()");
                return ((com.google.firebase.auth.FirebaseUserMetadata) this.getGInstance()).getLastSignInTimestamp();
            }
        }
        
        public int describeContents() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}