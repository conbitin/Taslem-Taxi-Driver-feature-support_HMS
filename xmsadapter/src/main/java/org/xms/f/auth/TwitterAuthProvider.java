package org.xms.f.auth;




public class TwitterAuthProvider extends org.xms.g.utils.XObject {
    
    private static final String TWITTER_PROVIDER = "twitter.com";
    
    public TwitterAuthProvider(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public java.lang.String getPROVIDER_ID() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.TwitterAuthProvider.getPROVIDER_ID()");
            return TWITTER_PROVIDER;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.TwitterAuthProvider) this.getGInstance()).PROVIDER_ID");
            return ((com.google.firebase.auth.TwitterAuthProvider) this.getGInstance()).PROVIDER_ID;
        }
    }
    
    public static java.lang.String getTWITTER_SIGN_IN_METHOD() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.AGConnectAuthCredential.Twitter_Provider");
            return String.valueOf(com.huawei.agconnect.auth.AGConnectAuthCredential.Twitter_Provider);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.TwitterAuthProvider.TWITTER_SIGN_IN_METHOD");
            return com.google.firebase.auth.TwitterAuthProvider.TWITTER_SIGN_IN_METHOD;
        }
    }
    
    public static org.xms.f.auth.AuthCredential getCredential(java.lang.String param0, java.lang.String param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.TwitterAuthProvider.credentialWithToken(param0, param1)");
            com.huawei.agconnect.auth.AGConnectAuthCredential hReturn = com.huawei.agconnect.auth.TwitterAuthProvider.credentialWithToken(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.f.auth.AuthCredential.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.TwitterAuthProvider.getCredential(param0, param1)");
            com.google.firebase.auth.AuthCredential gReturn = com.google.firebase.auth.TwitterAuthProvider.getCredential(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.f.auth.AuthCredential.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.f.auth.TwitterAuthProvider dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.TwitterAuthProvider) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.agconnect.auth.TwitterAuthProvider;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.TwitterAuthProvider;
        }
    }
}