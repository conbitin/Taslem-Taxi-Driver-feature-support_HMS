package org.xms.f.auth;




public class UserProfileChangeRequest extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.f.auth.UserProfileChangeRequest createFromParcel(android.os.Parcel param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.f.auth.UserProfileChangeRequest[] newArray(int param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    };
    
    
    
    public UserProfileChangeRequest(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public java.lang.String getDisplayName() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.ProfileRequest) this.getHInstance()).getDisplayName()");
            return ((com.huawei.agconnect.auth.ProfileRequest) this.getHInstance()).getDisplayName();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.UserProfileChangeRequest) this.getGInstance()).getDisplayName()");
            return ((com.google.firebase.auth.UserProfileChangeRequest) this.getGInstance()).getDisplayName();
        }
    }
    
    public android.net.Uri getPhotoUri() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "Uri.parse(((com.huawei.agconnect.auth.ProfileRequest) this.getHInstance()).getPhotoUrl())");
            return android.net.Uri.parse(((com.huawei.agconnect.auth.ProfileRequest) this.getHInstance()).getPhotoUrl());
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.UserProfileChangeRequest) this.getGInstance()).getPhotoUri()");
            return ((com.google.firebase.auth.UserProfileChangeRequest) this.getGInstance()).getPhotoUri();
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.f.auth.UserProfileChangeRequest dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.UserProfileChangeRequest) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.agconnect.auth.ProfileRequest;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.UserProfileChangeRequest;
        }
    }
    
    public static class Builder extends org.xms.g.utils.XObject {
        
        
        
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.agconnect.auth.ProfileRequest.Builder());
            } else {
                this.setGInstance(new com.google.firebase.auth.UserProfileChangeRequest.Builder());
            }
        }
        
        public org.xms.f.auth.UserProfileChangeRequest build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.ProfileRequest.Builder) this.getHInstance()).build()");
                com.huawei.agconnect.auth.ProfileRequest hReturn = ((com.huawei.agconnect.auth.ProfileRequest.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.f.auth.UserProfileChangeRequest(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.UserProfileChangeRequest.Builder) this.getGInstance()).build()");
                com.google.firebase.auth.UserProfileChangeRequest gReturn = ((com.google.firebase.auth.UserProfileChangeRequest.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.f.auth.UserProfileChangeRequest(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.f.auth.UserProfileChangeRequest.Builder setDisplayName(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.ProfileRequest.Builder) this.getHInstance()).setDisplayName(param0)");
                com.huawei.agconnect.auth.ProfileRequest.Builder hReturn = ((com.huawei.agconnect.auth.ProfileRequest.Builder) this.getHInstance()).setDisplayName(param0);
                return ((hReturn) == null ? null : (new org.xms.f.auth.UserProfileChangeRequest.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.UserProfileChangeRequest.Builder) this.getGInstance()).setDisplayName(param0)");
                com.google.firebase.auth.UserProfileChangeRequest.Builder gReturn = ((com.google.firebase.auth.UserProfileChangeRequest.Builder) this.getGInstance()).setDisplayName(param0);
                return ((gReturn) == null ? null : (new org.xms.f.auth.UserProfileChangeRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.f.auth.UserProfileChangeRequest.Builder setPhotoUri(android.net.Uri param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.ProfileRequest.Builder) this.getHInstance()).setPhotoUrl(param0.toString())");
                com.huawei.agconnect.auth.ProfileRequest.Builder hReturn = ((com.huawei.agconnect.auth.ProfileRequest.Builder) this.getHInstance()).setPhotoUrl(param0.toString());
                return ((hReturn) == null ? null : (new org.xms.f.auth.UserProfileChangeRequest.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.UserProfileChangeRequest.Builder) this.getGInstance()).setPhotoUri(param0)");
                com.google.firebase.auth.UserProfileChangeRequest.Builder gReturn = ((com.google.firebase.auth.UserProfileChangeRequest.Builder) this.getGInstance()).setPhotoUri(param0);
                return ((gReturn) == null ? null : (new org.xms.f.auth.UserProfileChangeRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public static org.xms.f.auth.UserProfileChangeRequest.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.f.auth.UserProfileChangeRequest.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.agconnect.auth.ProfileRequest.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.UserProfileChangeRequest.Builder;
            }
        }
    }
}