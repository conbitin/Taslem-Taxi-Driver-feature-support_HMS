package org.xms.g.auth;




public class AccountChangeEventsResponse extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.auth.AccountChangeEventsResponse createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                throw new RuntimeException("HMS does not support this API.");
            } else {
                com.google.android.gms.auth.AccountChangeEventsResponse gReturn = com.google.android.gms.auth.AccountChangeEventsResponse.CREATOR.createFromParcel(param0);
                return new org.xms.g.auth.AccountChangeEventsResponse(new org.xms.g.utils.XBox(gReturn, null));
            }
        }
        
        public org.xms.g.auth.AccountChangeEventsResponse[] newArray(int param0) {
            return new org.xms.g.auth.AccountChangeEventsResponse[param0];
        }
    };
    private boolean wrapper = true;
    
    
    
    public AccountChangeEventsResponse(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }
    
    public AccountChangeEventsResponse(java.util.List<org.xms.g.auth.AccountChangeEvent> param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.AccountChangeEventsResponse.AccountChangeEventsResponse(java.util.List<org.xms.g.auth.AccountChangeEvent>)");
        } else {
            this.setGInstance(new GImpl(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, false))));
        }
        wrapper = false;
    }
    
    public java.util.List<org.xms.g.auth.AccountChangeEvent> getEvents() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "HImpl org.xms.g.auth.AccountChangeEventsResponse.getEvents()");
                return new java.util.ArrayList<>();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.AccountChangeEventsResponse) this.getGInstance()).getEvents()");
                java.util.List gReturn = ((com.google.android.gms.auth.AccountChangeEventsResponse) this.getGInstance()).getEvents();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.auth.AccountChangeEvent, org.xms.g.auth.AccountChangeEvent>() {
                    
                    public org.xms.g.auth.AccountChangeEvent apply(com.google.android.gms.auth.AccountChangeEvent param0) {
                        return new org.xms.g.auth.AccountChangeEvent(new org.xms.g.utils.XBox(param0, null));
                    }
                }));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "HImpl org.xms.g.auth.AccountChangeEventsResponse.getEvents()");
                return new java.util.ArrayList<>();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.auth.AccountChangeEventsResponse) this.getGInstance())).getEventsCallSuper()");
                java.util.List gReturn = ((GImpl) ((com.google.android.gms.auth.AccountChangeEventsResponse) this.getGInstance())).getEventsCallSuper();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.auth.AccountChangeEvent, org.xms.g.auth.AccountChangeEvent>() {
                    
                    public org.xms.g.auth.AccountChangeEvent apply(com.google.android.gms.auth.AccountChangeEvent param0) {
                        return new org.xms.g.auth.AccountChangeEvent(new org.xms.g.utils.XBox(param0, null));
                    }
                }));
            }
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.AccountChangeEventsResponse dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.AccountChangeEventsResponse) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.AccountChangeEventsResponse.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.AccountChangeEventsResponse;
        }
    }
    
    private class GImpl extends com.google.android.gms.auth.AccountChangeEventsResponse {
        
        public java.util.List<com.google.android.gms.auth.AccountChangeEvent> getEvents() {
            return ((java.util.List) org.xms.g.utils.Utils.mapList2GH(org.xms.g.auth.AccountChangeEventsResponse.this.getEvents(), false));
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.util.List<com.google.android.gms.auth.AccountChangeEvent> getEventsCallSuper() {
            return super.getEvents();
        }
        
        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
        
        public GImpl(java.util.List<com.google.android.gms.auth.AccountChangeEvent> param0) {
            super(param0);
        }
    }
}