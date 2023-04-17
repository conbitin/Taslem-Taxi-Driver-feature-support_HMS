package org.xms.f.auth;

public class OAuthProvider extends org.xms.f.auth.FederatedAuthProvider {
    
    public OAuthProvider(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static synchronized org.xms.f.auth.AuthCredential getCredential(java.lang.String param0, java.lang.String param1, java.lang.String param2) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public java.lang.String getProviderId() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.f.auth.OAuthProvider.Builder newBuilder(java.lang.String param0, org.xms.f.auth.ExtensionAuth param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.f.auth.OAuthProvider.Builder newBuilder(java.lang.String param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.f.auth.OAuthProvider.CredentialBuilder newCredentialBuilder(java.lang.String param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.f.auth.OAuthProvider dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class Builder extends org.xms.g.utils.XObject {
        
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public org.xms.f.auth.OAuthProvider.Builder addCustomParameter(java.lang.String param0, java.lang.String param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.f.auth.OAuthProvider.Builder addCustomParameters(java.util.Map<java.lang.String, java.lang.String> param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.f.auth.OAuthProvider build() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.f.auth.OAuthProvider.Builder setScopes(java.util.List<java.lang.String> param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static org.xms.f.auth.OAuthProvider.Builder dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
    
    public static class CredentialBuilder extends org.xms.g.utils.XObject {
        
        public CredentialBuilder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public org.xms.f.auth.OAuthProvider.CredentialBuilder setIdToken(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.f.auth.OAuthProvider.CredentialBuilder setIdTokenWithRawNonce(java.lang.String param0, java.lang.String param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.f.auth.OAuthProvider.CredentialBuilder setAccessToken(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.f.auth.AuthCredential build() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static org.xms.f.auth.OAuthProvider.CredentialBuilder dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}