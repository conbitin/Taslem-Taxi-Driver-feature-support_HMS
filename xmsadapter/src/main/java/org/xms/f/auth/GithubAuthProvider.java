package org.xms.f.auth;




public class GithubAuthProvider extends org.xms.g.utils.XObject {
    
    private static final String GITHUB_PROVIDER = "github.com";
    
    public GithubAuthProvider(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static java.lang.String getGITHUB_SIGN_IN_METHOD() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.GithubAuthProvider.getGITHUB_SIGN_IN_METHOD");
            return GITHUB_PROVIDER;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.GithubAuthProvider.GITHUB_SIGN_IN_METHOD");
            return com.google.firebase.auth.GithubAuthProvider.GITHUB_SIGN_IN_METHOD;
        }
    }
    
    public java.lang.String getPROVIDER_ID() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.GithubAuthProvider.getGITHUB_SIGN_IN_METHOD");
            return GITHUB_PROVIDER;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.GithubAuthProvider) this.getGInstance()).PROVIDER_ID");
            return ((com.google.firebase.auth.GithubAuthProvider) this.getGInstance()).PROVIDER_ID;
        }
    }
    
    public static org.xms.f.auth.AuthCredential getCredential(java.lang.String param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.f.auth.GithubAuthProvider dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.GithubAuthProvider) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.GithubAuthProvider;
        }
    }
}