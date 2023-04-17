package org.xms.g.auth.api.phone;




public abstract class SmsRetrieverClient extends org.xms.g.common.api.ExtensionApi<org.xms.g.common.api.Api.ApiOptions.NoOptions> implements org.xms.g.auth.api.phone.SmsRetrieverApi {
    
    protected android.app.Activity localActivity = null;
    protected android.content.Context localContext = null;
    public SmsRetrieverClient(com.google.android.gms.auth.api.phone.SmsRetrieverClient param0, java.lang.Object param1, android.app.Activity param2) {
        super(((org.xms.g.utils.XBox) null));
        this.setHInstance(param1);
        localActivity = param2;
    }
    public SmsRetrieverClient(com.google.android.gms.auth.api.phone.SmsRetrieverClient param0, java.lang.Object param1, android.content.Context param2) {
        super(((org.xms.g.utils.XBox) null));
        this.setHInstance(param1);
        localContext = param2;
    }
    
    public SmsRetrieverClient(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public abstract org.xms.g.tasks.Task<java.lang.Void> startSmsRetriever();
    
    public abstract org.xms.g.tasks.Task<java.lang.Void> startSmsUserConsent(java.lang.String param0);
    
    public static org.xms.g.auth.api.phone.SmsRetrieverClient dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.auth.api.phone.SmsRetrieverClient) {
            return ((org.xms.g.auth.api.phone.SmsRetrieverClient) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.auth.api.phone.SmsRetrieverClient gReturn = ((com.google.android.gms.auth.api.phone.SmsRetrieverClient) ((org.xms.g.utils.XGettable) param0).getGInstance());
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.phone.SmsRetrieverClient.dynamicCast(java.lang.Object)");
            java.lang.Object hReturn = ((org.xms.g.utils.XGettable) param0).getHInstance();
            return new org.xms.g.auth.api.phone.SmsRetrieverClient.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.auth.api.phone.SmsRetrieverClient) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.phone.SmsRetrieverClient.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.phone.SmsRetrieverClient;
        }
    }
    
    public static class XImpl extends org.xms.g.auth.api.phone.SmsRetrieverClient {
        
        public XImpl(com.google.android.gms.auth.api.phone.SmsRetrieverClient param0, java.lang.Object param1, android.app.Activity param2) {
            super(param0, param1, param2);
        }
        public XImpl(com.google.android.gms.auth.api.phone.SmsRetrieverClient param0, java.lang.Object param1, android.content.Context param2) {
            super(param0, param1, param2);
        }
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public org.xms.g.tasks.Task<java.lang.Void> startSmsRetriever() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                if (localActivity == null && localContext == null) {
                    return null;
                }
                com.huawei.hmf.tasks.Task<Void> hReturn = null;
                if (localActivity != null) {
                    hReturn = com.huawei.hms.support.sms.ReadSmsManager.start(localActivity);
                } else {
                    hReturn = com.huawei.hms.support.sms.ReadSmsManager.start(localContext);
                }
                if (hReturn == null) {
                    return null;
                }
                return new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.phone.SmsRetrieverClient) this.getGInstance()).startSmsRetriever()");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.auth.api.phone.SmsRetrieverClient) this.getGInstance()).startSmsRetriever();
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.g.tasks.Task<java.lang.Void> startSmsUserConsent(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.phone.SmsRetrieverClient.XImpl.startSmsUserConsent(java.lang.String)");
                if (localActivity == null) {
                    return null;
                }
                com.huawei.hmf.tasks.Task<Void> hReturn = com.huawei.hms.support.sms.ReadSmsManager.startConsent(localActivity,param0);
                if (hReturn == null) {
                    return null;
                }
                return new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.phone.SmsRetrieverClient) this.getGInstance()).startSmsUserConsent(param0)");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.auth.api.phone.SmsRetrieverClient) this.getGInstance()).startSmsUserConsent(param0);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public java.lang.Object getApiKey() {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}