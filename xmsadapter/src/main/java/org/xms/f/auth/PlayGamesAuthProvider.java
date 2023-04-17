package org.xms.f.auth;




public class PlayGamesAuthProvider extends org.xms.g.utils.XObject {
    
    
    
    public PlayGamesAuthProvider(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    public static java.lang.String getPLAY_GAMES_SIGN_IN_METHOD() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.AGConnectAuthCredential.HWGame_Provider");
            return String.valueOf(com.huawei.agconnect.auth.AGConnectAuthCredential.HWGame_Provider);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.PlayGamesAuthProvider.PLAY_GAMES_SIGN_IN_METHOD");
            return com.google.firebase.auth.PlayGamesAuthProvider.PLAY_GAMES_SIGN_IN_METHOD;
        }
    }
    
    public java.lang.String getPROVIDER_ID() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.agconnect.auth.AGConnectAuthCredential.HWGame_Provider");
            return String.valueOf(com.huawei.agconnect.auth.AGConnectAuthCredential.HWGame_Provider);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.auth.PlayGamesAuthProvider) this.getGInstance()).PROVIDER_ID");
            return ((com.google.firebase.auth.PlayGamesAuthProvider) this.getGInstance()).PROVIDER_ID;
        }
    }
    
    public static org.xms.f.auth.AuthCredential getCredential(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.PlayGamesAuthProvider.getCredential(param0)");
            com.huawei.agconnect.auth.AGConnectAuthCredential hReturn = new com.huawei.agconnect.auth.HWGameAuthProvider.Builder().build();
            return ((hReturn) == null ? null : (new org.xms.f.auth.AuthCredential.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.auth.PlayGamesAuthProvider.getCredential(param0)");
            com.google.firebase.auth.AuthCredential gReturn = com.google.firebase.auth.PlayGamesAuthProvider.getCredential(param0);
            return ((gReturn) == null ? null : (new org.xms.f.auth.AuthCredential.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
    
    public static org.xms.f.auth.PlayGamesAuthProvider dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.auth.PlayGamesAuthProvider) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            throw new java.lang.RuntimeException("AppGallery-connect does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.auth.PlayGamesAuthProvider;
        }
    }
}