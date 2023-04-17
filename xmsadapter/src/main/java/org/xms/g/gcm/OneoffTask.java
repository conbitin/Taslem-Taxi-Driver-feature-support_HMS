package org.xms.g.gcm;

/**
 * A task that will execute once,at some point within the specified window.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.gcm.OneoffTask: A task that will execute once,at some point within the specified window.<br/>
 */
public class OneoffTask extends org.xms.g.gcm.Task {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.google.android.gms.gcm.OneoffTask.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/OneoffTask#public-static-final-creatoroneofftask-creator">https://developers.google.com/android/reference/com/google/android/gms/gcm/OneoffTask#public-static-final-creatoroneofftask-creator</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.gcm.OneoffTask createFromParcel(android.os.Parcel param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.gcm.OneoffTask[] newArray(int param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    };
    
    /**
     * org.xms.g.gcm.OneoffTask.OneoffTask(org.xms.g.utils.XBox) constructor of OneoffTask with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public OneoffTask(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public long getWindowEnd() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public long getWindowStart() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public void toBundle(android.os.Bundle param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public java.lang.String toString() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.OneoffTask.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.gcm.OneoffTask.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted OneoffTask object
     */
    public static org.xms.g.gcm.OneoffTask dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.OneoffTask.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * A task that will execute once,at some point within the specified window.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.gcm.OneoffTask.Builder: A task that will execute once,at some point within the specified window.<br/>
     */
    public static class Builder extends org.xms.g.gcm.Task.Builder {
        
        /**
         * org.xms.g.gcm.OneoffTask.Builder.Builder(org.xms.g.utils.XBox) constructor of OneoffTask.Builder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        /**
         * org.xms.g.gcm.OneoffTask.Builder.Builder() constructor of OneoffTask.Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.gcm.OneoffTask.Builder.Builder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/OneoffTask.Builder#public-oneofftask.builder">https://developers.google.com/android/reference/com/google/android/gms/gcm/OneoffTask.Builder#public-oneofftask.builder</a><br/>
         *
         */
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        protected void checkConditions() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.OneoffTask build() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.OneoffTask.Builder setExecutionWindow(long param0, long param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.OneoffTask.Builder setExtras(android.os.Bundle param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.OneoffTask.Builder setPersisted(boolean param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.OneoffTask.Builder setRequiredNetwork(int param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.OneoffTask.Builder setRequiresCharging(boolean param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.OneoffTask.Builder setService(java.lang.Class<? extends org.xms.g.gcm.GcmTaskService> param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.OneoffTask.Builder setTag(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.OneoffTask.Builder setUpdateCurrent(boolean param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * org.xms.g.gcm.OneoffTask.Builder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.gcm.OneoffTask.Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted OneoffTask Builder object
         */
        public static org.xms.g.gcm.OneoffTask.Builder dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * org.xms.g.gcm.OneoffTask.Builder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return true if the Object is XMS instance, otherwise false
         */
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}