package org.xms.f.auth;

public abstract class MultiFactorSession extends org.xms.g.utils.XObject implements android.os.Parcelable {
    
    public MultiFactorSession(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public MultiFactorSession() {
        super(((org.xms.g.utils.XBox) null));
    }
    
    public static org.xms.f.auth.MultiFactorSession dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.f.auth.MultiFactorSession {
        public static final android.os.Parcelable.Creator CREATOR = null;
        
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        public int describeContents() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}