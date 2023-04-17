package org.xms.f.auth;




public class FacebookAuthProvider extends org.xms.g.utils.XObject {
    
    
    
    public FacebookAuthProvider(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static java.lang.String getFACEBOOK_SIGN_IN_METHOD() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.AGConnectAuthCredential.Facebook_Provider");
            return String.valueOf(com.huawei.agconnect.auth.AGConnectAuthCredential.Facebook_Provider);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.FacebookAuthProvider.FACEBOOK_SIGN_IN_METHOD");
            return com.google.firebase.auth.FacebookAuthProvider.FACEBOOK_SIGN_IN_METHOD;
        }
    }
    
    public java.lang.String getPROVIDER_ID() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.AGConnectAuthCredential.Facebook_Provider");
            return String.valueOf(com.huawei.agconnect.auth.AGConnectAuthCredential.Facebook_Provider);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FacebookAuthProvider) this.getGInstance()).PROVIDER_ID");
            return ((com.google.firebase.auth.FacebookAuthProvider) this.getGInstance()).PROVIDER_ID;
        }
    }
    
    public static org.xms.f.auth.AuthCredential getCredential(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.FacebookAuthProvider.credentialWithToken(param0)");
            com.huawei.agconnect.auth.AGConnectAuthCredential hReturn = com.huawei.agconnect.auth.FacebookAuthProvider.credentialWithToken(param0);
            return ((hReturn) == null ? null : (new org.xms.f.auth.AuthCredential.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.FacebookAuthProvider.getCredential(param0)");
            com.google.firebase.auth.AuthCredential gReturn = com.google.firebase.auth.FacebookAuthProvider.getCredential(param0);
            return ((gReturn) == null ? null : (new org.xms.f.auth.AuthCredential.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.f.auth.FacebookAuthProvider dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.FacebookAuthProvider) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.agconnect.auth.FacebookAuthProvider;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.FacebookAuthProvider;
        }
    }
}