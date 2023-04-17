package org.xms.f.provider;




public class ExtensionInitProvider extends android.content.ContentProvider implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;
    private boolean wrapper = true;
    
    
    
    public ExtensionInitProvider(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
        wrapper = true;
    }
    
    public ExtensionInitProvider() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            this.setHInstance(null);
        } else {
            this.setGInstance(new GImpl());
        }
        wrapper = false;
    }
    
    public void attachInfo(android.content.Context param0, android.content.pm.ProviderInfo param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.provider.ExtensionInitProvider.attachInfo(param0, param1)");
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance()).attachInfo(param0, param1)");
                ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance()).attachInfo(param0, param1);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.provider.ExtensionInitProvider.attachInfo(param0, param1)");
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance())).attachInfoCallSuper(param0, param1)");
                ((GImpl) ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance())).attachInfoCallSuper(param0, param1);
            }
        }
    }
    
    public int delete(android.net.Uri param0, java.lang.String param1, java.lang.String[] param2) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.provider.ExtensionInitProvider.delete(param0, param1,param2)");
                return 0;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance()).delete(param0, param1, param2)");
                return ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance()).delete(param0, param1, param2);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.provider.ExtensionInitProvider.delete(param0, param1,param2)");
                return 0;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance())).deleteCallSuper(param0, param1, param2)");
                return ((GImpl) ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance())).deleteCallSuper(param0, param1, param2);
            }
        }
    }
    
    public java.lang.String getType(android.net.Uri param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.provider.ExtensionInitProvider.getType(param0)");
                return "";
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance()).getType(param0)");
                return ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance()).getType(param0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.provider.ExtensionInitProvider.getType(param0)");
                return "";
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance())).getTypeCallSuper(param0)");
                return ((GImpl) ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance())).getTypeCallSuper(param0);
            }
        }
    }
    
    public android.net.Uri insert(android.net.Uri param0, android.content.ContentValues param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.provider.ExtensionInitProvider.insert(param0, param1)");
                return param0;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance()).insert(param0, param1)");
                return ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance()).insert(param0, param1);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.provider.ExtensionInitProvider.insert(param0, param1)");
                return param0;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance())).insertCallSuper(param0, param1)");
                return ((GImpl) ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance())).insertCallSuper(param0, param1);
            }
        }
    }
    
    public boolean onCreate() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.provider.ExtensionInitProvider.onCreate()");
                return true;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance()).onCreate()");
                return ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance()).onCreate();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.provider.ExtensionInitProvider.onCreate()");
                return true;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance())).onCreateCallSuper()");
                return ((GImpl) ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance())).onCreateCallSuper();
            }
        }
    }
    
    public android.database.Cursor query(android.net.Uri param0, java.lang.String[] param1, java.lang.String param2, java.lang.String[] param3, java.lang.String param4) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.provider.ExtensionInitProvider.query(param0, param1, param2, param3, param4)");
                return null;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance()).query(param0, param1, param2, param3, param4)");
                return ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance()).query(param0, param1, param2, param3, param4);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.provider.ExtensionInitProvider.query(param0, param1, param2, param3, param4)");
                return null;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance())).queryCallSuper(param0, param1, param2, param3, param4)");
                return ((GImpl) ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance())).queryCallSuper(param0, param1, param2, param3, param4);
            }
        }
    }
    
    public int update(android.net.Uri param0, android.content.ContentValues param1, java.lang.String param2, java.lang.String[] param3) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.provider.ExtensionInitProvider.update(param0, param1, param2, param3)");
                return 0;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance()).update(param0, param1, param2, param3)");
                return ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance()).update(param0, param1, param2, param3);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.provider.ExtensionInitProvider.update(param0, param1, param2, param3)");
                return 0;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance())).updateCallSuper(param0, param1, param2, param3)");
                return ((GImpl) ((com.google.firebase.provider.FirebaseInitProvider) this.getGInstance())).updateCallSuper(param0, param1, param2, param3);
            }
        }
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
    
    public static org.xms.f.provider.ExtensionInitProvider dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.provider.ExtensionInitProvider) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.provider.FirebaseInitProvider;
        }
    }
    
    private class GImpl extends com.google.firebase.provider.FirebaseInitProvider {
        
        public void attachInfo(android.content.Context param0, android.content.pm.ProviderInfo param1) {
            org.xms.f.provider.ExtensionInitProvider.this.attachInfo(param0, param1);
        }
        
        public int delete(android.net.Uri param0, java.lang.String param1, java.lang.String[] param2) {
            return org.xms.f.provider.ExtensionInitProvider.this.delete(param0, param1, param2);
        }
        
        public java.lang.String getType(android.net.Uri param0) {
            return org.xms.f.provider.ExtensionInitProvider.this.getType(param0);
        }
        
        public android.net.Uri insert(android.net.Uri param0, android.content.ContentValues param1) {
            return org.xms.f.provider.ExtensionInitProvider.this.insert(param0, param1);
        }
        
        public boolean onCreate() {
            return org.xms.f.provider.ExtensionInitProvider.this.onCreate();
        }
        
        public android.database.Cursor query(android.net.Uri param0, java.lang.String[] param1, java.lang.String param2, java.lang.String[] param3, java.lang.String param4) {
            return org.xms.f.provider.ExtensionInitProvider.this.query(param0, param1, param2, param3, param4);
        }
        
        public int update(android.net.Uri param0, android.content.ContentValues param1, java.lang.String param2, java.lang.String[] param3) {
            return org.xms.f.provider.ExtensionInitProvider.this.update(param0, param1, param2, param3);
        }
        
        public void attachInfoCallSuper(android.content.Context param0, android.content.pm.ProviderInfo param1) {
            super.attachInfo(param0, param1);
        }
        
        public int deleteCallSuper(android.net.Uri param0, java.lang.String param1, java.lang.String[] param2) {
            return super.delete(param0, param1, param2);
        }
        
        public java.lang.String getTypeCallSuper(android.net.Uri param0) {
            return super.getType(param0);
        }
        
        public android.net.Uri insertCallSuper(android.net.Uri param0, android.content.ContentValues param1) {
            return super.insert(param0, param1);
        }
        
        public boolean onCreateCallSuper() {
            return super.onCreate();
        }
        
        public android.database.Cursor queryCallSuper(android.net.Uri param0, java.lang.String[] param1, java.lang.String param2, java.lang.String[] param3, java.lang.String param4) {
            return super.query(param0, param1, param2, param3, param4);
        }
        
        public int updateCallSuper(android.net.Uri param0, android.content.ContentValues param1, java.lang.String param2, java.lang.String[] param3) {
            return super.update(param0, param1, param2, param3);
        }
        
        public GImpl() {
            super();
        }
    }
}