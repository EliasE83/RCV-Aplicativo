package ve.com.vr.rcvmovilc.interfaces;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import ve.com.vr.rcvmovilc.model.LoginData;
import ve.com.vr.rcvmovilc.model.LoginResult;

public interface IGestiondeAcceso {

    @POST("/login.php")
    Call<LoginResult> mfLogin(@Body LoginData body);
}
