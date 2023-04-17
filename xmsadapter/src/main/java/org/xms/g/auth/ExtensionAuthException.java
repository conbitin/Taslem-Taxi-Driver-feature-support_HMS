package org.xms.g.auth;

public class ExtensionAuthException extends java.lang.Exception implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;
    private boolean wrapper = true;
    
    public ExtensionAuthException(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
        wrapper = true;
    }
    
    public ExtensionAuthException() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl());
        } else {
            this.setGInstance(new GImpl());
        }
        wrapper = false;
    }
    
    public ExtensionAuthException(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0));
        } else {
            this.setGInstance(new GImpl(param0));
        }
        wrapper = false;
    }
    
    public ExtensionAuthException(java.lang.String param0, java.lang.Throwable param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1));
        } else {
            this.setGInstance(new GImpl(param0, param1));
        }
        wrapper = false;
    }
    
    public ExtensionAuthException(java.lang.Throwable param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0));
        } else {
            this.setGInstance(new GImpl(param0));
        }
        wrapper = false;
    }
    
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }
    
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }
    
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }
    
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }
    
    public static org.xms.g.auth.ExtensionAuthException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.ExtensionAuthException) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.hwid.common.HuaweiIdAuthException;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.GoogleAuthException;
        }
    }
    
    private class GImpl extends com.google.android.gms.auth.GoogleAuthException {
        
        public GImpl() {
            super();
        }
        
        public GImpl(java.lang.String param0) {
            super(param0);
        }
        
        public GImpl(java.lang.String param0, java.lang.Throwable param1) {
            super(param0, param1);
        }
        
        public GImpl(java.lang.Throwable param0) {
            super(param0);
        }
    }
    
    private class HImpl extends com.huawei.hms.support.hwid.common.HuaweiIdAuthException {
        
        public HImpl() {
            super();
        }
        
        public HImpl(java.lang.String param0) {
            super(param0);
        }
        
        public HImpl(java.lang.String param0, java.lang.Throwable param1) {
            super(param0, param1);
        }
        
        public HImpl(java.lang.Throwable param0) {
            super(param0);
        }
    }
}