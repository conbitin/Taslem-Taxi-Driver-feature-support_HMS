package org.xms.g.auth.api.phone;

public interface SmsCodeAutofillClient extends org.xms.g.utils.XInterface, org.xms.g.common.api.HasApiKey<org.xms.g.common.api.Api.ApiOptions.NoOptions> {
    
    public org.xms.g.tasks.Task<Integer> checkPermissionState();
    
    public org.xms.g.tasks.Task<Boolean> hasOngoingSmsRequest(java.lang.String param0);
    
    public org.xms.g.tasks.Task<Void> startSmsCodeRetriever();
    
    default java.lang.Object getZInstanceSmsCodeAutofillClient() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default com.google.android.gms.auth.api.phone.SmsCodeAutofillClient getGInstanceSmsCodeAutofillClient() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default java.lang.Object getHInstanceSmsCodeAutofillClient() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.api.phone.SmsCodeAutofillClient dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.auth.api.phone.SmsCodeAutofillClient {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public org.xms.g.tasks.Task<Integer> checkPermissionState() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.tasks.Task<Boolean> hasOngoingSmsRequest(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.tasks.Task<Void> startSmsCodeRetriever() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public java.lang.Object getApiKey() {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
    
    public abstract static class PermissionState extends org.xms.g.utils.XObject implements java.lang.annotation.Annotation {
        
        
        
        public PermissionState(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public static int getDENIED() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.phone.SmsCodeAutofillClient.PermissionState.getDENIED");
                return 0;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.phone.SmsCodeAutofillClient.PermissionState.DENIED");
                return com.google.android.gms.auth.api.phone.SmsCodeAutofillClient.PermissionState.DENIED;
            }
        }
        
        public static int getGRANTED() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.phone.SmsCodeAutofillClient.PermissionState.getGRANTED");
                return 0;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.phone.SmsCodeAutofillClient.PermissionState.GRANTED");
                return com.google.android.gms.auth.api.phone.SmsCodeAutofillClient.PermissionState.GRANTED;
            }
        }
        
        public static int getNONE() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.phone.SmsCodeAutofillClient.PermissionState.getNONE");
                return 0;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.phone.SmsCodeAutofillClient.PermissionState.NONE");
                return com.google.android.gms.auth.api.phone.SmsCodeAutofillClient.PermissionState.NONE;
            }
        }
        
        public static org.xms.g.auth.api.phone.SmsCodeAutofillClient.PermissionState dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.auth.api.phone.SmsCodeAutofillClient.PermissionState) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                throw new java.lang.RuntimeException("HMS does not support this API.");
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.phone.SmsCodeAutofillClient.PermissionState;
            }
        }
        
        public static class XImpl extends org.xms.g.auth.api.phone.SmsCodeAutofillClient.PermissionState {
            
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
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
        }
    }
}