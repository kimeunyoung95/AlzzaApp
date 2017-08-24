package org.sopt.alzza;

import org.junit.Test;
import org.sopt.alzza.model.Evaluation;
import org.sopt.alzza.network.HttpService;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {

    Retrofit retrofit;
    GitHubService service;
    HttpService httpService;

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void httpTest() {
        init();

        try {
            Response<Object> obj = service.listRepos("octocat").execute();
            System.out.println(obj.body());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void httpTest2() {
        init();
        service.listRepos("octocat").enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                System.out.println(response.body());
            }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {
                System.out.println("fail");

            }
        });

    }

    @Test
    public void test3 () {
        init2();

        try {
            Response<List<Evaluation>> response = httpService.getEvaluations(123l).execute();

            System.out.println(response.body().get(0));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
/*
    @Test
    public void signintest () {
        init2();

        try {
            Response<JSONObject> response = httpService.duplication("czxcxzc@naver.com").execute();
            System.out.println(response.code());
            System.out.println(response.body().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
*/

    public void init() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(GitHubService.class);

    }

    public void init2() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://188.166.181.182:3000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        httpService = retrofit.create(HttpService.class);

    }


}