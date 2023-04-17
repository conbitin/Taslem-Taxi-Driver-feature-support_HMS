package org.xms.f.auth;




public class EmailAuthProvider extends org.xms.g.utils.XObject {
    
    
    
    public EmailAuthProvider(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static java.lang.String getEMAIL_LINK_SIGN_IN_METHOD() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.AGConnectAuthCredential.Email_Provider");
            return String.valueOf(com.huawei.agconnect.auth.AGConnectAuthCredential.Email_Provider);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.EmailAuthProvider.EMAIL_LINK_SIGN_IN_METHOD");
            return com.google.firebase.auth.EmailAuthProvider.EMAIL_LINK_SIGN_IN_METHOD;
        }
    }
    
    public static java.lang.String getEMAIL_PASSWORD_SIGN_IN_METHOD() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.AGConnectAuthCredential.Email_Provider");
            return String.valueOf(com.huawei.agconnect.auth.AGConnectAuthCredential.Email_Provider);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.EmailAuthProvider.EMAIL_PASSWORD_SIGN_IN_METHOD");
            return com.google.firebase.auth.EmailAuthProvider.EMAIL_PASSWORD_SIGN_IN_METHOD;
        }
    }
    
    public java.lang.String getPROVIDER_ID() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.AGConnectAuthCredential.Email_Provider");
            return String.valueOf(com.huawei.agconnect.auth.AGConnectAuthCredential.Email_Provider);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.EmailAuthProvider) this.getGInstance()).PROVIDER_ID");
            return ((com.google.firebase.auth.EmailAuthProvider) this.getGInstance()).PROVIDER_ID;
        }
    }
    
    public static org.xms.f.auth.AuthCredential getCredential(java.lang.String param0, java.lang.String param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.f.auth.AuthCredential getCredentialWithLink(java.lang.String param0, java.lang.String param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.f.auth.EmailAuthProvider dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.EmailAuthProvider) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.agconnect.auth.EmailAuthProvider;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.EmailAuthProvider;
        }
    }
}