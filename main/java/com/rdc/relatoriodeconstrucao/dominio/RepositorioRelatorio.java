package com.rdc.relatoriodeconstrucao.dominio;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.ArrayAdapter;

import com.rdc.relatoriodeconstrucao.dominio.entidades.Diario;

/**
 * Created by 40833 on 28/02/2016.
 */
public class RepositorioRelatorio {

    private SQLiteDatabase conn;

    public RepositorioRelatorio (SQLiteDatabase conn)
    {
        this.conn = conn;

    }

    private ContentValues preencheContentValues (Diario diario){

        ContentValues values = new ContentValues();

        values.put("OBRA"      , diario.getObra());
        values.put("CONSTA"    , diario.getConsta());
        values.put("END"       , diario.getEnd());
        values.put("NUM"       , diario.getNum());
        values.put("CID"       , diario.getCid());
        values.put("CAMBET"    , diario.getCambet());
        values.put("BOMBCONC"  , diario.getBombconc());
        values.put("RETRO"     , diario.getRetro());
        values.put("ESCAV"     , diario.getEscav());
        values.put("ROLO"      , diario.getRolo());
        values.put("PLAT"      , diario.getPlat());
        values.put("ACAB"      , diario.getAcab());
        values.put("ESPAR"     , diario.getEspar());
        values.put("TANDEM"    , diario.getTandem());
        values.put("GUIND"     , diario.getGuind());
        values.put("PACAR"     , diario.getPacar());
        values.put("BOB"       , diario.getBob());
        values.put("PATROL"    , diario.getPatrol());
        values.put("COMPAC"    , diario.getCompac());
        values.put("PIPA"      , diario.getPipa());
        values.put("MUNCK"     , diario.getMunck());
        values.put("CACAMBA"   , diario.getCacamba());
        values.put("ENG"       , diario.getEng());
        values.put("ASSIST"    , diario.getAssist());
        values.put("MESTRE"    , diario.getMestre());
        values.put("ENCFORMA"  , diario.getEncforma());
        values.put("CARP"      , diario.getCarp());
        values.put("AJUDCARP"  , diario.getAjudcarp());
        values.put("ENCARM"    , diario.getEncarm());
        values.put("ARM"       , diario.getArm());
        values.put("AJUDARM"   , diario.getAjudarm());
        values.put("ENCPED"    , diario.getEncped());
        values.put("PED"       , diario.getPed());
        values.put("AJUDPED"   , diario.getAjudped());
        values.put("ENCELET"   , diario.getEncelet());
        values.put("ELET"      , diario.getElet());
        values.put("AJUDELET"  , diario.getAjudelet());
        values.put("ENCPINT"   , diario.getEncpint());
        values.put("PINT"      , diario.getPint());
        values.put("AJUDPINT"  , diario.getAjudpint());
        values.put("ENCENCANADOR" , diario.getEncencanador());
        values.put("ENC"       , diario.getEnc());
        values.put("AJUDENC"   , diario.getAjudenc());
        values.put("EST"       , diario.getEst());
        values.put("CLIM1"     , diario.getClim1());
        values.put("CLIM2"     , diario.getClim2());
        values.put("COMENTARIO1", diario.getComentario1());
        values.put("COMENTARIO2", diario.getComentario2());
        values.put("COMENTARIO3", diario.getComentario3());
        values.put("COMENTARIO4", diario.getComentario4());
        values.put("COMENTARIO5", diario.getComentario5());
        values.put("COMENTARIO6", diario.getComentario6());
        values.put("COMENTARIO7", diario.getComentario7());
        values.put("COMENTARIO8", diario.getComentario8());
        values.put("COMENTARIO9", diario.getComentario9());
        values.put("COMENTARIO10", diario.getComentario10());
        values.put("COMENTARIO11", diario.getComentario11());
        values.put("COMENTARIO12", diario.getComentario12());
        values.put("COMENTARIO13", diario.getComentario13());
        values.put("COMENTARIO14", diario.getComentario14());
        values.put("COMENTARIO15", diario.getComentario15());
        values.put("AREAOBRA1", diario.getAreaobra1());
        values.put("AREAOBRA2", diario.getAreaobra2());
        values.put("AREAOBRA3", diario.getAreaobra3());
        values.put("AREAOBRA4", diario.getAreaobra4());
        values.put("AREAOBRA5", diario.getAreaobra5());
        values.put("AREAOBRA6", diario.getAreaobra6());
        values.put("AREAOBRA7", diario.getAreaobra7());
        values.put("AREAOBRA8", diario.getAreaobra8());
        values.put("AREAOBRA9", diario.getAreaobra9());
        values.put("AREAOBRA10", diario.getAreaobra10());
        values.put("AREAOBRA11", diario.getAreaobra11());
        values.put("AREAOBRA12", diario.getAreaobra12());
        values.put("AREAOBRA13", diario.getAreaobra13());
        values.put("AREAOBRA14", diario.getAreaobra14());
        values.put("AREAOBRA15", diario.getAreaobra15());
        values.put("LOGO"     , diario.getLogo());
        values.put("FOTO1"    , diario.getFoto1());
        values.put("FOTO2"    , diario.getFoto2());
        values.put("FOTO3"    , diario.getFoto3());
        values.put("FOTO4"    , diario.getFoto4());
        values.put("FOTO5"    , diario.getFoto5());
        values.put("FOTO6"    , diario.getFoto6());
        values.put("FOTO7"    , diario.getFoto7());
        values.put("FOTO8"    , diario.getFoto8());
        values.put("FOTO9"    , diario.getFoto9());
        values.put("FOTO10"    , diario.getFoto10());
        values.put("FOTO11"    , diario.getFoto11());
        values.put("FOTO12"    , diario.getFoto12());
        values.put("FOTO13"    , diario.getFoto13());
        values.put("FOTO14"    , diario.getFoto14());
        values.put("FOTO15"    , diario.getFoto15());
        values.put("DATA"     , diario.getData());
        values.put("DATAINI"  , diario.getDataini());
        values.put("DATAENT"  , diario.getDataent());

        return values;

    }

    public void excluir (long id){

        conn.delete("RELATORIO", " _id = ? ", new String[]{String.valueOf(id)});

    }


    public void alterar (Diario diario){

        ContentValues values = preencheContentValues(diario);
        conn.update("RELATORIO", values, "_id = ?", new String[]{String.valueOf(diario.getId())});
    }


    public void inserir (Diario diario){

        ContentValues values = preencheContentValues(diario);
        conn.insertOrThrow("RELATORIO", null, values);
    }

    public View ler(Diario diario){

        ContentValues values = preencheContentValues(diario);
        conn.isReadOnly();
        return null;
    }


    public ArrayAdapter<Diario> buscaRelatorios(Context context)
    {

        ArrayAdapter<Diario> adpRelatorio = new ArrayAdapter<Diario>(context, android.R.layout.simple_list_item_1);

        Cursor cursor = conn.query("RELATORIO", null, null, null, null, null, null);

        if (cursor.getCount() > 0)
        {
            cursor.moveToFirst();

            do
            {

                Diario diario = new Diario();

                diario.setId(cursor.getLong( cursor.getColumnIndex(Diario.ID)));
                diario.setObra(cursor.getString(cursor.getColumnIndex(Diario.OBRA)));
                diario.setConsta(cursor.getString(cursor.getColumnIndex(Diario.CONSTA)));
                diario.setEnd(cursor.getString(cursor.getColumnIndex(Diario.END)));
                diario.setNum(cursor.getString(cursor.getColumnIndex(Diario.NUM)));
                diario.setCid(cursor.getString(cursor.getColumnIndex(Diario.CID)));
                diario.setCambet(cursor.getString(cursor.getColumnIndex(Diario.CAMBET)));
                diario.setBombconc(cursor.getString(cursor.getColumnIndex(Diario.BOMBCONC)));
                diario.setRetro(cursor.getString(cursor.getColumnIndex(Diario.RETRO)));
                diario.setEscav(cursor.getString(cursor.getColumnIndex(Diario.ESCAV)));
                diario.setRolo(cursor.getString(cursor.getColumnIndex(Diario.ROLO)));
                diario.setPlat(cursor.getString(cursor.getColumnIndex(Diario.PLAT)));
                diario.setAcab(cursor.getString(cursor.getColumnIndex(Diario.ACAB)));
                diario.setEspar(cursor.getString(cursor.getColumnIndex(Diario.ESPAR)));
                diario.setTandem(cursor.getString(cursor.getColumnIndex(Diario.TANDEM)));
                diario.setGuind(cursor.getString(cursor.getColumnIndex(Diario.GUIND)));
                diario.setPacar(cursor.getString(cursor.getColumnIndex(Diario.PACAR)));
                diario.setBob(cursor.getString(cursor.getColumnIndex(Diario.BOB)));
                diario.setPatrol(cursor.getString(cursor.getColumnIndex(Diario.PATROL)));
                diario.setCompac(cursor.getString(cursor.getColumnIndex(Diario.COMPAC)));
                diario.setPipa(cursor.getString(cursor.getColumnIndex(Diario.PIPA)));
                diario.setMunck(cursor.getString(cursor.getColumnIndex(Diario.MUNCK)));
                diario.setCacamba(cursor.getString(cursor.getColumnIndex(Diario.CACAMBA)));
                diario.setEng(cursor.getString(cursor.getColumnIndex(Diario.ENG)));
                diario.setAssist(cursor.getString(cursor.getColumnIndex(Diario.ASSIST)));
                diario.setMestre(cursor.getString(cursor.getColumnIndex(Diario.MESTRE)));
                diario.setEncforma(cursor.getString(cursor.getColumnIndex(Diario.ENCFORMA)));
                diario.setCarp(cursor.getString(cursor.getColumnIndex(Diario.CARP)));
                diario.setAjudcarp(cursor.getString(cursor.getColumnIndex(Diario.AJUDCARP)));
                diario.setEncarm(cursor.getString(cursor.getColumnIndex(Diario.ENCARM)));
                diario.setArm(cursor.getString(cursor.getColumnIndex(Diario.ARM)));
                diario.setAjudarm(cursor.getString(cursor.getColumnIndex(Diario.AJUDARM)));
                diario.setEncped(cursor.getString(cursor.getColumnIndex(Diario.ENCPED)));
                diario.setPed(cursor.getString(cursor.getColumnIndex(Diario.PED)));
                diario.setAjudped(cursor.getString(cursor.getColumnIndex(Diario.AJUDPED)));
                diario.setEncelet(cursor.getString(cursor.getColumnIndex(Diario.ENCELET)));
                diario.setElet(cursor.getString(cursor.getColumnIndex(Diario.ELET)));
                diario.setAjudelet(cursor.getString(cursor.getColumnIndex(Diario.AJUDELET)));
                diario.setEncpint(cursor.getString(cursor.getColumnIndex(Diario.ENCPINT)));
                diario.setPint(cursor.getString(cursor.getColumnIndex(Diario.PINT)));
                diario.setAjudpint(cursor.getString(cursor.getColumnIndex(Diario.AJUDPINT)));
                diario.setEncencanador(cursor.getString(cursor.getColumnIndex(Diario.ENCENCANADOR)));
                diario.setEnc(cursor.getString(cursor.getColumnIndex(Diario.ENC)));
                diario.setAjudenc(cursor.getString(cursor.getColumnIndex(Diario.AJUDENC)));
                diario.setEst(cursor.getString(cursor.getColumnIndex(Diario.EST)));
                diario.setClim1(cursor.getString(cursor.getColumnIndex(Diario.CLIM1)));
                diario.setClim2(cursor.getString(cursor.getColumnIndex(Diario.CLIM2)));
                diario.setComentario1(cursor.getString(cursor.getColumnIndex(Diario.COMENTARIO1)));
                diario.setComentario2(cursor.getString(cursor.getColumnIndex(Diario.COMENTARIO2)));
                diario.setComentario3(cursor.getString(cursor.getColumnIndex(Diario.COMENTARIO3)));
                diario.setComentario4(cursor.getString(cursor.getColumnIndex(Diario.COMENTARIO4)));
                diario.setComentario5(cursor.getString(cursor.getColumnIndex(Diario.COMENTARIO5)));
                diario.setComentario6(cursor.getString(cursor.getColumnIndex(Diario.COMENTARIO6)));
                diario.setComentario7(cursor.getString(cursor.getColumnIndex(Diario.COMENTARIO7)));
                diario.setComentario8(cursor.getString(cursor.getColumnIndex(Diario.COMENTARIO8)));
                diario.setComentario9(cursor.getString(cursor.getColumnIndex(Diario.COMENTARIO9)));
                diario.setComentario10(cursor.getString(cursor.getColumnIndex(Diario.COMENTARIO10)));
                diario.setComentario11(cursor.getString(cursor.getColumnIndex(Diario.COMENTARIO11)));
                diario.setComentario12(cursor.getString(cursor.getColumnIndex(Diario.COMENTARIO12)));
                diario.setComentario13(cursor.getString(cursor.getColumnIndex(Diario.COMENTARIO13)));
                diario.setComentario14(cursor.getString(cursor.getColumnIndex(Diario.COMENTARIO14)));
                diario.setComentario15(cursor.getString(cursor.getColumnIndex(Diario.COMENTARIO15)));
                diario.setAreaobra1(cursor.getString(cursor.getColumnIndex(Diario.AREAOBRA1)));
                diario.setAreaobra2(cursor.getString(cursor.getColumnIndex(Diario.AREAOBRA2)));
                diario.setAreaobra3(cursor.getString(cursor.getColumnIndex(Diario.AREAOBRA3)));
                diario.setAreaobra4(cursor.getString(cursor.getColumnIndex(Diario.AREAOBRA4)));
                diario.setAreaobra5(cursor.getString(cursor.getColumnIndex(Diario.AREAOBRA5)));
                diario.setAreaobra6(cursor.getString(cursor.getColumnIndex(Diario.AREAOBRA6)));
                diario.setAreaobra7(cursor.getString(cursor.getColumnIndex(Diario.AREAOBRA7)));
                diario.setAreaobra8(cursor.getString(cursor.getColumnIndex(Diario.AREAOBRA8)));
                diario.setAreaobra9(cursor.getString(cursor.getColumnIndex(Diario.AREAOBRA9)));
                diario.setAreaobra10(cursor.getString(cursor.getColumnIndex(Diario.AREAOBRA10)));
                diario.setAreaobra11(cursor.getString(cursor.getColumnIndex(Diario.AREAOBRA11)));
                diario.setAreaobra12(cursor.getString(cursor.getColumnIndex(Diario.AREAOBRA12)));
                diario.setAreaobra13(cursor.getString(cursor.getColumnIndex(Diario.AREAOBRA13)));
                diario.setAreaobra14(cursor.getString(cursor.getColumnIndex(Diario.AREAOBRA14)));
                diario.setAreaobra15(cursor.getString(cursor.getColumnIndex(Diario.AREAOBRA15)));
                diario.setLogo(cursor.getString(cursor.getColumnIndex(Diario.LOGO)));
                diario.setFoto1(cursor.getString(cursor.getColumnIndex(Diario.FOTO1)));
                diario.setFoto2(cursor.getString(cursor.getColumnIndex(Diario.FOTO2)));
                diario.setFoto3(cursor.getString(cursor.getColumnIndex(Diario.FOTO3)));
                diario.setFoto4(cursor.getString(cursor.getColumnIndex(Diario.FOTO4)));
                diario.setFoto5(cursor.getString(cursor.getColumnIndex(Diario.FOTO5)));
                diario.setFoto6(cursor.getString(cursor.getColumnIndex(Diario.FOTO6)));
                diario.setFoto7(cursor.getString(cursor.getColumnIndex(Diario.FOTO7)));
                diario.setFoto8(cursor.getString(cursor.getColumnIndex(Diario.FOTO8)));
                diario.setFoto9(cursor.getString(cursor.getColumnIndex(Diario.FOTO9)));
                diario.setFoto10(cursor.getString(cursor.getColumnIndex(Diario.FOTO10)));
                diario.setFoto11(cursor.getString(cursor.getColumnIndex(Diario.FOTO11)));
                diario.setFoto12(cursor.getString(cursor.getColumnIndex(Diario.FOTO12)));
                diario.setFoto13(cursor.getString(cursor.getColumnIndex(Diario.FOTO13)));
                diario.setFoto14(cursor.getString(cursor.getColumnIndex(Diario.FOTO14)));
                diario.setFoto15(cursor.getString(cursor.getColumnIndex(Diario.FOTO15)));
                diario.setDataini(cursor.getString(cursor.getColumnIndex(Diario.DATAINI)));
                diario.setDataent(cursor.getString(cursor.getColumnIndex(Diario.DATAENT)));
                diario.setData(cursor.getString(cursor.getColumnIndex(Diario.DATA)));

                adpRelatorio.add(diario);

            }while (cursor.moveToNext());
        }

        return adpRelatorio;
    }


}