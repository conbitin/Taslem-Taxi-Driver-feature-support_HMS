package org.xms.f.auth;

public final class ExtensionAuthMultiFactorException extends org.xms.f.auth.ExtensionAuthException {
    
    public ExtensionAuthMultiFactorException(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public org.xms.f.auth.MultiFactorResolver getResolver() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.f.auth.ExtensionAuthMultiFactorException dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
}