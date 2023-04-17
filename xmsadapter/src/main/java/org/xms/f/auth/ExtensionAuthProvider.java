package org.xms.f.auth;




public interface ExtensionAuthProvider extends org.xms.g.utils.XInterface {
    
    public static final String AGC_PROVIDER = "AGC";
    
    public static java.lang.String getPROVIDER_ID() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ExtensionAuthProvider.getPROVIDER_ID");
            return AGC_PROVIDER;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.FirebaseAuthProvider.PROVIDER_ID");
            return com.google.firebase.auth.FirebaseAuthProvider.PROVIDER_ID;
        }
    }
    
    default java.lang.Object getZInstanceExtensionAuthProvider() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceExtensionAuthProvider();
        } else {
            return getGInstanceExtensionAuthProvider();
        }
    }
    
    default com.google.firebase.auth.FirebaseAuthProvider getGInstanceExtensionAuthProvider() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.firebase.auth.FirebaseAuthProvider) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.firebase.auth.FirebaseAuthProvider() {
        };
    }
    
    default java.lang.Object getHInstanceExtensionAuthProvider() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((java.lang.Object) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new java.lang.Object();
    }
    
    public static org.xms.f.auth.ExtensionAuthProvider dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.ExtensionAuthProvider) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.FirebaseAuthProvider;
            }
        }
        return param0 instanceof org.xms.f.auth.ExtensionAuthProvider;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.f.auth.ExtensionAuthProvider {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
    }
}