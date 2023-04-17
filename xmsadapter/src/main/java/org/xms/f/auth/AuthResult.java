package org.xms.f.auth;

public interface AuthResult extends org.xms.g.utils.XInterface, android.os.Parcelable {
    
    public org.xms.f.auth.AdditionalUserInfo getAdditionalUserInfo();
    
    public org.xms.f.auth.AuthCredential getCredential();
    
    public org.xms.f.auth.ExtensionUser getUser();
    
    default java.lang.Object getZInstanceAuthResult() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceAuthResult();
        } else {
            return getGInstanceAuthResult();
        }
    }
    
    default com.google.firebase.auth.AuthResult getGInstanceAuthResult() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.firebase.auth.AuthResult) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.firebase.auth.AuthResult() {
            
            public com.google.firebase.auth.AdditionalUserInfo getAdditionalUserInfo() {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            public com.google.firebase.auth.AuthCredential getCredential() {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            public com.google.firebase.auth.FirebaseUser getUser() {
                org.xms.f.auth.ExtensionUser xResult = org.xms.f.auth.AuthResult.this.getUser();
                return ((com.google.firebase.auth.FirebaseUser) ((xResult) == null ? null : (xResult.getGInstance())));
            }
            
            public int describeContents() {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            public void writeToParcel(android.os.Parcel param0, int param1) {
                throw new java.lang.RuntimeException("Not Supported");
            }
        };
    }
    
    default com.huawei.agconnect.auth.SignInResult getHInstanceAuthResult() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.agconnect.auth.SignInResult) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.agconnect.auth.SignInResult() {
            
            public com.huawei.agconnect.auth.AGConnectUser getUser() {
                org.xms.f.auth.ExtensionUser xResult = org.xms.f.auth.AuthResult.this.getUser();
                return ((com.huawei.agconnect.auth.AGConnectUser) ((xResult) == null ? null : (xResult.getHInstance())));
            }
        };
    }
    
    public static org.xms.f.auth.AuthResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.AuthResult) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.agconnect.auth.SignInResult;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.AuthResult;
            }
        }
        return param0 instanceof org.xms.f.auth.AuthResult;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.f.auth.AuthResult {
        public static final android.os.Parcelable.Creator CREATOR = null;
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public org.xms.f.auth.AdditionalUserInfo getAdditionalUserInfo() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.f.auth.AuthCredential getCredential() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.f.auth.ExtensionUser getUser() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.SignInResult) this.getHInstance()).getUser()");
                com.huawei.agconnect.auth.AGConnectUser hReturn = ((com.huawei.agconnect.auth.SignInResult) this.getHInstance()).getUser();
                return ((hReturn) == null ? null : (new org.xms.f.auth.ExtensionUser.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.AuthResult) this.getGInstance()).getUser()");
                com.google.firebase.auth.FirebaseUser gReturn = ((com.google.firebase.auth.AuthResult) this.getGInstance()).getUser();
                return ((gReturn) == null ? null : (new org.xms.f.auth.ExtensionUser.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
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