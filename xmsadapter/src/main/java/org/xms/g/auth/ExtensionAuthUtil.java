package org.xms.g.auth;




public final class ExtensionAuthUtil extends org.xms.g.utils.XObject {
    
    
    
    public ExtensionAuthUtil(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static int getCHANGE_TYPE_ACCOUNT_ADDED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.ExtensionAuthUtil.getCHANGE_TYPE_ACCOUNT_ADDED()");
            return 0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.CHANGE_TYPE_ACCOUNT_ADDED");
            return com.google.android.gms.auth.GoogleAuthUtil.CHANGE_TYPE_ACCOUNT_ADDED;
        }
    }
    
    public static int getCHANGE_TYPE_ACCOUNT_REMOVED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.ExtensionAuthUtil.getCHANGE_TYPE_ACCOUNT_REMOVED()");
            return 0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.CHANGE_TYPE_ACCOUNT_REMOVED");
            return com.google.android.gms.auth.GoogleAuthUtil.CHANGE_TYPE_ACCOUNT_REMOVED;
        }
    }
    
    public static int getCHANGE_TYPE_ACCOUNT_RENAMED_FROM() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.ExtensionAuthUtil.getCHANGE_TYPE_ACCOUNT_RENAMED_FROM()");
            return 0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.CHANGE_TYPE_ACCOUNT_RENAMED_FROM");
            return com.google.android.gms.auth.GoogleAuthUtil.CHANGE_TYPE_ACCOUNT_RENAMED_FROM;
        }
    }
    
    public static int getCHANGE_TYPE_ACCOUNT_RENAMED_TO() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.ExtensionAuthUtil.getCHANGE_TYPE_ACCOUNT_RENAMED_TO()");
            return 0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.CHANGE_TYPE_ACCOUNT_RENAMED_TO");
            return com.google.android.gms.auth.GoogleAuthUtil.CHANGE_TYPE_ACCOUNT_RENAMED_TO;
        }
    }
    
    public static java.lang.String getGOOGLE_ACCOUNT_TYPE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.ExtensionAuthUtil.getGOOGLE_ACCOUNT_TYPE()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.GOOGLE_ACCOUNT_TYPE");
            return com.google.android.gms.auth.GoogleAuthUtil.GOOGLE_ACCOUNT_TYPE;
        }
    }
    
    public static java.lang.String getKEY_SUPPRESS_PROGRESS_SCREEN() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static java.lang.String getWORK_ACCOUNT_TYPE() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static void clearToken(android.content.Context param0, java.lang.String param1) throws org.xms.g.auth.ExtensionPlayServicesAvailabilityException, org.xms.g.auth.ExtensionAuthException, java.io.IOException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.deleteAuthInfo(param0, param1)");
                com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.deleteAuthInfo(param0, param1);
            }
            catch (com.huawei.hms.support.hwid.common.HuaweiIdAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(null, e));
            }
        } else {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.clearToken(param0, param1)");
                com.google.android.gms.auth.GoogleAuthUtil.clearToken(param0, param1);
            }
            catch (com.google.android.gms.auth.GooglePlayServicesAvailabilityException e) {
                throw new org.xms.g.auth.ExtensionPlayServicesAvailabilityException(new org.xms.g.utils.XBox(e, null));
            }
            catch (com.google.android.gms.auth.GoogleAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(e, null));
            }
        }
    }
    
    public static java.util.List<org.xms.g.auth.AccountChangeEvent> getAccountChangeEvents(android.content.Context param0, int param1, java.lang.String param2) throws org.xms.g.auth.ExtensionAuthException, java.io.IOException {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static java.lang.String getAccountId(android.content.Context param0, java.lang.String param1) throws org.xms.g.auth.ExtensionPlayServicesAvailabilityException, org.xms.g.auth.UserRecoverableAuthException, org.xms.g.auth.ExtensionAuthException, java.io.IOException, java.lang.IllegalStateException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.requestUnionId(param0, param1)");
                return com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.requestUnionId(param0, param1);
            }
            catch (com.huawei.hms.support.hwid.common.HuaweiIdAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(null, e));
            }
        } else {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.getAccountId(param0, param1)");
                return com.google.android.gms.auth.GoogleAuthUtil.getAccountId(param0, param1);
            }
            catch (com.google.android.gms.auth.GooglePlayServicesAvailabilityException e) {
                throw new org.xms.g.auth.ExtensionPlayServicesAvailabilityException(new org.xms.g.utils.XBox(e, null));
            }
            catch (com.google.android.gms.auth.UserRecoverableAuthException e) {
                throw new org.xms.g.auth.UserRecoverableAuthException(new org.xms.g.utils.XBox(e, null));
            }
            catch (com.google.android.gms.auth.GoogleAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(e, null));
            }
        }
    }
    
    public static java.lang.String getToken(android.content.Context param0, android.accounts.Account param1, java.lang.String param2, android.os.Bundle param3) throws org.xms.g.auth.ExtensionPlayServicesAvailabilityException, org.xms.g.auth.UserRecoverableAuthException, org.xms.g.auth.ExtensionAuthException, java.io.IOException, java.lang.IllegalStateException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter",
                    "com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.requestAccessToken(param0, param1, scopeList, param3)");
                java.util.List<com.huawei.hms.support.api.entity.auth.Scope> scopeList = null;
                if (param2 != null) {
                    scopeList = new java.util.ArrayList<>();
                    String prefix = "oauth2:";
                    if (param2.startsWith(prefix)) {
                        String scopes = param2.split(prefix)[1];
                        for (String scope : scopes.split(" ")) {
                            scopeList.add(new com.huawei.hms.support.api.entity.auth.Scope(scope));
                        }
                    }
                }
                return com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.requestAccessToken(param0, param1, scopeList,
                    param3);
            } catch (com.huawei.hms.support.hwid.common.HuaweiIdAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(null, e));
            }
        } else {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.getToken(param0, param1, param2, param3)");
                return com.google.android.gms.auth.GoogleAuthUtil.getToken(param0, param1, param2, param3);
            }
            catch (com.google.android.gms.auth.GooglePlayServicesAvailabilityException e) {
                throw new org.xms.g.auth.ExtensionPlayServicesAvailabilityException(new org.xms.g.utils.XBox(e, null));
            }
            catch (com.google.android.gms.auth.UserRecoverableAuthException e) {
                throw new org.xms.g.auth.UserRecoverableAuthException(new org.xms.g.utils.XBox(e, null));
            }
            catch (com.google.android.gms.auth.GoogleAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(e, null));
            }
        }
    }
    
    public static java.lang.String getToken(android.content.Context param0, android.accounts.Account param1, java.lang.String param2) throws org.xms.g.auth.UserRecoverableAuthException, java.io.IOException, org.xms.g.auth.ExtensionAuthException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter",
                    "com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.requestAccessToken(param0, param1, scopeList)");
                java.util.List<com.huawei.hms.support.api.entity.auth.Scope> scopeList = null;
                if (param2 != null) {
                    scopeList = new java.util.ArrayList<>();
                    String prefix = "oauth2:";
                    if (param2.startsWith(prefix)) {
                        String scopes = param2.split(prefix)[1];
                        for (String scope : scopes.split(" ")) {
                            scopeList.add(new com.huawei.hms.support.api.entity.auth.Scope(scope));
                        }
                    }
                }
                return com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.requestAccessToken(param0, param1, scopeList);
            } catch (com.huawei.hms.support.hwid.common.HuaweiIdAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(null, e));
            }
        } else {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.getToken(param0, param1, param2)");
                return com.google.android.gms.auth.GoogleAuthUtil.getToken(param0, param1, param2);
            }
            catch (com.google.android.gms.auth.UserRecoverableAuthException e) {
                throw new org.xms.g.auth.UserRecoverableAuthException(new org.xms.g.utils.XBox(e, null));
            }
            catch (com.google.android.gms.auth.GoogleAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(e, null));
            }
        }
    }
    
    public static java.lang.String getToken(android.content.Context param0, java.lang.String param1, java.lang.String param2, android.os.Bundle param3) throws org.xms.g.auth.UserRecoverableAuthException, java.io.IOException, org.xms.g.auth.ExtensionAuthException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter",
                    "com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.requestAccessToken(param0, param1, scopeList, param3)");
                java.util.List<com.huawei.hms.support.api.entity.auth.Scope> scopeList = null;
                if (param2 != null) {
                    scopeList = new java.util.ArrayList<>();
                    String prefix = "oauth2:";
                    if (param2.startsWith(prefix)) {
                        String scopes = param2.split(prefix)[1];
                        for (String scope : scopes.split(" ")) {
                            scopeList.add(new com.huawei.hms.support.api.entity.auth.Scope(scope));
                        }
                    }
                }
                return com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.requestAccessToken(param0, param1, scopeList,
                    param3);
            } catch (com.huawei.hms.support.hwid.common.HuaweiIdAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(null, e));
            }
        } else {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.getToken(param0, param1, param2, param3)");
                return com.google.android.gms.auth.GoogleAuthUtil.getToken(param0, param1, param2, param3);
            }
            catch (com.google.android.gms.auth.UserRecoverableAuthException e) {
                throw new org.xms.g.auth.UserRecoverableAuthException(new org.xms.g.utils.XBox(e, null));
            }
            catch (com.google.android.gms.auth.GoogleAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(e, null));
            }
        }
    }
    
    public static java.lang.String getToken(android.content.Context param0, java.lang.String param1, java.lang.String param2) throws org.xms.g.auth.UserRecoverableAuthException, java.io.IOException, org.xms.g.auth.ExtensionAuthException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter",
                        "com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.requestAccessToken(param0, param1, scopeList)");
                java.util.List<com.huawei.hms.support.api.entity.auth.Scope> scopeList = null;
                if (param2 != null) {
                    scopeList = new java.util.ArrayList<>();
                    String prefix = "oauth2:";
                    if (param2.startsWith(prefix)) {
                        String scopes = param2.split(prefix)[1];
                        for (String scope : scopes.split(" ")) {
                            scopeList.add(new com.huawei.hms.support.api.entity.auth.Scope(scope));
                        }
                    }
                }
                return com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.requestAccessToken(param0, param1, scopeList);
            } catch (com.huawei.hms.support.hwid.common.HuaweiIdAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(null, e));
            }
        } else {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.getToken(param0, param1, param2)");
                return com.google.android.gms.auth.GoogleAuthUtil.getToken(param0, param1, param2);
            }
            catch (com.google.android.gms.auth.UserRecoverableAuthException e) {
                throw new org.xms.g.auth.UserRecoverableAuthException(new org.xms.g.utils.XBox(e, null));
            }
            catch (com.google.android.gms.auth.GoogleAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(e, null));
            }
        }
    }
    
    public static java.lang.String getTokenWithNotification(android.content.Context param0, java.lang.String param1, java.lang.String param2, android.os.Bundle param3, java.lang.String param4, android.os.Bundle param5) throws org.xms.g.auth.UserRecoverableNotifiedException, java.io.IOException, org.xms.g.auth.ExtensionAuthException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.ExtensionAuthUtil.getTokenWithNotification(android.content.Contextjava.lang.Stringjava.lang.Stringandroid.os.Bundlejava.lang.Stringandroid.os.Bundle)");
            return "";
        } else {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.getTokenWithNotification(param0, param1, param2, param3, param4, param5)");
                return com.google.android.gms.auth.GoogleAuthUtil.getTokenWithNotification(param0, param1, param2, param3, param4, param5);
            }
            catch (com.google.android.gms.auth.UserRecoverableNotifiedException e) {
                throw new org.xms.g.auth.UserRecoverableNotifiedException(new org.xms.g.utils.XBox(e, null));
            }
            catch (com.google.android.gms.auth.GoogleAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(e, null));
            }
        }
    }
    
    public static java.lang.String getTokenWithNotification(android.content.Context param0, android.accounts.Account param1, java.lang.String param2, android.os.Bundle param3) throws org.xms.g.auth.UserRecoverableNotifiedException, java.io.IOException, org.xms.g.auth.ExtensionAuthException, java.lang.IllegalStateException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.ExtensionAuthUtil.getTokenWithNotification(android.content.Contextandroid.accounts.Accountjava.lang.Stringandroid.os.Bundle)");
            return "";
        } else {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.getTokenWithNotification(param0, param1, param2, param3)");
                return com.google.android.gms.auth.GoogleAuthUtil.getTokenWithNotification(param0, param1, param2, param3);
            }
            catch (com.google.android.gms.auth.UserRecoverableNotifiedException e) {
                throw new org.xms.g.auth.UserRecoverableNotifiedException(new org.xms.g.utils.XBox(e, null));
            }
            catch (com.google.android.gms.auth.GoogleAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(e, null));
            }
        }
    }
    
    public static java.lang.String getTokenWithNotification(android.content.Context param0, java.lang.String param1, java.lang.String param2, android.os.Bundle param3, android.content.Intent param4) throws org.xms.g.auth.UserRecoverableNotifiedException, java.io.IOException, org.xms.g.auth.ExtensionAuthException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.ExtensionAuthUtil.getTokenWithNotification(android.content.Contextjava.lang.Stringjava.lang.Stringandroid.os.Bundleandroid.content.Intent)");
            return "";
        } else {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.getTokenWithNotification(param0, param1, param2, param3, param4)");
                return com.google.android.gms.auth.GoogleAuthUtil.getTokenWithNotification(param0, param1, param2, param3, param4);
            }
            catch (com.google.android.gms.auth.UserRecoverableNotifiedException e) {
                throw new org.xms.g.auth.UserRecoverableNotifiedException(new org.xms.g.utils.XBox(e, null));
            }
            catch (com.google.android.gms.auth.GoogleAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(e, null));
            }
        }
    }
    
    public static java.lang.String getTokenWithNotification(android.content.Context param0, android.accounts.Account param1, java.lang.String param2, android.os.Bundle param3, java.lang.String param4, android.os.Bundle param5) throws org.xms.g.auth.UserRecoverableNotifiedException, java.io.IOException, org.xms.g.auth.ExtensionAuthException, java.lang.IllegalStateException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.ExtensionAuthUtil.getTokenWithNotification(android.content.Contextandroid.accounts.Accountjava.lang.Stringandroid.os.Bundlejava.lang.Stringandroid.os.Bundle)");
            return "";
        } else {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.getTokenWithNotification(param0, param1, param2, param3, param4, param5)");
                return com.google.android.gms.auth.GoogleAuthUtil.getTokenWithNotification(param0, param1, param2, param3, param4, param5);
            }
            catch (com.google.android.gms.auth.UserRecoverableNotifiedException e) {
                throw new org.xms.g.auth.UserRecoverableNotifiedException(new org.xms.g.utils.XBox(e, null));
            }
            catch (com.google.android.gms.auth.GoogleAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(e, null));
            }
        }
    }
    
    public static java.lang.String getTokenWithNotification(android.content.Context param0, java.lang.String param1, java.lang.String param2, android.os.Bundle param3) throws org.xms.g.auth.UserRecoverableNotifiedException, java.io.IOException, org.xms.g.auth.ExtensionAuthException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.ExtensionAuthUtil.getTokenWithNotification(android.content.Contextjava.lang.Stringjava.lang.Stringandroid.os.Bundle)");
            return "";
        } else {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.getTokenWithNotification(param0, param1, param2, param3)");
                return com.google.android.gms.auth.GoogleAuthUtil.getTokenWithNotification(param0, param1, param2, param3);
            }
            catch (com.google.android.gms.auth.UserRecoverableNotifiedException e) {
                throw new org.xms.g.auth.UserRecoverableNotifiedException(new org.xms.g.utils.XBox(e, null));
            }
            catch (com.google.android.gms.auth.GoogleAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(e, null));
            }
        }
    }
    
    public static java.lang.String getTokenWithNotification(android.content.Context param0, android.accounts.Account param1, java.lang.String param2, android.os.Bundle param3, android.content.Intent param4) throws org.xms.g.auth.UserRecoverableNotifiedException, java.io.IOException, org.xms.g.auth.ExtensionAuthException, java.lang.IllegalStateException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.ExtensionAuthUtil.getTokenWithNotification(android.content.Contextandroid.accounts.Accountjava.lang.Stringandroid.os.Bundleandroid.content.Intent)");
            return "";
        } else {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.getTokenWithNotification(param0, param1, param2, param3, param4)");
                return com.google.android.gms.auth.GoogleAuthUtil.getTokenWithNotification(param0, param1, param2, param3, param4);
            }
            catch (com.google.android.gms.auth.UserRecoverableNotifiedException e) {
                throw new org.xms.g.auth.UserRecoverableNotifiedException(new org.xms.g.utils.XBox(e, null));
            }
            catch (com.google.android.gms.auth.GoogleAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(e, null));
            }
        }
    }
    
    public static void invalidateToken(android.content.Context param0, java.lang.String param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.ExtensionAuthUtil.invalidateToken(android.content.Contextjava.lang.String)");
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.invalidateToken(param0, param1)");
            com.google.android.gms.auth.GoogleAuthUtil.invalidateToken(param0, param1);
        }
    }
    
    public static android.os.Bundle removeAccount(android.content.Context param0, android.accounts.Account param1) throws org.xms.g.auth.ExtensionAuthException, java.io.IOException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.ExtensionAuthUtil.removeAccount(android.content.Contextandroid.accounts.Account)");
            return new android.os.Bundle();
        } else {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.removeAccount(param0, param1)");
                return com.google.android.gms.auth.GoogleAuthUtil.removeAccount(param0, param1);
            }
            catch (com.google.android.gms.auth.GoogleAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(e, null));
            }
        }
    }
    
    public static java.lang.Boolean requestGoogleAccountsAccess(android.content.Context param0) throws org.xms.g.auth.UserRecoverableNotifiedException, org.xms.g.auth.ExtensionAuthException, java.io.IOException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.auth.ExtensionAuthUtil.requestGoogleAccountsAccess(android.content.Context)");
            return false;
        } else {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.GoogleAuthUtil.requestGoogleAccountsAccess(param0)");
                return com.google.android.gms.auth.GoogleAuthUtil.requestGoogleAccountsAccess(param0);
            }
            catch (com.google.android.gms.auth.UserRecoverableNotifiedException e) {
                throw new org.xms.g.auth.UserRecoverableNotifiedException(new org.xms.g.utils.XBox(e, null));
            }
            catch (com.google.android.gms.auth.GoogleAuthException e) {
                throw new org.xms.g.auth.ExtensionAuthException(new org.xms.g.utils.XBox(e, null));
            }
        }
    }
    
    public static org.xms.g.auth.ExtensionAuthUtil dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.ExtensionAuthUtil) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.GoogleAuthUtil;
        }
    }
}