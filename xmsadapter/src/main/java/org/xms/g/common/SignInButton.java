package org.xms.g.common;




/**
 * The sign-in button to authenticate the user. Note that this class only handles the visual aspects of the button. In order to trigger an action, register a listener using setOnClickListener(OnClickListener).<br/>
 * Combination of com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton and com.google.android.gms.common.SignInButton.<br/>
 * com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton: the HuaweiIdAuthButton.<br/>
 * com.google.android.gms.common.SignInButton: The Google sign-in button to authenticate the user. Note that this class only handles the visual aspects of the button. In order to trigger an action, register a listener using setOnClickListener(OnClickListener).<br/>
 */
public final class SignInButton extends android.widget.FrameLayout implements android.view.View.OnClickListener, org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;
    
    
    
    /**
     * org.xms.g.common.SignInButton.SignInButton(android.content.Context) Constructors of the SignInButton.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.HuaweiIdAuthButton(android.content.Context): <a href="https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#HuaweiIdAuthButton1">https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#HuaweiIdAuthButton1</a><br/>
     * com.google.android.gms.common.SignInButton.SignInButton(android.content.Context): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-signinbutton-context-context">https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-signinbutton-context-context</a><br/>
     *
     * @param param0 parent context for creating SignInButton
     */
    public SignInButton(android.content.Context param0) {
        super(param0);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton(param0));
        } else {
            this.setGInstance(new com.google.android.gms.common.SignInButton(param0));
        }
    }
    
    /**
     * org.xms.g.common.SignInButton.SignInButton(android.content.Context,android.util.AttributeSet) Constructors of the SignInButton.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.HuaweiIdAuthButton(android.content.Context,android.util.AttributeSet): <a href="https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#HuaweiIdAuthButton2">https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#HuaweiIdAuthButton2</a><br/>
     * com.google.android.gms.common.SignInButton.SignInButton(android.content.Context, android.util.AttributeSet): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-signinbutton-context-context,-attributeset-attrs">https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-signinbutton-context-context,-attributeset-attrs</a><br/>
     *
     * @param param0 parent context for creating SignInButton
     * @param param1 the AttributeSet for creating SignInButton
     */
    public SignInButton(android.content.Context param0, android.util.AttributeSet param1) {
        super(param0, param1);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton(param0, param1));
        } else {
            this.setGInstance(new com.google.android.gms.common.SignInButton(param0, param1));
        }
    }
    
    /**
     * org.xms.g.common.SignInButton.SignInButton(android.content.Context,android.util.AttributeSet,int) Constructors of the SignInButton.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.HuaweiIdAuthButton(android.content.Context,android.util.AttributeSet,int): <a href="https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#HuaweiIdAuthButton3">https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#HuaweiIdAuthButton3</a><br/>
     * com.google.android.gms.common.SignInButton.SignInButton(android.content.Context, android.util.AttributeSet, int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-signinbutton-context-context,-attributeset-attrs,-int-defstyle">https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-signinbutton-context-context,-attributeset-attrs,-int-defstyle</a><br/>
     *
     * @param param0 parent context for creating SignInButton
     * @param param1 the AttributeSet for creating SignInButton
     * @param param2 default Style
     */
    public SignInButton(android.content.Context param0, android.util.AttributeSet param1, int param2) {
        super(param0, param1, param2);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton(param0, param1, param2));
        } else {
            this.setGInstance(new com.google.android.gms.common.SignInButton(param0, param1, param2));
        }
    }
    
    /**
     * org.xms.g.common.SignInButton.getCOLOR_AUTO() return the value of COLOR_AUTO.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.COLOR_POLICY_BLUE: <a href="https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#COLOR_POLICY_BLUE">https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#COLOR_POLICY_BLUE</a><br/>
     * com.google.android.gms.common.SignInButton.COLOR_AUTO: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-static-final-int-color_auto">https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-static-final-int-color_auto</a><br/>
     *
     * @return Constant Value.Google Play services will decide the color scheme for sign-in button
     */
    public static int getCOLOR_AUTO() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.COLOR_POLICY_BLUE");
            return com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.COLOR_POLICY_BLUE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.SignInButton.COLOR_AUTO");
            return com.google.android.gms.common.SignInButton.COLOR_AUTO;
        }
    }
    
    /**
     * org.xms.g.common.SignInButton.getCOLOR_DARK() return the value of COLOR_DARK.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.COLOR_POLICY_RED: <a href="https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#COLOR_POLICY_RED">https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#COLOR_POLICY_RED</a><br/>
     * com.google.android.gms.common.SignInButton.COLOR_DARK: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-static-final-int-color_dark">https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-static-final-int-color_dark</a><br/>
     *
     * @return Constant Value.The dark color scheme of the sign-in button
     */
    public static int getCOLOR_DARK() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.COLOR_POLICY_RED");
            return com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.COLOR_POLICY_RED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.SignInButton.COLOR_DARK");
            return com.google.android.gms.common.SignInButton.COLOR_DARK;
        }
    }
    
    /**
     * org.xms.g.common.SignInButton.getCOLOR_LIGHT() return the value of COLOR_LIGHT.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.COLOR_POLICY_WHITE: <a href="https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#COLOR_POLICY_WHITE">https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#COLOR_POLICY_WHITE</a><br/>
     * com.google.android.gms.common.SignInButton.COLOR_LIGHT: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-static-final-int-color_light">https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-static-final-int-color_light</a><br/>
     *
     * @return Constant Value.The light color scheme of the sign-in button
     */
    public static int getCOLOR_LIGHT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.COLOR_POLICY_WHITE");
            return com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.COLOR_POLICY_WHITE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.SignInButton.COLOR_LIGHT");
            return com.google.android.gms.common.SignInButton.COLOR_LIGHT;
        }
    }
    
    /**
     * org.xms.g.common.SignInButton.getSIZE_ICON_ONLY() return the value of SIZE_ICON_ONLY.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.THEME_NO_TITLE: <a href="https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#THEME_NO_TITLE">https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#THEME_NO_TITLE</a><br/>
     * com.google.android.gms.common.SignInButton.SIZE_ICON_ONLY: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-static-final-int-size_icon_only">https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-static-final-int-size_icon_only</a><br/>
     *
     * @return Constant Value.The icon-only size of the Google sign-in button
     */
    public static int getSIZE_ICON_ONLY() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.THEME_NO_TITLE");
            return com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.THEME_NO_TITLE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.SignInButton.SIZE_ICON_ONLY");
            return com.google.android.gms.common.SignInButton.SIZE_ICON_ONLY;
        }
    }
    
    /**
     * org.xms.g.common.SignInButton.getSIZE_STANDARD() return the value of SIZE_STANDARD.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.SignInButton.SIZE_STANDARD: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-static-final-int-size_standard">https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-static-final-int-size_standard</a><br/>
     *
     * @return Constant Value.The standard size of the Google sign-in button
     */
    public static int getSIZE_STANDARD() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.common.SignInButton.getSIZE_WIDE() return the value of SIZE_WIDE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.THEME_FULL_TITLE: <a href="https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#THEME_FULL_TITLE">https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#THEME_FULL_TITLE</a><br/>
     * com.google.android.gms.common.SignInButton.SIZE_WIDE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-static-final-int-size_wide">https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-static-final-int-size_wide</a><br/>
     *
     * @return Constant Value.The wide size of the Google sign-in button
     */
    public static int getSIZE_WIDE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.THEME_FULL_TITLE");
            return com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.THEME_FULL_TITLE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.SignInButton.SIZE_WIDE");
            return com.google.android.gms.common.SignInButton.SIZE_WIDE;
        }
    }
    
    /**
     * org.xms.g.common.SignInButton.onClick(android.view.View) the onClick.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.performClick(): <a href="https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#performClick">https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#performClick</a><br/>
     * com.google.android.gms.common.SignInButton.onClick(android.view.View): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-void-onclick-view-view">https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-void-onclick-view-view</a><br/>
     *
     * @param param0 the view
     */
    public final void onClick(android.view.View param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.common.SignInButton.onClick(android.view.View)");
            ((com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton) this.getHInstance()).performClick();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.SignInButton) this.getGInstance()).onClick(param0)");
            ((com.google.android.gms.common.SignInButton) this.getGInstance()).onClick(param0);
        }
    }
    
    /**
     * org.xms.g.common.SignInButton.setColorScheme(int) Set the color scheme of the button to use. The size and branding scheme will remain unchanged.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.setColorPolicy(int): <a href="https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#setColorPolicy">https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#setColorPolicy</a><br/>
     * com.google.android.gms.common.SignInButton.setColorScheme(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-void-setcolorscheme-int-colorscheme">https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-void-setcolorscheme-int-colorscheme</a><br/>
     *
     * @param param0 The color scheme to use for the button. See SignInButton.ColorScheme
     */
    public final void setColorScheme(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton) this.getHInstance()).setColorPolicy(param0)");
            ((com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton) this.getHInstance()).setColorPolicy(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.SignInButton) this.getGInstance()).setColorScheme(param0)");
            ((com.google.android.gms.common.SignInButton) this.getGInstance()).setColorScheme(param0);
        }
    }
    
    /**
     * org.xms.g.common.SignInButton.setEnabled(boolean) the setEnabled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.setEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#setEnabled">https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#setEnabled</a><br/>
     * com.google.android.gms.common.SignInButton.setEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-void-setenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-void-setenabled-boolean-enabled</a><br/>
     *
     * @param param0 the enabled
     */
    public final void setEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton) this.getHInstance()).setEnabled(param0)");
            ((com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton) this.getHInstance()).setEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.SignInButton) this.getGInstance()).setEnabled(param0)");
            ((com.google.android.gms.common.SignInButton) this.getGInstance()).setEnabled(param0);
        }
    }
    
    /**
     * org.xms.g.common.SignInButton.setOnClickListener(android.view.View.OnClickListener) the setOnClickListener.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.setOnClickListener(android.view.View.OnClickListener): <a href="https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#setOnClickListener">https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#setOnClickListener</a><br/>
     * com.google.android.gms.common.SignInButton.setOnClickListener(android.view.View.OnClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-void-setonclicklistener-view.onclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-void-setonclicklistener-view.onclicklistener-listener</a><br/>
     *
     * @param param0 the OnClickListener
     */
    public final void setOnClickListener(android.view.View.OnClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton) this.getHInstance()).setOnClickListener(param0)");
            ((com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton) this.getHInstance()).setOnClickListener(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.SignInButton) this.getGInstance()).setOnClickListener(param0)");
            ((com.google.android.gms.common.SignInButton) this.getGInstance()).setOnClickListener(param0);
        }
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public final void setScopes(org.xms.g.common.api.Scope[] param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.common.SignInButton.setSize(int) Set the size of the button to use. The color and branding scheme will remain unchanged.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.setTheme(int): <a href="https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#setTheme">https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#setTheme</a><br/>
     * com.google.android.gms.common.SignInButton.setSize(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-void-setsize-int-buttonsize">https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-void-setsize-int-buttonsize</a><br/>
     *
     * @param param0 The size of the button to display, See SignInButton.ButtonSize
     */
    public final void setSize(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton) this.getHInstance()).setTheme(param0)");
            ((com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton) this.getHInstance()).setTheme(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.SignInButton) this.getGInstance()).setSize(param0)");
            ((com.google.android.gms.common.SignInButton) this.getGInstance()).setSize(param0);
        }
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public final void setStyle(int param0, int param1, org.xms.g.common.api.Scope[] param2) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.common.SignInButton.setStyle(int,int) Set the desired style of button to use. This will update the button to use the specified size and color scheme.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.setUIMode(int,int,int): <a href="https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#setUIMode">https://developer.huawei.com/consumer/en/doc/HMS-References/account-huaweiIdAuthButton#setUIMode</a><br/>
     * com.google.android.gms.common.SignInButton.setStyle(int, int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-void-setstyle-int-buttonsize,-int-colorscheme">https://developers.google.com/android/reference/com/google/android/gms/common/SignInButton#public-void-setstyle-int-buttonsize,-int-colorscheme</a><br/>
     *
     * @param param0 The size of the button to display. See SignInButton.ButtonSize
     * @param param1 The color scheme to use for the button. See SignInButton.ColorScheme
     */
    public final void setStyle(int param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            
            org.xms.g.utils.XmsLog.d("XMSRouter", "org.xms.g.common.SignInButton.setStyle(intint)");
            ((com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton) this.getHInstance()).setUIMode(param0, param1,
                    com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton.CORNER_RADIUS_MEDIUM);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.SignInButton) this.getGInstance()).setStyle(param0, param1)");
            ((com.google.android.gms.common.SignInButton) this.getGInstance()).setStyle(param0, param1);
        }
    }
    
    /**
     * org.xms.g.common.SignInButton.setGInstance(java.lang.Object) set the gms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 instance of gms
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
        this.removeAllViews();
        this.addView(((com.google.android.gms.common.SignInButton) gInstance));
        this.setClickable(true);
    }
    
    /**
     * org.xms.g.common.SignInButton.setHInstance(java.lang.Object) set the hms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 instance of hms
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
        this.removeAllViews();
        this.addView(((com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton) hInstance));
        this.setClickable(true);
    }
    
    /**
     * org.xms.g.common.SignInButton.getGInstance() get the gms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return instance of gms
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }
    
    /**
     * org.xms.g.common.SignInButton.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return instance of hms
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }
    
    /**
     * org.xms.g.common.SignInButton.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.SignInButton.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted SignInButton object
     */
    public static org.xms.g.common.SignInButton dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.SignInButton) param0);
    }
    
    /**
     * org.xms.g.common.SignInButton.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.hwid.ui.HuaweiIdAuthButton;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.SignInButton;
        }
    }
    
    /**
     * org.xms.g.common.SignInButton.wrapInst(org.xms.g.utils.XBox) constructor of org.xms.g.common.SignInButton.wrapInst with org.xms.g.utils.XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public org.xms.g.common.SignInButton wrapInst(org.xms.g.utils.XBox param0) {
        gInstance = param0.getGInstance();
        hInstance = param0.getHInstance();
        return this;
    }
}