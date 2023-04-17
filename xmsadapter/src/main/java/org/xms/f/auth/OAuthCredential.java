package org.xms.f.auth;

public abstract class OAuthCredential extends org.xms.f.auth.AuthCredential {
    
    public OAuthCredential(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public OAuthCredential() {
        super(((org.xms.g.utils.XBox) null));
    }
    
    public abstract java.lang.String getAccessToken();
    
    public abstract java.lang.String getIdToken();
    
    public abstract java.lang.String getSecret();
    
    public static org.xms.f.auth.OAuthCredential dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.f.auth.OAuthCredential {
        public static final android.os.Parcelable.Creator CREATOR = null;
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public java.lang.String getAccessToken() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String getIdToken() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String getSecret() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String getProvider() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String getSignInMethod() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public int describeContents() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}