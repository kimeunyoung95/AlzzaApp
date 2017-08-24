package org.sopt.alzza.application;

import android.app.Application;

import org.sopt.alzza.common.Constants;
import org.sopt.alzza.network.HttpService;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Taehoon Yoo
 * User  : NOEP
 * Date  : 2016. 6. 27.
 * Time  : 오후 9:35
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  :
 */
public class App extends Application {

    private static App instance;
    private Retrofit retrofit;
    private HttpService httpService;

    public static App getInstance() {
        return instance;
    }

    public HttpService getHttpService() {
        return httpService;
    }

    private Socket mSocket;
    {
        try {
            mSocket = IO.socket(Constants.CHAT_SERVER_URL);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public Socket getSocket() {
        return mSocket;
    }



    @Override
    public void onCreate() {

        super.onCreate();

        App.instance = this;

        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.API_SERVER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        httpService = retrofit.create(HttpService.class);


    }
}
