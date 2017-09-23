package com.rdc.relatoriodeconstrucao;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.rdc.relatoriodeconstrucao.database.Database;
import com.rdc.relatoriodeconstrucao.dominio.RepositorioRelatorio;
import com.rdc.relatoriodeconstrucao.dominio.entidades.Diario;

public class MainRdc extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    private ListView lstgaleria;
    private ArrayAdapter<Diario> adpRelatorio;

    private Database database;
    private SQLiteDatabase conn;
    private RepositorioRelatorio repositorioRelatorio;
    private Diario diario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_rdc);

        lstgaleria = (ListView)findViewById(R.id.lstgaleria);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lstgaleria.setOnItemClickListener(this);
        lstgaleria.setOnItemLongClickListener(this);

        try {

            database = new Database(this);
            conn = database.getWritableDatabase();

            repositorioRelatorio = new RepositorioRelatorio(conn);

            adpRelatorio = repositorioRelatorio.buscaRelatorios(this);

            lstgaleria.setAdapter(adpRelatorio);


        }catch(SQLException ex){

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Erro ao Criar o Banco" + ex.getMessage());
            dlg.setNeutralButton("OK", null);
            dlg.show();

        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainRdc.this, Relatorio.class);
                startActivity(it);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        adpRelatorio = repositorioRelatorio.buscaRelatorios(this);
        lstgaleria.setAdapter(adpRelatorio);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Diario diario = adpRelatorio.getItem(position);

        Intent it = new Intent(this, Relatorio.class);
        it.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        it.putExtra("DIARIO", diario);
        startActivityForResult(it, 0);
        finish();

    }


    //atributo da classe.
    private AlertDialog alerta;

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, final long id) {

        // TODO Auto-generated method stub

        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //define o titulo
        builder.setTitle("Excluir");
        //define a mensagem
        builder.setMessage("Deseja excluir o Relatório?");
        //define um botão como positivo
        builder.setIcon(R.drawable.lixeira);
        builder.setPositiveButton("Excluir", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {

                Diario diario = adpRelatorio.getItem(position);

                Intent it = new Intent(MainRdc.this, Relatorio.class);
                it.putExtra("DIARIO1", diario);
                startActivityForResult(it, 0);
                repositorioRelatorio.excluir(diario.getId());

            }
        });

        //define um botão como negativo.
        builder.setNegativeButton("Manter", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {

                Toast.makeText(MainRdc.this, "Relatório Salvo", Toast.LENGTH_SHORT).show();
            }
        });
        //cria o AlertDialog
        alerta = builder.create();
        //Exibe
        alerta.show();


        return true;

    }

}
