package org.xms.g.auth.api.credentials;




public final class CredentialsOptions extends org.xms.g.auth.api.Auth.AuthCredentialsOptions {
    
    
    
    public CredentialsOptions(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static org.xms.g.auth.api.credentials.CredentialsOptions getDEFAULT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsOptions.getDEFAULT()");
            return new org.xms.g.auth.api.credentials.CredentialsOptions(new org.xms.g.utils.XBox(null, new java.lang.Object()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.CredentialsOptions.DEFAULT");
            com.google.android.gms.auth.api.credentials.CredentialsOptions gReturn = null;
            gReturn = com.google.android.gms.auth.api.credentials.CredentialsOptions.DEFAULT;
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialsOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.api.credentials.CredentialsOptions dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.auth.api.credentials.CredentialsOptions) {
            return ((org.xms.g.auth.api.credentials.CredentialsOptions) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.auth.api.credentials.CredentialsOptions gReturn = ((com.google.android.gms.auth.api.credentials.CredentialsOptions) ((org.xms.g.utils.XGettable) param0).getGInstance());
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsOptions.dynamicCast(java.lang.Object)");
            java.lang.Object hReturn = ((org.xms.g.utils.XGettable) param0).getHInstance();
            return new org.xms.g.auth.api.credentials.CredentialsOptions(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.auth.api.credentials.CredentialsOptions) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsOptions.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.credentials.CredentialsOptions;
        }
    }
    
    public static final class Builder extends org.xms.g.auth.api.Auth.AuthCredentialsOptions.Builder {
        
        
        
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsOptions.Builder.Builder()");
                this.setHInstance(new java.lang.Object());
            } else {
                this.setGInstance(new com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder());
            }
        }
        
        public final org.xms.g.auth.api.credentials.CredentialsOptions build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsOptions.Builder.build()");
                return new org.xms.g.auth.api.credentials.CredentialsOptions(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder) this.getGInstance()).build()");
                com.google.android.gms.auth.api.credentials.CredentialsOptions gReturn = ((com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialsOptions(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.credentials.CredentialsOptions.Builder forceEnableSaveDialog() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsOptions.Builder.forceEnableSaveDialog()");
                return new org.xms.g.auth.api.credentials.CredentialsOptions.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder) this.getGInstance()).forceEnableSaveDialog()");
                com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder gReturn = ((com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder) this.getGInstance()).forceEnableSaveDialog();
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialsOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public static org.xms.g.auth.api.credentials.CredentialsOptions.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.auth.api.credentials.CredentialsOptions.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialsOptions.Builder.isInstance(java.lang.Object)");
                return false;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.credentials.CredentialsOptions.Builder;
            }
        }
    }
}