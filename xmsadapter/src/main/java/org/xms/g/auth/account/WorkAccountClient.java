package org.xms.g.auth.account;




public class WorkAccountClient extends org.xms.g.common.api.ExtensionApi<org.xms.g.common.api.Api.ApiOptions.NoOptions> {
    
    
    
    public WorkAccountClient(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public org.xms.g.tasks.Task<android.accounts.Account> addWorkAccount(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.account.WorkAccountClient.addWorkAccount(java.lang.String)");
            return new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, new org.xms.g.auth.TaskEmptyImpl()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.account.WorkAccountClient) this.getGInstance()).addWorkAccount(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.auth.account.WorkAccountClient) this.getGInstance()).addWorkAccount(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> removeWorkAccount(android.accounts.Account param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.account.WorkAccountClient.removeWorkAccount(android.accounts.Account)");
            return new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, new org.xms.g.auth.TaskEmptyImpl()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.account.WorkAccountClient) this.getGInstance()).removeWorkAccount(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.auth.account.WorkAccountClient) this.getGInstance()).removeWorkAccount(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> setWorkAuthenticatorEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.account.WorkAccountClient.setWorkAuthenticatorEnabled(boolean)");
            return new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, new org.xms.g.auth.TaskEmptyImpl()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.account.WorkAccountClient) this.getGInstance()).setWorkAuthenticatorEnabled(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.auth.account.WorkAccountClient) this.getGInstance()).setWorkAuthenticatorEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public java.lang.Object getApiKey() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.account.WorkAccountClient dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.auth.account.WorkAccountClient) {
            return ((org.xms.g.auth.account.WorkAccountClient) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.auth.account.WorkAccountClient gReturn = ((com.google.android.gms.auth.account.WorkAccountClient) ((org.xms.g.utils.XGettable) param0).getGInstance());
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.account.WorkAccountClient.dynamicCast(java.lang.Object)");
            java.lang.Object hReturn = ((org.xms.g.utils.XGettable) param0).getHInstance();
            return new org.xms.g.auth.account.WorkAccountClient(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.auth.account.WorkAccountClient) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.account.WorkAccountClient.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.account.WorkAccountClient;
        }
    }
}