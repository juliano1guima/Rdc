package com.rdc.relatoriodeconstrucao;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.itextpdf.text.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.rdc.relatoriodeconstrucao.database.Database;
import com.rdc.relatoriodeconstrucao.dominio.RepositorioRelatorio;
import com.rdc.relatoriodeconstrucao.dominio.entidades.Diario;
import com.rengwuxian.materialedittext.MaterialEditText;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import static android.graphics.Color.LTGRAY;

public class Relatorio extends AppCompatActivity {

    public MaterialEditText edtobra;
    public MaterialEditText edtconst;
    public MaterialEditText edtendereco;
    public MaterialEditText edtnumero;
    public MaterialEditText edtcidade;
    public MaterialEditText edtdatarel;
    public MaterialEditText edtdatainicio;
    public MaterialEditText edtdataentrega;
    public MaterialEditText edtcambet;
    public MaterialEditText edtbombconc;
    public MaterialEditText edtretroescavadeira;
    public MaterialEditText edtescavadeira;
    public MaterialEditText edtrolopneu;
    public MaterialEditText edtplataforma;
    public MaterialEditText edtacabadora;
    public MaterialEditText edtespargidor;
    public MaterialEditText edttandem;
    public MaterialEditText edtguindaste;
    public MaterialEditText edtpacarregadeira;
    public MaterialEditText edtbob;
    public MaterialEditText edtpatrol;
    public MaterialEditText edtcompactador;
    public MaterialEditText edtpipa;
    public MaterialEditText edtmunck;
    public MaterialEditText edtcacamba;
    public MaterialEditText edteng;
    public MaterialEditText edtassisteng;
    public MaterialEditText edtmestre;
    public MaterialEditText edtencforma;
    public MaterialEditText edtcarp;
    public MaterialEditText edtajudcarp;
    public MaterialEditText edtencarm;
    public MaterialEditText edtarm;
    public MaterialEditText edtajudarm;
    public MaterialEditText edtencped;
    public MaterialEditText edtped;
    public MaterialEditText edtajudped;
    public MaterialEditText edtencelet;
    public MaterialEditText edtelet;
    public MaterialEditText edtajudelet;
    public MaterialEditText edtencpint;
    public MaterialEditText edtpint;
    public MaterialEditText edtajudpint;
    public MaterialEditText edtencencanador;
    public MaterialEditText edtenc;
    public MaterialEditText edtajudenc;
    public MaterialEditText edtcomentariofoto1;
    public MaterialEditText edtcomentariofoto2;
    public MaterialEditText edtcomentariofoto3;
    public MaterialEditText edtcomentariofoto4;
    public MaterialEditText edtcomentariofoto5;
    public MaterialEditText edtcomentariofoto6;
    public MaterialEditText edtcomentariofoto7;
    public MaterialEditText edtcomentariofoto8;
    public MaterialEditText edtcomentariofoto9;
    public MaterialEditText edtcomentariofoto10;
    public MaterialEditText edtcomentariofoto11;
    public MaterialEditText edtcomentariofoto12;
    public MaterialEditText edtcomentariofoto13;
    public MaterialEditText edtcomentariofoto14;
    public MaterialEditText edtcomentariofoto15;
    public EditText edtfoco;

    public MaterialBetterSpinner spnestado;
    public MaterialBetterSpinner spncondclimatica1;
    public MaterialBetterSpinner spncondclimatica2;
    public MaterialBetterSpinner spnareaobra1;
    public MaterialBetterSpinner spnareaobra2;
    public MaterialBetterSpinner spnareaobra3;
    public MaterialBetterSpinner spnareaobra4;
    public MaterialBetterSpinner spnareaobra5;
    public MaterialBetterSpinner spnareaobra6;
    public MaterialBetterSpinner spnareaobra7;
    public MaterialBetterSpinner spnareaobra8;
    public MaterialBetterSpinner spnareaobra9;
    public MaterialBetterSpinner spnareaobra10;
    public MaterialBetterSpinner spnareaobra11;
    public MaterialBetterSpinner spnareaobra12;
    public MaterialBetterSpinner spnareaobra13;
    public MaterialBetterSpinner spnareaobra14;
    public MaterialBetterSpinner spnareaobra15;

    public ImageView imglogo;
    public ImageView imgfoto1;
    public ImageView imgfoto2;
    public ImageView imgfoto3;
    public ImageView imgfoto4;
    public ImageView imgfoto5;
    public ImageView imgfoto6;
    public ImageView imgfoto7;
    public ImageView imgfoto8;
    public ImageView imgfoto9;
    public ImageView imgfoto10;
    public ImageView imgfoto11;
    public ImageView imgfoto12;
    public ImageView imgfoto13;
    public ImageView imgfoto14;
    public ImageView imgfoto15;

    public Button btnfoto1;
    public Button btnfoto2;
    public Button btnfoto3;
    public Button btnfoto4;
    public Button btnfoto5;
    public Button btnfoto6;
    public Button btnfoto7;
    public Button btnfoto8;
    public Button btnfoto9;
    public Button btnfoto10;
    public Button btnfoto11;
    public Button btnfoto12;
    public Button btnfoto13;
    public Button btnfoto14;
    public Button btnfoto15;
    public Button btngaleria1;
    public Button btngaleria2;
    public Button btngaleria3;
    public Button btngaleria4;
    public Button btngaleria5;
    public Button btngaleria6;
    public Button btngaleria7;
    public Button btngaleria8;
    public Button btngaleria9;
    public Button btngaleria10;
    public Button btngaleria11;
    public Button btngaleria12;
    public Button btngaleria13;
    public Button btngaleria14;
    public Button btngaleria15;
    public Button btnexc1;
    public Button btnexc2;
    public Button btnexc3;
    public Button btnexc4;
    public Button btnexc5;
    public Button btnexc6;
    public Button btnexc7;
    public Button btnexc8;
    public Button btnexc9;
    public Button btnexc10;
    public Button btnexc11;
    public Button btnexc12;
    public Button btnexc13;
    public Button btnexc14;
    public Button btnexc15;
    public Button btnlogo;

    private Database database;
    private SQLiteDatabase conn;
    private RepositorioRelatorio repositorioRelatorio;
    private Diario diario;
    private Intent enviarDocumento;
    private OutputStream os;

    String localDaFoto1 = Environment.getExternalStorageDirectory() + "/DCIM" + "/RDC" + "/" + System.currentTimeMillis() + "1" + ".jpg";
    String localDaFoto2 = Environment.getExternalStorageDirectory() + "/DCIM" + "/RDC" + "/" + System.currentTimeMillis() + "2" + ".jpg";
    String localDaFoto3 = Environment.getExternalStorageDirectory() + "/DCIM" + "/RDC" + "/" + System.currentTimeMillis() + "3" + ".jpg";
    String localDaFoto4 = Environment.getExternalStorageDirectory() + "/DCIM" + "/RDC" + "/" + System.currentTimeMillis() + "4" + ".jpg";
    String localDaFoto5 = Environment.getExternalStorageDirectory() + "/DCIM" + "/RDC" + "/" + System.currentTimeMillis() + "5" + ".jpg";
    String localDaFoto6 = Environment.getExternalStorageDirectory() + "/DCIM" + "/RDC" + "/" + System.currentTimeMillis() + "6" + ".jpg";
    String localDaFoto7 = Environment.getExternalStorageDirectory() + "/DCIM" + "/RDC" + "/" + System.currentTimeMillis() + "7" + ".jpg";
    String localDaFoto8 = Environment.getExternalStorageDirectory() + "/DCIM" + "/RDC" + "/" + System.currentTimeMillis() + "8" + ".jpg";
    String localDaFoto9 = Environment.getExternalStorageDirectory() + "/DCIM" + "/RDC" + "/" + System.currentTimeMillis() + "9" + ".jpg";
    String localDaFoto10 = Environment.getExternalStorageDirectory() + "/DCIM" + "/RDC" + "/" + System.currentTimeMillis() + "10" + ".jpg";
    String localDaFoto11 = Environment.getExternalStorageDirectory() + "/DCIM" + "/RDC" + "/" + System.currentTimeMillis() + "11" + ".jpg";
    String localDaFoto12 = Environment.getExternalStorageDirectory() + "/DCIM" + "/RDC" + "/" + System.currentTimeMillis() + "12" + ".jpg";
    String localDaFoto13 = Environment.getExternalStorageDirectory() + "/DCIM" + "/RDC" + "/" + System.currentTimeMillis() + "13" + ".jpg";
    String localDaFoto14 = Environment.getExternalStorageDirectory() + "/DCIM" + "/RDC" + "/" + System.currentTimeMillis() + "14" + ".jpg";
    String localDaFoto15 = Environment.getExternalStorageDirectory() + "/DCIM" + "/RDC" + "/" + System.currentTimeMillis() + "15" + ".jpg";
    String localDalogo = Environment.getExternalStorageDirectory() + "/DCIM" + "/RDC" + "/" + System.currentTimeMillis() + "16" + ".jpg";

    public static final String FONT = "resources/fonts/FreeSans.ttf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio);

        edtobra = (MaterialEditText) findViewById(R.id.edtobra);
        edtconst = (MaterialEditText) findViewById(R.id.edtconst);
        edtendereco = (MaterialEditText) findViewById(R.id.edtendereco);
        edtnumero = (MaterialEditText) findViewById(R.id.edtnumero);
        edtcidade = (MaterialEditText) findViewById(R.id.edtcidade);
        edtdatarel = (MaterialEditText) findViewById(R.id.edtdatarel);
        edtdatainicio = (MaterialEditText) findViewById(R.id.edtdatainicio);
        edtdataentrega = (MaterialEditText) findViewById(R.id.edtdataentrega);
        edtcambet = (MaterialEditText) findViewById(R.id.edtcambet);
        edtbombconc = (MaterialEditText) findViewById(R.id.edtbombconc);
        edtretroescavadeira = (MaterialEditText) findViewById(R.id.edtretroescavadeira);
        edtescavadeira = (MaterialEditText) findViewById(R.id.edtescavadeira);
        edtrolopneu = (MaterialEditText) findViewById(R.id.edtrolopneu);
        edtplataforma = (MaterialEditText) findViewById(R.id.edtplataforma);
        edtacabadora = (MaterialEditText) findViewById(R.id.edtacabadora);
        edtespargidor = (MaterialEditText) findViewById(R.id.edtespargidor);
        edttandem = (MaterialEditText) findViewById(R.id.edttandem);
        edtguindaste = (MaterialEditText) findViewById(R.id.edtguindaste);
        edtpacarregadeira = (MaterialEditText) findViewById(R.id.edtpacarregadeira);
        edtbob = (MaterialEditText) findViewById(R.id.edtbob);
        edtpatrol = (MaterialEditText) findViewById(R.id.edtpatrol);
        edtcompactador = (MaterialEditText) findViewById(R.id.edtcompactador);
        edtpipa = (MaterialEditText) findViewById(R.id.edtpipa);
        edtmunck = (MaterialEditText) findViewById(R.id.edtmunck);
        edtcacamba = (MaterialEditText) findViewById(R.id.edtcacamba);
        edteng = (MaterialEditText) findViewById(R.id.edteng);
        edtassisteng = (MaterialEditText) findViewById(R.id.edtassisteng);
        edtmestre = (MaterialEditText) findViewById(R.id.edtmestre);
        edtencforma = (MaterialEditText) findViewById(R.id.edtencforma);
        edtcarp = (MaterialEditText) findViewById(R.id.edtcarp);
        edtajudcarp = (MaterialEditText) findViewById(R.id.edtajudcarp);
        edtencarm = (MaterialEditText) findViewById(R.id.edtencarm);
        edtarm = (MaterialEditText) findViewById(R.id.edtarm);
        edtajudarm = (MaterialEditText) findViewById(R.id.edtajudarm);
        edtencped = (MaterialEditText) findViewById(R.id.edtencped);
        edtped = (MaterialEditText) findViewById(R.id.edtped);
        edtajudped = (MaterialEditText) findViewById(R.id.edtajudped);
        edtencelet = (MaterialEditText) findViewById(R.id.edtencelet);
        edtelet = (MaterialEditText) findViewById(R.id.edtelet);
        edtajudelet = (MaterialEditText) findViewById(R.id.edtajudelet);
        edtencpint = (MaterialEditText) findViewById(R.id.edtencpint);
        edtpint = (MaterialEditText) findViewById(R.id.edtpint);
        edtajudpint = (MaterialEditText) findViewById(R.id.edtajudpint);
        edtencencanador = (MaterialEditText) findViewById(R.id.edtencencanador);
        edtenc = (MaterialEditText) findViewById(R.id.edtenc);
        edtajudenc = (MaterialEditText) findViewById(R.id.edtajudenc);
        edtcomentariofoto1 = (MaterialEditText) findViewById(R.id.edtcomentariofoto1a);
        edtcomentariofoto2 = (MaterialEditText) findViewById(R.id.edtcomentariofoto2);
        edtcomentariofoto3 = (MaterialEditText) findViewById(R.id.edtcomentariofoto3);
        edtcomentariofoto4 = (MaterialEditText) findViewById(R.id.edtcomentariofoto4);
        edtcomentariofoto5 = (MaterialEditText) findViewById(R.id.edtcomentariofoto5);
        edtcomentariofoto6 = (MaterialEditText) findViewById(R.id.edtcomentariofoto6);
        edtcomentariofoto7 = (MaterialEditText) findViewById(R.id.edtcomentariofoto7);
        edtcomentariofoto8 = (MaterialEditText) findViewById(R.id.edtcomentariofoto8);
        edtcomentariofoto9 = (MaterialEditText) findViewById(R.id.edtcomentariofoto9);
        edtcomentariofoto10 = (MaterialEditText) findViewById(R.id.edtcomentariofoto10);
        edtcomentariofoto11 = (MaterialEditText) findViewById(R.id.edtcomentariofoto11);
        edtcomentariofoto12 = (MaterialEditText) findViewById(R.id.edtcomentariofoto12);
        edtcomentariofoto13 = (MaterialEditText) findViewById(R.id.edtcomentariofoto13);
        edtcomentariofoto14 = (MaterialEditText) findViewById(R.id.edtcomentariofoto14);
        edtcomentariofoto15 = (MaterialEditText) findViewById(R.id.edtcomentariofoto15);
        edtfoco = (EditText) findViewById(R.id.edtfoco);

        spnestado = (MaterialBetterSpinner) findViewById(R.id.spnesatdo);
        spncondclimatica1 = (MaterialBetterSpinner) findViewById(R.id.spncondclimatica1);
        spncondclimatica2 = (MaterialBetterSpinner) findViewById(R.id.spncondclimatica2);
        spnareaobra1 = (MaterialBetterSpinner) findViewById(R.id.spnareaobra1);
        spnareaobra2 = (MaterialBetterSpinner) findViewById(R.id.spnareaobra2);
        spnareaobra3 = (MaterialBetterSpinner) findViewById(R.id.spnareaobra3);
        spnareaobra4 = (MaterialBetterSpinner) findViewById(R.id.spnareaobra4);
        spnareaobra5 = (MaterialBetterSpinner) findViewById(R.id.spnareaobra5);
        spnareaobra6 = (MaterialBetterSpinner) findViewById(R.id.spnareaobra6);
        spnareaobra7 = (MaterialBetterSpinner) findViewById(R.id.spnareaobra7);
        spnareaobra8 = (MaterialBetterSpinner) findViewById(R.id.spnareaobra8);
        spnareaobra9 = (MaterialBetterSpinner) findViewById(R.id.spnareaobra9);
        spnareaobra10 = (MaterialBetterSpinner) findViewById(R.id.spnareaobra10);
        spnareaobra11 = (MaterialBetterSpinner) findViewById(R.id.spnareaobra11);
        spnareaobra12 = (MaterialBetterSpinner) findViewById(R.id.spnareaobra12);
        spnareaobra13 = (MaterialBetterSpinner) findViewById(R.id.spnareaobra13);
        spnareaobra14 = (MaterialBetterSpinner) findViewById(R.id.spnareaobra14);
        spnareaobra15 = (MaterialBetterSpinner) findViewById(R.id.spnareaobra15);

        imgfoto1 = (ImageView) findViewById( R.id.imgfoto1);
        imgfoto2 = (ImageView) findViewById( R.id.imgfoto2);
        imgfoto3 = (ImageView) findViewById( R.id.imgfoto3);
        imgfoto4 = (ImageView) findViewById( R.id.imgfoto4);
        imgfoto5 = (ImageView) findViewById( R.id.imgfoto5);
        imgfoto6 = (ImageView) findViewById( R.id.imgfoto6);
        imgfoto7 = (ImageView) findViewById( R.id.imgfoto7);
        imgfoto8 = (ImageView) findViewById( R.id.imgfoto8);
        imgfoto9 = (ImageView) findViewById( R.id.imgfoto9);
        imgfoto10 = (ImageView) findViewById( R.id.imgfoto10);
        imgfoto11 = (ImageView) findViewById( R.id.imgfoto11);
        imgfoto12 = (ImageView) findViewById( R.id.imgfoto12);
        imgfoto13 = (ImageView) findViewById( R.id.imgfoto13);
        imgfoto14 = (ImageView) findViewById( R.id.imgfoto14);
        imgfoto15 = (ImageView) findViewById( R.id.imgfoto15);
        imglogo = (ImageView) findViewById( R.id.imglogo);

        btnfoto1 = (Button) findViewById(R.id.btnfoto1);
        btnfoto2 = (Button) findViewById(R.id.btnfoto2);
        btnfoto3 = (Button) findViewById(R.id.btnfoto3);
        btnfoto4 = (Button) findViewById(R.id.btnfoto4);
        btnfoto5 = (Button) findViewById(R.id.btnfoto5);
        btnfoto6 = (Button) findViewById(R.id.btnfoto6);
        btnfoto7 = (Button) findViewById(R.id.btnfoto7);
        btnfoto8 = (Button) findViewById(R.id.btnfoto8);
        btnfoto9 = (Button) findViewById(R.id.btnfoto9);
        btnfoto10 = (Button) findViewById(R.id.btnfoto10);
        btnfoto11 = (Button) findViewById(R.id.btnfoto11);
        btnfoto12 = (Button) findViewById(R.id.btnfoto12);
        btnfoto13 = (Button) findViewById(R.id.btnfoto13);
        btnfoto14 = (Button) findViewById(R.id.btnfoto14);
        btnfoto15 = (Button) findViewById(R.id.btnfoto15);
        btngaleria1 = (Button) findViewById(R.id.btngaleria1);
        btngaleria2 = (Button) findViewById(R.id.btngaleria2);
        btngaleria3 = (Button) findViewById(R.id.btngaleria3);
        btngaleria4 = (Button) findViewById(R.id.btngaleria4);
        btngaleria5 = (Button) findViewById(R.id.btngaleria5);
        btngaleria6 = (Button) findViewById(R.id.btngaleria6);
        btngaleria7 = (Button) findViewById(R.id.btngaleria7);
        btngaleria8 = (Button) findViewById(R.id.btngaleria8);
        btngaleria9 = (Button) findViewById(R.id.btngaleria9);
        btngaleria10 = (Button) findViewById(R.id.btngaleria10);
        btngaleria11 = (Button) findViewById(R.id.btngaleria11);
        btngaleria12 = (Button) findViewById(R.id.btngaleria12);
        btngaleria13 = (Button) findViewById(R.id.btngaleria13);
        btngaleria14 = (Button) findViewById(R.id.btngaleria14);
        btngaleria15 = (Button) findViewById(R.id.btngaleria15);
        btnexc1 = (Button) findViewById(R.id.btnexc1);
        btnexc2 = (Button) findViewById(R.id.btnexc2);
        btnexc3 = (Button) findViewById(R.id.btnexc3);
        btnexc4 = (Button) findViewById(R.id.btnexc4);
        btnexc5 = (Button) findViewById(R.id.btnexc5);
        btnexc6 = (Button) findViewById(R.id.btnexc6);
        btnexc7 = (Button) findViewById(R.id.btnexc7);
        btnexc8 = (Button) findViewById(R.id.btnexc8);
        btnexc9 = (Button) findViewById(R.id.btnexc9);
        btnexc10 = (Button) findViewById(R.id.btnexc10);
        btnexc11 = (Button) findViewById(R.id.btnexc11);
        btnexc12 = (Button) findViewById(R.id.btnexc12);
        btnexc13 = (Button) findViewById(R.id.btnexc13);
        btnexc14 = (Button) findViewById(R.id.btnexc14);
        btnexc15 = (Button) findViewById(R.id.btnexc15);
        btnlogo = (Button) findViewById(R.id.btnlogo);

        edtfoco.setInputType(0);
        edtdatarel.setInputType(0);
        edtdatainicio.setInputType(0);
        edtdataentrega.setInputType(0);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Drawable d = getResources().getDrawable(R.drawable.logo3);
        BitmapDrawable bitDw = ((BitmapDrawable) d);
        Bitmap bmp = bitDw.getBitmap();
        imglogo.setImageBitmap(bmp);

        ArrayAdapter<String> adpcargo1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item);
        adpcargo1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnestado.setAdapter(adpcargo1);

        ArrayAdapter<String> adpcargo2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item);
        adpcargo2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spncondclimatica1.setAdapter(adpcargo2);

        ArrayAdapter<String> adpcargo3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item);
        adpcargo3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spncondclimatica2.setAdapter(adpcargo3);

        ArrayAdapter<String> adpcargo4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item);
        adpcargo4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnareaobra1.setAdapter(adpcargo4);
        spnareaobra2.setAdapter(adpcargo4);
        spnareaobra3.setAdapter(adpcargo4);
        spnareaobra4.setAdapter(adpcargo4);
        spnareaobra5.setAdapter(adpcargo4);
        spnareaobra6.setAdapter(adpcargo4);
        spnareaobra7.setAdapter(adpcargo4);
        spnareaobra8.setAdapter(adpcargo4);
        spnareaobra9.setAdapter(adpcargo4);
        spnareaobra10.setAdapter(adpcargo4);
        spnareaobra11.setAdapter(adpcargo4);
        spnareaobra12.setAdapter(adpcargo4);
        spnareaobra13.setAdapter(adpcargo4);
        spnareaobra14.setAdapter(adpcargo4);
        spnareaobra15.setAdapter(adpcargo4);

        adpcargo1.add("");
        adpcargo1.add("AC");
        adpcargo1.add("AL");
        adpcargo1.add("AM");
        adpcargo1.add("AP");
        adpcargo1.add("BA");
        adpcargo1.add("CE");
        adpcargo1.add("DF");
        adpcargo1.add("ES");
        adpcargo1.add("GO");
        adpcargo1.add("MA");
        adpcargo1.add("MG");
        adpcargo1.add("MS");
        adpcargo1.add("MT");
        adpcargo1.add("PA");
        adpcargo1.add("PB");
        adpcargo1.add("PI");
        adpcargo1.add("PR");
        adpcargo1.add("PE");
        adpcargo1.add("RJ");
        adpcargo1.add("RN");
        adpcargo1.add("RO");
        adpcargo1.add("RR");
        adpcargo1.add("RS");
        adpcargo1.add("SC");
        adpcargo1.add("SE");
        adpcargo1.add("SP");
        adpcargo1.add("TO");

        adpcargo2.add("");
        adpcargo2.add("Sol");
        adpcargo2.add("Chuva");
        adpcargo2.add("Nublado");

        adpcargo3.add("");
        adpcargo3.add("Sol");
        adpcargo3.add("Chuva");
        adpcargo3.add("Nublado");

        adpcargo4.add("");
        adpcargo4.add("Fundações");
        adpcargo4.add("Estruturas");
        adpcargo4.add("Armações");
        adpcargo4.add("Paredes e Reboco");
        adpcargo4.add("Concreto");
        adpcargo4.add("Telhados e Forros");
        adpcargo4.add("Instalações Hidrossanitárias");
        adpcargo4.add("Instalações Elétricas");
        adpcargo4.add("Instalações Complementares");
        adpcargo4.add("Acabamentos");
        adpcargo4.add("Esquadrias");
        adpcargo4.add("Pinturas e Texturas");
        adpcargo4.add("Louças e Metais");
        adpcargo4.add("Jardins e Áreas externas");
        adpcargo4.add("Limpeza Final");
        adpcargo4.add("Outros");

        Bundle bundle = getIntent().getExtras();

        if ((bundle != null) && (bundle.containsKey("DIARIO1"))) {

            diario = (Diario) bundle.getSerializable("DIARIO1");
            excluir();
            finish();
        }


        if ((bundle != null) && (bundle.containsKey("DIARIO"))) {

            diario = (Diario) bundle.getSerializable("DIARIO");
            preenchedados();

        } else
            diario = new Diario();

        try {

            database = new Database(this);
            conn = database.getWritableDatabase();

            repositorioRelatorio = new RepositorioRelatorio(conn);


        } catch (SQLException ex) {

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Erro ao Criar o Banco" + ex.getMessage());
            dlg.setNeutralButton("OK", null);
            dlg.show();

        }

        ExibeDataListener listener = new ExibeDataListener();
        edtdatarel.setOnClickListener(listener);
        edtdatarel.setOnFocusChangeListener(listener);

        ExibeDataListener2 listener1 = new ExibeDataListener2();
        edtdatainicio.setOnClickListener(listener1);
        edtdatainicio.setOnFocusChangeListener(listener1);

        ExibeDataListener3 listener2 = new ExibeDataListener3();
        edtdataentrega.setOnClickListener(listener2);
        edtdataentrega.setOnFocusChangeListener(listener2);


        btnfoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                File arquivo = new File(localDaFoto1);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);
                startActivityForResult(cameraIntent, 0);

            }
        });

        btngaleria1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto1);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);
                startActivityForResult(cameraIntent, 1);


            }
        });

        btnexc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable d = getResources().getDrawable(R.drawable.semreg);
                BitmapDrawable bitDw = ((BitmapDrawable) d);
                Bitmap bmp = bitDw.getBitmap();
                diario.setFoto1(null);
                imgfoto1.setImageBitmap(bmp);

            }
        });

        btnfoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto2);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent("android.media.action.IMAGE_CAPTURE");
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);
                startActivityForResult(cameraIntent, 2);

            }
        });

        btngaleria2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto2);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);

                startActivityForResult(cameraIntent, 3);
            }
        });

        btnexc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable d = getResources().getDrawable(R.drawable.semreg);
                BitmapDrawable bitDw = ((BitmapDrawable) d);
                Bitmap bmp = bitDw.getBitmap();
                diario.setFoto2(null);
                imgfoto2.setImageBitmap(bmp);

            }
        });

        btnfoto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto3);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent("android.media.action.IMAGE_CAPTURE");
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);
                startActivityForResult(cameraIntent, 4);

            }
        });

        btngaleria3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto3);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);

                startActivityForResult(cameraIntent, 5);
            }
        });

        btnexc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable d = getResources().getDrawable(R.drawable.semreg);
                BitmapDrawable bitDw = ((BitmapDrawable) d);
                Bitmap bmp = bitDw.getBitmap();
                diario.setFoto3(null);
                imgfoto3.setImageBitmap(bmp);

            }
        });

        btnfoto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto4);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent("android.media.action.IMAGE_CAPTURE");
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);
                startActivityForResult(cameraIntent, 6);

            }
        });

        btngaleria4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto4);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);

                startActivityForResult(cameraIntent, 7);
            }
        });

        btnexc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable d = getResources().getDrawable(R.drawable.semreg);
                BitmapDrawable bitDw = ((BitmapDrawable) d);
                Bitmap bmp = bitDw.getBitmap();
                diario.setFoto4(null);
                imgfoto4.setImageBitmap(bmp);

            }
        });

        btnfoto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto5);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent("android.media.action.IMAGE_CAPTURE");
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);
                startActivityForResult(cameraIntent, 8);


            }
        });

        btngaleria5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto5);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);

                startActivityForResult(cameraIntent, 9);
            }
        });

        btnexc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable d = getResources().getDrawable(R.drawable.semreg);
                BitmapDrawable bitDw = ((BitmapDrawable) d);
                Bitmap bmp = bitDw.getBitmap();
                diario.setFoto5(null);
                imgfoto5.setImageBitmap(bmp);

            }
        });

        btnfoto6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto6);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent("android.media.action.IMAGE_CAPTURE");
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);
                startActivityForResult(cameraIntent, 10);


            }
        });

        btngaleria6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto6);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);

                startActivityForResult(cameraIntent, 11);
            }
        });

        btnexc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable d = getResources().getDrawable(R.drawable.semreg);
                BitmapDrawable bitDw = ((BitmapDrawable) d);
                Bitmap bmp = bitDw.getBitmap();
                diario.setFoto6(null);
                imgfoto6.setImageBitmap(bmp);

            }
        });

        btnfoto7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto7);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent("android.media.action.IMAGE_CAPTURE");
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);
                startActivityForResult(cameraIntent, 12);


            }
        });

        btngaleria7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto7);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);

                startActivityForResult(cameraIntent, 13);
            }
        });

        btnexc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable d = getResources().getDrawable(R.drawable.semreg);
                BitmapDrawable bitDw = ((BitmapDrawable) d);
                Bitmap bmp = bitDw.getBitmap();
                diario.setFoto7(null);
                imgfoto7.setImageBitmap(bmp);

            }
        });

        btnfoto8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto8);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent("android.media.action.IMAGE_CAPTURE");
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);
                startActivityForResult(cameraIntent, 14);


            }
        });

        btngaleria8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto8);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);

                startActivityForResult(cameraIntent, 15);
            }
        });

        btnexc8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable d = getResources().getDrawable(R.drawable.semreg);
                BitmapDrawable bitDw = ((BitmapDrawable) d);
                Bitmap bmp = bitDw.getBitmap();
                diario.setFoto8(null);
                imgfoto8.setImageBitmap(bmp);

            }
        });

        btnfoto9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto9);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent("android.media.action.IMAGE_CAPTURE");
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);
                startActivityForResult(cameraIntent, 16);


            }
        });

        btngaleria9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto9);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);

                startActivityForResult(cameraIntent, 17);
            }
        });

        btnexc9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable d = getResources().getDrawable(R.drawable.semreg);
                BitmapDrawable bitDw = ((BitmapDrawable) d);
                Bitmap bmp = bitDw.getBitmap();
                diario.setFoto9(null);
                imgfoto9.setImageBitmap(bmp);

            }
        });

        btnfoto10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto10);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent("android.media.action.IMAGE_CAPTURE");
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);
                startActivityForResult(cameraIntent, 18);


            }
        });

        btngaleria10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto10);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);

                startActivityForResult(cameraIntent, 19);
            }
        });

        btnexc10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable d = getResources().getDrawable(R.drawable.semreg);
                BitmapDrawable bitDw = ((BitmapDrawable) d);
                Bitmap bmp = bitDw.getBitmap();
                diario.setFoto10(null);
                imgfoto10.setImageBitmap(bmp);

            }
        });

        btnfoto11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto11);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent("android.media.action.IMAGE_CAPTURE");
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);
                startActivityForResult(cameraIntent, 20);


            }
        });

        btngaleria11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto11);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);

                startActivityForResult(cameraIntent, 21);
            }
        });

        btnexc11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable d = getResources().getDrawable(R.drawable.semreg);
                BitmapDrawable bitDw = ((BitmapDrawable) d);
                Bitmap bmp = bitDw.getBitmap();
                diario.setFoto11(null);
                imgfoto11.setImageBitmap(bmp);

            }
        });

        btnfoto12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto12);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent("android.media.action.IMAGE_CAPTURE");
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);
                startActivityForResult(cameraIntent, 22);


            }
        });

        btngaleria12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto12);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);

                startActivityForResult(cameraIntent, 23);
            }
        });

        btnexc12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable d = getResources().getDrawable(R.drawable.semreg);
                BitmapDrawable bitDw = ((BitmapDrawable) d);
                Bitmap bmp = bitDw.getBitmap();
                diario.setFoto12(null);
                imgfoto12.setImageBitmap(bmp);

            }
        });

        btnfoto13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto13);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent("android.media.action.IMAGE_CAPTURE");
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);
                startActivityForResult(cameraIntent, 24);


            }
        });

        btngaleria13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto13);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);

                startActivityForResult(cameraIntent, 25);
            }
        });

        btnexc13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable d = getResources().getDrawable(R.drawable.semreg);
                BitmapDrawable bitDw = ((BitmapDrawable) d);
                Bitmap bmp = bitDw.getBitmap();
                diario.setFoto13(null);
                imgfoto13.setImageBitmap(bmp);

            }
        });

        btnfoto14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto14);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent("android.media.action.IMAGE_CAPTURE");
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);
                startActivityForResult(cameraIntent, 26);


            }
        });

        btngaleria14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto14);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);

                startActivityForResult(cameraIntent, 27);
            }
        });

        btnexc14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable d = getResources().getDrawable(R.drawable.semreg);
                BitmapDrawable bitDw = ((BitmapDrawable) d);
                Bitmap bmp = bitDw.getBitmap();
                diario.setFoto14(null);
                imgfoto14.setImageBitmap(bmp);

            }
        });

        btnfoto15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto15);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent("android.media.action.IMAGE_CAPTURE");
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);
                startActivityForResult(cameraIntent, 28);


            }
        });

        btngaleria15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDaFoto15);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);

                startActivityForResult(cameraIntent, 29);
            }
        });

        btnexc15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable d = getResources().getDrawable(R.drawable.semreg);
                BitmapDrawable bitDw = ((BitmapDrawable) d);
                Bitmap bmp = bitDw.getBitmap();
                diario.setFoto15(null);
                imgfoto15.setImageBitmap(bmp);

            }
        });

        btnlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File arquivo = new File(localDalogo);
                Uri localFotoUri = Uri.fromFile(arquivo);

                Intent cameraIntent = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, localFotoUri);

                startActivityForResult(cameraIntent, 30);
            }
        });



    }



    private void exibedata() {

        Calendar calendar = Calendar.getInstance();

        int ano = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dlg = new DatePickerDialog(this, new SelecionaDataListener(), ano, mes, dia);
        dlg.show();

    }

    private void exibedata2() {

        Calendar calendar = Calendar.getInstance();

        int ano = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dlg = new DatePickerDialog(this, new SelecionaDataListener2(), ano, mes, dia);
        dlg.show();

    }

    private void exibedata3() {

        Calendar calendar = Calendar.getInstance();

        int ano = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dlg = new DatePickerDialog(this, new SelecionaDataListener3(), ano, mes, dia);
        dlg.show();

    }

    private class ExibeDataListener implements View.OnClickListener, View.OnFocusChangeListener {


        @Override
        public void onClick(View v) {

            exibedata();
        }

        @Override
        public void onFocusChange(View v, boolean hasFocus) {

            if (hasFocus)
                exibedata();

        }

    }

    private class ExibeDataListener2 implements View.OnClickListener, View.OnFocusChangeListener {


        @Override
        public void onClick(View v) {

            exibedata2();
        }

        @Override
        public void onFocusChange(View v, boolean hasFocus) {

            if (hasFocus)
                exibedata2();

        }

    }

    private class ExibeDataListener3 implements View.OnClickListener, View.OnFocusChangeListener {


        @Override
        public void onClick(View v) {

            exibedata3();
        }

        @Override
        public void onFocusChange(View v, boolean hasFocus) {

            if (hasFocus)
                exibedata3();

        }

    }


    private class SelecionaDataListener implements DatePickerDialog.OnDateSetListener {


        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

            Calendar calendar = Calendar.getInstance();
            calendar.set(year, monthOfYear, dayOfMonth);
            Date data = calendar.getTime();

            DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
            String dt = format.format(data);

            edtdatarel.setText(dt);
            //diario.setData(data);

        }
    }

    private class SelecionaDataListener2 implements DatePickerDialog.OnDateSetListener {


        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

            Calendar calendar = Calendar.getInstance();
            calendar.set(year, monthOfYear, dayOfMonth);
            Date data = calendar.getTime();

            DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
            String dt = format.format(data);

            edtdatainicio.setText(dt);
            //diario.setData(data);

        }
    }

    private class SelecionaDataListener3 implements DatePickerDialog.OnDateSetListener {


        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

            Calendar calendar = Calendar.getInstance();
            calendar.set(year, monthOfYear, dayOfMonth);
            Date data = calendar.getTime();

            DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
            String dt = format.format(data);

            edtdataentrega.setText(dt);
            //diario.setData(data);

        }
    }

    @Override
    public void onBackPressed() {

        salvar1();

        Intent it = new Intent(Relatorio.this, MainRdc.class);
        it.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(it);
        finish();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.principal, menu);

        if (diario.getId() != 0) ;
        menu.getItem(0).setVisible(true);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.mni_acao1:

                exemplo_simples();

                break;

            case R.id.mni_acao2:

                salvar();
                try {
                    gerapdf();
                } catch (DocumentException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Intent it = new Intent(Relatorio.this, MainRdc.class);
                startActivity(it);

                enviardocumento();
                finish();
                Toast.makeText(Relatorio.this, "Relatório Pronto", Toast.LENGTH_SHORT).show();

                break;

            case R.id.mni_acao3:

                salvar1();
                Toast.makeText(Relatorio.this, "Dados Salvos", Toast.LENGTH_SHORT).show();

                break;

        }

        return super.onOptionsItemSelected(item);
    }

    private void gerapdf() throws DocumentException, IOException {

        String FILE = Environment.getExternalStorageDirectory().toString() + "/PDF/" + "rdc.pdf";
        Document doc = new Document(PageSize.A4, 10, 10, 10, 10);
        String root = Environment.getExternalStorageDirectory().toString();
        File myDir = new File(root + "/PDF");
        myDir.mkdirs();

        PdfWriter.getInstance(doc, new FileOutputStream(FILE));


        doc.open();

        Font a = new Font(Font.FontFamily.HELVETICA, 10);
        Font b = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, new BaseColor(50, 70, 30));
        Font g = FontFactory.getFont(FontFactory.TIMES_ROMAN, 14, Font.BOLD);
        Font h = FontFactory.getFont(FontFactory.TIMES_ROMAN, 22, Font.BOLD);



        PdfPTable table100 = new PdfPTable(new float[]{0.3f, 0.7f});
        table100.setWidthPercentage(100.0f);
        table100.setSpacingBefore(0);
        table100.setSpacingAfter(20);
        table100.setHorizontalAlignment(Element.ALIGN_CENTER);

        BitmapDrawable drawable1 = (BitmapDrawable) imglogo.getDrawable();
        Bitmap bitmap1 = drawable1.getBitmap();

        ByteArrayOutputStream stream1 = new ByteArrayOutputStream();
        bitmap1.compress(Bitmap.CompressFormat.JPEG, 100, stream1);
        byte[] imageInByte1 = stream1.toByteArray();
        Image image1 = Image.getInstance(imageInByte1);
        table100.addCell(image1);
        PdfPCell header100 = new PdfPCell(new Paragraph("\n Relatório de Obra \n"+ "Construtor: " + String.valueOf(edtconst.getText()), h));
        header100.setVerticalAlignment(Element.ALIGN_CENTER);
        header100.setHorizontalAlignment(Element.ALIGN_CENTER);
        header100.setColspan(2);
        table100.addCell(header100);
        doc.add(table100);

        PdfPTable table50 = new PdfPTable(new float[]{0.50f, 0.50f});
        table50.setWidthPercentage(100.0f);
        table50.setHorizontalAlignment(Element.ALIGN_LEFT);

        table50.addCell(getTextbranco("Dados da Obra", null, 10));
        table50.addCell(getTextbranco("", null, 10));
        table50.addCell("Obra:   " + String.valueOf(edtobra.getText()));
        table50.addCell("Construtor:   " + String.valueOf(edtconst.getText()));
        doc.add(table50);

        PdfPTable table51 = new PdfPTable(new float[]{0.50f, 0.13f, 0.22f, 0.15f});
        table51.setWidthPercentage(100.0f);
        table51.setHorizontalAlignment(Element.ALIGN_LEFT);

        table51.addCell("Rua:   " + String.valueOf(edtendereco.getText()));
        table51.addCell("Nº:   " + String.valueOf(edtnumero.getText()));
        table51.addCell("Cidade:   " + String.valueOf(edtcidade.getText()));
        table51.addCell("Estado:   " + String.valueOf(spnestado.getText()));
        doc.add(table51);

        PdfPTable table52 = new PdfPTable(new float[]{0.50f, 0.50f});
        table52.setWidthPercentage(100.0f);
        table52.setSpacingBefore(20);
        table52.setHorizontalAlignment(Element.ALIGN_LEFT);

        table52.addCell(getTextbranco("Dados do Relatório", null, 10));
        table52.addCell(getTextbranco("", null, 10));
        table52.addCell("Condição Climática - Manhã :   " + String.valueOf(spncondclimatica1.getText()));
        table52.addCell("Condição Climática - Tarde :   " + String.valueOf(spncondclimatica2.getText()));
        doc.add(table52);

        PdfPTable table53 = new PdfPTable(new float[]{0.33f, 0.33f, 0.34f});
        table53.setWidthPercentage(100.0f);
        table53.setHorizontalAlignment(Element.ALIGN_LEFT);

        table53.addCell("Data do Relatório:   " + String.valueOf(edtdatarel.getText()));
        table53.addCell("Início da Obra:   " + String.valueOf(edtdatainicio.getText()));
        table53.addCell("Entrega da Obra:   " + String.valueOf(edtdataentrega.getText()));
        doc.add(table53);

        PdfPTable table54 = new PdfPTable(new float[]{0.50f, 0.50f});
        table54.setWidthPercentage(100.0f);
        table54.setSpacingBefore(20);
        table54.setHorizontalAlignment(Element.ALIGN_LEFT);

        table54.addCell(getTextbranco("Máquinas em Obra", null, 10));
        table54.addCell(getTextbranco("", null, 10));
        doc.add(table54);

        PdfPTable table55 = new PdfPTable(new float[]{0.20f, 0.05f, 0.20f, 0.05f, 0.20f, 0.05f, 0.20f, 0.05f});
        table55.setWidthPercentage(100.0f);
        table55.setHorizontalAlignment(Element.ALIGN_LEFT);

        table55.addCell(getTextqtd("Descrição", null, 10));
        table55.addCell(getTextqtd("Qtd.", null, 10));
        table55.addCell(getTextqtd("Descrição", null, 10));
        table55.addCell(getTextqtd("Qtd.", null, 10));
        table55.addCell(getTextqtd("Descrição", null, 10));
        table55.addCell(getTextqtd("Qtd.", null, 10));
        table55.addCell(getTextqtd("Descrição", null, 10));
        table55.addCell(getTextqtd("Qtd.", null, 10));
        doc.add(table55);

        PdfPTable table56 = new PdfPTable(new float[]{0.20f, 0.05f, 0.20f, 0.05f, 0.20f, 0.05f, 0.20f, 0.05f});
        table56.setWidthPercentage(100.0f);
        table56.setHorizontalAlignment(Element.ALIGN_LEFT);

        table56.addCell("Cam. Betoneira:   ");
        table56.addCell(String.valueOf(edtcambet.getText()));
        table56.addCell("Bomba de Concreto:   ");
        table56.addCell(String.valueOf(edtbombconc.getText()));
        table56.addCell("Retroescavadeira:   ");
        table56.addCell(String.valueOf(edtretroescavadeira.getText()));
        table56.addCell("Escav. Hidráulica:   ");
        table56.addCell(String.valueOf(edtescavadeira.getText()));
        table56.addCell("Rolo Pneumático:   ");
        table56.addCell(String.valueOf(edtrolopneu.getText()));
        table56.addCell("Plataforma Elev.:   ");
        table56.addCell(String.valueOf(edtplataforma.getText()));
        table56.addCell("Acab. de Asfalto:   ");
        table56.addCell(String.valueOf(edtacabadora.getText()));
        table56.addCell("Cam. Espargidor:   ");
        table56.addCell(String.valueOf(edtespargidor.getText()));
        table56.addCell("Rolo Tandem:   ");
        table56.addCell(String.valueOf(edttandem.getText()));
        table56.addCell("Guindaste:   ");
        table56.addCell(String.valueOf(edtguindaste.getText()));
        table56.addCell("Pá Carregadeira:   ");
        table56.addCell(String.valueOf(edtpacarregadeira.getText()));
        table56.addCell("Bobcat:   ");
        table56.addCell(String.valueOf(edtbob.getText()));
        table56.addCell("Patrol:   ");
        table56.addCell(String.valueOf(edtpatrol.getText()));
        table56.addCell("Rolo Compactador:   ");
        table56.addCell(String.valueOf(edtcompactador.getText()));
        table56.addCell("Caminhão Pipa:   ");
        table56.addCell(String.valueOf(edtpipa.getText()));
        table56.addCell("Caminhão Munck:   ");
        table56.addCell(String.valueOf(edtmunck.getText()));
        table56.addCell("Cam. Caçamba:   ");
        table56.addCell(String.valueOf(edtcacamba.getText()));
        table56.addCell("");
        table56.addCell("");
        table56.addCell("");
        table56.addCell("");
        table56.addCell("");
        table56.addCell("");
        doc.add(table56);

        PdfPTable table57a = new PdfPTable(new float[]{0.50f, 0.50f});
        table57a.setWidthPercentage(100.0f);
        table57a.setSpacingBefore(20);
        table57a.setHorizontalAlignment(Element.ALIGN_LEFT);

        table57a.addCell(getTextbranco("Equipe em Obra", null, 10));
        table57a.addCell(getTextbranco("", null, 10));
        doc.add(table57a);

        PdfPTable table57 = new PdfPTable(new float[]{0.20f, 0.05f, 0.20f, 0.05f, 0.20f, 0.05f, 0.20f, 0.05f});
        table57.setWidthPercentage(100.0f);
        table57.setHorizontalAlignment(Element.ALIGN_LEFT);


        table57.addCell(getTextqtd("Função", null, 10));
        table57.addCell(getTextqtd("Qtd.", null, 10));
        table57.addCell(getTextqtd("Função", null, 10));
        table57.addCell(getTextqtd("Qtd.", null, 10));
        table57.addCell(getTextqtd("Função", null, 10));
        table57.addCell(getTextqtd("Qtd.", null, 10));
        table57.addCell(getTextqtd("Função", null, 10));
        table57.addCell(getTextqtd("Qtd.", null, 10));
        doc.add(table57);

        PdfPTable table58 = new PdfPTable(new float[]{0.20f, 0.05f, 0.20f, 0.05f, 0.20f, 0.05f, 0.20f, 0.05f});
        table58.setWidthPercentage(100.0f);
        table58.setHorizontalAlignment(Element.ALIGN_LEFT);

        table58.addCell("Engenheiro:   ");
        table58.addCell(String.valueOf(edteng.getText()));
        table58.addCell("Assist. Engenheiro:   ");
        table58.addCell(String.valueOf(edtassisteng.getText()));
        table58.addCell("Mestre de Obra:   ");
        table58.addCell(String.valueOf(edtmestre.getText()));
        table58.addCell("Enc. Forma:   ");
        table58.addCell(String.valueOf(edtencforma.getText()));
        table58.addCell("Carpinteiro:   ");
        table58.addCell(String.valueOf(edtcarp.getText()));
        table58.addCell("Ajud. Carpinteiro:   ");
        table58.addCell(String.valueOf(edtajudcarp.getText()));
        table58.addCell("Enc. Armação:   ");
        table58.addCell(String.valueOf(edtencarm.getText()));
        table58.addCell("Armador:   ");
        table58.addCell(String.valueOf(edtarm.getText()));
        table58.addCell("Ajud. Armador:   ");
        table58.addCell(String.valueOf(edtajudarm.getText()));
        table58.addCell("Enc. Pedreiro:   ");
        table58.addCell(String.valueOf(edtencped.getText()));
        table58.addCell("Pedreiro:   ");
        table58.addCell(String.valueOf(edtped.getText()));
        table58.addCell("Ajud. Pedreiro:   ");
        table58.addCell(String.valueOf(edtajudped.getText()));
        table58.addCell("Enc. Eletricista:   ");
        table58.addCell(String.valueOf(edtencelet.getText()));
        table58.addCell("Eletricista:   ");
        table58.addCell(String.valueOf(edtelet.getText()));
        table58.addCell("Ajud. Eletricista:   ");
        table58.addCell(String.valueOf(edtajudelet.getText()));
        table58.addCell("Enc. Pintor:   ");
        table58.addCell(String.valueOf(edtencpint.getText()));
        table58.addCell("Pintor:   ");
        table58.addCell(String.valueOf(edtpint.getText()));
        table58.addCell("Ajud. Pintor:   ");
        table58.addCell(String.valueOf(edtajudpint.getText()));
        table58.addCell("Enc. Encanador:   ");
        table58.addCell(String.valueOf(edtencencanador.getText()));
        table58.addCell("Encanador:   ");
        table58.addCell(String.valueOf(edtenc.getText()));
        table58.addCell("Ajud. Encanador:   ");
        table58.addCell(String.valueOf(edtajudenc.getText()));
        doc.add(table58);

        PdfPTable table59 = new PdfPTable(new float[]{0.50f, 0.50f});
        table59.setWidthPercentage(100.0f);
        table59.setSpacingBefore(20);
        table59.setHorizontalAlignment(Element.ALIGN_LEFT);

        table59.addCell(getTextbranco("Registro Fotográfico", null, 10));
        table59.addCell(getTextbranco("", null, 10));
        doc.add(table59);

        PdfPTable table60 = new PdfPTable(new float[]{0.33f, 0.33f, 0.33f});
        table60.setWidthPercentage(100.0f);
        table60.setHorizontalAlignment(Element.ALIGN_CENTER);

        table60.addCell(getTextqtd("Registro Fotográfico 1", null, 10));
        table60.addCell(getTextqtd("Registro Fotográfico 2", null, 10));
        table60.addCell(getTextqtd("Registro Fotográfico 3", null, 10));

        BitmapDrawable drawable2 = (BitmapDrawable) imgfoto1.getDrawable();
        Bitmap bitmap2 = drawable2.getBitmap();

        ByteArrayOutputStream stream2 = new ByteArrayOutputStream();
        bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, stream2);
        byte[] imageInByte2 = stream2.toByteArray();
        Image image2 = Image.getInstance(imageInByte2);
        table60.addCell(image2);

        BitmapDrawable drawable3 = (BitmapDrawable) imgfoto2.getDrawable();
        Bitmap bitmap3 = drawable3.getBitmap();

        ByteArrayOutputStream stream3 = new ByteArrayOutputStream();
        bitmap3.compress(Bitmap.CompressFormat.JPEG, 100, stream3);
        byte[] imageInByte3 = stream3.toByteArray();
        Image image3 = Image.getInstance(imageInByte3);
        table60.addCell(image3);

        BitmapDrawable drawable4 = (BitmapDrawable) imgfoto3.getDrawable();
        Bitmap bitmap4 = drawable4.getBitmap();

        ByteArrayOutputStream stream4 = new ByteArrayOutputStream();
        bitmap4.compress(Bitmap.CompressFormat.JPEG, 100, stream4);
        byte[] imageInByte4 = stream4.toByteArray();
        Image image4 = Image.getInstance(imageInByte4);
        table60.addCell(image4);

        table60.addCell(getTextareasobra(String.valueOf(spnareaobra1.getText()), null, 12));
        table60.addCell(getTextareasobra(String.valueOf(spnareaobra2.getText()), null, 12));
        table60.addCell(getTextareasobra(String.valueOf(spnareaobra3.getText()), null, 12));
        table60.addCell(String.valueOf(edtcomentariofoto1.getText()));
        table60.addCell(String.valueOf(edtcomentariofoto2.getText()));
        table60.addCell(String.valueOf(edtcomentariofoto3.getText()));
        doc.add(table60);

        doc.newPage();

        PdfPTable table61a = new PdfPTable(new float[]{0.50f, 0.50f});
        table61a.setWidthPercentage(100.0f);
        table61a.setSpacingBefore(7);
        table61a.setHorizontalAlignment(Element.ALIGN_LEFT);

        table61a.addCell(getTextbranco("Registro Fotográfico", null, 10));
        table61a.addCell(getTextbranco("", null, 10));
        doc.add(table61a);

        PdfPTable table61 = new PdfPTable(new float[]{0.33f, 0.33f, 0.33f});
        table61.setWidthPercentage(100.0f);
        table61.setHorizontalAlignment(Element.ALIGN_CENTER);

        table61.addCell(getTextqtd("Registro Fotográfico 4", null, 10));
        table61.addCell(getTextqtd("Registro Fotográfico 5", null, 10));
        table61.addCell(getTextqtd("Registro Fotográfico 6", null, 10));

        BitmapDrawable drawable5 = (BitmapDrawable) imgfoto4.getDrawable();
        Bitmap bitmap5 = drawable5.getBitmap();

        ByteArrayOutputStream stream5 = new ByteArrayOutputStream();
        bitmap5.compress(Bitmap.CompressFormat.JPEG, 100, stream5);
        byte[] imageInByte5 = stream5.toByteArray();
        Image image5 = Image.getInstance(imageInByte5);
        table61.addCell(image5);

        BitmapDrawable drawable6 = (BitmapDrawable) imgfoto5.getDrawable();
        Bitmap bitmap6 = drawable6.getBitmap();

        ByteArrayOutputStream stream6 = new ByteArrayOutputStream();
        bitmap6.compress(Bitmap.CompressFormat.JPEG, 100, stream6);
        byte[] imageInByte6 = stream6.toByteArray();
        Image image6 = Image.getInstance(imageInByte6);
        table61.addCell(image6);

        BitmapDrawable drawable7 = (BitmapDrawable) imgfoto6.getDrawable();
        Bitmap bitmap7 = drawable7.getBitmap();

        ByteArrayOutputStream stream7 = new ByteArrayOutputStream();
        bitmap7.compress(Bitmap.CompressFormat.JPEG, 100, stream7);
        byte[] imageInByte7 = stream7.toByteArray();
        Image image7 = Image.getInstance(imageInByte7);
        table61.addCell(image7);

        table61.addCell(getTextareasobra(String.valueOf(spnareaobra4.getText()), null, 12));
        table61.addCell(getTextareasobra(String.valueOf(spnareaobra5.getText()), null, 12));
        table61.addCell(getTextareasobra(String.valueOf(spnareaobra6.getText()), null, 12));
        table61.addCell(String.valueOf(edtcomentariofoto4.getText()));
        table61.addCell(String.valueOf(edtcomentariofoto5.getText()));
        table61.addCell(String.valueOf(edtcomentariofoto6.getText()));
        doc.add(table61);

        PdfPTable table62 = new PdfPTable(new float[]{0.33f, 0.33f, 0.33f});
        table62.setWidthPercentage(100.0f);
        table62.setSpacingBefore(7);
        table62.setHorizontalAlignment(Element.ALIGN_CENTER);

        table62.addCell(getTextqtd("Registro Fotográfico 7", null, 10));
        table62.addCell(getTextqtd("Registro Fotográfico 8", null, 10));
        table62.addCell(getTextqtd("Registro Fotográfico 9", null, 10));

        BitmapDrawable drawable8 = (BitmapDrawable) imgfoto7.getDrawable();
        Bitmap bitmap8 = drawable8.getBitmap();

        ByteArrayOutputStream stream8 = new ByteArrayOutputStream();
        bitmap8.compress(Bitmap.CompressFormat.JPEG, 100, stream8);
        byte[] imageInByte8 = stream8.toByteArray();
        Image image8 = Image.getInstance(imageInByte8);
        table62.addCell(image8);

        BitmapDrawable drawable9 = (BitmapDrawable) imgfoto8.getDrawable();
        Bitmap bitmap9 = drawable9.getBitmap();

        ByteArrayOutputStream stream9 = new ByteArrayOutputStream();
        bitmap9.compress(Bitmap.CompressFormat.JPEG, 100, stream9);
        byte[] imageInByte9 = stream9.toByteArray();
        Image image9 = Image.getInstance(imageInByte9);
        table62.addCell(image9);

        BitmapDrawable drawable10 = (BitmapDrawable) imgfoto9.getDrawable();
        Bitmap bitmap10 = drawable10.getBitmap();

        ByteArrayOutputStream stream10 = new ByteArrayOutputStream();
        bitmap10.compress(Bitmap.CompressFormat.JPEG, 100, stream10);
        byte[] imageInByte10 = stream10.toByteArray();
        Image image10 = Image.getInstance(imageInByte10);
        table62.addCell(image10);

        table62.addCell(getTextareasobra(String.valueOf(spnareaobra7.getText()), null, 12));
        table62.addCell(getTextareasobra(String.valueOf(spnareaobra8.getText()), null, 12));
        table62.addCell(getTextareasobra(String.valueOf(spnareaobra9.getText()), null, 12));
        table62.addCell(String.valueOf(edtcomentariofoto7.getText()));
        table62.addCell(String.valueOf(edtcomentariofoto8.getText()));
        table62.addCell(String.valueOf(edtcomentariofoto9.getText()));
        doc.add(table62);

        PdfPTable table63 = new PdfPTable(new float[]{0.33f, 0.33f, 0.33f});
        table63.setWidthPercentage(100.0f);
        table63.setSpacingBefore(7);
        table63.setHorizontalAlignment(Element.ALIGN_CENTER);

        table63.addCell(getTextqtd("Registro Fotográfico 10", null, 10));
        table63.addCell(getTextqtd("Registro Fotográfico 11", null, 10));
        table63.addCell(getTextqtd("Registro Fotográfico 12", null, 10));

        BitmapDrawable drawable11 = (BitmapDrawable) imgfoto10.getDrawable();
        Bitmap bitmap11 = drawable11.getBitmap();

        ByteArrayOutputStream stream11 = new ByteArrayOutputStream();
        bitmap11.compress(Bitmap.CompressFormat.JPEG, 100, stream11);
        byte[] imageInByte11 = stream11.toByteArray();
        Image image11 = Image.getInstance(imageInByte11);
        table63.addCell(image11);

        BitmapDrawable drawable12 = (BitmapDrawable) imgfoto11.getDrawable();
        Bitmap bitmap12 = drawable12.getBitmap();

        ByteArrayOutputStream stream12 = new ByteArrayOutputStream();
        bitmap12.compress(Bitmap.CompressFormat.JPEG, 100, stream12);
        byte[] imageInByte12 = stream12.toByteArray();
        Image image12 = Image.getInstance(imageInByte12);
        table63.addCell(image12);

        BitmapDrawable drawable13 = (BitmapDrawable) imgfoto12.getDrawable();
        Bitmap bitmap13 = drawable13.getBitmap();

        ByteArrayOutputStream stream13 = new ByteArrayOutputStream();
        bitmap13.compress(Bitmap.CompressFormat.JPEG, 100, stream13);
        byte[] imageInByte13 = stream13.toByteArray();
        Image image13 = Image.getInstance(imageInByte13);
        table63.addCell(image13);

        table63.addCell(getTextareasobra(String.valueOf(spnareaobra10.getText()), null, 12));
        table63.addCell(getTextareasobra(String.valueOf(spnareaobra11.getText()), null, 12));
        table63.addCell(getTextareasobra(String.valueOf(spnareaobra12.getText()), null, 12));
        table63.addCell(String.valueOf(edtcomentariofoto10.getText()));
        table63.addCell(String.valueOf(edtcomentariofoto11.getText()));
        table63.addCell(String.valueOf(edtcomentariofoto12.getText()));
        doc.add(table63);

        PdfPTable table64 = new PdfPTable(new float[]{0.33f, 0.33f, 0.33f});
        table64.setWidthPercentage(100.0f);
        table64.setSpacingBefore(7);
        table64.setHorizontalAlignment(Element.ALIGN_CENTER);

        table64.addCell(getTextqtd("Registro Fotográfico 13", null, 10));
        table64.addCell(getTextqtd("Registro Fotográfico 14", null, 10));
        table64.addCell(getTextqtd("Registro Fotográfico 15", null, 10));

        BitmapDrawable drawable14 = (BitmapDrawable) imgfoto13.getDrawable();
        Bitmap bitmap14 = drawable14.getBitmap();

        ByteArrayOutputStream stream14 = new ByteArrayOutputStream();
        bitmap14.compress(Bitmap.CompressFormat.JPEG, 100, stream14);
        byte[] imageInByte14 = stream14.toByteArray();
        Image image14 = Image.getInstance(imageInByte14);
        table64.addCell(image14);

        BitmapDrawable drawable15 = (BitmapDrawable) imgfoto14.getDrawable();
        Bitmap bitmap15 = drawable15.getBitmap();

        ByteArrayOutputStream stream15 = new ByteArrayOutputStream();
        bitmap15.compress(Bitmap.CompressFormat.JPEG, 100, stream15);
        byte[] imageInByte15 = stream15.toByteArray();
        Image image15 = Image.getInstance(imageInByte15);
        table64.addCell(image15);

        BitmapDrawable drawable16 = (BitmapDrawable) imgfoto15.getDrawable();
        Bitmap bitmap16 = drawable16.getBitmap();

        ByteArrayOutputStream stream16 = new ByteArrayOutputStream();
        bitmap16.compress(Bitmap.CompressFormat.JPEG, 100, stream16);
        byte[] imageInByte16 = stream16.toByteArray();
        Image image16 = Image.getInstance(imageInByte16);
        table64.addCell(image16);

        table64.addCell(getTextareasobra(String.valueOf(spnareaobra13.getText()), null, 12));
        table64.addCell(getTextareasobra(String.valueOf(spnareaobra14.getText()), null, 12));
        table64.addCell(getTextareasobra(String.valueOf(spnareaobra15.getText()), null, 12));
        table64.addCell(String.valueOf(edtcomentariofoto13.getText()));
        table64.addCell(String.valueOf(edtcomentariofoto14.getText()));
        table64.addCell(String.valueOf(edtcomentariofoto15.getText()));
        doc.add(table64);

        doc.close();

    }

    public static PdfPCell getNormalCell(String string, String language, float size)
            throws DocumentException, IOException {

        size = 16;
        Font f = FontFactory.getFont(FontFactory.TIMES_ROMAN, 16, Font.BOLD);
        f.setColor(BaseColor.BLUE);
        f.setSize(size);
        PdfPCell cell = new PdfPCell(new Phrase(string, f));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setVerticalAlignment(Element.ALIGN_CENTER);
        cell.setBorder(PdfPCell.NO_BORDER);
        return cell;
    }

    public static PdfPCell getTextareasobra(String string, String language, float size)
            throws DocumentException, IOException {

        size = 12;
        Font h = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12);
        h.setColor(BaseColor.BLACK);
        h.setSize(size);
        PdfPCell cell = new PdfPCell(new Phrase(string, h));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_CENTER);
        return cell;
    }

    public static PdfPCell getTextbranco(String string, String language, float size)
            throws DocumentException, IOException {

        size = 14;
        Font a = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14);
        a.setColor(BaseColor.WHITE);
        a.setSize(size);
        PdfPCell cell = new PdfPCell(new Phrase(string, a));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setVerticalAlignment(Element.ALIGN_CENTER);
        cell.setBackgroundColor(BaseColor.DARK_GRAY);
        cell.setBorder(PdfPCell.NO_BORDER);
        return cell;
    }

    public static PdfPCell getTextqtd(String string, String language, float size)
            throws DocumentException, IOException {

        size = 12;
        Font a = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12);
        a.setColor(BaseColor.WHITE);
        a.setSize(size);
        PdfPCell cell = new PdfPCell(new Phrase(string, a));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_CENTER);
        cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        return cell;
    }

    private void enviardocumento() {

        enviarDocumento = new Intent();
        enviarDocumento.setAction(Intent.ACTION_SEND);
        enviarDocumento.setType("text/html");
        File sdcard = Environment.getExternalStorageDirectory();
        File file = new File(sdcard + "/PDF/" + "rdc.pdf");
        Uri u1 = Uri.fromFile(file);
        enviarDocumento.setType("application/pdf");
        // Assuming it may go via eMail:
        enviarDocumento.putExtra(Intent.EXTRA_SUBJECT, " Relatório diário da obra - " + edtobra.getText() + " - " + edtdatarel.getText() );
        enviarDocumento.putExtra(Intent.EXTRA_TEXT, Html.fromHtml("<p> Prezado (a),</p> Segue o relatório da obra mencionada no assunto deste email.</p> <p> Att,</p>"));
        enviarDocumento.putExtra(Intent.EXTRA_STREAM, u1);
        startActivity(Intent.createChooser(enviarDocumento, "Escolha o App para envio:"));

        return;
    }



    private void preenchedados() {

        edtobra.setText(diario.getObra());
        edtconst.setText(diario.getConsta());
        edtendereco.setText(diario.getEnd());
        edtnumero.setText(diario.getNum());
        edtcidade.setText(diario.getCid());
        edtcambet.setText(diario.getCambet());
        edtbombconc.setText(diario.getBombconc());
        edtretroescavadeira.setText(diario.getRetro());
        edtescavadeira.setText(diario.getEscav());
        edtrolopneu.setText(diario.getRolo());
        edtplataforma.setText(diario.getPlat());
        edtacabadora.setText(diario.getAcab());
        edtespargidor.setText(diario.getEspar());
        edttandem.setText(diario.getTandem());
        edtguindaste.setText(diario.getGuind());
        edtpacarregadeira.setText(diario.getPacar());
        edtbob.setText(diario.getBob());
        edtpatrol.setText(diario.getPatrol());
        edtcompactador.setText(diario.getCompac());
        edtpipa.setText(diario.getPipa());
        edtmunck.setText(diario.getMunck());
        edtcacamba.setText(diario.getCacamba());
        edteng.setText(diario.getEng());
        edtassisteng.setText(diario.getAssist());
        edtmestre.setText(diario.getMestre());
        edtencforma.setText(diario.getEncforma());
        edtcarp.setText(diario.getCarp());
        edtajudcarp.setText(diario.getAjudcarp());
        edtencarm.setText(diario.getEncarm());
        edtarm.setText(diario.getArm());
        edtajudarm.setText(diario.getAjudarm());
        edtencped.setText(diario.getEncped());
        edtped.setText(diario.getPed());
        edtajudped.setText(diario.getAjudped());
        edtencelet.setText(diario.getEncelet());
        edtelet.setText(diario.getElet());
        edtajudelet.setText(diario.getAjudelet());
        edtencpint.setText(diario.getEncpint());
        edtpint.setText(diario.getPint());
        edtajudpint.setText(diario.getAjudpint());
        edtencencanador.setText(diario.getEncencanador());
        edtenc.setText(diario.getEnc());
        edtajudenc.setText(diario.getAjudenc());
        spnestado.setText(diario.getEst());
        spncondclimatica1.setText(diario.getClim1());
        spncondclimatica2.setText(diario.getClim2());
        spnareaobra1.setText(diario.getAreaobra1());
        spnareaobra2.setText(diario.getAreaobra2());
        spnareaobra3.setText(diario.getAreaobra3());
        spnareaobra4.setText(diario.getAreaobra4());
        spnareaobra5.setText(diario.getAreaobra5());
        spnareaobra6.setText(diario.getAreaobra6());
        spnareaobra7.setText(diario.getAreaobra7());
        spnareaobra8.setText(diario.getAreaobra8());
        spnareaobra9.setText(diario.getAreaobra9());
        spnareaobra10.setText(diario.getAreaobra10());
        spnareaobra11.setText(diario.getAreaobra11());
        spnareaobra12.setText(diario.getAreaobra12());
        spnareaobra13.setText(diario.getAreaobra13());
        spnareaobra14.setText(diario.getAreaobra14());
        spnareaobra15.setText(diario.getAreaobra15());
        edtcomentariofoto1.setText(diario.getComentario1());
        edtcomentariofoto2.setText(diario.getComentario2());
        edtcomentariofoto3.setText(diario.getComentario3());
        edtcomentariofoto4.setText(diario.getComentario4());
        edtcomentariofoto5.setText(diario.getComentario5());
        edtcomentariofoto6.setText(diario.getComentario6());
        edtcomentariofoto7.setText(diario.getComentario7());
        edtcomentariofoto8.setText(diario.getComentario8());
        edtcomentariofoto9.setText(diario.getComentario9());
        edtcomentariofoto10.setText(diario.getComentario10());
        edtcomentariofoto11.setText(diario.getComentario11());
        edtcomentariofoto12.setText(diario.getComentario12());
        edtcomentariofoto13.setText(diario.getComentario13());
        edtcomentariofoto14.setText(diario.getComentario14());
        edtcomentariofoto15.setText(diario.getComentario15());
        edtdatarel.setText(diario.getData());
        edtdatainicio.setText(diario.getDataini());
        edtdataentrega.setText(diario.getDataent());


        if (diario.getFoto1() != null) {
            Bitmap resized1 = BitmapFactory.decodeFile(diario.getFoto1());
            Bitmap bitmap1 = Bitmap.createScaledBitmap(resized1, 550, 380, true);
            ByteArrayOutputStream stream2 = new ByteArrayOutputStream();
            bitmap1.compress(Bitmap.CompressFormat.JPEG, 100, stream2);
            imgfoto1.setImageBitmap(bitmap1);
        }

        if (diario.getFoto2() != null) {
            Bitmap resized2 = BitmapFactory.decodeFile(diario.getFoto2());
            Bitmap bitmap2 = Bitmap.createScaledBitmap(resized2, 550, 380, true);
            ByteArrayOutputStream stream3 = new ByteArrayOutputStream();
            bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, stream3);
            imgfoto2.setImageBitmap(bitmap2);
        }

        if (diario.getFoto3() != null) {
            Bitmap resized3 = BitmapFactory.decodeFile(diario.getFoto3());
            Bitmap bitmap3 = Bitmap.createScaledBitmap(resized3, 550, 380, true);
            ByteArrayOutputStream stream4 = new ByteArrayOutputStream();
            bitmap3.compress(Bitmap.CompressFormat.JPEG, 100, stream4);
            imgfoto3.setImageBitmap(bitmap3);
        }

        if (diario.getFoto4() != null) {
            Bitmap resized4 = BitmapFactory.decodeFile(diario.getFoto4());
            Bitmap bitmap4 = Bitmap.createScaledBitmap(resized4, 550, 380, true);
            ByteArrayOutputStream stream5 = new ByteArrayOutputStream();
            bitmap4.compress(Bitmap.CompressFormat.JPEG, 100, stream5);
            imgfoto4.setImageBitmap(bitmap4);
        }

        if (diario.getFoto5() != null) {
            Bitmap resized5 = BitmapFactory.decodeFile(diario.getFoto5());
            Bitmap bitmap5 = Bitmap.createScaledBitmap(resized5, 550, 380, true);
            ByteArrayOutputStream stream6 = new ByteArrayOutputStream();
            bitmap5.compress(Bitmap.CompressFormat.JPEG, 100, stream6);
            imgfoto5.setImageBitmap(bitmap5);
        }

        if (diario.getFoto6() != null) {
            Bitmap resized6 = BitmapFactory.decodeFile(diario.getFoto6());
            Bitmap bitmap6 = Bitmap.createScaledBitmap(resized6, 550, 380, true);
            ByteArrayOutputStream stream7 = new ByteArrayOutputStream();
            bitmap6.compress(Bitmap.CompressFormat.JPEG, 100, stream7);
            imgfoto6.setImageBitmap(bitmap6);
        }

        if (diario.getFoto7() != null) {
            Bitmap resized7 = BitmapFactory.decodeFile(diario.getFoto7());
            Bitmap bitmap7 = Bitmap.createScaledBitmap(resized7, 550, 380, true);
            ByteArrayOutputStream stream8 = new ByteArrayOutputStream();
            bitmap7.compress(Bitmap.CompressFormat.JPEG, 100, stream8);
            imgfoto7.setImageBitmap(bitmap7);
        }

        if (diario.getFoto8() != null) {
            Bitmap resized8 = BitmapFactory.decodeFile(diario.getFoto8());
            Bitmap bitmap8 = Bitmap.createScaledBitmap(resized8, 550, 380, true);
            ByteArrayOutputStream stream9 = new ByteArrayOutputStream();
            bitmap8.compress(Bitmap.CompressFormat.JPEG, 100, stream9);
            imgfoto8.setImageBitmap(bitmap8);
        }

        if (diario.getFoto9() != null) {
            Bitmap resized9 = BitmapFactory.decodeFile(diario.getFoto9());
            Bitmap bitmap9 = Bitmap.createScaledBitmap(resized9, 550, 380, true);
            ByteArrayOutputStream stream10 = new ByteArrayOutputStream();
            bitmap9.compress(Bitmap.CompressFormat.JPEG, 100, stream10);
            imgfoto9.setImageBitmap(bitmap9);
        }

        if (diario.getFoto10() != null) {
            Bitmap resized10 = BitmapFactory.decodeFile(diario.getFoto10());
            Bitmap bitmap10 = Bitmap.createScaledBitmap(resized10, 550, 380, true);
            ByteArrayOutputStream stream11 = new ByteArrayOutputStream();
            bitmap10.compress(Bitmap.CompressFormat.JPEG, 100, stream11);
            imgfoto10.setImageBitmap(bitmap10);
        }

        if (diario.getFoto11() != null) {
            Bitmap resized11 = BitmapFactory.decodeFile(diario.getFoto11());
            Bitmap bitmap11 = Bitmap.createScaledBitmap(resized11, 550, 380, true);
            ByteArrayOutputStream stream12 = new ByteArrayOutputStream();
            bitmap11.compress(Bitmap.CompressFormat.JPEG, 100, stream12);
            imgfoto11.setImageBitmap(bitmap11);
        }

        if (diario.getFoto12() != null) {
            Bitmap resized12 = BitmapFactory.decodeFile(diario.getFoto12());
            Bitmap bitmap12 = Bitmap.createScaledBitmap(resized12, 550, 380, true);
            ByteArrayOutputStream stream13 = new ByteArrayOutputStream();
            bitmap12.compress(Bitmap.CompressFormat.JPEG, 100, stream13);
            imgfoto12.setImageBitmap(bitmap12);
        }

        if (diario.getFoto13() != null) {
            Bitmap resized13 = BitmapFactory.decodeFile(diario.getFoto13());
            Bitmap bitmap13 = Bitmap.createScaledBitmap(resized13, 550, 380, true);
            ByteArrayOutputStream stream14 = new ByteArrayOutputStream();
            bitmap13.compress(Bitmap.CompressFormat.JPEG, 100, stream14);
            imgfoto13.setImageBitmap(bitmap13);
        }

        if (diario.getFoto14() != null) {
            Bitmap resized14 = BitmapFactory.decodeFile(diario.getFoto14());
            Bitmap bitmap14 = Bitmap.createScaledBitmap(resized14, 550, 380, true);
            ByteArrayOutputStream stream15 = new ByteArrayOutputStream();
            bitmap14.compress(Bitmap.CompressFormat.JPEG, 100, stream15);
            imgfoto14.setImageBitmap(bitmap14);
        }

        if (diario.getFoto15() != null) {
            Bitmap resized15 = BitmapFactory.decodeFile(diario.getFoto15());
            Bitmap bitmap15 = Bitmap.createScaledBitmap(resized15, 550, 380, true);
            ByteArrayOutputStream stream16 = new ByteArrayOutputStream();
            bitmap15.compress(Bitmap.CompressFormat.JPEG, 100, stream16);
            imgfoto15.setImageBitmap(bitmap15);
        }

        if (diario.getLogo() != null) {
            Bitmap resized16 = BitmapFactory.decodeFile(diario.getLogo());
            Bitmap bitmap16 = Bitmap.createScaledBitmap(resized16, 200, 100, true);
            ByteArrayOutputStream stream17 = new ByteArrayOutputStream();
            bitmap16.compress(Bitmap.CompressFormat.JPEG, 100, stream17);
            imglogo.setImageBitmap(bitmap16);
        }

    }




    private void excluir() {

        try {

            repositorioRelatorio.excluir(diario.getId());

            Intent it = new Intent(Relatorio.this, MainRdc.class);
            it.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(it);
            finish();

        } catch (Exception ex) {

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Erro ao Excluir os Dados" + ex.getMessage());
            dlg.setNeutralButton("OK", null);
            dlg.show();

        }


    }


    private void salvar() {

        try {
            diario.setObra(edtobra.getText().toString());
            diario.setConsta(edtconst.getText().toString());
            diario.setEnd(edtendereco.getText().toString());
            diario.setNum(edtnumero.getText().toString());
            diario.setCid(edtcidade.getText().toString());
            diario.setCambet(edtcambet.getText().toString());
            diario.setBombconc(edtbombconc.getText().toString());
            diario.setRetro(edtretroescavadeira.getText().toString());
            diario.setEscav(edtescavadeira.getText().toString());
            diario.setRolo(edtrolopneu.getText().toString());
            diario.setPlat(edtplataforma.getText().toString());
            diario.setAcab(edtacabadora.getText().toString());
            diario.setEspar(edtespargidor.getText().toString());
            diario.setTandem(edttandem.getText().toString());
            diario.setGuind(edtguindaste.getText().toString());
            diario.setPacar(edtpacarregadeira.getText().toString());
            diario.setBob(edtbob.getText().toString());
            diario.setPatrol(edtpatrol.getText().toString());
            diario.setCompac(edtcompactador.getText().toString());
            diario.setPipa(edtpipa.getText().toString());
            diario.setMunck(edtmunck.getText().toString());
            diario.setCacamba(edtcacamba.getText().toString());
            diario.setEng(edteng.getText().toString());
            diario.setAssist(edtassisteng.getText().toString());
            diario.setMestre(edtmestre.getText().toString());
            diario.setEncforma(edtencforma.getText().toString());
            diario.setCarp(edtcarp.getText().toString());
            diario.setAjudcarp(edtajudcarp.getText().toString());
            diario.setEncarm(edtencarm.getText().toString());
            diario.setArm(edtarm.getText().toString());
            diario.setAjudarm(edtajudarm.getText().toString());
            diario.setEncped(edtencped.getText().toString());
            diario.setPed(edtped.getText().toString());
            diario.setAjudped(edtajudped.getText().toString());
            diario.setEncelet(edtencelet.getText().toString());
            diario.setElet(edtelet.getText().toString());
            diario.setAjudelet(edtajudelet.getText().toString());
            diario.setEncpint(edtencpint.getText().toString());
            diario.setPint(edtpint.getText().toString());
            diario.setAjudpint(edtajudpint.getText().toString());
            diario.setEncencanador(edtencencanador.getText().toString());
            diario.setEnc(edtenc.getText().toString());
            diario.setAjudenc(edtajudenc.getText().toString());
            diario.setComentario1(edtcomentariofoto1.getText().toString());
            diario.setComentario2(edtcomentariofoto2.getText().toString());
            diario.setComentario3(edtcomentariofoto3.getText().toString());
            diario.setComentario4(edtcomentariofoto4.getText().toString());
            diario.setComentario5(edtcomentariofoto5.getText().toString());
            diario.setComentario6(edtcomentariofoto6.getText().toString());
            diario.setComentario7(edtcomentariofoto7.getText().toString());
            diario.setComentario8(edtcomentariofoto8.getText().toString());
            diario.setComentario9(edtcomentariofoto9.getText().toString());
            diario.setComentario10(edtcomentariofoto10.getText().toString());
            diario.setComentario11(edtcomentariofoto11.getText().toString());
            diario.setComentario12(edtcomentariofoto12.getText().toString());
            diario.setComentario13(edtcomentariofoto13.getText().toString());
            diario.setComentario14(edtcomentariofoto14.getText().toString());
            diario.setComentario15(edtcomentariofoto15.getText().toString());

            diario.setEst(String.valueOf(spnestado.getText()));
            diario.setClim1(String.valueOf(spncondclimatica1.getText()));
            diario.setClim2(String.valueOf(spncondclimatica2.getText()));
            diario.setAreaobra1(String.valueOf(spnareaobra1.getText()));
            diario.setAreaobra2(String.valueOf(spnareaobra2.getText()));
            diario.setAreaobra3(String.valueOf(spnareaobra3.getText()));
            diario.setAreaobra4(String.valueOf(spnareaobra4.getText()));
            diario.setAreaobra5(String.valueOf(spnareaobra5.getText()));
            diario.setAreaobra6(String.valueOf(spnareaobra6.getText()));
            diario.setAreaobra7(String.valueOf(spnareaobra7.getText()));
            diario.setAreaobra8(String.valueOf(spnareaobra8.getText()));
            diario.setAreaobra9(String.valueOf(spnareaobra9.getText()));
            diario.setAreaobra10(String.valueOf(spnareaobra10.getText()));
            diario.setAreaobra11(String.valueOf(spnareaobra11.getText()));
            diario.setAreaobra12(String.valueOf(spnareaobra12.getText()));
            diario.setAreaobra13(String.valueOf(spnareaobra13.getText()));
            diario.setAreaobra14(String.valueOf(spnareaobra14.getText()));
            diario.setAreaobra15(String.valueOf(spnareaobra15.getText()));


            diario.setData(edtdatarel.getText().toString());
            diario.setDataini(edtdatainicio.getText().toString());
            diario.setDataent(edtdataentrega.getText().toString());



            if (diario.getId() == 0)
                repositorioRelatorio.inserir(diario);
            else
                repositorioRelatorio.alterar(diario);


        } catch (Exception ex) {

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Erro ao Inserir os Dados" + ex.getMessage());
            dlg.setNeutralButton("OK", null);
            dlg.show();

        }

    }

    private void salvar1() {

        try {
            diario.setObra(edtobra.getText().toString());
            diario.setConsta(edtconst.getText().toString());
            diario.setEnd(edtendereco.getText().toString());
            diario.setNum(edtnumero.getText().toString());
            diario.setCid(edtcidade.getText().toString());
            diario.setCambet(edtcambet.getText().toString());
            diario.setBombconc(edtbombconc.getText().toString());
            diario.setRetro(edtretroescavadeira.getText().toString());
            diario.setEscav(edtescavadeira.getText().toString());
            diario.setRolo(edtrolopneu.getText().toString());
            diario.setPlat(edtplataforma.getText().toString());
            diario.setAcab(edtacabadora.getText().toString());
            diario.setEspar(edtespargidor.getText().toString());
            diario.setTandem(edttandem.getText().toString());
            diario.setGuind(edtguindaste.getText().toString());
            diario.setPacar(edtpacarregadeira.getText().toString());
            diario.setBob(edtbob.getText().toString());
            diario.setPatrol(edtpatrol.getText().toString());
            diario.setCompac(edtcompactador.getText().toString());
            diario.setPipa(edtpipa.getText().toString());
            diario.setMunck(edtmunck.getText().toString());
            diario.setCacamba(edtcacamba.getText().toString());
            diario.setEng(edteng.getText().toString());
            diario.setAssist(edtassisteng.getText().toString());
            diario.setMestre(edtmestre.getText().toString());
            diario.setEncforma(edtencforma.getText().toString());
            diario.setCarp(edtcarp.getText().toString());
            diario.setAjudcarp(edtajudcarp.getText().toString());
            diario.setEncarm(edtencarm.getText().toString());
            diario.setArm(edtarm.getText().toString());
            diario.setAjudarm(edtajudarm.getText().toString());
            diario.setEncped(edtencped.getText().toString());
            diario.setPed(edtped.getText().toString());
            diario.setAjudped(edtajudped.getText().toString());
            diario.setEncelet(edtencelet.getText().toString());
            diario.setElet(edtelet.getText().toString());
            diario.setAjudelet(edtajudelet.getText().toString());
            diario.setEncpint(edtencpint.getText().toString());
            diario.setPint(edtpint.getText().toString());
            diario.setAjudpint(edtajudpint.getText().toString());
            diario.setEncencanador(edtencencanador.getText().toString());
            diario.setEnc(edtenc.getText().toString());
            diario.setAjudenc(edtajudenc.getText().toString());
            diario.setComentario1(edtcomentariofoto1.getText().toString());
            diario.setComentario2(edtcomentariofoto2.getText().toString());
            diario.setComentario3(edtcomentariofoto3.getText().toString());
            diario.setComentario4(edtcomentariofoto4.getText().toString());
            diario.setComentario5(edtcomentariofoto5.getText().toString());
            diario.setComentario6(edtcomentariofoto6.getText().toString());
            diario.setComentario7(edtcomentariofoto7.getText().toString());
            diario.setComentario8(edtcomentariofoto8.getText().toString());
            diario.setComentario9(edtcomentariofoto9.getText().toString());
            diario.setComentario10(edtcomentariofoto10.getText().toString());
            diario.setComentario11(edtcomentariofoto11.getText().toString());
            diario.setComentario12(edtcomentariofoto12.getText().toString());
            diario.setComentario13(edtcomentariofoto13.getText().toString());
            diario.setComentario14(edtcomentariofoto14.getText().toString());
            diario.setComentario15(edtcomentariofoto15.getText().toString());

            diario.setEst(String.valueOf(spnestado.getText()));
            diario.setClim1(String.valueOf(spncondclimatica1.getText()));
            diario.setClim2(String.valueOf(spncondclimatica2.getText()));
            diario.setAreaobra1(String.valueOf(spnareaobra1.getText()));
            diario.setAreaobra2(String.valueOf(spnareaobra2.getText()));
            diario.setAreaobra3(String.valueOf(spnareaobra3.getText()));
            diario.setAreaobra4(String.valueOf(spnareaobra4.getText()));
            diario.setAreaobra5(String.valueOf(spnareaobra5.getText()));
            diario.setAreaobra6(String.valueOf(spnareaobra6.getText()));
            diario.setAreaobra7(String.valueOf(spnareaobra7.getText()));
            diario.setAreaobra8(String.valueOf(spnareaobra8.getText()));
            diario.setAreaobra9(String.valueOf(spnareaobra9.getText()));
            diario.setAreaobra10(String.valueOf(spnareaobra10.getText()));
            diario.setAreaobra11(String.valueOf(spnareaobra11.getText()));
            diario.setAreaobra12(String.valueOf(spnareaobra12.getText()));
            diario.setAreaobra13(String.valueOf(spnareaobra13.getText()));
            diario.setAreaobra14(String.valueOf(spnareaobra14.getText()));
            diario.setAreaobra15(String.valueOf(spnareaobra15.getText()));


            diario.setData(edtdatarel.getText().toString());
            diario.setDataini(edtdatainicio.getText().toString());
            diario.setDataent(edtdataentrega.getText().toString());



            if (diario.getId() == 0)
                repositorioRelatorio.inserir(diario);
            else
                repositorioRelatorio.alterar(diario);

            Intent it = new Intent(Relatorio.this, MainRdc.class);
            it.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(it);
            finish();


        } catch (Exception ex) {

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Erro ao Inserir os Dados" + ex.getMessage());
            dlg.setNeutralButton("OK", null);
            dlg.show();

        }

    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 0) {

            if (resultCode == Activity.RESULT_OK) {


                Bitmap resized = BitmapFactory.decodeFile(localDaFoto1);
                Bitmap bitmap = Bitmap.createScaledBitmap(resized, 550, 380, true);
                ByteArrayOutputStream stream3 = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream3);

                diario.setFoto1(localDaFoto1);

                imgfoto1.setImageBitmap(bitmap);


            }
        }

        if (requestCode == 1 && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = this.getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath1 = cursor.getString(columnIndex);
            cursor.close();

            Bitmap resized = BitmapFactory.decodeFile(picturePath1);
            Bitmap bitmap1 = Bitmap.createScaledBitmap(resized, 550, 380, true);

            diario.setFoto1(picturePath1);

            imgfoto1.setImageBitmap(bitmap1);

        }

        if (requestCode == 2) {

            if (resultCode == Activity.RESULT_OK) {

                Bitmap resized = BitmapFactory.decodeFile(localDaFoto2);
                Bitmap bitmap = Bitmap.createScaledBitmap(resized, 550, 380, true);
                ByteArrayOutputStream stream4 = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream4);

                diario.setFoto2(localDaFoto2);

                imgfoto2.setImageBitmap(bitmap);


            }
        }

        if (requestCode == 3 && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = this.getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath2 = cursor.getString(columnIndex);
            cursor.close();

            Bitmap resized = BitmapFactory.decodeFile(picturePath2);
            Bitmap bitmap2 = Bitmap.createScaledBitmap(resized, 550, 380, true);

            diario.setFoto2(picturePath2);

            imgfoto2.setImageBitmap(bitmap2);

        }

        if (requestCode == 4) {

            if (resultCode == Activity.RESULT_OK) {

                Bitmap resized = BitmapFactory.decodeFile(localDaFoto3);
                Bitmap bitmap = Bitmap.createScaledBitmap(resized, 550, 380, true);
                ByteArrayOutputStream stream5 = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream5);

                diario.setFoto3(localDaFoto3);

                imgfoto3.setImageBitmap(bitmap);


            }
        }

        if (requestCode == 5 && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = this.getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath3 = cursor.getString(columnIndex);
            cursor.close();

            Bitmap resized = BitmapFactory.decodeFile(picturePath3);
            Bitmap bitmap3 = Bitmap.createScaledBitmap(resized, 550, 380, true);

            diario.setFoto3(picturePath3);

            imgfoto3.setImageBitmap(bitmap3);

        }


        if (requestCode == 6) {

            if (resultCode == Activity.RESULT_OK) {

                Bitmap resized = BitmapFactory.decodeFile(localDaFoto4);
                Bitmap bitmap = Bitmap.createScaledBitmap(resized, 550, 380, true);
                ByteArrayOutputStream stream5 = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream5);

                diario.setFoto4(localDaFoto4);

                imgfoto4.setImageBitmap(bitmap);


            }
        }

        if (requestCode == 7 && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = this.getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath4 = cursor.getString(columnIndex);
            cursor.close();

            Bitmap resized = BitmapFactory.decodeFile(picturePath4);
            Bitmap bitmap4 = Bitmap.createScaledBitmap(resized, 550, 380, true);

            diario.setFoto4(picturePath4);

            imgfoto4.setImageBitmap(bitmap4);

        }

        if (requestCode == 8) {

            if (resultCode == Activity.RESULT_OK) {

                Bitmap resized = BitmapFactory.decodeFile(localDaFoto5);
                Bitmap bitmap = Bitmap.createScaledBitmap(resized, 550, 380, true);
                ByteArrayOutputStream stream5 = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream5);

                diario.setFoto5(localDaFoto5);

                imgfoto5.setImageBitmap(bitmap);


            }
        }

        if (requestCode == 9 && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = this.getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath5 = cursor.getString(columnIndex);
            cursor.close();

            Bitmap resized = BitmapFactory.decodeFile(picturePath5);
            Bitmap bitmap5 = Bitmap.createScaledBitmap(resized, 550, 380, true);

            diario.setFoto5(picturePath5);

            imgfoto5.setImageBitmap(bitmap5);

        }

        if (requestCode == 10) {

            if (resultCode == Activity.RESULT_OK) {

                Bitmap resized = BitmapFactory.decodeFile(localDaFoto6);
                Bitmap bitmap = Bitmap.createScaledBitmap(resized, 550, 380, true);
                ByteArrayOutputStream stream5 = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream5);

                diario.setFoto6(localDaFoto6);

                imgfoto6.setImageBitmap(bitmap);


            }
        }

        if (requestCode == 11 && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = this.getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath6 = cursor.getString(columnIndex);
            cursor.close();

            Bitmap resized = BitmapFactory.decodeFile(picturePath6);
            Bitmap bitmap6 = Bitmap.createScaledBitmap(resized, 550, 380, true);

            diario.setFoto6(picturePath6);

            imgfoto6.setImageBitmap(bitmap6);

        }

        if (requestCode == 12) {

            if (resultCode == Activity.RESULT_OK) {

                Bitmap resized = BitmapFactory.decodeFile(localDaFoto7);
                Bitmap bitmap = Bitmap.createScaledBitmap(resized, 550, 380, true);
                ByteArrayOutputStream stream5 = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream5);

                diario.setFoto7(localDaFoto7);

                imgfoto7.setImageBitmap(bitmap);


            }
        }

        if (requestCode == 13 && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = this.getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath7 = cursor.getString(columnIndex);
            cursor.close();

            Bitmap resized = BitmapFactory.decodeFile(picturePath7);
            Bitmap bitmap7 = Bitmap.createScaledBitmap(resized, 550, 380, true);

            diario.setFoto7(picturePath7);

            imgfoto7.setImageBitmap(bitmap7);

        }

        if (requestCode == 14) {

            if (resultCode == Activity.RESULT_OK) {

                Bitmap resized = BitmapFactory.decodeFile(localDaFoto8);
                Bitmap bitmap = Bitmap.createScaledBitmap(resized, 550, 380, true);
                ByteArrayOutputStream stream5 = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream5);

                diario.setFoto8(localDaFoto8);

                imgfoto8.setImageBitmap(bitmap);


            }
        }

        if (requestCode == 15 && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = this.getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath8 = cursor.getString(columnIndex);
            cursor.close();

            Bitmap resized = BitmapFactory.decodeFile(picturePath8);
            Bitmap bitmap8 = Bitmap.createScaledBitmap(resized, 550, 380, true);

            diario.setFoto8(picturePath8);

            imgfoto8.setImageBitmap(bitmap8);

        }

        if (requestCode == 16) {

            if (resultCode == Activity.RESULT_OK) {

                Bitmap resized = BitmapFactory.decodeFile(localDaFoto9);
                Bitmap bitmap = Bitmap.createScaledBitmap(resized, 550, 380, true);
                ByteArrayOutputStream stream6 = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream6);

                diario.setFoto9(localDaFoto9);

                imgfoto9.setImageBitmap(bitmap);


            }
        }

        if (requestCode == 17 && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = this.getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath9 = cursor.getString(columnIndex);
            cursor.close();

            Bitmap resized = BitmapFactory.decodeFile(picturePath9);
            Bitmap bitmap9 = Bitmap.createScaledBitmap(resized, 550, 380, true);

            diario.setFoto9(picturePath9);

            imgfoto9.setImageBitmap(bitmap9);

        }

        if (requestCode == 18) {

            if (resultCode == Activity.RESULT_OK) {

                Bitmap resized = BitmapFactory.decodeFile(localDaFoto10);
                Bitmap bitmap = Bitmap.createScaledBitmap(resized, 550, 380, true);
                ByteArrayOutputStream stream7 = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream7);

                diario.setFoto10(localDaFoto10);

                imgfoto10.setImageBitmap(bitmap);


            }
        }

        if (requestCode == 19 && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = this.getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath10 = cursor.getString(columnIndex);
            cursor.close();

            Bitmap resized = BitmapFactory.decodeFile(picturePath10);
            Bitmap bitmap10 = Bitmap.createScaledBitmap(resized, 550, 380, true);

            diario.setFoto10(picturePath10);

            imgfoto10.setImageBitmap(bitmap10);

        }

        if (requestCode == 20) {

            if (resultCode == Activity.RESULT_OK) {

                Bitmap resized = BitmapFactory.decodeFile(localDaFoto11);
                Bitmap bitmap = Bitmap.createScaledBitmap(resized, 550, 380, true);
                ByteArrayOutputStream stream8 = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream8);

                diario.setFoto11(localDaFoto11);

                imgfoto11.setImageBitmap(bitmap);


            }
        }

        if (requestCode == 21 && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = this.getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath11 = cursor.getString(columnIndex);
            cursor.close();

            Bitmap resized = BitmapFactory.decodeFile(picturePath11);
            Bitmap bitmap11 = Bitmap.createScaledBitmap(resized, 550, 380, true);

            diario.setFoto11(picturePath11);

            imgfoto11.setImageBitmap(bitmap11);

        }

        if (requestCode == 22) {

            if (resultCode == Activity.RESULT_OK) {

                Bitmap resized = BitmapFactory.decodeFile(localDaFoto12);
                Bitmap bitmap = Bitmap.createScaledBitmap(resized, 550, 380, true);
                ByteArrayOutputStream stream9 = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream9);

                diario.setFoto12(localDaFoto12);

                imgfoto12.setImageBitmap(bitmap);


            }
        }

        if (requestCode == 23 && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = this.getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath12 = cursor.getString(columnIndex);
            cursor.close();

            Bitmap resized = BitmapFactory.decodeFile(picturePath12);
            Bitmap bitmap12 = Bitmap.createScaledBitmap(resized, 550, 380, true);

            diario.setFoto12(picturePath12);

            imgfoto12.setImageBitmap(bitmap12);

        }

        if (requestCode == 24) {

            if (resultCode == Activity.RESULT_OK) {

                Bitmap resized = BitmapFactory.decodeFile(localDaFoto13);
                Bitmap bitmap = Bitmap.createScaledBitmap(resized, 550, 380, true);
                ByteArrayOutputStream stream10 = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream10);

                diario.setFoto13(localDaFoto13);

                imgfoto13.setImageBitmap(bitmap);


            }
        }

        if (requestCode == 25 && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = this.getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath13 = cursor.getString(columnIndex);
            cursor.close();

            Bitmap resized = BitmapFactory.decodeFile(picturePath13);
            Bitmap bitmap13 = Bitmap.createScaledBitmap(resized, 550, 380, true);

            diario.setFoto13(picturePath13);

            imgfoto13.setImageBitmap(bitmap13);

        }

        if (requestCode == 26) {

            if (resultCode == Activity.RESULT_OK) {

                Bitmap resized = BitmapFactory.decodeFile(localDaFoto14);
                Bitmap bitmap = Bitmap.createScaledBitmap(resized, 550, 380, true);
                ByteArrayOutputStream stream11 = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream11);

                diario.setFoto14(localDaFoto14);

                imgfoto14.setImageBitmap(bitmap);


            }
        }

        if (requestCode == 27 && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = this.getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath14 = cursor.getString(columnIndex);
            cursor.close();

            Bitmap resized = BitmapFactory.decodeFile(picturePath14);
            Bitmap bitmap14 = Bitmap.createScaledBitmap(resized, 550, 380, true);

            diario.setFoto14(picturePath14);

            imgfoto14.setImageBitmap(bitmap14);

        }

        if (requestCode == 28) {

            if (resultCode == Activity.RESULT_OK) {

                Bitmap resized = BitmapFactory.decodeFile(localDaFoto15);
                Bitmap bitmap = Bitmap.createScaledBitmap(resized, 550, 380, true);
                ByteArrayOutputStream stream12 = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream12);

                diario.setFoto15(localDaFoto15);

                imgfoto15.setImageBitmap(bitmap);


            }
        }

        if (requestCode == 29 && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = this.getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath15 = cursor.getString(columnIndex);
            cursor.close();

            Bitmap resized = BitmapFactory.decodeFile(picturePath15);
            Bitmap bitmap15 = Bitmap.createScaledBitmap(resized, 550, 380, true);

            diario.setFoto15(picturePath15);

            imgfoto15.setImageBitmap(bitmap15);

        }



        if (requestCode == 30 && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = this.getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath10 = cursor.getString(columnIndex);
            cursor.close();

            Bitmap resized = BitmapFactory.decodeFile(picturePath10);
            Bitmap bitmap10 = Bitmap.createScaledBitmap(resized, 200, 100, true);

            diario.setLogo(picturePath10);

            imglogo.setImageBitmap(bitmap10);

        }


    }




    //atributo da classe.
    private AlertDialog alerta;

    private void exemplo_simples() {
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

                excluir();
                finish();
                Toast.makeText(Relatorio.this, "Relatório Excluído", Toast.LENGTH_SHORT).show();

            }
        });

        //define um botão como negativo.
        builder.setNegativeButton("Manter", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {

                Toast.makeText(Relatorio.this, "Relatório Salvo", Toast.LENGTH_SHORT).show();
            }
        });
        //cria o AlertDialog
        alerta = builder.create();
        //Exibe
        alerta.show();
    }


}
