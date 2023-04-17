package org.xms.f.auth;




public interface ActionCodeResult extends org.xms.g.utils.XInterface {
    
    
    
    public static int getEMAIL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeResult.getEMAIL");
            return 0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.ActionCodeResult.EMAIL");
            return com.google.firebase.auth.ActionCodeResult.EMAIL;
        }
    }
    
    public static int getERROR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeResult.getERROR");
            return 3;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.ActionCodeResult.ERROR");
            return com.google.firebase.auth.ActionCodeResult.ERROR;
        }
    }
    
    public static int getFROM_EMAIL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeResult.getFROM_EMAIL");
            return 1;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.ActionCodeResult.FROM_EMAIL");
            return com.google.firebase.auth.ActionCodeResult.FROM_EMAIL;
        }
    }
    
    public static int getPASSWORD_RESET() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeResult.getPASSWORD_RESET");
            return 0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.ActionCodeResult.PASSWORD_RESET");
            return com.google.firebase.auth.ActionCodeResult.PASSWORD_RESET;
        }
    }
    
    public static int getRECOVER_EMAIL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeResult.getRECOVER_EMAIL");
            return 2;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.ActionCodeResult.RECOVER_EMAIL");
            return com.google.firebase.auth.ActionCodeResult.RECOVER_EMAIL;
        }
    }
    
    public static int getSIGN_IN_WITH_EMAIL_LINK() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeResult.getSIGN_IN_WITH_EMAIL_LINK");
            return 4;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.ActionCodeResult.SIGN_IN_WITH_EMAIL_LINK");
            return com.google.firebase.auth.ActionCodeResult.SIGN_IN_WITH_EMAIL_LINK;
        }
    }
    
    public static int getVERIFY_BEFORE_CHANGE_EMAIL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeResult.getVERIFY_BEFORE_CHANGE_EMAIL");
            return 5;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.ActionCodeResult.VERIFY_BEFORE_CHANGE_EMAIL");
            return com.google.firebase.auth.ActionCodeResult.VERIFY_BEFORE_CHANGE_EMAIL;
        }
    }
    
    public static int getREVERT_SECOND_FACTOR_ADDITION() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeResult.getREVERT_SECOND_FACTOR_ADDITION");
            return 6;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.ActionCodeResult.REVERT_SECOND_FACTOR_ADDITION");
            return com.google.firebase.auth.ActionCodeResult.REVERT_SECOND_FACTOR_ADDITION;
        }
    }
    
    public static int getVERIFY_EMAIL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeResult.getVERIFY_EMAIL");
            return 1;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.ActionCodeResult.VERIFY_EMAIL");
            return com.google.firebase.auth.ActionCodeResult.VERIFY_EMAIL;
        }
    }
    
    public java.lang.String getData(int param0);
    
    public org.xms.f.auth.ActionCodeInfo getInfo();
    
    public int getOperation();
    
    default java.lang.Object getZInstanceActionCodeResult() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceActionCodeResult();
        } else {
            return getGInstanceActionCodeResult();
        }
    }
    
    default com.google.firebase.auth.ActionCodeResult getGInstanceActionCodeResult() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.firebase.auth.ActionCodeResult) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.firebase.auth.ActionCodeResult() {
            
            public java.lang.String getData(int param0) {
                return org.xms.f.auth.ActionCodeResult.this.getData(param0);
            }
            
            public com.google.firebase.auth.ActionCodeInfo getInfo() {
                org.xms.f.auth.ActionCodeInfo xResult = org.xms.f.auth.ActionCodeResult.this.getInfo();
                return ((com.google.firebase.auth.ActionCodeInfo) ((xResult) == null ? null : (xResult.getGInstance())));
            }
            
            public int getOperation() {
                return org.xms.f.auth.ActionCodeResult.this.getOperation();
            }
        };
    }
    
    default java.lang.Object getHInstanceActionCodeResult() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((java.lang.Object) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new java.lang.Object();
    }
    
    public static org.xms.f.auth.ActionCodeResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.ActionCodeResult) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.ActionCodeResult;
            }
        }
        return param0 instanceof org.xms.f.auth.ActionCodeResult;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.f.auth.ActionCodeResult {
        
        
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public java.lang.String getData(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeResult.XImpl.getData(param0)");
                return "";
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.ActionCodeResult) this.getGInstance()).getData(param0)");
                return ((com.google.firebase.auth.ActionCodeResult) this.getGInstance()).getData(param0);
            }
        }
        
        public org.xms.f.auth.ActionCodeInfo getInfo() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeResult.XImpl.getInfo()");
                return new org.xms.f.auth.ActionCodeInfo(new org.xms.g.utils.XBox(null, null));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.ActionCodeResult) this.getGInstance()).getInfo()");
                com.google.firebase.auth.ActionCodeInfo gReturn = ((com.google.firebase.auth.ActionCodeResult) this.getGInstance()).getInfo();
                return ((gReturn) == null ? null : (new org.xms.f.auth.ActionCodeInfo(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public int getOperation() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeResult.XImpl.getOperation()");
                return 0;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.ActionCodeResult) this.getGInstance()).getOperation()");
                return ((com.google.firebase.auth.ActionCodeResult) this.getGInstance()).getOperation();
            }
        }
    }
}