package com.tasleem.driver.models.datamodels;

import androidx.annotation.Nullable;

import com.tasleem.driver.utils.Const;
import com.google.gson.annotations.SerializedName;

import org.xms.g.utils.GlobalEnvSetting;

public class AdminSettings {


    @SerializedName("image_base_url")
    private String imageBaseUrl;

    @SerializedName("is_show_estimation_in_provider_app")
    private boolean isShowEstimationInProviderApp;

    @SerializedName("admin_phone")
    private String adminPhone;

    @Nullable
    @SerializedName("android_provider_app_force_update")
    private boolean androidProviderAppForceUpdate;

    @Nullable
    @SerializedName("harmonyos_provider_app_force_update")
    private boolean harmonyosProviderAppForceUpdate;

    @SerializedName("stripe_publishable_key")
    private String stripePublishableKey;

    @SerializedName("contactUsEmail")
    private String contactUsEmail;

    @SerializedName("providerEmailVerification")
    private boolean providerEmailVerification;

    @SerializedName("is_provider_social_login")
    private boolean isProviderSocialLogin;

    @SerializedName("is_provider_initiate_trip")
    private boolean isProviderInitiateTrip;

    @SerializedName("twilio_number")
    private String twilioNumber;

    @SerializedName("android_provider_app_google_key")
    private String androidProviderAppGoogleKey;

    @SerializedName("android_places_autocomplete_key")
    private String androidPlacesAutoCompleteKey;

    @SerializedName("userEmailVerification")
    private boolean userEmailVerification;

    @SerializedName("providerPath")
    private boolean providerPath;

    @SerializedName("success")
    private boolean success;

    @SerializedName("providerSms")
    private boolean providerSms;

    @SerializedName("scheduledRequestPreStartMinute")
    private int scheduledRequestPreStartMinute;

    @Nullable
    @SerializedName("android_provider_app_version_code")
    private String androidProviderAppVersionCode;

    @Nullable
    @SerializedName("harmonyos_provider_app_version_code")
    private String harmonyosProviderAppVersionCode;

    @SerializedName("twilio_call_masking")
    private boolean twilioCallMasking;

    @SerializedName("terms_and_condition_url")
    private String termsAndConditionUrl;

    @SerializedName("privacy_policy_url")
    private String privacyPolicyUrl;

    @SerializedName("minimum_phone_number_length")
    private int minimumPhoneNumberLength = Const.PhoneNumber.MINIMUM_PHONE_NUMBER_LENGTH;

    @SerializedName("maximum_phone_number_length")
    private int maximumPhoneNumberLength = Const.PhoneNumber.MAXIMUM_PHONE_NUMBER_LENGTH;

    @SerializedName("referral_text_en")
    private String referralTextEn;

    @SerializedName("referral_text_ar")
    private String referralTextAr;

    @SerializedName("referral_link")
    private String referralLink;

    public boolean isShowEstimationInProviderApp() {
        return isShowEstimationInProviderApp;
    }

    public boolean isTwilioCallMasking() {
        return twilioCallMasking;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public boolean isAndroidProviderAppForceUpdate() {
        if (GlobalEnvSetting.isHms()) {
            return harmonyosProviderAppForceUpdate;
        } else {
            return androidProviderAppForceUpdate;
        }
    }

    public String getStripePublishableKey() {
        return stripePublishableKey;
    }

    public String getContactUsEmail() {
        return contactUsEmail;
    }

    public boolean isProviderEmailVerification() {
        return providerEmailVerification;
    }

    public boolean isIsProviderInitiateTrip() {
        return isProviderInitiateTrip;
    }

    public String getTwilioNumber() {
        return twilioNumber;
    }

    public String getAndroidProviderAppGoogleKey() {
        return androidProviderAppGoogleKey;
    }

    public boolean isProviderPath() {
        return providerPath;
    }

    public boolean isSuccess() {
        return success;
    }

    public boolean isProviderSms() {
        return providerSms;
    }

    public int getScheduledRequestPreStartMinute() {
        return scheduledRequestPreStartMinute;
    }

    public String getAndroidProviderAppVersionCode() {
        if (GlobalEnvSetting.isHms() && harmonyosProviderAppVersionCode != null ) {
            return harmonyosProviderAppVersionCode;
        } else {
            return androidProviderAppVersionCode;
        }
    }

    public String getImageBaseUrl() {
        return imageBaseUrl;
    }

    public String getAndroidPlacesAutoCompleteKey() {
        return androidPlacesAutoCompleteKey;
    }

    public String getTermsAndConditionUrl() {
        return termsAndConditionUrl;
    }

    public void setTermsAndConditionUrl(String termsAndConditionUrl) {
        this.termsAndConditionUrl = termsAndConditionUrl;
    }

    public String getPrivacyPolicyUrl() {
        return privacyPolicyUrl;
    }

    public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
    }

    public boolean isProviderSocialLogin() {
        return isProviderSocialLogin;
    }
    
    public int getMinimumPhoneNumberLength() {
        return minimumPhoneNumberLength;
    }

    public void setMinimumPhoneNumberLength(int minimumPhoneNumberLength) {
        this.minimumPhoneNumberLength = minimumPhoneNumberLength;
    }

    public int getMaximumPhoneNumberLength() {
        return maximumPhoneNumberLength;
    }

    public void setMaximumPhoneNumberLength(int maximumPhoneNumberLength) {
        this.maximumPhoneNumberLength = maximumPhoneNumberLength;
    }

    public boolean isHarmonyosProviderAppForceUpdate() {
        return harmonyosProviderAppForceUpdate;
    }

    @Nullable
    public String getHarmonyosProviderAppVersionCode() {
        return harmonyosProviderAppVersionCode;
    }

    public String getReferralTextEn() {
        return referralTextEn;
    }

    public String getReferralTextAr() {
        return referralTextAr;
    }

    public String getReferralLink() {
        return referralLink;
    }
}