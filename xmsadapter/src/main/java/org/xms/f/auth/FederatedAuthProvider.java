package org.xms.f.auth;

public abstract class FederatedAuthProvider extends org.xms.g.utils.XObject {
    
    public FederatedAuthProvider(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public FederatedAuthProvider() {
        super(((org.xms.g.utils.XBox) null));
    }
    
    public static org.xms.f.auth.FederatedAuthProvider dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.f.auth.FederatedAuthProvider {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
    }
}