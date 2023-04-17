package org.xms.g.auth.api.signin;




public class ExtensionSignInOptions extends org.xms.g.utils.XObject implements org.xms.g.common.api.Api.ApiOptions.Optional, android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.auth.api.signin.ExtensionSignInOptions createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.support.hwid.request.HuaweiIdAuthParams hReturn = com.huawei.hms.support.hwid.request.HuaweiIdAuthParams.CREATOR.createFromParcel(param0);
                return new org.xms.g.auth.api.signin.ExtensionSignInOptions(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.auth.api.signin.GoogleSignInOptions gReturn = com.google.android.gms.auth.api.signin.GoogleSignInOptions.CREATOR.createFromParcel(param0);
                return new org.xms.g.auth.api.signin.ExtensionSignInOptions(new org.xms.g.utils.XBox(gReturn, null));
            }
        }
        
        public org.xms.g.auth.api.signin.ExtensionSignInOptions[] newArray(int param0) {
            return new org.xms.g.auth.api.signin.ExtensionSignInOptions[param0];
        }
    };
    
    
    
    public ExtensionSignInOptions(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static org.xms.g.auth.api.signin.ExtensionSignInOptions getDEFAULT_GAMES_SIGN_IN() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.request.HuaweiIdAuthParams.DEFAULT_AUTH_REQUEST_PARAM_GAME");
            com.huawei.hms.support.hwid.request.HuaweiIdAuthParams hReturn = null;
            hReturn = com.huawei.hms.support.hwid.request.HuaweiIdAuthParams.DEFAULT_AUTH_REQUEST_PARAM_GAME;
            return ((hReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN");
            com.google.android.gms.auth.api.signin.GoogleSignInOptions gReturn = null;
            gReturn = com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN;
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.g.auth.api.signin.ExtensionSignInOptions getDEFAULT_SIGN_IN() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.request.HuaweiIdAuthParams.DEFAULT_AUTH_REQUEST_PARAM");
            com.huawei.hms.support.hwid.request.HuaweiIdAuthParams hReturn = null;
            hReturn = com.huawei.hms.support.hwid.request.HuaweiIdAuthParams.DEFAULT_AUTH_REQUEST_PARAM;
            return ((hReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN");
            com.google.android.gms.auth.api.signin.GoogleSignInOptions gReturn = null;
            gReturn = com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN;
            return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.request.HuaweiIdAuthParams) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.support.hwid.request.HuaweiIdAuthParams) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInOptions) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) this.getGInstance()).equals(param0);
        }
    }
    
    public org.xms.g.common.api.Scope[] getScopeArray() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            java.util.List<com.huawei.hms.support.api.entity.auth.Scope> hReturn = null;
            org.xms.g.utils.XmsLog.d("XMSRouter",
                "((com.huawei.hms.support.hwid.request.HuaweiIdAuthParams) getHInstance()).getRequestScopeList()");
            hReturn = ((com.huawei.hms.support.hwid.request.HuaweiIdAuthParams) getHInstance()).getRequestScopeList();
            if (hReturn == null) {
                return null;
            }
            com.huawei.hms.support.api.entity.auth.Scope[] hArray =
                hReturn.toArray(new com.huawei.hms.support.api.entity.auth.Scope[hReturn.size()]);
            return org.xms.g.utils.Utils.genericArrayCopy(hArray, org.xms.g.common.api.Scope.class,
                new org.xms.g.utils.Function<com.huawei.hms.support.api.entity.auth.Scope,
                    org.xms.g.common.api.Scope>() {
                    @Override
                    public org.xms.g.common.api.Scope apply(com.huawei.hms.support.api.entity.auth.Scope param0) {
                        return new org.xms.g.common.api.Scope(new org.xms.g.utils.XBox(null, param0));
                    }
                });
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInOptions) this.getGInstance()).getScopeArray()");
            com.google.android.gms.common.api.Scope[] gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) this.getGInstance()).getScopeArray();
            return org.xms.g.utils.Utils.genericArrayCopy(gReturn, org.xms.g.common.api.Scope.class, new org.xms.g.utils.Function<com.google.android.gms.common.api.Scope, org.xms.g.common.api.Scope>() {
                
                public org.xms.g.common.api.Scope apply(com.google.android.gms.common.api.Scope param0) {
                    return new org.xms.g.common.api.Scope(new org.xms.g.utils.XBox(param0, null));
                }
            });
        }
    }
    
    public int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.request.HuaweiIdAuthParams) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.support.hwid.request.HuaweiIdAuthParams) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInOptions) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) this.getGInstance()).hashCode();
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.request.HuaweiIdAuthParams) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.support.hwid.request.HuaweiIdAuthParams) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.auth.api.signin.ExtensionSignInOptions dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.auth.api.signin.ExtensionSignInOptions) {
            return ((org.xms.g.auth.api.signin.ExtensionSignInOptions) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.auth.api.signin.GoogleSignInOptions gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.support.hwid.request.HuaweiIdAuthParams hReturn = ((com.huawei.hms.support.hwid.request.HuaweiIdAuthParams) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.auth.api.signin.ExtensionSignInOptions(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.auth.api.signin.ExtensionSignInOptions) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.signin.GoogleSignInOptions;
        }
    }
    
    public static final class Builder extends org.xms.g.utils.XObject {
        
        
        
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper());
            } else {
                this.setGInstance(new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder());
            }
        }
        
        public Builder(org.xms.g.auth.api.signin.ExtensionSignInOptions param0) {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper(((com.huawei.hms.support.hwid.request.HuaweiIdAuthParams) ((param0) == null ? null : (param0.getHInstance())))));
            } else {
                this.setGInstance(new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder(((com.google.android.gms.auth.api.signin.GoogleSignInOptions) ((param0) == null ? null : (param0.getGInstance())))));
            }
        }
        
        public final org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder addExtension(org.xms.g.auth.api.signin.ExtensionSignInOptionsExtension param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public final org.xms.g.auth.api.signin.ExtensionSignInOptions build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper) this.getHInstance()).createParams()");
                com.huawei.hms.support.hwid.request.HuaweiIdAuthParams hReturn = ((com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper) this.getHInstance()).createParams();
                return ((hReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInOptions(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder) this.getGInstance()).build()");
                com.google.android.gms.auth.api.signin.GoogleSignInOptions gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInOptions(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder requestEmail() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper) this.getHInstance()).setEmail()");
                com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper hReturn = ((com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper) this.getHInstance()).setEmail();
                return ((hReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder) this.getGInstance()).requestEmail()");
                com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder) this.getGInstance()).requestEmail();
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder requestId() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper) this.getHInstance()).setId()");
                com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper hReturn = ((com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper) this.getHInstance()).setId();
                return ((hReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder) this.getGInstance()).requestId()");
                com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder) this.getGInstance()).requestId();
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder requestIdToken(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter",
                    "((com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper) getHInstance()).setIdToken()");
                com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper hReturn =
                    ((com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper) getHInstance()).setIdToken();
                if (hReturn == null) {
                    return null;
                }
                return new org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder) this.getGInstance()).requestIdToken(param0)");
                com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder) this.getGInstance()).requestIdToken(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder requestProfile() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper) this.getHInstance()).setProfile()");
                com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper hReturn = ((com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper) this.getHInstance()).setProfile();
                return ((hReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder) this.getGInstance()).requestProfile()");
                com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder) this.getGInstance()).requestProfile();
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder requestScopes(org.xms.g.common.api.Scope param0, org.xms.g.common.api.Scope... param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter",
                    "((com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper) getHInstance()).setScopeList(scopeList)");
                java.util.List<com.huawei.hms.support.api.entity.auth.Scope> scopeList = null;
                if (param0 != null || param1 != null) {
                    scopeList = new java.util.ArrayList<>();
                    if (param0 != null) {
                        scopeList.add((com.huawei.hms.support.api.entity.auth.Scope) param0.getHInstance());
                    }
                    if (param1 != null) {
                        for (org.xms.g.common.api.Scope scope : param1) {
                            scopeList.add((com.huawei.hms.support.api.entity.auth.Scope) scope.getHInstance());
                        }
                    }
                }
                com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper hReturn =
                    ((com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper) getHInstance())
                        .setScopeList(scopeList);
                if (hReturn == null) {
                    return null;
                }
                return new org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder) this.getGInstance()).requestScopes(((com.google.android.gms.common.api.Scope) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.common.api.Scope[]) org.xms.g.utils.Utils.genericArrayCopy(param1, com.google.android.gms.common.api.Scope.class, x -> (com.google.android.gms.common.api.Scope)x.getGInstance())))");
                com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder) this.getGInstance()).requestScopes(((com.google.android.gms.common.api.Scope) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.common.api.Scope[]) org.xms.g.utils.Utils.genericArrayCopy(param1, com.google.android.gms.common.api.Scope.class, x -> (com.google.android.gms.common.api.Scope)x.getGInstance())));
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder requestServerAuthCode(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter",
                    "((com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper) getHInstance()).setAuthorizationCode()");
                com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper hReturn =
                    ((com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper) getHInstance())
                        .setAuthorizationCode();
                if (hReturn == null) {
                    return null;
                }
                return new org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder) this.getGInstance()).requestServerAuthCode(param0)");
                com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder) this.getGInstance()).requestServerAuthCode(param0);
                return ((gReturn) == null ? null : (new org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public final org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder requestServerAuthCode(java.lang.String param0, boolean param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public final org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder setAccountName(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public final org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder setHostedDomain(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.auth.api.signin.ExtensionSignInOptions.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder;
            }
        }
    }
}