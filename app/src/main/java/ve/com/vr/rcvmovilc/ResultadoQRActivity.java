package ve.com.vr.rcvmovilc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONObject;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ve.com.vr.rcvmovilc.interfaces.IGestiondeAcceso;
import ve.com.vr.rcvmovilc.interfaces.RetrofitInterface;
import ve.com.vr.rcvmovilc.model.LoginData;
import ve.com.vr.rcvmovilc.model.LoginResult;

public class ResultadoQRActivity extends AppCompatActivity {

    EditText edtRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_qr);

        edtRes = (EditText) findViewById(R.id.edtRes);

        Integer vOpt= -1;
        String vValor="";

        vOpt = Integer.parseInt(getIntent().getExtras().getString("prmOptOrigen").toString());
       vValor = getIntent().getExtras().getString("prmValorOrigen").toString();

        mpProcesarQR(vOpt, vValor);
    }



    private void mpProcesarQR(Integer vpOpt, String vpValor){

        String vRuta = getString(R.string.urlApiBase);

        switch (vpOpt) {
            case 1:
                edtRes.setText(vpValor);
              /*
                OkHttpClient.Builder oktHttpClient = new OkHttpClient.Builder();
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(vRuta)
                        .client(oktHttpClient.build())
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                IGestiondeAcceso vServicio = retrofit.create(IGestiondeAcceso.class);
                Call<LoginResult> vCall = vServicio.mfLogin(new LoginData("",""));

                vCall.enqueue(new Callback<LoginResult>() {
                    @Override
                    public void onResponse(Call<LoginResult> vpCall, Response<LoginResult> vpResponse) {

                        if (vpResponse.isSuccessful()) {
                            Toast.makeText(getBaseContext(),vpResponse.body().getMessage(),Toast.LENGTH_SHORT).show();

                            //login();

                        } else {
                            try {
                                JSONObject jObjError = new JSONObject(vpResponse.errorBody().string());
                                Toast.makeText(getBaseContext(), jObjError.getString("message"), Toast.LENGTH_LONG).show();
                            } catch (Exception e) {
                                Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                    @Override
                    public void onFailure(Call<LoginResult> call, Throwable t) {
                        //Log.d(TAG, t.toString() +"-CAZ-"+ call.toString());
                        Toast.makeText(getBaseContext(),"Error " ,Toast.LENGTH_SHORT).show();
                    }
                });
*/
                break;
        }


    }
}
