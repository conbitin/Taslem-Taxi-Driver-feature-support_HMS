package org.xms.g.auth.api.credentials;

public final class HintRequest extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.auth.api.credentials.HintRequest createFromParcel(android.os.Parcel param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.auth.api.credentials.HintRequest[] newArray(int param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    };
    
    public HintRequest(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public final java.lang.String[] getAccountTypes() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final org.xms.g.auth.api.credentials.CredentialPickerConfig getHintPickerConfig() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final java.lang.String getIdTokenNonce() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final java.lang.String getServerClientId() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final boolean isEmailAddressIdentifierSupported() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final boolean isIdTokenRequested() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.api.credentials.HintRequest dynamicCast(java.lang.Object param0) {
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
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.HintRequest.Builder.Builder()");
                this.setHInstance(new java.lang.Object());
            } else {
                this.setGInstance(new com.google.android.gms.auth.api.credentials.HintRequest.Builder());
            }
        }
        
        public final org.xms.g.auth.api.credentials.HintRequest build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.HintRequest.Builder.build()");
                return new org.xms.g.auth.api.credentials.HintRequest(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.HintRequest.Builder) this.getGInstance()).build()");
                com.google.android.gms.auth.api.credentials.HintRequest gReturn = ((com.google.android.gms.auth.api.credentials.HintRequest.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.HintRequest(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.auth.api.credentials.HintRequest.Builder setAccountTypes(java.lang.String... param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.HintRequest.Builder.setAccountTypes(java.lang.String...)");
                return new org.xms.g.auth.api.credentials.HintRequest.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.HintRequest.Builder) this.getGInstance()).setAccountTypes(param0)");
                com.google.android.gms.auth.api.credentials.HintRequest.Builder gReturn = ((com.google.android.gms.auth.api.credentials.HintRequest.Builder) this.getGInstance()).setAccountTypes(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.HintRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.credentials.HintRequest.Builder setEmailAddressIdentifierSupported(boolean param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.HintRequest.Builder.setEmailAddressIdentifierSupported(boolean)");
                return new org.xms.g.auth.api.credentials.HintRequest.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.HintRequest.Builder) this.getGInstance()).setEmailAddressIdentifierSupported(param0)");
                com.google.android.gms.auth.api.credentials.HintRequest.Builder gReturn = ((com.google.android.gms.auth.api.credentials.HintRequest.Builder) this.getGInstance()).setEmailAddressIdentifierSupported(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.HintRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.credentials.HintRequest.Builder setHintPickerConfig(org.xms.g.auth.api.credentials.CredentialPickerConfig param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.HintRequest.Builder.setHintPickerConfig(org.xms.g.auth.api.credentials.CredentialPickerConfig)");
                return new org.xms.g.auth.api.credentials.HintRequest.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.HintRequest.Builder) this.getGInstance()).setHintPickerConfig(((com.google.android.gms.auth.api.credentials.CredentialPickerConfig) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.auth.api.credentials.HintRequest.Builder gReturn = ((com.google.android.gms.auth.api.credentials.HintRequest.Builder) this.getGInstance()).setHintPickerConfig(((com.google.android.gms.auth.api.credentials.CredentialPickerConfig) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.HintRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.credentials.HintRequest.Builder setIdTokenNonce(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public final org.xms.g.auth.api.credentials.HintRequest.Builder setIdTokenRequested(boolean param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.HintRequest.Builder.setIdTokenRequested(boolean)");
                return new org.xms.g.auth.api.credentials.HintRequest.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.HintRequest.Builder) this.getGInstance()).setIdTokenRequested(param0)");
                com.google.android.gms.auth.api.credentials.HintRequest.Builder gReturn = ((com.google.android.gms.auth.api.credentials.HintRequest.Builder) this.getGInstance()).setIdTokenRequested(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.HintRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.credentials.HintRequest.Builder setPhoneNumberIdentifierSupported(boolean param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.HintRequest.Builder.setPhoneNumberIdentifierSupported(boolean)");
                return new org.xms.g.auth.api.credentials.HintRequest.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.HintRequest.Builder) this.getGInstance()).setPhoneNumberIdentifierSupported(param0)");
                com.google.android.gms.auth.api.credentials.HintRequest.Builder gReturn = ((com.google.android.gms.auth.api.credentials.HintRequest.Builder) this.getGInstance()).setPhoneNumberIdentifierSupported(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.HintRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.credentials.HintRequest.Builder setServerClientId(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static org.xms.g.auth.api.credentials.HintRequest.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.auth.api.credentials.HintRequest.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.HintRequest.Builder.isInstance(java.lang.Object)");
                return false;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.credentials.HintRequest.Builder;
            }
        }
    }
}