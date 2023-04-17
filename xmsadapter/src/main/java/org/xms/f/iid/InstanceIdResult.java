package org.xms.f.iid;

/**
 * Result object obtained from requests for an Instance ID and token.<br/>
 * Combination of com.huawei.hms.aaid.entity.AAIDResult and com.google.firebase.iid.InstanceIdResult.<br/>
 * com.huawei.hms.aaid.entity.AAIDResult: Bears and returns AAIDs obtained through the getAAID() method in HmsInstanceId You can call the getId() method in the AAIDResult class to obtain an AAID.<br/>
 * com.google.firebase.iid.InstanceIdResult: Result object obtained from requests for an Instance ID and token.<br/>
 */
public interface InstanceIdResult extends org.xms.g.utils.XInterface {
    
    /**
     * org.xms.f.iid.InstanceIdResult.getId() Returns the stable identifier that uniquely identifies this application instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.aaid.entity.AAIDResult.getId(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/aaidresult-0000001050255642-V5#EN-US_TOPIC_0000001050255642__section1788692510237">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/aaidresult-0000001050255642-V5#EN-US_TOPIC_0000001050255642__section1788692510237</a><br/>
     * com.google.firebase.iid.InstanceIdResult.getId(): <a href="https://developers.google.com/android/reference/com/google/firebase/iid/InstanceIdResult#public-abstract-string-getid">https://developers.google.com/android/reference/com/google/firebase/iid/InstanceIdResult#public-abstract-string-getid</a><br/>
     *
     * @return the stable identifier
     */
    public java.lang.String getId();
    
    /**
     * XMS does not provide this api.<br/>
     */
    public java.lang.String getToken();
    
    default java.lang.Object getZInstanceInstanceIdResult() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceInstanceIdResult();
        } else {
            return getGInstanceInstanceIdResult();
        }
    }
    
    default com.google.firebase.iid.InstanceIdResult getGInstanceInstanceIdResult() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.firebase.iid.InstanceIdResult) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.firebase.iid.InstanceIdResult() {
            
            public java.lang.String getId() {
                return org.xms.f.iid.InstanceIdResult.this.getId();
            }
            
            public java.lang.String getToken() {
                throw new java.lang.RuntimeException("Not Supported");
            }
        };
    }
    
    default com.huawei.hms.aaid.entity.AAIDResult getHInstanceInstanceIdResult() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.aaid.entity.AAIDResult) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.aaid.entity.AAIDResult() {
            
            public java.lang.String getId() {
                return org.xms.f.iid.InstanceIdResult.this.getId();
            }
        };
    }
    
    /**
     * org.xms.f.iid.InstanceIdResult.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.f.iid.InstanceIdResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted InstanceIdResult object
     */
    public static org.xms.f.iid.InstanceIdResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.iid.InstanceIdResult) param0);
    }
    
    /**
     * org.xms.f.iid.InstanceIdResult.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.aaid.entity.AAIDResult;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.iid.InstanceIdResult;
            }
        }
        return param0 instanceof org.xms.f.iid.InstanceIdResult;
    }
    
    /**
     * Result object obtained from requests for an Instance ID and token.<br/>
     * Combination of com.huawei.hms.aaid.entity.AAIDResult and com.google.firebase.iid.InstanceIdResult.<br/>
     * com.huawei.hms.aaid.entity.AAIDResult: Bears and returns AAIDs obtained through the getAAID() method in HmsInstanceId.<br/>
     * com.google.firebase.iid.InstanceIdResult: Result object obtained from requests for an Instance ID and token.<br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.f.iid.InstanceIdResult {
        
        /**
         * org.xms.f.iid.InstanceIdResult.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        /**
         * org.xms.f.iid.InstanceIdResult.XImpl.getId() Returns the stable identifier that uniquely identifies this application instance.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.aaid.entity.AAIDResult.getId(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/aaidresult-0000001050255642-V5#EN-US_TOPIC_0000001050255642__section1788692510237">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/aaidresult-0000001050255642-V5#EN-US_TOPIC_0000001050255642__section1788692510237</a><br/>
         * com.google.firebase.iid.InstanceIdResult.getId(): <a href="https://developers.google.com/android/reference/com/google/firebase/iid/InstanceIdResult#public-abstract-string-getid">https://developers.google.com/android/reference/com/google/firebase/iid/InstanceIdResult#public-abstract-string-getid</a><br/>
         *
         * @return the stable identifier
         */
        public java.lang.String getId() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.aaid.entity.AAIDResult) this.getHInstance()).getId()");
                return ((com.huawei.hms.aaid.entity.AAIDResult) this.getHInstance()).getId();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.iid.InstanceIdResult) this.getGInstance()).getId()");
                return ((com.google.firebase.iid.InstanceIdResult) this.getGInstance()).getId();
            }
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public java.lang.String getToken() {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}