package com.example.owner.donkicutesnoteweather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static Retrofit retrofit;
    @BindView(R.id.bt_get)
    Button btGet;
    @BindView(R.id.tv_city)
    TextView tvCity;
    @BindView(R.id.tv_humility)
    TextView tvHumility;
    @BindView(R.id.tv_tmin)
    TextView tvTmin;
    @BindView(R.id.tv_getHum)
    TextView tvGetHum;
    @BindView(R.id.tv_tmax)
    TextView tvTmax;
    @BindView(R.id.tv_getTmax)
    TextView tvGetTmax;
    @BindView(R.id.tv_getTmin)
    TextView tvGetTmin;
    @BindView(R.id.et_cityname)
    EditText etCityname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        if(retrofit==null){
//            retrofit = new Retrofit
//                    .Builder()
//                    .addConverterFactory(GsonConverterFactory.create())  // Json-.Jav
//                    .baseUrl("api.openweathermap.org/data/2.5/")     // url của server
//                    .build();
//        }
//        final WeatherService weatherService = retrofit.create(WeatherService.class);
//
//        btGet.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                weatherService.getInfWeather(etCityname.getText().toString(),"fab20df4688876b500a09614cbf5d2ee")
//                        .enqueue(new Callback<WeatherReq>() {
//                            @Override
//                            public void onResponse(Call<WeatherReq> call, Response<WeatherReq> response) {
//                                String inf = response.body().name;
//                                tvGetHum.setText(inf);
//                                //
//                                //
//                                //
//                                //
//                                //
//                                //
//                                //
//                            }
//
//                            @Override
//                            public void onFailure(Call<WeatherReq> call, Throwable t) {
//
//                            }
//                        });
//            }
//        });
    }

}
