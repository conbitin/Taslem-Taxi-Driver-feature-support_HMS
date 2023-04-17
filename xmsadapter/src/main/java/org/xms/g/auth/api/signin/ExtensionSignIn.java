package org.xms.g.auth.api.signin;




public final class ExtensionSignIn extends org.xms.g.utils.XObject {
    
    
    
    public ExtensionSignIn(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static org.xms.g.auth.api.signin.ExtensionSignInAccount getAccountForExtension(android.content.Context param0, org.xms.g.auth.api.signin.ExtensionSignInOptionsExtension param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter",
                "com.huawei.hms.support.hwid.HuaweiIdAuthManager.getExtendedAuthResult(param1 == null ? null : param1.getHInstanceExtensionSignInOptionsExtension())");
            com.huawei.hms.support.hwid.result.AuthHuaweiId hReturn = com.huawei.hms.support.hwid.HuaweiIdAuthManager
                .getExtendedAuthResult(param1 == null ? null : param1.getHInstanceExtensionSignInOptionsExtension());
            if (hReturn == null) {
                return null;
            }
            return new org.xms.g.auth.api.signin.ExtensionSignInAccount(new org.xms.g.utils.XBox(null, hReturn));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignIn.getAccountForExtension(param0, ((param1) == null ? null : (param1.getGInstanceExtensionSignInOptionsExtension())))");
            com.google.android.gms.auth.api.signin.GoogleSignInAccount gReturn = com.google.android.gms.auth.api.signin.GoogleSignIn.getAccountForExtension(param0, ((param1) == null ? null : (param1.getGInstanceExtensionSignInOptionsExtension())));
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInAccount(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.api.signin.ExtensionSignInAccount getAccountForScopes(android.content.Context param0, org.xms.g.common.api.Scope param1, org.xms.g.common.api.Scope... param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.api.signin.ExtensionSignIn.getAccountForScopes(android.content.Contextorg.xms.g.common.api.Scopeorg.xms.g.common.api.Scope...)");
            java.util.List<com.huawei.hms.support.api.entity.auth.Scope> list = new java.util.ArrayList<>();
            if (param1 != null) {
                list.add((com.huawei.hms.support.api.entity.auth.Scope) param1.getHInstance());
            }
            if (param2 != null) {
                for (org.xms.g.common.api.Scope scope : param2) {
                    list.add((com.huawei.hms.support.api.entity.auth.Scope) scope.getHInstance());
                }
            }
            try {
                com.huawei.hms.support.hwid.result.AuthHuaweiId hReturn =
                    com.huawei.hms.support.hwid.HuaweiIdAuthManager.getAuthResultWithScopes(list);
                return ((hReturn) == null ? null
                    : (new org.xms.g.auth.api.signin.ExtensionSignInAccount(new org.xms.g.utils.XBox(null, hReturn))));
            } catch (com.huawei.hms.support.hwid.common.HuaweiIdAuthException e) {
                throw new NullPointerException("getAccountForScopes empty scope");
            }
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignIn.getAccountForScopes(param0, ((com.google.android.gms.common.api.Scope) ((param1) == null ? null : (param1.getGInstance()))), ((com.google.android.gms.common.api.Scope[]) org.xms.g.utils.Utils.genericArrayCopy(param2, com.google.android.gms.common.api.Scope.class, x -> (com.google.android.gms.common.api.Scope)x.getGInstance())))");
            com.google.android.gms.auth.api.signin.GoogleSignInAccount gReturn = com.google.android.gms.auth.api.signin.GoogleSignIn.getAccountForScopes(param0, ((com.google.android.gms.common.api.Scope) ((param1) == null ? null : (param1.getGInstance()))), ((com.google.android.gms.common.api.Scope[]) org.xms.g.utils.Utils.genericArrayCopy(param2, com.google.android.gms.common.api.Scope.class, x -> (com.google.android.gms.common.api.Scope)x.getGInstance())));
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInAccount(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.api.signin.ExtensionSignInClient getClient(android.content.Context param0, org.xms.g.auth.api.signin.ExtensionSignInOptions param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.HuaweiIdAuthManager.getService(param0, ((com.huawei.hms.support.hwid.request.HuaweiIdAuthParams) ((param1) == null ? null : (param1.getHInstance()))))");
            com.huawei.hms.support.hwid.service.HuaweiIdAuthService hReturn = com.huawei.hms.support.hwid.HuaweiIdAuthManager.getService(param0, ((com.huawei.hms.support.hwid.request.HuaweiIdAuthParams) ((param1) == null ? null : (param1.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInClient(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignIn.getClient(param0, ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) ((param1) == null ? null : (param1.getGInstance()))))");
            com.google.android.gms.auth.api.signin.GoogleSignInClient gReturn = com.google.android.gms.auth.api.signin.GoogleSignIn.getClient(param0, ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) ((param1) == null ? null : (param1.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInClient(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.api.signin.ExtensionSignInClient getClient(android.app.Activity param0, org.xms.g.auth.api.signin.ExtensionSignInOptions param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.HuaweiIdAuthManager.getService(param0, ((com.huawei.hms.support.hwid.request.HuaweiIdAuthParams) ((param1) == null ? null : (param1.getHInstance()))))");
            com.huawei.hms.support.hwid.service.HuaweiIdAuthService hReturn = com.huawei.hms.support.hwid.HuaweiIdAuthManager.getService(param0, ((com.huawei.hms.support.hwid.request.HuaweiIdAuthParams) ((param1) == null ? null : (param1.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInClient(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignIn.getClient(param0, ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) ((param1) == null ? null : (param1.getGInstance()))))");
            com.google.android.gms.auth.api.signin.GoogleSignInClient gReturn = com.google.android.gms.auth.api.signin.GoogleSignIn.getClient(param0, ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) ((param1) == null ? null : (param1.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInClient(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.api.signin.ExtensionSignInAccount getLastSignedInAccount(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.HuaweiIdAuthManager.getAuthResult()");
            com.huawei.hms.support.hwid.result.AuthHuaweiId hReturn =
                com.huawei.hms.support.hwid.HuaweiIdAuthManager.getAuthResult();
            if (hReturn == null) {
                return null;
            }
            return new org.xms.g.auth.api.signin.ExtensionSignInAccount(new org.xms.g.utils.XBox(null, hReturn));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(param0)");
            com.google.android.gms.auth.api.signin.GoogleSignInAccount gReturn = com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(param0);
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInAccount(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.tasks.Task<org.xms.g.auth.api.signin.ExtensionSignInAccount> getSignedInAccountFromIntent(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.HuaweiIdAuthManager.parseAuthResultFromIntent(param0)");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hms.support.hwid.HuaweiIdAuthManager.parseAuthResultFromIntent(param0);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignIn.getSignedInAccountFromIntent(param0)");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.auth.api.signin.GoogleSignIn.getSignedInAccountFromIntent(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static boolean hasPermissions(org.xms.g.auth.api.signin.ExtensionSignInAccount param0, org.xms.g.auth.api.signin.ExtensionSignInOptionsExtension param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.HuaweiIdAuthManager.containScopes(((com.huawei.hms.support.hwid.result.AuthHuaweiId) ((param0) == null ? null : (param0.getHInstance()))), ((param1) == null ? null : (param1.getHInstanceExtensionSignInOptionsExtension())))");
            return com.huawei.hms.support.hwid.HuaweiIdAuthManager.containScopes(((com.huawei.hms.support.hwid.result.AuthHuaweiId) ((param0) == null ? null : (param0.getHInstance()))), ((param1) == null ? null : (param1.getHInstanceExtensionSignInOptionsExtension())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignIn.hasPermissions(((com.google.android.gms.auth.api.signin.GoogleSignInAccount) ((param0) == null ? null : (param0.getGInstance()))), ((param1) == null ? null : (param1.getGInstanceExtensionSignInOptionsExtension())))");
            return com.google.android.gms.auth.api.signin.GoogleSignIn.hasPermissions(((com.google.android.gms.auth.api.signin.GoogleSignInAccount) ((param0) == null ? null : (param0.getGInstance()))), ((param1) == null ? null : (param1.getGInstanceExtensionSignInOptionsExtension())));
        }
    }
    
    public static boolean hasPermissions(org.xms.g.auth.api.signin.ExtensionSignInAccount param0, org.xms.g.common.api.Scope... param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter",
                "com.huawei.hms.support.hwid.HuaweiIdAuthManager.containScopes(((com.huawei.hms.support.hwid.result.AuthHuaweiId) (param0 == null ? null : param0.getHInstance())),scopeList)");
            java.util.List<com.huawei.hms.support.api.entity.auth.Scope> scopeList = null;
            if (param1 != null) {
                scopeList = new java.util.ArrayList<>();
                for (org.xms.g.common.api.Scope scope : param1) {
                    scopeList.add((com.huawei.hms.support.api.entity.auth.Scope) scope.getHInstance());
                }
            }
            return com.huawei.hms.support.hwid.HuaweiIdAuthManager.containScopes(
                ((com.huawei.hms.support.hwid.result.AuthHuaweiId) (param0 == null ? null : param0.getHInstance())),
                scopeList);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignIn.hasPermissions(((com.google.android.gms.auth.api.signin.GoogleSignInAccount) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.common.api.Scope[]) org.xms.g.utils.Utils.genericArrayCopy(param1, com.google.android.gms.common.api.Scope.class, x -> (com.google.android.gms.common.api.Scope)x.getGInstance())))");
            return com.google.android.gms.auth.api.signin.GoogleSignIn.hasPermissions(((com.google.android.gms.auth.api.signin.GoogleSignInAccount) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.common.api.Scope[]) org.xms.g.utils.Utils.genericArrayCopy(param1, com.google.android.gms.common.api.Scope.class, x -> (com.google.android.gms.common.api.Scope)x.getGInstance())));
        }
    }
    
    public static void requestPermissions(android.app.Activity param0, int param1, org.xms.g.auth.api.signin.ExtensionSignInAccount param2, org.xms.g.common.api.Scope... param3) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter",
                "com.huawei.hms.support.hwid.HuaweiIdAuthManager.addAuthScopes(param0, param1, scopeList)");
            java.util.List<com.huawei.hms.support.api.entity.auth.Scope> scopeList = null;
            if (param3 != null) {
                scopeList = new java.util.ArrayList<>();
                for (org.xms.g.common.api.Scope scope : param3) {
                    scopeList.add((com.huawei.hms.support.api.entity.auth.Scope) scope.getHInstance());
                }
            }
            com.huawei.hms.support.hwid.HuaweiIdAuthManager.addAuthScopes(param0, param1, scopeList);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignIn.requestPermissions(param0, param1, ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) ((param2) == null ? null : (param2.getGInstance()))), ((com.google.android.gms.common.api.Scope[]) org.xms.g.utils.Utils.genericArrayCopy(param3, com.google.android.gms.common.api.Scope.class, x -> (com.google.android.gms.common.api.Scope)x.getGInstance())))");
            com.google.android.gms.auth.api.signin.GoogleSignIn.requestPermissions(param0, param1, ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) ((param2) == null ? null : (param2.getGInstance()))), ((com.google.android.gms.common.api.Scope[]) org.xms.g.utils.Utils.genericArrayCopy(param3, com.google.android.gms.common.api.Scope.class, x -> (com.google.android.gms.common.api.Scope)x.getGInstance())));
        }
    }
    
    public static void requestPermissions(android.app.Activity param0, int param1, org.xms.g.auth.api.signin.ExtensionSignInAccount param2, org.xms.g.auth.api.signin.ExtensionSignInOptionsExtension param3) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter",
                "com.huawei.hms.support.hwid.HuaweiIdAuthManager.addAuthScopes(param0, param1, param3 == null ? null : param3.getHInstanceExtensionSignInOptionsExtension())");
            com.huawei.hms.support.hwid.HuaweiIdAuthManager.addAuthScopes(param0, param1,
                param3 == null ? null : param3.getHInstanceExtensionSignInOptionsExtension());
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignIn.requestPermissions(param0, param1, ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) ((param2) == null ? null : (param2.getGInstance()))), ((param3) == null ? null : (param3.getGInstanceExtensionSignInOptionsExtension())))");
            com.google.android.gms.auth.api.signin.GoogleSignIn.requestPermissions(param0, param1, ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) ((param2) == null ? null : (param2.getGInstance()))), ((param3) == null ? null : (param3.getGInstanceExtensionSignInOptionsExtension())));
        }
    }
    
    public static org.xms.g.auth.api.signin.ExtensionSignIn dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.signin.ExtensionSignIn) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.hwid.HuaweiIdAuthManager;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.signin.GoogleSignIn;
        }
    }
}