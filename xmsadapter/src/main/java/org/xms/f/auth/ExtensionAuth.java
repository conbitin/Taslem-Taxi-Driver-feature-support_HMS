package org.xms.f.auth;




public class ExtensionAuth extends org.xms.g.utils.XObject {
    
    private String xLanguageCode;
    public void setXLanguageCode(String code) {
        this.xLanguageCode = code;
    }
    public String getXLanguageCode() {
        return this.xLanguageCode;
    }
    
    public ExtensionAuth(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public void addAuthStateListener(org.xms.f.auth.ExtensionAuth.AuthStateListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).addTokenListener(((param0) == null ? null : (param0.getHInstanceAuthStateListener())))");
            ((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).addTokenListener(((param0) == null ? null : (param0.getHInstanceAuthStateListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).addAuthStateListener(((param0) == null ? null : (param0.getGInstanceAuthStateListener())))");
            ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).addAuthStateListener(((param0) == null ? null : (param0.getGInstanceAuthStateListener())));
        }
    }
    
    public void addIdTokenListener(org.xms.f.auth.ExtensionAuth.IdTokenListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).addTokenListener(((param0) == null ? null : (param0.getHInstanceIdTokenListener())))");
            ((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).addTokenListener(((param0) == null ? null : (param0.getHInstanceIdTokenListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).addIdTokenListener(((param0) == null ? null : (param0.getGInstanceIdTokenListener())))");
            ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).addIdTokenListener(((param0) == null ? null : (param0.getGInstanceIdTokenListener())));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> applyActionCode(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ExtensionAuth.applyActionCode(param0)");
            return new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, new org.xms.f.TaskImpl()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).applyActionCode(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).applyActionCode(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.tasks.Task<org.xms.f.auth.ActionCodeResult> checkActionCode(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ExtensionAuth.checkActionCode(param0)");
            return new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, new org.xms.f.TaskImpl()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).checkActionCode(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).checkActionCode(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> confirmPasswordReset(java.lang.String param0, java.lang.String param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<org.xms.f.auth.AuthResult> createUserWithEmailAndPassword(java.lang.String param0, java.lang.String param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<org.xms.f.auth.SignInMethodQueryResult> fetchSignInMethodsForEmail(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ExtensionAuth.fetchSignInMethodsForEmail(param0)");
            return new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, null));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).fetchSignInMethodsForEmail(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).fetchSignInMethodsForEmail(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.f.ExtensionApp getApp() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ExtensionAuth.getApp");
            return new org.xms.f.ExtensionApp(new org.xms.g.utils.XBox(null, null));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).getApp()");
            com.google.firebase.FirebaseApp gReturn = ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).getApp();
            return ((gReturn) == null ? null : (new org.xms.f.ExtensionApp(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.f.auth.ExtensionUser getCurrentUser() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).getCurrentUser()");
            com.huawei.agconnect.auth.AGConnectUser hReturn = ((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).getCurrentUser();
            return ((hReturn) == null ? null : (new org.xms.f.auth.ExtensionUser.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).getCurrentUser()");
            com.google.firebase.auth.FirebaseUser gReturn = ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).getCurrentUser();
            return ((gReturn) == null ? null : (new org.xms.f.auth.ExtensionUser.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.f.auth.ExtensionAuthSettings getFirebaseAuthSettings() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ExtensionAuth.getFirebaseAuthSettings()");
            return new org.xms.f.auth.ExtensionAuthSettings.XImpl(new org.xms.g.utils.XBox(null, null));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).getFirebaseAuthSettings()");
            com.google.firebase.auth.FirebaseAuthSettings gReturn = ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).getFirebaseAuthSettings();
            return ((gReturn) == null ? null : (new org.xms.f.auth.ExtensionAuthSettings.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.f.auth.ExtensionAuth getInstance() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.AGConnectAuth.getInstance()");
            com.huawei.agconnect.auth.AGConnectAuth hReturn = com.huawei.agconnect.auth.AGConnectAuth.getInstance();
            return ((hReturn) == null ? null : (new org.xms.f.auth.ExtensionAuth(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.FirebaseAuth.getInstance()");
            com.google.firebase.auth.FirebaseAuth gReturn = com.google.firebase.auth.FirebaseAuth.getInstance();
            return ((gReturn) == null ? null : (new org.xms.f.auth.ExtensionAuth(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.f.auth.ExtensionAuth getInstance(org.xms.f.ExtensionApp param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.AGConnectAuth.getInstance()");
            com.huawei.agconnect.auth.AGConnectAuth hReturn = com.huawei.agconnect.auth.AGConnectAuth.getInstance();
            return ((hReturn) == null ? null : (new org.xms.f.auth.ExtensionAuth(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.FirebaseAuth.getInstance(((com.google.firebase.FirebaseApp) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.firebase.auth.FirebaseAuth gReturn = com.google.firebase.auth.FirebaseAuth.getInstance(((com.google.firebase.FirebaseApp) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.f.auth.ExtensionAuth(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public java.lang.String getLanguageCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ExtensionAuth.getLanguageCode");
            return this.getXLanguageCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).getLanguageCode()");
            return ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).getLanguageCode();
        }
    }
    
    public org.xms.g.tasks.Task<org.xms.f.auth.AuthResult> getPendingAuthResult() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public boolean isSignInWithEmailLink(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ExtensionAuth.isSignInWithEmailLink(param0)");
            return false;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).isSignInWithEmailLink(param0)");
            return ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).isSignInWithEmailLink(param0);
        }
    }
    
    public void removeAuthStateListener(org.xms.f.auth.ExtensionAuth.AuthStateListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).removeTokenListener(((param0) == null ? null : (param0.getHInstanceAuthStateListener())))");
            ((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).removeTokenListener(((param0) == null ? null : (param0.getHInstanceAuthStateListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).removeAuthStateListener(((param0) == null ? null : (param0.getGInstanceAuthStateListener())))");
            ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).removeAuthStateListener(((param0) == null ? null : (param0.getGInstanceAuthStateListener())));
        }
    }
    
    public void removeIdTokenListener(org.xms.f.auth.ExtensionAuth.IdTokenListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).removeTokenListener(((param0) == null ? null : (param0.getHInstanceIdTokenListener())))");
            ((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).removeTokenListener(((param0) == null ? null : (param0.getHInstanceIdTokenListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).removeIdTokenListener(((param0) == null ? null : (param0.getGInstanceIdTokenListener())))");
            ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).removeIdTokenListener(((param0) == null ? null : (param0.getGInstanceIdTokenListener())));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> sendPasswordResetEmail(java.lang.String param0, org.xms.f.auth.ActionCodeSettings param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> sendPasswordResetEmail(java.lang.String param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> sendSignInLinkToEmail(java.lang.String param0, org.xms.f.auth.ActionCodeSettings param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> setFirebaseUIVersion(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ExtensionAuth.setFirebaseUIVersion(param0)");
            return new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, new org.xms.f.TaskImpl()));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).setFirebaseUIVersion(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).setFirebaseUIVersion(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public void setLanguageCode(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ExtensionAuth.setLanguageCode");
            this.setXLanguageCode(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).setLanguageCode(param0)");
            ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).setLanguageCode(param0);
        }
    }
    
    public org.xms.g.tasks.Task<org.xms.f.auth.AuthResult> signInAnonymously() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).signInAnonymously()");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).signInAnonymously();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).signInAnonymously()");
            com.google.android.gms.tasks.Task gReturn = ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).signInAnonymously();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.tasks.Task<org.xms.f.auth.AuthResult> signInWithCredential(org.xms.f.auth.AuthCredential param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).signIn(((com.huawei.agconnect.auth.AGConnectAuthCredential) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).signIn(((com.huawei.agconnect.auth.AGConnectAuthCredential) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).signInWithCredential(((com.google.firebase.auth.AuthCredential) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).signInWithCredential(((com.google.firebase.auth.AuthCredential) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.tasks.Task<org.xms.f.auth.AuthResult> signInWithCustomToken(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).signIn(agConnectAuthCredential)");
            com.huawei.agconnect.auth.AGConnectAuthCredential agConnectAuthCredential = com.huawei.agconnect.auth.SelfBuildProvider.credentialWithToken(param0);
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).signIn(agConnectAuthCredential);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).signInWithCustomToken(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).signInWithCustomToken(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public org.xms.g.tasks.Task<org.xms.f.auth.AuthResult> signInWithEmailAndPassword(java.lang.String param0, java.lang.String param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<org.xms.f.auth.AuthResult> signInWithEmailLink(java.lang.String param0, java.lang.String param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public void signOut() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).signOut()");
            ((com.huawei.agconnect.auth.AGConnectAuth) this.getHInstance()).signOut();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).signOut()");
            ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).signOut();
        }
    }
    
    public org.xms.g.tasks.Task<org.xms.f.auth.AuthResult> startActivityForSignInWithProvider(android.app.Activity param0, org.xms.f.auth.FederatedAuthProvider param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> updateCurrentUser(org.xms.f.auth.ExtensionUser param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public void useAppLanguage() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ExtensionAuth.useAppLanguage");
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).useAppLanguage()");
            ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).useAppLanguage();
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.String> verifyPasswordResetCode(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ExtensionAuth.verifyPasswordResetCode(param0)");
            return new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, null));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).verifyPasswordResetCode(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.firebase.auth.FirebaseAuth) this.getGInstance()).verifyPasswordResetCode(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.f.auth.ExtensionAuth dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.ExtensionAuth) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.agconnect.auth.AGConnectAuth;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.FirebaseAuth;
        }
    }
    
    public static interface AuthStateListener extends org.xms.g.utils.XInterface {
        
        public void onAuthStateChanged(org.xms.f.auth.ExtensionAuth param0);
        
        default java.lang.Object getZInstanceAuthStateListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceAuthStateListener();
            } else {
                return getGInstanceAuthStateListener();
            }
        }
        
        default com.google.firebase.auth.FirebaseAuth.AuthStateListener getGInstanceAuthStateListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.firebase.auth.FirebaseAuth.AuthStateListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.firebase.auth.FirebaseAuth.AuthStateListener() {
                
                public void onAuthStateChanged(com.google.firebase.auth.FirebaseAuth param0) {
                    throw new java.lang.RuntimeException("Not Supported");
                }
            };
        }
        
        default com.huawei.agconnect.core.service.auth.OnTokenListener getHInstanceAuthStateListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.agconnect.core.service.auth.OnTokenListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.agconnect.core.service.auth.OnTokenListener() {
                
                public void onChanged(com.huawei.agconnect.core.service.auth.TokenSnapshot param0) {
                    throw new java.lang.RuntimeException("Stub");
                }
            };
        }
        
        public static org.xms.f.auth.ExtensionAuth.AuthStateListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.f.auth.ExtensionAuth.AuthStateListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.agconnect.core.service.auth.OnTokenListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.FirebaseAuth.AuthStateListener;
                }
            }
            return param0 instanceof org.xms.f.auth.ExtensionAuth.AuthStateListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.f.auth.ExtensionAuth.AuthStateListener {
            
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }
            
            public void onAuthStateChanged(org.xms.f.auth.ExtensionAuth param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
        }
    }
    
    public static interface IdTokenListener extends org.xms.g.utils.XInterface {
        
        public void onIdTokenChanged(org.xms.f.auth.ExtensionAuth param0);
        
        default java.lang.Object getZInstanceIdTokenListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceIdTokenListener();
            } else {
                return getGInstanceIdTokenListener();
            }
        }
        
        default com.google.firebase.auth.FirebaseAuth.IdTokenListener getGInstanceIdTokenListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.firebase.auth.FirebaseAuth.IdTokenListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.firebase.auth.FirebaseAuth.IdTokenListener() {
                
                public void onIdTokenChanged(com.google.firebase.auth.FirebaseAuth param0) {
                    throw new java.lang.RuntimeException("Not Supported");
                }
            };
        }
        
        default com.huawei.agconnect.core.service.auth.OnTokenListener getHInstanceIdTokenListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.agconnect.core.service.auth.OnTokenListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.agconnect.core.service.auth.OnTokenListener() {
                
                public void onChanged(com.huawei.agconnect.core.service.auth.TokenSnapshot param0) {
                    throw new java.lang.RuntimeException("Stub");
                }
            };
        }
        
        public static org.xms.f.auth.ExtensionAuth.IdTokenListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.f.auth.ExtensionAuth.IdTokenListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.agconnect.core.service.auth.OnTokenListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.FirebaseAuth.IdTokenListener;
                }
            }
            return param0 instanceof org.xms.f.auth.ExtensionAuth.IdTokenListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.f.auth.ExtensionAuth.IdTokenListener {
            
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }
            
            public void onIdTokenChanged(org.xms.f.auth.ExtensionAuth param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
        }
    }
}