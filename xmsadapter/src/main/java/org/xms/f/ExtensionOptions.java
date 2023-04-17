package org.xms.f;




public final class ExtensionOptions extends org.xms.g.utils.XObject {
    
    
    
    public ExtensionOptions(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.equals(param0)");
            return false;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.FirebaseOptions) this.getGInstance()).equals(param0)");
            return ((com.google.firebase.FirebaseOptions) this.getGInstance()).equals(param0);
        }
    }
    
    public static org.xms.f.ExtensionOptions fromResource(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.fromResource(param0)");
            return new org.xms.f.ExtensionOptions(new org.xms.g.utils.XBox(null, null));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.FirebaseOptions.fromResource(param0)");
            com.google.firebase.FirebaseOptions gReturn = com.google.firebase.FirebaseOptions.fromResource(param0);
            return ((gReturn) == null ? null : (new org.xms.f.ExtensionOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public java.lang.String getApiKey() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.getApiKey()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.FirebaseOptions) this.getGInstance()).getApiKey()");
            return ((com.google.firebase.FirebaseOptions) this.getGInstance()).getApiKey();
        }
    }
    
    public java.lang.String getApplicationId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.getApplicationId()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.FirebaseOptions) this.getGInstance()).getApplicationId()");
            return ((com.google.firebase.FirebaseOptions) this.getGInstance()).getApplicationId();
        }
    }
    
    public java.lang.String getDatabaseUrl() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.getDatabaseUrl()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.FirebaseOptions) this.getGInstance()).getDatabaseUrl()");
            return ((com.google.firebase.FirebaseOptions) this.getGInstance()).getDatabaseUrl();
        }
    }
    
    public java.lang.String getGcmSenderId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.getGcmSenderId()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.FirebaseOptions) this.getGInstance()).getGcmSenderId()");
            return ((com.google.firebase.FirebaseOptions) this.getGInstance()).getGcmSenderId();
        }
    }
    
    public java.lang.String getProjectId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.getProjectId()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.FirebaseOptions) this.getGInstance()).getProjectId()");
            return ((com.google.firebase.FirebaseOptions) this.getGInstance()).getProjectId();
        }
    }
    
    public java.lang.String getStorageBucket() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.getStorageBucket()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.FirebaseOptions) this.getGInstance()).getStorageBucket()");
            return ((com.google.firebase.FirebaseOptions) this.getGInstance()).getStorageBucket();
        }
    }
    
    public int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.hashCode()");
            return 0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.FirebaseOptions) this.getGInstance()).hashCode()");
            return ((com.google.firebase.FirebaseOptions) this.getGInstance()).hashCode();
        }
    }
    
    public java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.toString()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.FirebaseOptions) this.getGInstance()).toString()");
            return ((com.google.firebase.FirebaseOptions) this.getGInstance()).toString();
        }
    }
    
    public static org.xms.f.ExtensionOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.ExtensionOptions) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.FirebaseOptions;
        }
    }
    
    public static final class Builder extends org.xms.g.utils.XObject {
        
        
        
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                this.setHInstance(null);
            } else {
                this.setGInstance(new com.google.firebase.FirebaseOptions.Builder());
            }
        }
        
        public Builder(org.xms.f.ExtensionOptions param0) {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                this.setHInstance(null);
            } else {
                this.setGInstance(new com.google.firebase.FirebaseOptions.Builder(((com.google.firebase.FirebaseOptions) ((param0) == null ? null : (param0.getGInstance())))));
            }
        }
        
        public org.xms.f.ExtensionOptions build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.Builder.build()");
                return new org.xms.f.ExtensionOptions(new org.xms.g.utils.XBox(null, null));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.FirebaseOptions.Builder) this.getGInstance()).build()");
                com.google.firebase.FirebaseOptions gReturn = ((com.google.firebase.FirebaseOptions.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.f.ExtensionOptions(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.f.ExtensionOptions.Builder setApiKey(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.Builder.setApiKey(param0)");
                return new org.xms.f.ExtensionOptions.Builder(new org.xms.g.utils.XBox(null, null));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.FirebaseOptions.Builder) this.getGInstance()).setApiKey(param0)");
                com.google.firebase.FirebaseOptions.Builder gReturn = ((com.google.firebase.FirebaseOptions.Builder) this.getGInstance()).setApiKey(param0);
                return ((gReturn) == null ? null : (new org.xms.f.ExtensionOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.f.ExtensionOptions.Builder setApplicationId(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.Builder.setApplicationId(param0)");
                return new org.xms.f.ExtensionOptions.Builder(new org.xms.g.utils.XBox(null, null));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.FirebaseOptions.Builder) this.getGInstance()).setApplicationId(param0)");
                com.google.firebase.FirebaseOptions.Builder gReturn = ((com.google.firebase.FirebaseOptions.Builder) this.getGInstance()).setApplicationId(param0);
                return ((gReturn) == null ? null : (new org.xms.f.ExtensionOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.f.ExtensionOptions.Builder setDatabaseUrl(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.Builder.setDatabaseUrl(param0)");
                return new org.xms.f.ExtensionOptions.Builder(new org.xms.g.utils.XBox(null, null));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.FirebaseOptions.Builder) this.getGInstance()).setDatabaseUrl(param0)");
                com.google.firebase.FirebaseOptions.Builder gReturn = ((com.google.firebase.FirebaseOptions.Builder) this.getGInstance()).setDatabaseUrl(param0);
                return ((gReturn) == null ? null : (new org.xms.f.ExtensionOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.f.ExtensionOptions.Builder setGcmSenderId(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.Builder.setGcmSenderId(param0)");
                return new org.xms.f.ExtensionOptions.Builder(new org.xms.g.utils.XBox(null, null));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.FirebaseOptions.Builder) this.getGInstance()).setGcmSenderId(param0)");
                com.google.firebase.FirebaseOptions.Builder gReturn = ((com.google.firebase.FirebaseOptions.Builder) this.getGInstance()).setGcmSenderId(param0);
                return ((gReturn) == null ? null : (new org.xms.f.ExtensionOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.f.ExtensionOptions.Builder setProjectId(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.Builder.setProjectId(param0)");
                return new org.xms.f.ExtensionOptions.Builder(new org.xms.g.utils.XBox(null, null));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.FirebaseOptions.Builder) this.getGInstance()).setProjectId(param0)");
                com.google.firebase.FirebaseOptions.Builder gReturn = ((com.google.firebase.FirebaseOptions.Builder) this.getGInstance()).setProjectId(param0);
                return ((gReturn) == null ? null : (new org.xms.f.ExtensionOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.f.ExtensionOptions.Builder setStorageBucket(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.ExtensionOptions.Builder.setStorageBucket(param0)");
                return new org.xms.f.ExtensionOptions.Builder(new org.xms.g.utils.XBox(null, null));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.FirebaseOptions.Builder) this.getGInstance()).setStorageBucket(param0)");
                com.google.firebase.FirebaseOptions.Builder gReturn = ((com.google.firebase.FirebaseOptions.Builder) this.getGInstance()).setStorageBucket(param0);
                return ((gReturn) == null ? null : (new org.xms.f.ExtensionOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public static org.xms.f.ExtensionOptions.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.f.ExtensionOptions.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.FirebaseOptions.Builder;
            }
        }
    }
}