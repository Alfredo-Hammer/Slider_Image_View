package com.hammer67.autoimageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.SensorEventListener;
import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {

    SliderView sliderView;
    int[] images = {R.drawable.alabanza1, R.drawable.alabanza2, R.drawable.alabanza3,
            R.drawable.alabanza4, R.drawable.alabanza5, R.drawable.alabanza6};

    SliderApp sliderApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderView = findViewById(R.id.slider_view);

        //inicializamos el adapter
        sliderApp = new SliderApp(images);

        //asignamoss el adapter
        sliderView.setSliderAdapter(sliderApp);

        //Indicador de animacion
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);

        //Transformacion de animacion
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);

        //Inicio automatico
        sliderView.startAutoCycle();
    }
}