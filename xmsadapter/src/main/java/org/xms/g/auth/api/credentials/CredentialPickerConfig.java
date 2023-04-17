package org.xms.g.auth.api.credentials;




public final class CredentialPickerConfig extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.auth.api.credentials.CredentialPickerConfig createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                throw new RuntimeException("HMS does not support this API.");
            } else {
                com.google.android.gms.auth.api.credentials.CredentialPickerConfig gReturn = com.google.android.gms.auth.api.credentials.CredentialPickerConfig.CREATOR.createFromParcel(param0);
                return new org.xms.g.auth.api.credentials.CredentialPickerConfig(new org.xms.g.utils.XBox(gReturn, null));
            }
        }
        
        public org.xms.g.auth.api.credentials.CredentialPickerConfig[] newArray(int param0) {
            return new org.xms.g.auth.api.credentials.CredentialPickerConfig[param0];
        }
    };
    
    
    
    public CredentialPickerConfig(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public final boolean isForNewAccount() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final boolean shouldShowAddAccountButton() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final boolean shouldShowCancelButton() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.api.credentials.CredentialPickerConfig dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.credentials.CredentialPickerConfig) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialPickerConfig.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
        }
    }
    
    public static class Builder extends org.xms.g.utils.XObject {
        
        
        
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder.Builder()");
                this.setHInstance(new java.lang.Object());
            } else {
                this.setGInstance(new com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder());
            }
        }
        
        public org.xms.g.auth.api.credentials.CredentialPickerConfig build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder.build()");
                return new org.xms.g.auth.api.credentials.CredentialPickerConfig(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder) this.getGInstance()).build()");
                com.google.android.gms.auth.api.credentials.CredentialPickerConfig gReturn = ((com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialPickerConfig(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder setForNewAccount(boolean param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder setPrompt(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder.setPrompt(int)");
                return new org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder) this.getGInstance()).setPrompt(param0)");
                com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder gReturn = ((com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder) this.getGInstance()).setPrompt(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder setShowAddAccountButton(boolean param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder.setShowAddAccountButton(boolean)");
                return new org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder) this.getGInstance()).setShowAddAccountButton(param0)");
                com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder gReturn = ((com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder) this.getGInstance()).setShowAddAccountButton(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder setShowCancelButton(boolean param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder.setShowCancelButton(boolean)");
                return new org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder) this.getGInstance()).setShowCancelButton(param0)");
                com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder gReturn = ((com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder) this.getGInstance()).setShowCancelButton(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public static org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialPickerConfig.Builder.isInstance(java.lang.Object)");
                return false;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Builder;
            }
        }
    }
    
    public static class Prompt extends org.xms.g.utils.XObject implements java.lang.annotation.Annotation {
        
        
        
        public Prompt(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public static int getCONTINUE() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialPickerConfig.Prompt.getCONTINUE()");
                return 0;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Prompt.CONTINUE");
                return com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Prompt.CONTINUE;
            }
        }
        
        public static int getSIGN_IN() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialPickerConfig.Prompt.getSIGN_IN()");
                return 0;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Prompt.SIGN_IN");
                return com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Prompt.SIGN_IN;
            }
        }
        
        public static int getSIGN_UP() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialPickerConfig.Prompt.getSIGN_UP()");
                return 0;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Prompt.SIGN_UP");
                return com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Prompt.SIGN_UP;
            }
        }
        
        public boolean equals(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public int hashCode() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String toString() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.Class<? extends java.lang.annotation.Annotation> annotationType() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static org.xms.g.auth.api.credentials.CredentialPickerConfig.Prompt dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.auth.api.credentials.CredentialPickerConfig.Prompt) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialPickerConfig.Prompt.isInstance(java.lang.Object)");
                return false;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.credentials.CredentialPickerConfig.Prompt;
            }
        }
    }
}