package org.xms.g.auth.api.credentials;

public final class CredentialRequest extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.auth.api.credentials.CredentialRequest createFromParcel(android.os.Parcel param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.auth.api.credentials.CredentialRequest[] newArray(int param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    };
    
    public CredentialRequest(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public final java.lang.String[] getAccountTypes() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final java.util.Set<java.lang.String> getAccountTypesSet() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final org.xms.g.auth.api.credentials.CredentialPickerConfig getCredentialHintPickerConfig() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final org.xms.g.auth.api.credentials.CredentialPickerConfig getCredentialPickerConfig() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final java.lang.String getIdTokenNonce() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final java.lang.String getServerClientId() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final boolean getSupportsPasswordLogin() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final boolean isIdTokenRequested() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final boolean isPasswordLoginSupported() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.api.credentials.CredentialRequest dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static final class Builder extends org.xms.g.utils.XObject {
        
        
        
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialRequest.Builder.Builder()");
                this.setHInstance(new java.lang.Object());
            } else {
                this.setGInstance(new com.google.android.gms.auth.api.credentials.CredentialRequest.Builder());
            }
        }
        
        public final org.xms.g.auth.api.credentials.CredentialRequest build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialRequest.Builder.build()");
                return new org.xms.g.auth.api.credentials.CredentialRequest(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialRequest.Builder) this.getGInstance()).build()");
                com.google.android.gms.auth.api.credentials.CredentialRequest gReturn = ((com.google.android.gms.auth.api.credentials.CredentialRequest.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialRequest(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.credentials.CredentialRequest.Builder setAccountTypes(java.lang.String... param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialRequest.Builder.setAccountTypes(java.lang.String...)");
                return new org.xms.g.auth.api.credentials.CredentialRequest.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialRequest.Builder) this.getGInstance()).setAccountTypes(param0)");
                com.google.android.gms.auth.api.credentials.CredentialRequest.Builder gReturn = ((com.google.android.gms.auth.api.credentials.CredentialRequest.Builder) this.getGInstance()).setAccountTypes(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.credentials.CredentialRequest.Builder setCredentialHintPickerConfig(org.xms.g.auth.api.credentials.CredentialPickerConfig param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialRequest.Builder.setCredentialHintPickerConfig(org.xms.g.auth.api.credentials.CredentialPickerConfig)");
                return new org.xms.g.auth.api.credentials.CredentialRequest.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialRequest.Builder) this.getGInstance()).setCredentialHintPickerConfig(((com.google.android.gms.auth.api.credentials.CredentialPickerConfig) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.auth.api.credentials.CredentialRequest.Builder gReturn = ((com.google.android.gms.auth.api.credentials.CredentialRequest.Builder) this.getGInstance()).setCredentialHintPickerConfig(((com.google.android.gms.auth.api.credentials.CredentialPickerConfig) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.credentials.CredentialRequest.Builder setCredentialPickerConfig(org.xms.g.auth.api.credentials.CredentialPickerConfig param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialRequest.Builder.setCredentialPickerConfig(org.xms.g.auth.api.credentials.CredentialPickerConfig)");
                return new org.xms.g.auth.api.credentials.CredentialRequest.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialRequest.Builder) this.getGInstance()).setCredentialPickerConfig(((com.google.android.gms.auth.api.credentials.CredentialPickerConfig) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.auth.api.credentials.CredentialRequest.Builder gReturn = ((com.google.android.gms.auth.api.credentials.CredentialRequest.Builder) this.getGInstance()).setCredentialPickerConfig(((com.google.android.gms.auth.api.credentials.CredentialPickerConfig) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.credentials.CredentialRequest.Builder setIdTokenNonce(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public final org.xms.g.auth.api.credentials.CredentialRequest.Builder setIdTokenRequested(boolean param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialRequest.Builder.setIdTokenRequested(boolean)");
                return new org.xms.g.auth.api.credentials.CredentialRequest.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialRequest.Builder) this.getGInstance()).setIdTokenRequested(param0)");
                com.google.android.gms.auth.api.credentials.CredentialRequest.Builder gReturn = ((com.google.android.gms.auth.api.credentials.CredentialRequest.Builder) this.getGInstance()).setIdTokenRequested(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.credentials.CredentialRequest.Builder setPasswordLoginSupported(boolean param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialRequest.Builder.setPasswordLoginSupported(boolean)");
                return new org.xms.g.auth.api.credentials.CredentialRequest.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialRequest.Builder) this.getGInstance()).setPasswordLoginSupported(param0)");
                com.google.android.gms.auth.api.credentials.CredentialRequest.Builder gReturn = ((com.google.android.gms.auth.api.credentials.CredentialRequest.Builder) this.getGInstance()).setPasswordLoginSupported(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.credentials.CredentialRequest.Builder setServerClientId(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialRequest.Builder.setServerClientId(java.lang.String)");
                return new org.xms.g.auth.api.credentials.CredentialRequest.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialRequest.Builder) this.getGInstance()).setServerClientId(param0)");
                com.google.android.gms.auth.api.credentials.CredentialRequest.Builder gReturn = ((com.google.android.gms.auth.api.credentials.CredentialRequest.Builder) this.getGInstance()).setServerClientId(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.credentials.CredentialRequest.Builder setSupportsPasswordLogin(boolean param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialRequest.Builder.setSupportsPasswordLogin(boolean)");
                return new org.xms.g.auth.api.credentials.CredentialRequest.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.CredentialRequest.Builder) this.getGInstance()).setSupportsPasswordLogin(param0)");
                com.google.android.gms.auth.api.credentials.CredentialRequest.Builder gReturn = ((com.google.android.gms.auth.api.credentials.CredentialRequest.Builder) this.getGInstance()).setSupportsPasswordLogin(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.CredentialRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public static org.xms.g.auth.api.credentials.CredentialRequest.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.auth.api.credentials.CredentialRequest.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.CredentialRequest.Builder.isInstance(java.lang.Object)");
                return false;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.credentials.CredentialRequest.Builder;
            }
        }
    }
}