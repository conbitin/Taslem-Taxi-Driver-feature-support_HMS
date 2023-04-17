package org.xms.f.auth;




public interface SignInMethodQueryResult extends org.xms.g.utils.XInterface {
    
    
    
    public java.util.List<java.lang.String> getSignInMethods();
    
    default java.lang.Object getZInstanceSignInMethodQueryResult() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceSignInMethodQueryResult();
        } else {
            return getGInstanceSignInMethodQueryResult();
        }
    }
    
    default com.google.firebase.auth.SignInMethodQueryResult getGInstanceSignInMethodQueryResult() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.firebase.auth.SignInMethodQueryResult) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.firebase.auth.SignInMethodQueryResult() {
            
            public java.util.List<java.lang.String> getSignInMethods() {
                return org.xms.g.utils.Utils.mapList2GH(org.xms.f.auth.SignInMethodQueryResult.this.getSignInMethods(), false);
            }
        };
    }
    
    default java.lang.Object getHInstanceSignInMethodQueryResult() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((java.lang.Object) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new java.lang.Object();
    }
    
    public static org.xms.f.auth.SignInMethodQueryResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.SignInMethodQueryResult) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.SignInMethodQueryResult;
            }
        }
        return param0 instanceof org.xms.f.auth.SignInMethodQueryResult;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.f.auth.SignInMethodQueryResult {
        
        
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public java.util.List<java.lang.String> getSignInMethods() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.SignInMethodQueryResult.XImpl.getSignInMethods()");
                return java.util.Collections.singletonList("");
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.SignInMethodQueryResult) this.getGInstance()).getSignInMethods()");
                return ((com.google.firebase.auth.SignInMethodQueryResult) this.getGInstance()).getSignInMethods();
            }
        }
    }
}