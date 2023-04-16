package com.tasleem.driver;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.tasleem.driver.parse.ApiClient;
import com.tasleem.driver.parse.ApiInterface;
import com.tasleem.driver.utils.AppLog;
import com.tasleem.driver.utils.Const;
import com.tasleem.driver.utils.ServerConfig;
import com.tasleem.driver.utils.Utils;

import java.io.IOException;
import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MuscatPaymentActivity extends BaseAppCompatActivity {
    public static String ADD_CARD = "add_card_mobile";
    public static String ADD_AMOUNT_FOR_WALLET = "select_card_for_wallet_mobile";

    private WebView webViewTerms;
    private String actionType;
    private double amount;
    private String cardId;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscat_payment);
        initToolBar();

        actionType = getIntent().getStringExtra(Const.Params.ACTION_TYPE);
        amount = getIntent().getDoubleExtra(Const.Params.AMOUNT, 0.150);
        cardId = getIntent().getStringExtra(Const.Params.CUSTOMER_CARD_ID);

        initWebView();

        loadPaymentPageHtml();

        webViewTerms.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                AppLog.Log(TAG, url);
                // When success
                if (url.contains("ccav_payment_response_view")) {
                    setResult(RESULT_OK);
                    finish();
                } else if (url.contains(ServerConfig.BASE_URL + "provider_payments")) {
                    setResult(RESULT_OK);
                    finish();
                    // When failure
                } else if (url.contains("ccav_payment_failed")) {
                    setResult(RESULT_CANCELED);
                    finish();
                } else if (url.contains(ServerConfig.BASE_URL + "fail_stripe_intent_payment")) {
                    setResult(RESULT_CANCELED);
                    finish();
                }
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
    }

    private void initWebView() {
        webViewTerms = findViewById(R.id.webview);
        webViewTerms.getSettings().setLoadsImagesAutomatically(true);
        webViewTerms.getSettings().setDisplayZoomControls(false);
        webViewTerms.getSettings().setBuiltInZoomControls(true);
        webViewTerms.getSettings().setJavaScriptEnabled(true);
        webViewTerms.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webViewTerms.getSettings().setDomStorageEnabled(true);
    }

    private void loadPaymentPageHtml() {
        Utils.showCustomProgressDialog(this, getResources().getString(R.string.msg_waiting_for_add_card), false, null);
        HashMap<String, Object> map = new HashMap<>();
        map.put(Const.Params.PROVIDER_ID, preferenceHelper.getProviderId());
        map.put(Const.Params.TOKEN, preferenceHelper.getSessionToken());
        map.put(Const.Params.AMOUNT, amount);
        map.put(Const.Params.TYPE, Const.PROVIDER_UNIQUE_NUMBER);
        if (actionType.equals(ADD_CARD)) {
            setTitleOnToolbar(getResources().getString(R.string.text_add_new_card));
            map.put(Const.Params.ACTION_TYPE, ADD_CARD);
        } else if (actionType.equals(ADD_AMOUNT_FOR_WALLET)) {
            setTitleOnToolbar(getResources().getString(R.string.text_payments));
            map.put(Const.Params.ACTION_TYPE, ADD_AMOUNT_FOR_WALLET);
            map.put(Const.Params.CUSTOMER_CARD_ID, cardId);
        }

        Call<ResponseBody> call = ApiClient.getClient().create(ApiInterface.class).getMuscatBankSetupIntent(map);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Utils.hideCustomProgressDialog();
                if (response.isSuccessful()) {
                    try {
                        assert response.body() != null;
                        webViewTerms.loadDataWithBaseURL(null, response.body().string(), "text/html", "utf-8", null);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Utils.hideCustomProgressDialog();
                AppLog.handleThrowable(MuscatPaymentActivity.class.getSimpleName(), t);
            }
        });
    }

    @Override
    protected boolean isValidate() {
        return false;
    }

    @Override
    public void goWithBackArrow() {
        onBackPressed();
    }


    @Override
    public void onNetworkConnectionChanged(boolean isConnected) {

    }

    @Override
    public void onGpsConnectionChanged(boolean isConnected) {

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onAdminApproved() {

    }

    @Override
    public void onAdminDeclined() {

    }
}