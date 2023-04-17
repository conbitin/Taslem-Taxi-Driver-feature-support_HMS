package org.xms.f.auth;

public abstract class MultiFactor extends org.xms.g.utils.XObject {
    
    public MultiFactor(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public MultiFactor() {
        super(((org.xms.g.utils.XBox) null));
    }
    
    public abstract org.xms.g.tasks.Task<org.xms.f.auth.MultiFactorSession> getSession();
    
    public abstract org.xms.g.tasks.Task<java.lang.Void> enroll(org.xms.f.auth.MultiFactorAssertion param0, java.lang.String param1);
    
    public abstract java.util.List<org.xms.f.auth.MultiFactorInfo> getEnrolledFactors();
    
    public abstract org.xms.g.tasks.Task<java.lang.Void> unenroll(org.xms.f.auth.MultiFactorInfo param0);
    
    public abstract org.xms.g.tasks.Task<java.lang.Void> unenroll(java.lang.String param0);
    
    public static org.xms.f.auth.MultiFactor dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.f.auth.MultiFactor {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public org.xms.g.tasks.Task<org.xms.f.auth.MultiFactorSession> getSession() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.tasks.Task<java.lang.Void> enroll(org.xms.f.auth.MultiFactorAssertion param0, java.lang.String param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.util.List<org.xms.f.auth.MultiFactorInfo> getEnrolledFactors() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.tasks.Task<java.lang.Void> unenroll(org.xms.f.auth.MultiFactorInfo param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.tasks.Task<java.lang.Void> unenroll(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}