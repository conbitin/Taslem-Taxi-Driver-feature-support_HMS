package org.xms.g.auth.account;




public class WorkAccount extends org.xms.g.utils.XObject {
    
    
    
    public WorkAccount(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static org.xms.g.common.api.Api getAPI() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.account.WorkAccount.getAPI()");
            com.huawei.hms.api.Api hReturn = new com.huawei.hms.api.Api("");
            return new org.xms.g.common.api.Api(new org.xms.g.utils.XBox(null, hReturn));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.account.WorkAccount.API");
            com.google.android.gms.common.api.Api gReturn = null;
            gReturn = com.google.android.gms.auth.account.WorkAccount.API;
            return ((gReturn) == null ? null : (new org.xms.g.common.api.Api(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.account.WorkAccountApi getWorkAccountApi() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.account.WorkAccount.getWorkAccountApi()");
            java.lang.Object hReturn = new java.lang.Object();
            return new org.xms.g.auth.account.WorkAccountApi.XImpl(new org.xms.g.utils.XBox(null, hReturn));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.account.WorkAccount.WorkAccountApi");
            com.google.android.gms.auth.account.WorkAccountApi gReturn = null;
            gReturn = com.google.android.gms.auth.account.WorkAccount.WorkAccountApi;
            return ((gReturn) == null ? null : (new org.xms.g.auth.account.WorkAccountApi.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.account.WorkAccountClient getClient(android.app.Activity param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.account.WorkAccount.getClient(android.app.Activity)org.xms.g.auth.account.WorkAccountClient");
            return new org.xms.g.auth.account.WorkAccountClient(new org.xms.g.utils.XBox(null, new java.lang.Object()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.account.WorkAccount.getClient(param0)");
            com.google.android.gms.auth.account.WorkAccountClient gReturn = com.google.android.gms.auth.account.WorkAccount.getClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.auth.account.WorkAccountClient(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.account.WorkAccountClient getClient(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.account.WorkAccount.getClient(android.content.Context)org.xms.g.auth.account.WorkAccountClient");
            return new org.xms.g.auth.account.WorkAccountClient(new org.xms.g.utils.XBox(null, new java.lang.Object()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.account.WorkAccount.getClient(param0)");
            com.google.android.gms.auth.account.WorkAccountClient gReturn = com.google.android.gms.auth.account.WorkAccount.getClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.auth.account.WorkAccountClient(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.account.WorkAccount dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.account.WorkAccount) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.account.WorkAccount.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.account.WorkAccount;
        }
    }
}