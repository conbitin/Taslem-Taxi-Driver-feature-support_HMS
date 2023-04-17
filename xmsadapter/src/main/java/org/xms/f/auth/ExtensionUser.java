package org.xms.f.auth;




public abstract class ExtensionUser extends org.xms.g.utils.XObject implements android.os.Parcelable, org.xms.f.auth.UserInfo {
    
    
    
    public ExtensionUser(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public ExtensionUser() {
        super(((org.xms.g.utils.XBox) null));
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> delete() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public abstract java.lang.String getDisplayName();
    
    public abstract java.lang.String getEmail();
    
    public org.xms.g.tasks.Task<org.xms.f.auth.GetTokenResult> getIdToken(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).getToken(param0)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).getToken(param0);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseUser) this.getGInstance()).getIdToken(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.firebase.auth.FirebaseUser) this.getGInstance()).getIdToken(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public abstract org.xms.f.auth.ExtensionUserMetadata getMetadata();
    
    public abstract java.lang.String getPhoneNumber();
    
    public abstract android.net.Uri getPhotoUrl();
    
    public abstract org.xms.f.auth.MultiFactor getMultiFactor();
    
    public abstract java.util.List<? extends org.xms.f.auth.UserInfo> getProviderData();
    
    public abstract java.lang.String getProviderId();
    
    public abstract java.lang.String getUid();
    
    public abstract boolean isAnonymous();
    
    public org.xms.g.tasks.Task<org.xms.f.auth.AuthResult> linkWithCredential(org.xms.f.auth.AuthCredential param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).link(((com.huawei.agconnect.auth.AGConnectAuthCredential) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).link(((com.huawei.agconnect.auth.AGConnectAuthCredential) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseUser) this.getGInstance()).linkWithCredential(((com.google.firebase.auth.AuthCredential) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.firebase.auth.FirebaseUser) this.getGInstance()).linkWithCredential(((com.google.firebase.auth.AuthCredential) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> reauthenticate(org.xms.f.auth.AuthCredential param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<org.xms.f.auth.AuthResult> reauthenticateAndRetrieveData(org.xms.f.auth.AuthCredential param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            com.huawei.agconnect.auth.AGConnectAuth.getInstance().signOut();
            com.huawei.hmf.tasks.Task hReturn = com.huawei.agconnect.auth.AGConnectAuth.getInstance().signIn((com.huawei.agconnect.auth.AGConnectAuthCredential) param0.getHInstance());
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseUser) this.getGInstance()).reauthenticateAndRetrieveData(((com.google.firebase.auth.AuthCredential) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.firebase.auth.FirebaseUser) this.getGInstance()).reauthenticateAndRetrieveData(((com.google.firebase.auth.AuthCredential) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> reload() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ExtensionUser.reload()");
            return new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, new org.xms.f.TaskImpl()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseUser) this.getGInstance()).reload()");
            com.google.android.gms.tasks.Task gReturn = ((com.google.firebase.auth.FirebaseUser) this.getGInstance()).reload();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> sendEmailVerification(org.xms.f.auth.ActionCodeSettings param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> sendEmailVerification() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<org.xms.f.auth.AuthResult> startActivityForLinkWithProvider(android.app.Activity param0, org.xms.f.auth.FederatedAuthProvider param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<org.xms.f.auth.AuthResult> startActivityForReauthenticateWithProvider(android.app.Activity param0, org.xms.f.auth.FederatedAuthProvider param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<org.xms.f.auth.AuthResult> unlink(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ExtensionUser.unlink(param0)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).unlink(Integer.parseInt(param0));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseUser) this.getGInstance()).unlink(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.firebase.auth.FirebaseUser) this.getGInstance()).unlink(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> updateEmail(java.lang.String param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> updatePassword(java.lang.String param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> updatePhoneNumber(org.xms.f.auth.PhoneAuthCredential param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> updateProfile(org.xms.f.auth.UserProfileChangeRequest param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).updateProfile(((com.huawei.agconnect.auth.ProfileRequest) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).updateProfile(((com.huawei.agconnect.auth.ProfileRequest) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseUser) this.getGInstance()).updateProfile(((com.google.firebase.auth.UserProfileChangeRequest) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.firebase.auth.FirebaseUser) this.getGInstance()).updateProfile(((com.google.firebase.auth.UserProfileChangeRequest) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> verifyBeforeUpdateEmail(java.lang.String param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> verifyBeforeUpdateEmail(java.lang.String param0, org.xms.f.auth.ActionCodeSettings param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.f.auth.ExtensionUser dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.f.auth.ExtensionUser) {
            return ((org.xms.f.auth.ExtensionUser) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.firebase.auth.FirebaseUser gReturn = ((com.google.firebase.auth.FirebaseUser) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.agconnect.auth.AGConnectUser hReturn = ((com.huawei.agconnect.auth.AGConnectUser) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.f.auth.ExtensionUser.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.f.auth.ExtensionUser) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.agconnect.auth.AGConnectUser;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.FirebaseUser;
        }
    }
    
    public static class XImpl extends org.xms.f.auth.ExtensionUser {
        public static final android.os.Parcelable.Creator CREATOR = null;
        
        
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public java.lang.String getDisplayName() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).getDisplayName()");
                return ((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).getDisplayName();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseUser) this.getGInstance()).getDisplayName()");
                return ((com.google.firebase.auth.FirebaseUser) this.getGInstance()).getDisplayName();
            }
        }
        
        public java.lang.String getEmail() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).getEmail()");
                return ((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).getEmail();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseUser) this.getGInstance()).getEmail()");
                return ((com.google.firebase.auth.FirebaseUser) this.getGInstance()).getEmail();
            }
        }
        
        public org.xms.f.auth.ExtensionUserMetadata getMetadata() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String getPhoneNumber() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).getPhone()");
                return ((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).getPhone();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseUser) this.getGInstance()).getPhoneNumber()");
                return ((com.google.firebase.auth.FirebaseUser) this.getGInstance()).getPhoneNumber();
            }
        }
        
        public android.net.Uri getPhotoUrl() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "Uri.parse(((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).getPhotoUrl())");
                return android.net.Uri.parse(((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).getPhotoUrl());
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseUser) this.getGInstance()).getPhotoUrl()");
                return ((com.google.firebase.auth.FirebaseUser) this.getGInstance()).getPhotoUrl();
            }
        }
        
        public org.xms.f.auth.MultiFactor getMultiFactor() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.util.List<? extends org.xms.f.auth.UserInfo> getProviderData() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String getProviderId() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).getProviderId()");
                return ((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).getProviderId();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseUser) this.getGInstance()).getProviderId()");
                return ((com.google.firebase.auth.FirebaseUser) this.getGInstance()).getProviderId();
            }
        }
        
        public java.lang.String getUid() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).getUid()");
                return ((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).getUid();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseUser) this.getGInstance()).getUid()");
                return ((com.google.firebase.auth.FirebaseUser) this.getGInstance()).getUid();
            }
        }
        
        public boolean isAnonymous() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).isAnonymous()");
                return ((com.huawei.agconnect.auth.AGConnectUser) this.getHInstance()).isAnonymous();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseUser) this.getGInstance()).isAnonymous()");
                return ((com.google.firebase.auth.FirebaseUser) this.getGInstance()).isAnonymous();
            }
        }
        
        public int describeContents() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public boolean isEmailVerified() {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}