package org.xms.g.auth.api.credentials;




public final class IdToken extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.auth.api.credentials.IdToken createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                throw new RuntimeException("HMS does not support this API.");
            } else {
                com.google.android.gms.auth.api.credentials.IdToken gReturn = com.google.android.gms.auth.api.credentials.IdToken.CREATOR.createFromParcel(param0);
                return new org.xms.g.auth.api.credentials.IdToken(new org.xms.g.utils.XBox(gReturn, null));
            }
        }
        
        public org.xms.g.auth.api.credentials.IdToken[] newArray(int param0) {
            return new org.xms.g.auth.api.credentials.IdToken[param0];
        }
    };
    
    
    
    public IdToken(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public IdToken(java.lang.String param0, java.lang.String param1) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.IdToken.IdToken(java.lang.Stringjava.lang.String)");
        } else {
            this.setGInstance(new com.google.android.gms.auth.api.credentials.IdToken(param0, param1));
        }
    }
    
    public final boolean equals(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final java.lang.String getAccountType() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final java.lang.String getIdToken() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.IdToken.getIdToken()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.credentials.IdToken) this.getGInstance()).getIdToken()");
            return ((com.google.android.gms.auth.api.credentials.IdToken) this.getGInstance()).getIdToken();
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.api.credentials.IdToken dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.credentials.IdToken) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.credentials.IdToken.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.credentials.IdToken;
        }
    }
}