package org.xms.f.auth;

public abstract class MultiFactorAssertion extends org.xms.g.utils.XObject {
    
    public MultiFactorAssertion(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public MultiFactorAssertion() {
        super(((org.xms.g.utils.XBox) null));
    }
    
    public abstract String getFactorId();
    
    public static org.xms.f.auth.MultiFactorAssertion dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.f.auth.MultiFactorAssertion {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public String getFactorId() {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}