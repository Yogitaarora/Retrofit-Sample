package retrofit.techindustan.com.retrofitsample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import retrofit.techindustan.com.retrofitsample.R;
import retrofit.techindustan.com.retrofitsample.model.ProductPrice;
import retrofit.techindustan.com.retrofitsample.rest.ApiClient;
import retrofit.techindustan.com.retrofitsample.rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    // TODO - insert your themoviedb.org API KEY here
    private final static String AUTH_KEY = "33448899Favens99884433";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (AUTH_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please obtain your Auth KEY ", Toast.LENGTH_LONG).show();
            return;
        }
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<ProductPrice> call = apiService.getProductDetails(AUTH_KEY);
        call.enqueue(new Callback<ProductPrice>() {
            @Override
            public void onResponse(Call<ProductPrice> call, retrofit2.Response<ProductPrice> response) {
                Log.e(TAG, response.body().getStatus() + "");

            }

            @Override
            public void onFailure(Call<ProductPrice> call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
    }
}

