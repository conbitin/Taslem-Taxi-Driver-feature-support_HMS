package org.xms.f.auth;

public abstract class MultiFactorResolver extends org.xms.g.utils.XObject implements android.os.Parcelable {
    
    public MultiFactorResolver(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public MultiFactorResolver() {
        super(((org.xms.g.utils.XBox) null));
    }
    
    public abstract org.xms.f.auth.MultiFactorSession getSession();
    
    public abstract java.util.List<org.xms.f.auth.MultiFactorInfo> getHints();
    
    public abstract org.xms.g.tasks.Task<org.xms.f.auth.AuthResult> resolveSignIn(org.xms.f.auth.MultiFactorAssertion param0);
    
    public abstract org.xms.f.auth.ExtensionAuth getFirebaseAuth();
    
    public static org.xms.f.auth.MultiFactorResolver dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.f.auth.MultiFactorResolver {
        public static final android.os.Parcelable.Creator CREATOR = null;
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public org.xms.f.auth.MultiFactorSession getSession() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.util.List<org.xms.f.auth.MultiFactorInfo> getHints() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.tasks.Task<org.xms.f.auth.AuthResult> resolveSignIn(org.xms.f.auth.MultiFactorAssertion param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.f.auth.ExtensionAuth getFirebaseAuth() {
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