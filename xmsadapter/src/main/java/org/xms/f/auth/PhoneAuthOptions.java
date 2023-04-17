package org.xms.f.auth;




public final class PhoneAuthOptions extends org.xms.g.utils.XObject {
    
    
    
    public PhoneAuthOptions(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static org.xms.f.auth.PhoneAuthOptions.Builder newBuilder() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthOptions.newBuilder()");
            return new org.xms.f.auth.PhoneAuthOptions.Builder(new org.xms.g.utils.XBox(null, null));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.PhoneAuthOptions.newBuilder()");
            com.google.firebase.auth.PhoneAuthOptions.Builder gReturn = com.google.firebase.auth.PhoneAuthOptions.newBuilder();
            return ((gReturn) == null ? null : (new org.xms.f.auth.PhoneAuthOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.f.auth.PhoneAuthOptions.Builder newBuilder(org.xms.f.auth.ExtensionAuth param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthOptions.newBuilder(param0)");
            return new org.xms.f.auth.PhoneAuthOptions.Builder(new org.xms.g.utils.XBox(null, null));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.PhoneAuthOptions.newBuilder(((com.google.firebase.auth.FirebaseAuth) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.firebase.auth.PhoneAuthOptions.Builder gReturn = com.google.firebase.auth.PhoneAuthOptions.newBuilder(((com.google.firebase.auth.FirebaseAuth) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.f.auth.PhoneAuthOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.f.auth.PhoneAuthOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.PhoneAuthOptions) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.PhoneAuthOptions;
        }
    }
    
    public static final class Builder extends org.xms.g.utils.XObject {
        
        
        
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public Builder(org.xms.f.auth.ExtensionAuth param0) {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                this.setHInstance(null);
            } else {
                this.setGInstance(new com.google.firebase.auth.PhoneAuthOptions.Builder(((com.google.firebase.auth.FirebaseAuth) ((param0) == null ? null : (param0.getGInstance())))));
            }
        }
        
        public final org.xms.f.auth.PhoneAuthOptions.Builder setPhoneNumber(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthOptions.Builder.setPhoneNumber(param0)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).setPhoneNumber(param0)");
                com.google.firebase.auth.PhoneAuthOptions.Builder gReturn = ((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).setPhoneNumber(param0);
                return ((gReturn) == null ? null : (new org.xms.f.auth.PhoneAuthOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.f.auth.PhoneAuthOptions.Builder setMultiFactorHint(org.xms.f.auth.PhoneMultiFactorInfo param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthOptions.Builder.setMultiFactorHint(param0)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).setMultiFactorHint(((com.google.firebase.auth.PhoneMultiFactorInfo) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.firebase.auth.PhoneAuthOptions.Builder gReturn = ((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).setMultiFactorHint(((com.google.firebase.auth.PhoneMultiFactorInfo) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.f.auth.PhoneAuthOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.f.auth.PhoneAuthOptions.Builder setTimeout(java.lang.Long param0, java.util.concurrent.TimeUnit param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthOptions.Builder.setTimeout(param0,param1)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).setTimeout(param0, param1)");
                com.google.firebase.auth.PhoneAuthOptions.Builder gReturn = ((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).setTimeout(param0, param1);
                return ((gReturn) == null ? null : (new org.xms.f.auth.PhoneAuthOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.f.auth.PhoneAuthOptions.Builder setCallbacks(org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthOptions.Builder.setCallbacks(param0)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).setCallbacks(((com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.firebase.auth.PhoneAuthOptions.Builder gReturn = ((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).setCallbacks(((com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.f.auth.PhoneAuthOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.f.auth.PhoneAuthOptions.Builder setActivity(android.app.Activity param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthOptions.Builder.setActivity(param0)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).setActivity(param0)");
                com.google.firebase.auth.PhoneAuthOptions.Builder gReturn = ((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).setActivity(param0);
                return ((gReturn) == null ? null : (new org.xms.f.auth.PhoneAuthOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.f.auth.PhoneAuthOptions.Builder setExecutor(java.util.concurrent.Executor param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthOptions.Builder.setExecutor(param0)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).setExecutor(param0)");
                com.google.firebase.auth.PhoneAuthOptions.Builder gReturn = ((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).setExecutor(param0);
                return ((gReturn) == null ? null : (new org.xms.f.auth.PhoneAuthOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.f.auth.PhoneAuthOptions.Builder setForceResendingToken(org.xms.f.auth.PhoneAuthProvider.ForceResendingToken param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthOptions.Builder.setForceResendingToken(param0)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).setForceResendingToken(((com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.firebase.auth.PhoneAuthOptions.Builder gReturn = ((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).setForceResendingToken(((com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.f.auth.PhoneAuthOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.f.auth.PhoneAuthOptions.Builder setMultiFactorSession(org.xms.f.auth.MultiFactorSession param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthOptions.Builder.setMultiFactorSession(param0)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).setMultiFactorSession(((com.google.firebase.auth.MultiFactorSession) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.firebase.auth.PhoneAuthOptions.Builder gReturn = ((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).setMultiFactorSession(((com.google.firebase.auth.MultiFactorSession) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.f.auth.PhoneAuthOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.f.auth.PhoneAuthOptions.Builder requireSmsValidation(boolean param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthOptions.Builder.requireSmsValidation(param0)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).requireSmsValidation(param0)");
                com.google.firebase.auth.PhoneAuthOptions.Builder gReturn = ((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).requireSmsValidation(param0);
                return ((gReturn) == null ? null : (new org.xms.f.auth.PhoneAuthOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.f.auth.PhoneAuthOptions build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthOptions.Builder.build()");
                return new org.xms.f.auth.PhoneAuthOptions(new org.xms.g.utils.XBox(null, null));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).build()");
                com.google.firebase.auth.PhoneAuthOptions gReturn = ((com.google.firebase.auth.PhoneAuthOptions.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.f.auth.PhoneAuthOptions(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public static org.xms.f.auth.PhoneAuthOptions.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.f.auth.PhoneAuthOptions.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.PhoneAuthOptions.Builder;
            }
        }
    }
}