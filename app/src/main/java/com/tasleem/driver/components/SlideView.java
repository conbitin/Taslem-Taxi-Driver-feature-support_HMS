package com.tasleem.driver.components;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;

import com.tasleem.driver.R;


/**
 * Created by elluminati on 20-May-17.
 */

public class SlideView extends RelativeLayout implements SeekBar.OnSeekBarChangeListener {

    protected Slider slider;
    protected Drawable slideBackground;
    protected Drawable buttonBackground;
    protected Drawable buttonImage;
    protected Drawable buttonImageDisabled;
    protected TextView slideTextView;
    protected LayerDrawable buttonLayers;
    protected ColorStateList slideBackgroundColor;
    protected ColorStateList buttonBackgroundColor;
    protected boolean animateSlideText;
    protected ImageView ivArrowImage;

    public SlideView(Context context) {
        super(context);
        init(null, 0);
    }

    public SlideView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public SlideView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public SlideView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs, defStyleAttr);
    }

    void init(AttributeSet attrs, int defStyle) {
        inflate(getContext(), R.layout.layout_slide_view, this);
        setBackground(ContextCompat.getDrawable(getContext(), R.drawable.slide_view_bg));
        slideTextView = findViewById(R.id.slideText);
        ivArrowImage = findViewById(R.id.ivArrowImage);
        slider = findViewById(R.id.slider);
        slider.setOnSeekBarChangeListener(this);
        slideBackground = getBackground();
        buttonLayers = (LayerDrawable) slider.getThumb();
        buttonBackground = buttonLayers.findDrawableByLayerId(R.id.buttonBackground);
        TypedArray a = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.SlideView, defStyle, defStyle);

        int strokeColor;
        String slideText;
        boolean reverseSlide;
        ColorStateList sliderTextColor;
        try {
            animateSlideText = a.getBoolean(R.styleable.SlideView_animateSlideText, true);
            reverseSlide = a.getBoolean(R.styleable.SlideView_reverseSlide, false);
            strokeColor = a.getColor(R.styleable.SlideView_strokeColor, ContextCompat.
                    getColor(getContext(), R.color.color_white));

            slideText = a.getString(R.styleable.SlideView_slideText);
            sliderTextColor = a.getColorStateList(R.styleable.SlideView_slideTextColor);

            setText(slideText);
            setTextColor(sliderTextColor == null ? slideTextView.getTextColors() : sliderTextColor);

            int buttonImageId = a.getResourceId(R.styleable.SlideView_buttonImage, R.mipmap.ic_launcher);
            setButtonImage(ContextCompat.getDrawable(getContext(), buttonImageId));
            setButtonImageDisabled(ContextCompat.getDrawable(getContext(), a.getResourceId(R.styleable.SlideView_buttonImageDisabled, buttonImageId)));

            setButtonBackgroundColor(a.getColorStateList(R.styleable.SlideView_buttonBackgroundColor));
            setSlideBackgroundColor(a.getColorStateList(R.styleable.SlideView_slideBackgroundColor));

            if (a.hasValue(R.styleable.SlideView_strokeColor)) {
                SliderUtil.setDrawableStroke(slideBackground, strokeColor);
            }
            if (reverseSlide) {
                slider.setRotation(180);
                LayoutParams params = ((LayoutParams) slideTextView.getLayoutParams());
                params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 0);
                params.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                    params.addRule(RelativeLayout.ALIGN_PARENT_END, 0);
                    params.addRule(RelativeLayout.ALIGN_PARENT_START);
                }
                slideTextView.setLayoutParams(params);
            }
        } finally {
            a.recycle();
        }
    }

    public void setTextColor(@ColorInt int color) {
        slideTextView.setTextColor(color);
    }

    public void setTextColor(ColorStateList colors) {
        slideTextView.setTextColor(colors);
    }

    public void setText(CharSequence text) {
        slideTextView.setText(text);
    }

    public void setButtonImage(Drawable image) {
        buttonImage = image;
        buttonLayers.setDrawableByLayerId(R.id.buttonImage, image);
    }

    public void setButtonImageDisabled(Drawable image) {
        buttonImageDisabled = image;
    }


    public void setButtonBackgroundColor(ColorStateList color) {
        buttonBackgroundColor = color;
        SliderUtil.setDrawableColor(buttonBackground, color.getDefaultColor());
    }


    public void setSlideBackgroundColor(ColorStateList color) {
        slideBackgroundColor = color;
        SliderUtil.setDrawableColor(slideBackground, color.getDefaultColor());
    }

    public Slider getSlider() {
        return slider;
    }

    public void setOnSlideCompleteListener(OnSlideCompleteListener listener) {
        slider.setOnSlideCompleteListenerInternal(listener, this);
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setEnabled(enabled);
        }
        buttonLayers.setDrawableByLayerId(R.id.buttonImage, enabled ? buttonImage : buttonImageDisabled == null ? buttonImage : buttonImageDisabled);
        SliderUtil.setDrawableColor(buttonBackground, buttonBackgroundColor.getColorForState(enabled ? new int[]{android.R.attr.state_enabled} : new int[]{-android.R.attr.state_enabled}, ContextCompat.getColor(getContext(), R.color.color_app_button)));
        SliderUtil.setDrawableColor(slideBackground, slideBackgroundColor.getColorForState(enabled ? new int[]{android.R.attr.state_enabled} : new int[]{-android.R.attr.state_enabled}, ContextCompat.getColor(getContext(), R.color.color_app_button)));
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (animateSlideText) {
            slideTextView.setAlpha(1 - (progress / 15f));
            ivArrowImage.setAlpha(1 - (progress / 90f));
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    public void setProgress(int i) {
        slider.setProgress(i);
    }

    public interface OnSlideCompleteListener {
        void onSlideComplete(SlideView slideView);
    }

}