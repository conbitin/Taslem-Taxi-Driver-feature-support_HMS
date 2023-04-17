package org.xms.f.auth;




public class PhoneAuthProvider extends org.xms.g.utils.XObject {
    
    
    
    public PhoneAuthProvider(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static java.lang.String getPHONE_SIGN_IN_METHOD() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.AGConnectAuthCredential.Phone_Provider");
            return String.valueOf(com.huawei.agconnect.auth.AGConnectAuthCredential.Phone_Provider);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.PhoneAuthProvider.PHONE_SIGN_IN_METHOD");
            return com.google.firebase.auth.PhoneAuthProvider.PHONE_SIGN_IN_METHOD;
        }
    }
    
    public java.lang.String getPROVIDER_ID() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.AGConnectAuthCredential.Phone_Provider");
            return String.valueOf(com.huawei.agconnect.auth.AGConnectAuthCredential.Phone_Provider);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.PhoneAuthProvider) this.getGInstance()).PROVIDER_ID");
            return ((com.google.firebase.auth.PhoneAuthProvider) this.getGInstance()).PROVIDER_ID;
        }
    }
    
    public static org.xms.f.auth.PhoneAuthCredential getCredential(java.lang.String param0, java.lang.String param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.f.auth.PhoneAuthProvider getInstance() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthProvider.getInstance()");
            return new org.xms.f.auth.PhoneAuthProvider(new org.xms.g.utils.XBox(null, null));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.PhoneAuthProvider.getInstance()");
            com.google.firebase.auth.PhoneAuthProvider gReturn = com.google.firebase.auth.PhoneAuthProvider.getInstance();
            return ((gReturn) == null ? null : (new org.xms.f.auth.PhoneAuthProvider(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.f.auth.PhoneAuthProvider getInstance(org.xms.f.auth.ExtensionAuth param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthProvider.getInstance(ExtensionAuth)");
            return new org.xms.f.auth.PhoneAuthProvider(new org.xms.g.utils.XBox(null, null));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.PhoneAuthProvider.getInstance(((com.google.firebase.auth.FirebaseAuth) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.firebase.auth.PhoneAuthProvider gReturn = com.google.firebase.auth.PhoneAuthProvider.getInstance(((com.google.firebase.auth.FirebaseAuth) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.f.auth.PhoneAuthProvider(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public void verifyPhoneNumber(java.lang.String param0, long param1, java.util.concurrent.TimeUnit param2, android.app.Activity param3, org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks param4) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public void verifyPhoneNumber(java.lang.String param0, long param1, java.util.concurrent.TimeUnit param2, java.util.concurrent.Executor param3, org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks param4) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public void verifyPhoneNumber(java.lang.String param0, long param1, java.util.concurrent.TimeUnit param2, android.app.Activity param3, org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks param4, org.xms.f.auth.PhoneAuthProvider.ForceResendingToken param5) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public void verifyPhoneNumber(java.lang.String param0, long param1, java.util.concurrent.TimeUnit param2, java.util.concurrent.Executor param3, org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks param4, org.xms.f.auth.PhoneAuthProvider.ForceResendingToken param5) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static void verifyPhoneNumber(org.xms.f.auth.PhoneAuthOptions param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.f.auth.PhoneAuthProvider dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.PhoneAuthProvider) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.PhoneAuthProvider;
        }
    }
    
    public static class ForceResendingToken extends org.xms.g.utils.XObject implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
            
            public org.xms.f.auth.PhoneAuthProvider.ForceResendingToken createFromParcel(android.os.Parcel param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            public org.xms.f.auth.PhoneAuthProvider.ForceResendingToken[] newArray(int param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
        };
        
        public ForceResendingToken(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public int describeContents() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static org.xms.f.auth.PhoneAuthProvider.ForceResendingToken dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
    
    public abstract static class OnVerificationStateChangedCallbacks extends org.xms.g.utils.XObject {
        private boolean wrapper = true;
        
        
        
        public OnVerificationStateChangedCallbacks(org.xms.g.utils.XBox param0) {
            super(param0);
            wrapper = true;
        }
        
        public OnVerificationStateChangedCallbacks() {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                this.setHInstance(null);
            } else {
                this.setGInstance(new GImpl());
            }
            wrapper = false;
        }
        
        public void onCodeAutoRetrievalTimeOut(java.lang.String param0) {
            if (wrapper) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    
                    org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks.onCodeAutoRetrievalTimeOut(param0)");
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks) this.getGInstance()).onCodeAutoRetrievalTimeOut(param0)");
                    ((com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks) this.getGInstance()).onCodeAutoRetrievalTimeOut(param0);
                }
            } else {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    
                    org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks.onCodeAutoRetrievalTimeOut(param0)");
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks) this.getGInstance())).onCodeAutoRetrievalTimeOutCallSuper(param0)");
                    ((GImpl) ((com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks) this.getGInstance())).onCodeAutoRetrievalTimeOutCallSuper(param0);
                }
            }
        }
        
        public void onCodeSent(java.lang.String param0, org.xms.f.auth.PhoneAuthProvider.ForceResendingToken param1) {
            if (wrapper) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    
                    org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks.onCodeSent(param0,param1)");
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks) this.getGInstance()).onCodeSent(param0, ((com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken) ((param1) == null ? null : (param1.getGInstance()))))");
                    ((com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks) this.getGInstance()).onCodeSent(param0, ((com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken) ((param1) == null ? null : (param1.getGInstance()))));
                }
            } else {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    
                    org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks.onCodeSent(param0,param1)");
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks) this.getGInstance())).onCodeSentCallSuper(param0, ((com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken) ((param1) == null ? null : (param1.getGInstance()))))");
                    ((GImpl) ((com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks) this.getGInstance())).onCodeSentCallSuper(param0, ((com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken) ((param1) == null ? null : (param1.getGInstance()))));
                }
            }
        }
        
        public abstract void onVerificationCompleted(org.xms.f.auth.PhoneAuthCredential param0);
        
        public abstract void onVerificationFailed(org.xms.f.ExtensionException param0);
        
        public static org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks dynamicCast(java.lang.Object param0) {
            return ((org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks;
            }
        }
        
        private class GImpl extends com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks {
            
            public void onCodeAutoRetrievalTimeOut(java.lang.String param0) {
                org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks.this.onCodeAutoRetrievalTimeOut(param0);
            }
            
            public void onCodeSent(java.lang.String param0, com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken param1) {
                org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks.this.onCodeSent(param0, ((param1) == null ? null : (new org.xms.f.auth.PhoneAuthProvider.ForceResendingToken(new org.xms.g.utils.XBox(param1, null)))));
            }
            
            public void onCodeAutoRetrievalTimeOutCallSuper(java.lang.String param0) {
                super.onCodeAutoRetrievalTimeOut(param0);
            }
            
            public void onCodeSentCallSuper(java.lang.String param0, com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken param1) {
                super.onCodeSent(param0, param1);
            }
            
            public void onVerificationCompleted(com.google.firebase.auth.PhoneAuthCredential param0) {
                org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks.this.onVerificationCompleted(((param0) == null ? null : (new org.xms.f.auth.PhoneAuthCredential(new org.xms.g.utils.XBox(param0, null)))));
            }
            
            public void onVerificationFailed(com.google.firebase.FirebaseException param0) {
                org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks.this.onVerificationFailed(((param0) == null ? null : (new org.xms.f.ExtensionException(new org.xms.g.utils.XBox(param0, null)))));
            }
            
            public GImpl() {
                super();
            }
        }
        
        public static class XImpl extends org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks {
            
            
            
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }
            
            public void onVerificationCompleted(org.xms.f.auth.PhoneAuthCredential param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    
                    org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks.XImpl.onVerificationCompleted(param0)");
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks) this.getGInstance()).onVerificationCompleted(((com.google.firebase.auth.PhoneAuthCredential) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks) this.getGInstance()).onVerificationCompleted(((com.google.firebase.auth.PhoneAuthCredential) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
            
            public void onVerificationFailed(org.xms.f.ExtensionException param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    
                    org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks.XImpl.onVerificationFailed(param0)");
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks) this.getGInstance()).onVerificationFailed(((com.google.firebase.FirebaseException) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks) this.getGInstance()).onVerificationFailed(((com.google.firebase.FirebaseException) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
}