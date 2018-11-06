package ve.com.vr.rcvmovilc;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import ve.com.vr.rcvmovilc.datos.ConfiguracionesDB;
import ve.com.vr.rcvmovilc.model.Configuracion;

public class splashActivity extends AppCompatActivity {
    private ConfiguracionesDB db;
    private static int SPLASH_TIME_OUT = 4000;
    private static String CODIGO_DE_REGISTRO = "0001";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /*Funcion Buena*/
        ImageView imageView = (ImageView) findViewById(R.id.imgLogo);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),  R.anim.fade);
        imageView.startAnimation(animation);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run(){
                Intent vIntent=null;
                db = new ConfiguracionesDB(getApplicationContext());

                //0001:Registro inicial de App
                if (db.mfValidarExistencia(CODIGO_DE_REGISTRO, "1")){
                    vIntent= new Intent(splashActivity.this, LoginActivity.class);
                }
                else{
                    vIntent= new Intent(splashActivity.this, TipoRegistroActivity.class);
                }

                if (vIntent !=null){
                    startActivity(vIntent);
                    finish();
                }
            }
        },SPLASH_TIME_OUT);
        /*Fin Funcion Buena*/

        //Para colocar una pagina web
        //WebView webView;
        //webView = (WebView) findViewById(R.id.webView);
        //webView.loadUrl("file:///android_asset/splash.html");
    }
}
