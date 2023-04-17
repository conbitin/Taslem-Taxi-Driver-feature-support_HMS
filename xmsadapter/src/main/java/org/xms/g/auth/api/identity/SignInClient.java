package org.xms.g.auth.api.identity;

public interface SignInClient extends org.xms.g.utils.XInterface, org.xms.g.common.api.HasApiKey<org.xms.g.auth.api.identity.SignInOptions> {
    
    public org.xms.g.tasks.Task<org.xms.g.auth.api.identity.BeginSignInResult> beginSignIn(org.xms.g.auth.api.identity.BeginSignInRequest param0);
    
    public org.xms.g.auth.api.identity.SignInCredential getSignInCredentialFromIntent(android.content.Intent param0) throws org.xms.g.common.api.ApiException;
    
    public org.xms.g.tasks.Task<java.lang.Void> signOut();
    
    default java.lang.Object getZInstanceSignInClient() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default com.google.android.gms.auth.api.identity.SignInClient getGInstanceSignInClient() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default java.lang.Object getHInstanceSignInClient() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.api.identity.SignInClient dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.auth.api.identity.SignInClient {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public org.xms.g.tasks.Task<org.xms.g.auth.api.identity.BeginSignInResult> beginSignIn(org.xms.g.auth.api.identity.BeginSignInRequest param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.auth.api.identity.SignInCredential getSignInCredentialFromIntent(android.content.Intent param0) throws org.xms.g.common.api.ApiException {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.tasks.Task<java.lang.Void> signOut() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.Object getApiKey() {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}