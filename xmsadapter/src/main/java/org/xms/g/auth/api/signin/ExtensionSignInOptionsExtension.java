package org.xms.g.auth.api.signin;

public interface ExtensionSignInOptionsExtension extends org.xms.g.utils.XInterface {
    
    public int getExtensionType();
    
    public java.util.List<org.xms.g.common.api.Scope> getImpliedScopes();
    
    public android.os.Bundle toBundle();
    
    default java.lang.Object getZInstanceExtensionSignInOptionsExtension() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceExtensionSignInOptionsExtension();
        } else {
            return getGInstanceExtensionSignInOptionsExtension();
        }
    }
    
    default com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension getGInstanceExtensionSignInOptionsExtension() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension() {
            
            public int getExtensionType() {
                return org.xms.g.auth.api.signin.ExtensionSignInOptionsExtension.this.getExtensionType();
            }
            
            public java.util.List<com.google.android.gms.common.api.Scope> getImpliedScopes() {
                return ((java.util.List) org.xms.g.utils.Utils.mapList2GH(org.xms.g.auth.api.signin.ExtensionSignInOptionsExtension.this.getImpliedScopes(), false));
            }
            
            public android.os.Bundle toBundle() {
                return org.xms.g.auth.api.signin.ExtensionSignInOptionsExtension.this.toBundle();
            }
        };
    }
    
    default com.huawei.hms.support.hwid.request.HuaweiIdAuthExtendedParams getHInstanceExtensionSignInOptionsExtension() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.support.hwid.request.HuaweiIdAuthExtendedParams) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.support.hwid.request.HuaweiIdAuthExtendedParams() {
            
            public int getExtendedParamType() {
                return org.xms.g.auth.api.signin.ExtensionSignInOptionsExtension.this.getExtensionType();
            }
            
            public java.util.List<com.huawei.hms.support.api.entity.auth.Scope> getExtendedScopes() {
                return ((java.util.List) org.xms.g.utils.Utils.mapList2GH(org.xms.g.auth.api.signin.ExtensionSignInOptionsExtension.this.getImpliedScopes(), true));
            }
            
            public android.os.Bundle getExtendedBundle() {
                return org.xms.g.auth.api.signin.ExtensionSignInOptionsExtension.this.toBundle();
            }
        };
    }
    
    public static org.xms.g.auth.api.signin.ExtensionSignInOptionsExtension dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.auth.api.signin.ExtensionSignInOptionsExtension) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.hwid.request.HuaweiIdAuthExtendedParams;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
            }
        }
        return param0 instanceof org.xms.g.auth.api.signin.ExtensionSignInOptionsExtension;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.auth.api.signin.ExtensionSignInOptionsExtension {
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public int getExtensionType() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.request.HuaweiIdAuthExtendedParams) this.getHInstance()).getExtendedParamType()");
                return ((com.huawei.hms.support.hwid.request.HuaweiIdAuthExtendedParams) this.getHInstance()).getExtendedParamType();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension) this.getGInstance()).getExtensionType()");
                return ((com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension) this.getGInstance()).getExtensionType();
            }
        }
        
        public java.util.List<org.xms.g.common.api.Scope> getImpliedScopes() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.request.HuaweiIdAuthExtendedParams) this.getHInstance()).getExtendedScopes()");
                java.util.List hReturn = ((com.huawei.hms.support.hwid.request.HuaweiIdAuthExtendedParams) this.getHInstance()).getExtendedScopes();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.support.api.entity.auth.Scope, org.xms.g.common.api.Scope>() {
                    
                    public org.xms.g.common.api.Scope apply(com.huawei.hms.support.api.entity.auth.Scope param0) {
                        return new org.xms.g.common.api.Scope(new org.xms.g.utils.XBox(null, param0));
                    }
                }));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension) this.getGInstance()).getImpliedScopes()");
                java.util.List gReturn = ((com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension) this.getGInstance()).getImpliedScopes();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.common.api.Scope, org.xms.g.common.api.Scope>() {
                    
                    public org.xms.g.common.api.Scope apply(com.google.android.gms.common.api.Scope param0) {
                        return new org.xms.g.common.api.Scope(new org.xms.g.utils.XBox(param0, null));
                    }
                }));
            }
        }
        
        public android.os.Bundle toBundle() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.request.HuaweiIdAuthExtendedParams) this.getHInstance()).getExtendedBundle()");
                return ((com.huawei.hms.support.hwid.request.HuaweiIdAuthExtendedParams) this.getHInstance()).getExtendedBundle();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension) this.getGInstance()).toBundle()");
                return ((com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension) this.getGInstance()).toBundle();
            }
        }
    }
}