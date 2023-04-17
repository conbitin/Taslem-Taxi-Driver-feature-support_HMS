package org.xms.f.auth;




public class ExtensionAuthException extends org.xms.f.ExtensionException {
    private boolean wrapper = true;
    
    
    
    public ExtensionAuthException(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }
    
    public ExtensionAuthException(java.lang.String param0, java.lang.String param1) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            this.setHInstance(new HImpl(param1, Integer.parseInt(param0)));
        } else {
            this.setGInstance(new GImpl(param0, param1));
        }
        wrapper = false;
    }
    
    public java.lang.String getErrorCode() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "String.valueOf(((com.huawei.agconnect.auth.AGCAuthException) this.getHInstance()).getCode())");
                return String.valueOf(((com.huawei.agconnect.auth.AGCAuthException) this.getHInstance()).getCode());
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuthException) this.getGInstance()).getErrorCode()");
                return ((com.google.firebase.auth.FirebaseAuthException) this.getGInstance()).getErrorCode();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.agconnect.auth.AGCAuthException) this.getHInstance())).getErrorCodeCallSuper()");
                return ((HImpl) ((com.huawei.agconnect.auth.AGCAuthException) this.getHInstance())).getErrorCodeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.firebase.auth.FirebaseAuthException) this.getGInstance())).getErrorCodeCallSuper()");
                return ((GImpl) ((com.google.firebase.auth.FirebaseAuthException) this.getGInstance())).getErrorCodeCallSuper();
            }
        }
    }
    
    public static org.xms.f.auth.ExtensionAuthException dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.ExtensionAuthException) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.agconnect.auth.AGCAuthException;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.FirebaseAuthException;
        }
    }
    
    private class GImpl extends com.google.firebase.auth.FirebaseAuthException {
        
        public java.lang.String getErrorCode() {
            return org.xms.f.auth.ExtensionAuthException.this.getErrorCode();
        }
        
        public java.lang.String getErrorCodeCallSuper() {
            return super.getErrorCode();
        }
        
        public GImpl(java.lang.String param0, java.lang.String param1) {
            super(param0, param1);
        }
    }
    
    private class HImpl extends com.huawei.agconnect.auth.AGCAuthException {
        
        public java.lang.String getErrorCodeCallSuper() {
            return String.valueOf(super.getCode());
        }
        
        public HImpl(java.lang.String param0, int param1) {
            super(param0, param1);
        }
    }
}