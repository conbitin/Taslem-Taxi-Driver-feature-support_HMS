package org.xms.g.auth.api.credentials;




public class Credential extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.auth.api.credentials.Credential createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                throw new RuntimeException("HMS does not support this API.");
            } else {
                com.google.android.gms.auth.api.credentials.Credential gReturn = com.google.android.gms.auth.api.credentials.Credential.CREATOR.createFromParcel(param0);
                return new org.xms.g.auth.api.credentials.Credential(new org.xms.g.utils.XBox(gReturn, null));
            }
        }
        
        public org.xms.g.auth.api.credentials.Credential[] newArray(int param0) {
            return new org.xms.g.auth.api.credentials.Credential[param0];
        }
    };
    
    
    
    public Credential(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static java.lang.String getEXTRA_KEY() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.getEXTRA_KEY()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.credentials.Credential.EXTRA_KEY");
            return com.google.android.gms.auth.api.credentials.Credential.EXTRA_KEY;
        }
    }
    
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.equals(java.lang.Object)");
            return this == param0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).equals(param0);
        }
    }
    
    public java.lang.String getAccountType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.getAccountType()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).getAccountType()");
            return ((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).getAccountType();
        }
    }
    
    public java.lang.String getFamilyName() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.getFamilyName()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).getFamilyName()");
            return ((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).getFamilyName();
        }
    }
    
    public java.lang.String getGivenName() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.getGivenName()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).getGivenName()");
            return ((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).getGivenName();
        }
    }
    
    public java.lang.String getId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.getId()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).getId()");
            return ((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).getId();
        }
    }
    
    public java.util.List<org.xms.g.auth.api.credentials.IdToken> getIdTokens() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.getIdTokens()");
            return new java.util.ArrayList<>();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).getIdTokens()");
            java.util.List gReturn = ((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).getIdTokens();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.auth.api.credentials.IdToken, org.xms.g.auth.api.credentials.IdToken>() {
                
                public org.xms.g.auth.api.credentials.IdToken apply(com.google.android.gms.auth.api.credentials.IdToken param0) {
                    return new org.xms.g.auth.api.credentials.IdToken(new org.xms.g.utils.XBox(param0, null));
                }
            }));
        }
    }
    
    public java.lang.String getName() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.getName()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).getName()");
            return ((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).getName();
        }
    }
    
    public java.lang.String getPassword() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.getPassword()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).getPassword()");
            return ((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).getPassword();
        }
    }
    
    public android.net.Uri getProfilePictureUri() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.getProfilePictureUri()");
            return android.net.Uri.EMPTY;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).getProfilePictureUri()");
            return ((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).getProfilePictureUri();
        }
    }
    
    public int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.hashCode()");
            return 0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.auth.api.credentials.Credential) this.getGInstance()).hashCode();
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.api.credentials.Credential dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.credentials.Credential) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.credentials.Credential;
        }
    }
    
    public static class Builder extends org.xms.g.utils.XObject {
        
        
        
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public Builder(java.lang.String param0) {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.Builder.Builder(java.lang.String)");
                this.setHInstance(new java.lang.Object());
            } else {
                this.setGInstance(new com.google.android.gms.auth.api.credentials.Credential.Builder(param0));
            }
        }
        
        public Builder(org.xms.g.auth.api.credentials.Credential param0) {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.Builder.Builder(org.xms.g.auth.api.credentials.Credential)");
                this.setHInstance(new java.lang.Object());
            } else {
                this.setGInstance(new com.google.android.gms.auth.api.credentials.Credential.Builder(((com.google.android.gms.auth.api.credentials.Credential) ((param0) == null ? null : (param0.getGInstance())))));
            }
        }
        
        public org.xms.g.auth.api.credentials.Credential build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.Builder.build()");
                return new org.xms.g.auth.api.credentials.Credential(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.Credential.Builder) this.getGInstance()).build()");
                com.google.android.gms.auth.api.credentials.Credential gReturn = ((com.google.android.gms.auth.api.credentials.Credential.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.Credential(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.auth.api.credentials.Credential.Builder setAccountType(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.Builder.setAccountType(java.lang.String)");
                return new org.xms.g.auth.api.credentials.Credential.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.Credential.Builder) this.getGInstance()).setAccountType(param0)");
                com.google.android.gms.auth.api.credentials.Credential.Builder gReturn = ((com.google.android.gms.auth.api.credentials.Credential.Builder) this.getGInstance()).setAccountType(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.Credential.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.auth.api.credentials.Credential.Builder setName(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.Builder.setName(java.lang.String)");
                return new org.xms.g.auth.api.credentials.Credential.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.Credential.Builder) this.getGInstance()).setName(param0)");
                com.google.android.gms.auth.api.credentials.Credential.Builder gReturn = ((com.google.android.gms.auth.api.credentials.Credential.Builder) this.getGInstance()).setName(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.Credential.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.auth.api.credentials.Credential.Builder setPassword(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.Builder.setPassword(java.lang.String)");
                return new org.xms.g.auth.api.credentials.Credential.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.Credential.Builder) this.getGInstance()).setPassword(param0)");
                com.google.android.gms.auth.api.credentials.Credential.Builder gReturn = ((com.google.android.gms.auth.api.credentials.Credential.Builder) this.getGInstance()).setPassword(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.Credential.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.auth.api.credentials.Credential.Builder setProfilePictureUri(android.net.Uri param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.Builder.setProfilePictureUri(android.net.Uri)");
                return new org.xms.g.auth.api.credentials.Credential.Builder(new org.xms.g.utils.XBox(null, new java.lang.Object()));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.Credential.Builder) this.getGInstance()).setProfilePictureUri(param0)");
                com.google.android.gms.auth.api.credentials.Credential.Builder gReturn = ((com.google.android.gms.auth.api.credentials.Credential.Builder) this.getGInstance()).setProfilePictureUri(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.credentials.Credential.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public static org.xms.g.auth.api.credentials.Credential.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.auth.api.credentials.Credential.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.Credential.Builder.isInstance(java.lang.Object)");
                return false;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.credentials.Credential.Builder;
            }
        }
    }
}