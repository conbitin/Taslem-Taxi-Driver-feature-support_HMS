package org.xms.f.auth;

public abstract class ActionCodeMultiFactorInfo extends org.xms.f.auth.ActionCodeInfo {
    
    public ActionCodeMultiFactorInfo(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public ActionCodeMultiFactorInfo() {
        super(((org.xms.g.utils.XBox) null));
    }
    
    public abstract org.xms.f.auth.MultiFactorInfo getMultiFactorInfo();
    
    public static org.xms.f.auth.ActionCodeMultiFactorInfo dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.f.auth.ActionCodeMultiFactorInfo {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public org.xms.f.auth.MultiFactorInfo getMultiFactorInfo() {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}