package org.xms.g.auth.api.signin;

public class ExtensionSignInAccount extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.auth.api.signin.ExtensionSignInAccount createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.support.hwid.result.AuthHuaweiId hReturn = com.huawei.hms.support.hwid.result.AuthHuaweiId.CREATOR.createFromParcel(param0);
                return new org.xms.g.auth.api.signin.ExtensionSignInAccount(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.auth.api.signin.GoogleSignInAccount gReturn = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR.createFromParcel(param0);
                return new org.xms.g.auth.api.signin.ExtensionSignInAccount(new org.xms.g.utils.XBox(gReturn, null));
            }
        }
        
        public org.xms.g.auth.api.signin.ExtensionSignInAccount[] newArray(int param0) {
            return new org.xms.g.auth.api.signin.ExtensionSignInAccount[param0];
        }
    };
    
    public ExtensionSignInAccount(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public android.accounts.Account getAccount(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getHuaweiAccount()");
            return ((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getHuaweiAccount(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getAccount()");
            return ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getAccount();
        }
    }
    
    public java.lang.String getDisplayName() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getDisplayName()");
            return ((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getDisplayName();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getDisplayName()");
            return ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getDisplayName();
        }
    }
    
    public java.lang.String getEmail() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getEmail()");
            return ((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getEmail();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getEmail()");
            return ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getEmail();
        }
    }
    
    public java.lang.String getFamilyName() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getFamilyName()");
            return ((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getFamilyName();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getFamilyName()");
            return ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getFamilyName();
        }
    }
    
    public java.lang.String getGivenName() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getGivenName()");
            return ((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getGivenName();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getGivenName()");
            return ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getGivenName();
        }
    }
    
    public java.util.Set<org.xms.g.common.api.Scope> getGrantedScopes() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getAuthorizedScopes()");
            java.util.Set hReturn = ((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getAuthorizedScopes();
            return ((java.util.Set) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.support.api.entity.auth.Scope, org.xms.g.common.api.Scope>() {
                
                public org.xms.g.common.api.Scope apply(com.huawei.hms.support.api.entity.auth.Scope param0) {
                    return new org.xms.g.common.api.Scope(new org.xms.g.utils.XBox(null, param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getGrantedScopes()");
            java.util.Set gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getGrantedScopes();
            return ((java.util.Set) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.common.api.Scope, org.xms.g.common.api.Scope>() {
                
                public org.xms.g.common.api.Scope apply(com.google.android.gms.common.api.Scope param0) {
                    return new org.xms.g.common.api.Scope(new org.xms.g.utils.XBox(param0, null));
                }
            }));
        }
    }
    
    public java.lang.String getId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getUnionId()");
            return ((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getUnionId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getId()");
            return ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getId();
        }
    }
    
    public java.lang.String getIdToken() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getIdToken()");
            return ((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getIdToken();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getIdToken()");
            return ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getIdToken();
        }
    }
    
    public android.net.Uri getPhotoUrl() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getAvatarUri()");
            return ((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getAvatarUri();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getPhotoUrl()");
            return ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getPhotoUrl();
        }
    }
    
    public java.lang.String getServerAuthCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getAuthorizationCode()");
            return ((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).getAuthorizationCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getServerAuthCode()");
            return ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).getServerAuthCode();
        }
    }
    
    public int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).hashCode();
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.support.hwid.result.AuthHuaweiId) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.api.signin.ExtensionSignInAccount dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.signin.ExtensionSignInAccount) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.hwid.result.AuthHuaweiId;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.signin.GoogleSignInAccount;
        }
    }
}