package ve.com.vr.rcvmovilc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TipoRegistroActivity extends AppCompatActivity {
    Button btnManual;
    Button btnQR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_registro);

        mpObtenerObjetos();
        mpEventos();
    }


    private void mpObtenerObjetos(){
        btnManual = (Button) findViewById(R.id.btnManual);
        btnQR = (Button) findViewById(R.id.btnQr);
    }

    private void mpEventos(){

        btnManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vIntent =  new Intent(TipoRegistroActivity.this, RegistroActivity.class );
                startActivity(vIntent);
            }
        });
        btnQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vIntent =  new Intent(TipoRegistroActivity.this, qrScanActivity.class);
                vIntent.putExtra("prmOptOrigen", "1");
                //String  a = getIntent().getExtras().getString("NOMBRE").toString();
                startActivity(vIntent);
            }
        });

    }



}
