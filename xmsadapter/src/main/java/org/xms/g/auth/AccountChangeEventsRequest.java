package org.xms.g.auth;




public class AccountChangeEventsRequest extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.auth.AccountChangeEventsRequest createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                throw new RuntimeException("HMS does not support this API.");
            } else {
                com.google.android.gms.auth.AccountChangeEventsRequest gReturn = com.google.android.gms.auth.AccountChangeEventsRequest.CREATOR.createFromParcel(param0);
                return new org.xms.g.auth.AccountChangeEventsRequest(new org.xms.g.utils.XBox(gReturn, null));
            }
        }
        
        public org.xms.g.auth.AccountChangeEventsRequest[] newArray(int param0) {
            return new org.xms.g.auth.AccountChangeEventsRequest[param0];
        }
    };
    private boolean wrapper = true;
    
    
    
    public AccountChangeEventsRequest(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }
    
    public AccountChangeEventsRequest() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.AccountChangeEventsRequest.AccountChangeEventsRequest()");
        } else {
            this.setGInstance(new GImpl());
        }
        wrapper = false;
    }
    
    public android.accounts.Account getAccount() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public java.lang.String getAccountName() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public int getEventIndex() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.auth.AccountChangeEventsRequest setAccount(android.accounts.Account param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.auth.AccountChangeEventsRequest setAccountName(java.lang.String param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "HImpl org.xms.g.auth.AccountChangeEventsRequest.setAccountName(java.lang.String)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.AccountChangeEventsRequest) this.getGInstance()).setAccountName(param0)");
                com.google.android.gms.auth.AccountChangeEventsRequest gReturn = ((com.google.android.gms.auth.AccountChangeEventsRequest) this.getGInstance()).setAccountName(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.AccountChangeEventsRequest(new org.xms.g.utils.XBox(gReturn, null))));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "HImpl org.xms.g.auth.AccountChangeEventsRequest.setAccountName(java.lang.String)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.auth.AccountChangeEventsRequest) this.getGInstance())).setAccountNameCallSuper(param0)");
                com.google.android.gms.auth.AccountChangeEventsRequest gReturn = ((GImpl) ((com.google.android.gms.auth.AccountChangeEventsRequest) this.getGInstance())).setAccountNameCallSuper(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.AccountChangeEventsRequest(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
    
    public org.xms.g.auth.AccountChangeEventsRequest setEventIndex(int param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "HImpl org.xms.g.auth.AccountChangeEventsRequest.setEventIndex(int)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.AccountChangeEventsRequest) this.getGInstance()).setEventIndex(param0)");
                com.google.android.gms.auth.AccountChangeEventsRequest gReturn = ((com.google.android.gms.auth.AccountChangeEventsRequest) this.getGInstance()).setEventIndex(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.AccountChangeEventsRequest(new org.xms.g.utils.XBox(gReturn, null))));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "HImpl org.xms.g.auth.AccountChangeEventsRequest.setEventIndex(int)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.auth.AccountChangeEventsRequest) this.getGInstance())).setEventIndexCallSuper(param0)");
                com.google.android.gms.auth.AccountChangeEventsRequest gReturn = ((GImpl) ((com.google.android.gms.auth.AccountChangeEventsRequest) this.getGInstance())).setEventIndexCallSuper(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.AccountChangeEventsRequest(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.AccountChangeEventsRequest dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.AccountChangeEventsRequest) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.AccountChangeEventsRequest.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.AccountChangeEventsRequest;
        }
    }
    
    private class GImpl extends com.google.android.gms.auth.AccountChangeEventsRequest {
        
        public android.accounts.Account getAccount() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String getAccountName() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public int getEventIndex() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public com.google.android.gms.auth.AccountChangeEventsRequest setAccount(android.accounts.Account param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public com.google.android.gms.auth.AccountChangeEventsRequest setAccountName(java.lang.String param0) {
            org.xms.g.auth.AccountChangeEventsRequest xResult = org.xms.g.auth.AccountChangeEventsRequest.this.setAccountName(param0);
            return ((com.google.android.gms.auth.AccountChangeEventsRequest) ((xResult) == null ? null : (xResult.getGInstance())));
        }
        
        public com.google.android.gms.auth.AccountChangeEventsRequest setEventIndex(int param0) {
            org.xms.g.auth.AccountChangeEventsRequest xResult = org.xms.g.auth.AccountChangeEventsRequest.this.setEventIndex(param0);
            return ((com.google.android.gms.auth.AccountChangeEventsRequest) ((xResult) == null ? null : (xResult.getGInstance())));
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public android.accounts.Account getAccountCallSuper() {
            return super.getAccount();
        }
        
        public java.lang.String getAccountNameCallSuper() {
            return super.getAccountName();
        }
        
        public int getEventIndexCallSuper() {
            return super.getEventIndex();
        }
        
        public com.google.android.gms.auth.AccountChangeEventsRequest setAccountCallSuper(android.accounts.Account param0) {
            return super.setAccount(param0);
        }
        
        public com.google.android.gms.auth.AccountChangeEventsRequest setAccountNameCallSuper(java.lang.String param0) {
            return super.setAccountName(param0);
        }
        
        public com.google.android.gms.auth.AccountChangeEventsRequest setEventIndexCallSuper(int param0) {
            return super.setEventIndex(param0);
        }
        
        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
        
        public GImpl() {
            super();
        }
    }
}