package org.xms.f.auth;

public abstract class ActionCodeEmailInfo extends org.xms.f.auth.ActionCodeInfo {
    
    public ActionCodeEmailInfo(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public ActionCodeEmailInfo() {
        super(((org.xms.g.utils.XBox) null));
    }
    
    public abstract String getPreviousEmail();
    
    public java.lang.String getEmail() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.f.auth.ActionCodeEmailInfo dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.f.auth.ActionCodeEmailInfo {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public String getPreviousEmail() {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}