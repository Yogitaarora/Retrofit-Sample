package retrofit.techindustan.com.retrofitsample.rest;

import retrofit.techindustan.com.retrofitsample.model.ProductPrice;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by android on 9/11/17.
 */

public interface ApiInterface {
  /*  @GET("movie/top_rated")
    Call<Response> getProductDetails(@Query("auth") String apiKey);*/

    @POST("products/list")
    Call<ProductPrice> getProductDetails(@Query("auth") String auth);

}