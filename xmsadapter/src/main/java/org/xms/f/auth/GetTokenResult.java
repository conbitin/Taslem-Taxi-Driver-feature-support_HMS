package org.xms.f.auth;




public class GetTokenResult extends org.xms.g.utils.XObject {
    
    
    
    public GetTokenResult(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public long getAuthTimestamp() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public java.util.Map<java.lang.String, java.lang.Object> getClaims() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.GetTokenResult.getClaims()");
            return new java.util.HashMap<>();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.GetTokenResult) this.getGInstance()).getClaims()");
            return ((com.google.firebase.auth.GetTokenResult) this.getGInstance()).getClaims();
        }
    }
    
    public long getExpirationTimestamp() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.TokenResult) this.getHInstance()).getExpirePeriod()");
            return ((com.huawei.agconnect.auth.TokenResult) this.getHInstance()).getExpirePeriod();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.GetTokenResult) this.getGInstance()).getExpirationTimestamp()");
            return ((com.google.firebase.auth.GetTokenResult) this.getGInstance()).getExpirationTimestamp();
        }
    }
    
    public long getIssuedAtTimestamp() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.GetTokenResult.getIssuedAtTimestamp()");
            return 1;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.GetTokenResult) this.getGInstance()).getIssuedAtTimestamp()");
            return ((com.google.firebase.auth.GetTokenResult) this.getGInstance()).getIssuedAtTimestamp();
        }
    }
    
    public java.lang.String getSignInProvider() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.AGConnectAuth.getInstance().getCurrentUser().getProviderId()");
            return com.huawei.agconnect.auth.AGConnectAuth.getInstance().getCurrentUser().getProviderId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.GetTokenResult) this.getGInstance()).getSignInProvider()");
            return ((com.google.firebase.auth.GetTokenResult) this.getGInstance()).getSignInProvider();
        }
    }
    
    public java.lang.String getToken() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.TokenResult) this.getHInstance()).getToken()");
            return ((com.huawei.agconnect.auth.TokenResult) this.getHInstance()).getToken();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.GetTokenResult) this.getGInstance()).getToken()");
            return ((com.google.firebase.auth.GetTokenResult) this.getGInstance()).getToken();
        }
    }
    
    public static org.xms.f.auth.GetTokenResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.GetTokenResult) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.agconnect.auth.TokenResult;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.GetTokenResult;
        }
    }
}