package org.xms.g.gcm;

/**
 * Encapsulates the parameters of a task that you will schedule on the GcmNetworkManager.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.gcm.Task: Encapsulates the parameters of a task that you will schedule on the GcmNetworkManager.<br/>
 */
public class Task extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.google.android.gms.gcm.Task.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/Task">https://developers.google.com/android/reference/com/google/android/gms/gcm/Task</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.gcm.Task createFromParcel(android.os.Parcel param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.gcm.Task[] newArray(int param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    };
    
    /**
     * org.xms.g.gcm.Task.Task(org.xms.g.utils.XBox) constructor of Task with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public Task(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    /**
     * org.xms.g.gcm.Task.getEXTRAS_LIMIT_BYTES() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/Task#public-static-final-int-extras_limit_bytes">https://developers.google.com/android/reference/com/google/android/gms/gcm/Task#public-static-final-int-extras_limit_bytes</a><br/>
     *
     * @return Constant Value The maximum size allowed for extras bundle in bytes
     */
    public static int getEXTRAS_LIMIT_BYTES() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.Task.getNETWORK_STATE_ANY() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.gcm.Task.NETWORK_STATE_ANY: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/Task#public-static-final-int-network_state_any">https://developers.google.com/android/reference/com/google/android/gms/gcm/Task#public-static-final-int-network_state_any</a><br/>
     *
     * @return Constant Value Specify using setRequiredNetwork(int) that your task will execute regardless of whether a network is available
     */
    public static int getNETWORK_STATE_ANY() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.Task.getNETWORK_STATE_CONNECTED() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.gcm.Task.NETWORK_STATE_CONNECTED: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/Task#public-static-final-int-network_state_connected">https://developers.google.com/android/reference/com/google/android/gms/gcm/Task#public-static-final-int-network_state_connected</a><br/>
     *
     * @return Specify using setRequiredNetwork(int) that your task will only execute if some sort of data connection is available either metered or unmetered This is the default
     */
    public static int getNETWORK_STATE_CONNECTED() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.Task.getNETWORK_STATE_UNMETERED() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.gcm.Task.NETWORK_STATE_UNMETERED: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/Task#public-static-final-int-network_state_unmetered">https://developers.google.com/android/reference/com/google/android/gms/gcm/Task#public-static-final-int-network_state_unmetered</a><br/>
     *
     * @return Specify using setRequiredNetwork(int) that your task will only execute if there is an unmetered network connection available
     */
    public static int getNETWORK_STATE_UNMETERED() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.Task.getUNINITIALIZED() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.gcm.Task.UNINITIALIZED: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/Task#protected-static-final-long-uninitialized">https://developers.google.com/android/reference/com/google/android/gms/gcm/Task#protected-static-final-long-uninitialized</a><br/>
     *
     * @return Constant Value
     */
    public static long getUNINITIALIZED() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public android.os.Bundle getExtras() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public int getRequiredNetwork() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public boolean getRequiresCharging() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public java.lang.String getServiceName() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public java.lang.String getTag() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public boolean isPersisted() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public boolean isUpdateCurrent() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.Task.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.gcm.Task.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted Task object
     */
    public static org.xms.g.gcm.Task dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.Task.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * Encapsulates the parameters of a task that you will schedule on the GcmNetworkManager.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.gcm.Task.Builder: Encapsulates the parameters of a task that you will schedule on the GcmNetworkManager.<br/>
     */
    public abstract static class Builder extends org.xms.g.utils.XObject {
        
        /**
         * org.xms.g.gcm.Task.Builder.Builder(org.xms.g.utils.XBox) constructor of Builder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        /**
         * org.xms.g.gcm.Task.Builder.Builder() constructor of Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.gcm.Task.Builder.Builder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/Task.Builder#public-task.builder">https://developers.google.com/android/reference/com/google/android/gms/gcm/Task.Builder#public-task.builder</a><br/>
         *
         */
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
        }
        
        /**
         * org.xms.g.gcm.Task.Builder.getExtras() return the Attribute.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.gcm.Task.Builder.extras: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/Task.Builder#protected-bundle-extras">https://developers.google.com/android/reference/com/google/android/gms/gcm/Task.Builder#protected-bundle-extras</a><br/>
         *
         * @return the return object is android os Bundle
         */
        public android.os.Bundle getExtras() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * org.xms.g.gcm.Task.Builder.getGcmTaskService() return the Attribute.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.gcm.Task.Builder.gcmTaskService: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/Task.Builder#protected-string-gcmtaskservice">https://developers.google.com/android/reference/com/google/android/gms/gcm/Task.Builder#protected-string-gcmtaskservice</a><br/>
         *
         * @return the return object is java lang String
         */
        public java.lang.String getGcmTaskService() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * org.xms.g.gcm.Task.Builder.getIsPersisted() return the Attribute.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.gcm.Task.Builder.isPersisted: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/Task.Builder#protected-boolean-ispersisted">https://developers.google.com/android/reference/com/google/android/gms/gcm/Task.Builder#protected-boolean-ispersisted</a><br/>
         *
         * @return the return object is boolean
         */
        public boolean getIsPersisted() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * org.xms.g.gcm.Task.Builder.getRequiredNetworkState() return the Attribute.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.gcm.Task.Builder.requiredNetworkState: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/Task.Builder#protected-int-requirednetworkstate">https://developers.google.com/android/reference/com/google/android/gms/gcm/Task.Builder#protected-int-requirednetworkstate</a><br/>
         *
         * @return the return object is requiredNetworkState
         */
        public int getRequiredNetworkState() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * org.xms.g.gcm.Task.Builder.getRequiresCharging() return the Attribute.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.gcm.Task.Builder.requiresCharging: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/Task.Builder#protected-boolean-requirescharging">https://developers.google.com/android/reference/com/google/android/gms/gcm/Task.Builder#protected-boolean-requirescharging</a><br/>
         *
         * @return the return obejct is requiresCharging
         */
        public boolean getRequiresCharging() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * org.xms.g.gcm.Task.Builder.getTag() return the Attribute.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.gcm.Task.Builder.tag: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/Task.Builder#protected-string-tag">https://developers.google.com/android/reference/com/google/android/gms/gcm/Task.Builder#protected-string-tag</a><br/>
         *
         * @return the return object is java lang string
         */
        public java.lang.String getTag() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * org.xms.g.gcm.Task.Builder.getUpdateCurrent() return the Attribute.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.gcm.Task.Builder.updateCurrent: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/Task.Builder#protected-boolean-updatecurrent">https://developers.google.com/android/reference/com/google/android/gms/gcm/Task.Builder#protected-boolean-updatecurrent</a><br/>
         *
         * @return the return object is updateCurrent
         */
        public boolean getUpdateCurrent() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public abstract org.xms.g.gcm.Task build();
        
        /**
         * XMS does not provide this api.<br/>
         */
        public abstract org.xms.g.gcm.Task.Builder setExtras(android.os.Bundle param0);
        
        /**
         * XMS does not provide this api.<br/>
         */
        public abstract org.xms.g.gcm.Task.Builder setPersisted(boolean param0);
        
        /**
         * XMS does not provide this api.<br/>
         */
        public abstract org.xms.g.gcm.Task.Builder setRequiredNetwork(int param0);
        
        /**
         * XMS does not provide this api.<br/>
         */
        public abstract org.xms.g.gcm.Task.Builder setRequiresCharging(boolean param0);
        
        /**
         * XMS does not provide this api.<br/>
         */
        public abstract org.xms.g.gcm.Task.Builder setService(java.lang.Class<? extends org.xms.g.gcm.GcmTaskService> param0);
        
        /**
         * XMS does not provide this api.<br/>
         */
        public abstract org.xms.g.gcm.Task.Builder setTag(java.lang.String param0);
        
        /**
         * XMS does not provide this api.<br/>
         */
        public abstract org.xms.g.gcm.Task.Builder setUpdateCurrent(boolean param0);
        
        /**
         * XMS does not provide this api.<br/>
         */
        protected void checkConditions() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * org.xms.g.gcm.Task.Builder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.gcm.Task.Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted Task Builder object
         */
        public static org.xms.g.gcm.Task.Builder dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * org.xms.g.gcm.Task.Builder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return true if the Object is XMS instance, otherwise false
         */
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * Encapsulates the parameters of a task that you will schedule on the GcmNetworkManager.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.gcm.Task.Builder: Encapsulates the parameters of a task that you will schedule on the GcmNetworkManager.<br/>
         */
        public static class XImpl extends org.xms.g.gcm.Task.Builder {
            
            /**
             * org.xms.g.gcm.Task.Builder.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 the wrapper of xms instance
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }
            
            /**
             * XMS does not provide this api.<br/>
             */
            public org.xms.g.gcm.Task build() {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            /**
             * XMS does not provide this api.<br/>
             */
            public org.xms.g.gcm.Task.Builder setExtras(android.os.Bundle param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            /**
             * XMS does not provide this api.<br/>
             */
            public org.xms.g.gcm.Task.Builder setPersisted(boolean param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            /**
             * XMS does not provide this api.<br/>
             */
            public org.xms.g.gcm.Task.Builder setRequiredNetwork(int param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            /**
             * XMS does not provide this api.<br/>
             */
            public org.xms.g.gcm.Task.Builder setRequiresCharging(boolean param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            /**
             * XMS does not provide this api.<br/>
             */
            public org.xms.g.gcm.Task.Builder setService(java.lang.Class<? extends org.xms.g.gcm.GcmTaskService> param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            /**
             * XMS does not provide this api.<br/>
             */
            public org.xms.g.gcm.Task.Builder setTag(java.lang.String param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
            
            /**
             * XMS does not provide this api.<br/>
             */
            public org.xms.g.gcm.Task.Builder setUpdateCurrent(boolean param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
        }
    }
}