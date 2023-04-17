package org.xms.g.auth.api.accounttransfer;




public class AccountTransferException extends org.xms.g.common.api.ApiException {
    private boolean wrapper = true;
    
    
    
    public AccountTransferException(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }
    
    public AccountTransferException(org.xms.g.common.api.Status param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.accounttransfer.AccountTransferException.AccountTransferException(org.xms.g.common.api.Status)");
        } else {
            this.setGInstance(new GImpl(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance())))));
        }
        wrapper = false;
    }
    
    public static org.xms.g.auth.api.accounttransfer.AccountTransferException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.accounttransfer.AccountTransferException) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.accounttransfer.AccountTransferException.isInstance(java.lang.Object)");
            return false;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.accounttransfer.AccountTransferException;
        }
    }
    
    private class GImpl extends com.google.android.gms.auth.api.accounttransfer.AccountTransferException {
        
        public GImpl(com.google.android.gms.common.api.Status param0) {
            super(param0);
        }
    }
}