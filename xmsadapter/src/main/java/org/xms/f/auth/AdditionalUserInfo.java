package org.xms.f.auth;




public interface AdditionalUserInfo extends org.xms.g.utils.XInterface, android.os.Parcelable {
    
    
    
    public java.util.Map<java.lang.String, java.lang.Object> getProfile();
    
    public java.lang.String getProviderId();
    
    public java.lang.String getUsername();
    
    public boolean isNewUser();
    
    default java.lang.Object getZInstanceAdditionalUserInfo() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceAdditionalUserInfo();
        } else {
            return getGInstanceAdditionalUserInfo();
        }
    }
    
    default com.google.firebase.auth.AdditionalUserInfo getGInstanceAdditionalUserInfo() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.firebase.auth.AdditionalUserInfo) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.firebase.auth.AdditionalUserInfo() {
            
            public java.util.Map<java.lang.String, java.lang.Object> getProfile() {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            public java.lang.String getProviderId() {
                return org.xms.f.auth.AdditionalUserInfo.this.getProviderId();
            }
            
            public java.lang.String getUsername() {
                return org.xms.f.auth.AdditionalUserInfo.this.getUsername();
            }
            
            public boolean isNewUser() {
                return org.xms.f.auth.AdditionalUserInfo.this.isNewUser();
            }
            
            public int describeContents() {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            public void writeToParcel(android.os.Parcel param0, int param1) {
                throw new java.lang.RuntimeException("Not Supported");
            }
        };
    }
    
    default java.lang.Object getHInstanceAdditionalUserInfo() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((java.lang.Object) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new java.lang.Object();
    }
    
    public static org.xms.f.auth.AdditionalUserInfo dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.AdditionalUserInfo) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.AdditionalUserInfo;
            }
        }
        return param0 instanceof org.xms.f.auth.AdditionalUserInfo;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.f.auth.AdditionalUserInfo {
        public static final android.os.Parcelable.Creator CREATOR = null;
        
        
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public java.util.Map<java.lang.String, java.lang.Object> getProfile() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String getProviderId() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.AGConnectAuth.getInstance().getCurrentUser().getProviderId()");
                return com.huawei.agconnect.auth.AGConnectAuth.getInstance().getCurrentUser().getProviderId();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.AdditionalUserInfo) this.getGInstance()).getProviderId()");
                return ((com.google.firebase.auth.AdditionalUserInfo) this.getGInstance()).getProviderId();
            }
        }
        
        public java.lang.String getUsername() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.AGConnectAuth.getInstance().getCurrentUser().getDisplayName()");
                return com.huawei.agconnect.auth.AGConnectAuth.getInstance().getCurrentUser().getDisplayName();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.AdditionalUserInfo) this.getGInstance()).getUsername()");
                return ((com.google.firebase.auth.AdditionalUserInfo) this.getGInstance()).getUsername();
            }
        }
        
        public boolean isNewUser() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.AdditionalUserInfo.XImpl.isNewUser");
                com.huawei.agconnect.auth.AGConnectUserExtra agConnectUserExtra =
                        com.huawei.agconnect.auth.AGConnectAuth.getInstance().getCurrentUser().getUserExtra().getResult();
                return agConnectUserExtra.getCreateTime().equals(agConnectUserExtra.getLastSignInTime());
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.AdditionalUserInfo) this.getGInstance()).isNewUser()");
                return ((com.google.firebase.auth.AdditionalUserInfo) this.getGInstance()).isNewUser();
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