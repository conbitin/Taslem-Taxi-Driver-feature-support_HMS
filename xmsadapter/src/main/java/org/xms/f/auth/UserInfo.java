package org.xms.f.auth;

public interface UserInfo extends org.xms.g.utils.XInterface {
    
    public java.lang.String getDisplayName();
    
    public java.lang.String getEmail();
    
    public java.lang.String getPhoneNumber();
    
    public android.net.Uri getPhotoUrl();
    
    public java.lang.String getProviderId();
    
    public java.lang.String getUid();
    
    public boolean isEmailVerified();
    
    default java.lang.Object getZInstanceUserInfo() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default com.google.firebase.auth.UserInfo getGInstanceUserInfo() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default java.lang.Object getHInstanceUserInfo() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.f.auth.UserInfo dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.f.auth.UserInfo {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public java.lang.String getDisplayName() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String getEmail() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String getPhoneNumber() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public android.net.Uri getPhotoUrl() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String getProviderId() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String getUid() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public boolean isEmailVerified() {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}