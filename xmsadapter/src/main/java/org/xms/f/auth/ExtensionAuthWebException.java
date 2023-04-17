package org.xms.f.auth;




public class ExtensionAuthWebException extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    
    
    
    public ExtensionAuthWebException(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }
    
    public ExtensionAuthWebException(java.lang.String param0, java.lang.String param1) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            this.setHInstance(new com.huawei.agconnect.auth.AGCAuthException(param1, Integer.parseInt(param0)));
        } else {
            this.setGInstance(new GImpl(param0, param1));
        }
        wrapper = false;
    }
    
    public static org.xms.f.auth.ExtensionAuthWebException dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.ExtensionAuthWebException) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.FirebaseAuthWebException;
        }
    }
    
    private class GImpl extends com.google.firebase.auth.FirebaseAuthWebException {
        
        public GImpl(java.lang.String param0, java.lang.String param1) {
            super(param0, param1);
        }
    }
}