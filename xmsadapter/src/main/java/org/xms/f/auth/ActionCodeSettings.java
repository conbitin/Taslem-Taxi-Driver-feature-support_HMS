package org.xms.f.auth;




public class ActionCodeSettings extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.f.auth.ActionCodeSettings createFromParcel(android.os.Parcel param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.f.auth.ActionCodeSettings[] newArray(int param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    };
    
    
    
    public ActionCodeSettings(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public boolean canHandleCodeInApp() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeSettings.canHandleCodeInApp()");
            return false;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.ActionCodeSettings) this.getGInstance()).canHandleCodeInApp()");
            return ((com.google.firebase.auth.ActionCodeSettings) this.getGInstance()).canHandleCodeInApp();
        }
    }
    
    public boolean getAndroidInstallApp() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeSettings.getAndroidInstallApp()");
            return false;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.ActionCodeSettings) this.getGInstance()).getAndroidInstallApp()");
            return ((com.google.firebase.auth.ActionCodeSettings) this.getGInstance()).getAndroidInstallApp();
        }
    }
    
    public java.lang.String getAndroidMinimumVersion() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeSettings.getAndroidMinimumVersion()");
            return "17";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.ActionCodeSettings) this.getGInstance()).getAndroidMinimumVersion()");
            return ((com.google.firebase.auth.ActionCodeSettings) this.getGInstance()).getAndroidMinimumVersion();
        }
    }
    
    public java.lang.String getAndroidPackageName() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeSettings.getAndroidPackageName()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.ActionCodeSettings) this.getGInstance()).getAndroidPackageName()");
            return ((com.google.firebase.auth.ActionCodeSettings) this.getGInstance()).getAndroidPackageName();
        }
    }
    
    public java.lang.String getIOSBundle() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeSettings.getIOSBundle()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.ActionCodeSettings) this.getGInstance()).getIOSBundle()");
            return ((com.google.firebase.auth.ActionCodeSettings) this.getGInstance()).getIOSBundle();
        }
    }
    
    public java.lang.String getUrl() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeSettings.getUrl()");
            return "";
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.ActionCodeSettings) this.getGInstance()).getUrl()");
            return ((com.google.firebase.auth.ActionCodeSettings) this.getGInstance()).getUrl();
        }
    }
    
    public static org.xms.f.auth.ActionCodeSettings.Builder newBuilder() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.VerifyCodeSettings.newBuilder()");
            com.huawei.agconnect.auth.VerifyCodeSettings.Builder hReturn = com.huawei.agconnect.auth.VerifyCodeSettings.newBuilder();
            return ((hReturn) == null ? null : (new org.xms.f.auth.ActionCodeSettings.Builder(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.ActionCodeSettings.newBuilder()");
            com.google.firebase.auth.ActionCodeSettings.Builder gReturn = com.google.firebase.auth.ActionCodeSettings.newBuilder();
            return ((gReturn) == null ? null : (new org.xms.f.auth.ActionCodeSettings.Builder(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.f.auth.ActionCodeSettings dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.ActionCodeSettings) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.agconnect.auth.VerifyCodeSettings;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.ActionCodeSettings;
        }
    }
    
    public static class Builder extends org.xms.g.utils.XObject {
        
        
        
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public org.xms.f.auth.ActionCodeSettings build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.agconnect.auth.VerifyCodeSettings.Builder) this.getHInstance()).build()");
                com.huawei.agconnect.auth.VerifyCodeSettings hReturn = ((com.huawei.agconnect.auth.VerifyCodeSettings.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.f.auth.ActionCodeSettings(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.ActionCodeSettings.Builder) this.getGInstance()).build()");
                com.google.firebase.auth.ActionCodeSettings gReturn = ((com.google.firebase.auth.ActionCodeSettings.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.f.auth.ActionCodeSettings(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.f.auth.ActionCodeSettings.Builder setAndroidPackageName(java.lang.String param0, boolean param1, java.lang.String param2) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeSettings.Builder.setAndroidPackageName(param0, param1, param2)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.ActionCodeSettings.Builder) this.getGInstance()).setAndroidPackageName(param0, param1, param2)");
                com.google.firebase.auth.ActionCodeSettings.Builder gReturn = ((com.google.firebase.auth.ActionCodeSettings.Builder) this.getGInstance()).setAndroidPackageName(param0, param1, param2);
                return ((gReturn) == null ? null : (new org.xms.f.auth.ActionCodeSettings.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.f.auth.ActionCodeSettings.Builder setDynamicLinkDomain(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeSettings.Builder.setDynamicLinkDomain(param0)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.ActionCodeSettings.Builder) this.getGInstance()).setDynamicLinkDomain(param0)");
                com.google.firebase.auth.ActionCodeSettings.Builder gReturn = ((com.google.firebase.auth.ActionCodeSettings.Builder) this.getGInstance()).setDynamicLinkDomain(param0);
                return ((gReturn) == null ? null : (new org.xms.f.auth.ActionCodeSettings.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.f.auth.ActionCodeSettings.Builder setHandleCodeInApp(boolean param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeSettings.Builder.setHandleCodeInApp(param0)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.ActionCodeSettings.Builder) this.getGInstance()).setHandleCodeInApp(param0)");
                com.google.firebase.auth.ActionCodeSettings.Builder gReturn = ((com.google.firebase.auth.ActionCodeSettings.Builder) this.getGInstance()).setHandleCodeInApp(param0);
                return ((gReturn) == null ? null : (new org.xms.f.auth.ActionCodeSettings.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.f.auth.ActionCodeSettings.Builder setIOSBundleId(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeSettings.Builder.setIOSBundleId(param0)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.ActionCodeSettings.Builder) this.getGInstance()).setIOSBundleId(param0)");
                com.google.firebase.auth.ActionCodeSettings.Builder gReturn = ((com.google.firebase.auth.ActionCodeSettings.Builder) this.getGInstance()).setIOSBundleId(param0);
                return ((gReturn) == null ? null : (new org.xms.f.auth.ActionCodeSettings.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public org.xms.f.auth.ActionCodeSettings.Builder setUrl(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                
                org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.f.auth.ActionCodeSettings.Builder.setUrl(param0)");
                return this;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.ActionCodeSettings.Builder) this.getGInstance()).setUrl(param0)");
                com.google.firebase.auth.ActionCodeSettings.Builder gReturn = ((com.google.firebase.auth.ActionCodeSettings.Builder) this.getGInstance()).setUrl(param0);
                return ((gReturn) == null ? null : (new org.xms.f.auth.ActionCodeSettings.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
        
        public static org.xms.f.auth.ActionCodeSettings.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.f.auth.ActionCodeSettings.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.agconnect.auth.VerifyCodeSettings.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.ActionCodeSettings.Builder;
            }
        }
    }
}