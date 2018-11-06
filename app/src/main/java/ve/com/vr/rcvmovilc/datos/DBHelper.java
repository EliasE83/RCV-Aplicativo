package ve.com.vr.rcvmovilc.datos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {


    public DBHelper(Context context) {
        super(context, ConstantesDB.DB_NAME, null, ConstantesDB.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ConstantesDB.TABLA_CONFIGURACIONES_CREATE_SQL);
        db.execSQL(ConstantesDB.TABLA_CLIENTES_CREATE_SQL);
        db.execSQL(ConstantesDB.TABLA_VEHICULOS_CREATE_SQL);
        db.execSQL(ConstantesDB.TABLA_CONTRATOS_CREATE_SQL);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (newVersion > oldVersion) {

        }
    }

}
