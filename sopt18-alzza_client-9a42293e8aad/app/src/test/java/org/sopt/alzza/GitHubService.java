package org.sopt.alzza;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Taehoon Yoo
 * User  : NOEP
 * Date  : 2016. 6. 30.
 * Time  : 오전 3:22
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  :
 */
public interface GitHubService {
    @GET("users/{user}")
    Call<Object> listRepos(@Path("user") String user);
}