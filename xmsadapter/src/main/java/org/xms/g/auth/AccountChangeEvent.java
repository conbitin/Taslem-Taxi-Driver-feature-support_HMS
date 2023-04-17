package org.xms.g.auth;




public class AccountChangeEvent extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.auth.AccountChangeEvent createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                throw new RuntimeException("HMS does not support this API.");
            } else {
                com.google.android.gms.auth.AccountChangeEvent gReturn = com.google.android.gms.auth.AccountChangeEvent.CREATOR.createFromParcel(param0);
                return new org.xms.g.auth.AccountChangeEvent(new org.xms.g.utils.XBox(gReturn, null));
            }
        }
        
        public org.xms.g.auth.AccountChangeEvent[] newArray(int param0) {
            return new org.xms.g.auth.AccountChangeEvent[param0];
        }
    };
    private boolean wrapper = true;
    
    
    
    public AccountChangeEvent(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }
    
    public AccountChangeEvent(long param0, java.lang.String param1, int param2, int param3, java.lang.String param4) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.AccountChangeEvent.AccountChangeEvent(longjava.lang.Stringintintjava.lang.String)");
        } else {
            this.setGInstance(new GImpl(param0, param1, param2, param3, param4));
        }
        wrapper = false;
    }
    
    public boolean equals(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public java.lang.String getAccountName() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public java.lang.String getChangeData() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public int getChangeType() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public int getEventIndex() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public int hashCode() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public java.lang.String toString() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.AccountChangeEvent dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.AccountChangeEvent) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.AccountChangeEvent.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.AccountChangeEvent;
        }
    }
    
    private class GImpl extends com.google.android.gms.auth.AccountChangeEvent {
        
        public boolean equals(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String getAccountName() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String getChangeData() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public int getChangeType() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public int getEventIndex() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public int hashCode() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.String toString() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }
        
        public java.lang.String getAccountNameCallSuper() {
            return super.getAccountName();
        }
        
        public java.lang.String getChangeDataCallSuper() {
            return super.getChangeData();
        }
        
        public int getChangeTypeCallSuper() {
            return super.getChangeType();
        }
        
        public int getEventIndexCallSuper() {
            return super.getEventIndex();
        }
        
        public int hashCodeCallSuper() {
            return super.hashCode();
        }
        
        public java.lang.String toStringCallSuper() {
            return super.toString();
        }
        
        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
        
        public GImpl(long param0, java.lang.String param1, int param2, int param3, java.lang.String param4) {
            super(param0, param1, param2, param3, param4);
        }
    }
}