package code.test.promobi.di.module;

import android.util.Log;

import javax.inject.Singleton;

import code.test.promobi.data.rest.APIService;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Singleton
@Module(includes = ViewModelModule.class)
public class ApplicationModule {

    private static final String BASE_URL = "https://api.nytimes.com/svc/";

    @Singleton
    @Provides
    static Retrofit provideRetrofit() {
        HttpLoggingInterceptor loggingInterceptor;
        OkHttpClient okHttpClient;
        loggingInterceptor = new HttpLoggingInterceptor(message -> {
            Log.e("Retrofit", "message = " + message.toString());
        });
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);


        //okHttpClient = OkHttpClientHelper.getOkHttpClientHelper()
        okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();

        return new Retrofit.Builder().baseUrl(BASE_URL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    static APIService provideRetrofitService(Retrofit retrofit) {
        return retrofit.create(APIService.class);
    }
}
