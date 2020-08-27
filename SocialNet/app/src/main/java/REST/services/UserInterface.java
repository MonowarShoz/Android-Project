package REST.services;


import com.Socialnet.Model.User;
import com.Socialnet.activity.LoginActivity;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface UserInterface {
    @POST("login")
    Call<Integer>signin(@Body LoginActivity.UserInfo userInfo);

    @GET("loadownprofile")
    Call<User> loadownProfile(@QueryMap Map<String,String> params);

}
