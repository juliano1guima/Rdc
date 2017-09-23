package com.rdc.relatoriodeconstrucao.dominio.entidades;

import java.io.Serializable;

/**
 * Created by 40833 on 28/02/2016.
 */
public class Diario implements Serializable {


    public static String ID = "_id";
    public static String OBRA = "OBRA";
    public static String CONSTA = "CONSTA";
    public static String END = "END";
    public static String NUM = "NUM";
    public static String CID = "CID";
    public static String CAMBET = "CAMBET";
    public static String BOMBCONC = "BOMBCONC";
    public static String RETRO = "RETRO";
    public static String ESCAV = "ESCAV";
    public static String ROLO = "ROLO";
    public static String PLAT = "PLAT";
    public static String ACAB = "ACAB";
    public static String ESPAR = "ESPAR";
    public static String TANDEM = "TANDEM";
    public static String GUIND = "GUIND";
    public static String PACAR = "PACAR";
    public static String BOB = "BOB";
    public static String PATROL = "PATROL";
    public static String COMPAC = "COMPAC";
    public static String PIPA = "PIPA";
    public static String MUNCK = "MUNCK";
    public static String CACAMBA = "CACAMBA";
    public static String ENG = "ENG";
    public static String ASSIST = "ASSIST";
    public static String MESTRE = "MESTRE";
    public static String ENCFORMA = "ENCFORMA";
    public static String CARP = "CARP";
    public static String AJUDCARP = "AJUDCARP";
    public static String ENCARM = "ENCARM";
    public static String ARM = "ARM";
    public static String AJUDARM = "AJUDARM";
    public static String ENCPED = "ENCPED";
    public static String PED = "PED";
    public static String AJUDPED = "AJUDPED";
    public static String ENCELET = "ENCELET";
    public static String ELET = "ELET";
    public static String AJUDELET = "AJUDELET";
    public static String ENCPINT = "ENCPINT";
    public static String PINT = "PINT";
    public static String AJUDPINT = "AJUDPINT";
    public static String ENCENCANADOR = "ENCENCANADOR";
    public static String ENC = "ENC";
    public static String AJUDENC = "AJUDENC";
    public static String COMENTARIO1 = "COMENTARIO1";
    public static String COMENTARIO2 = "COMENTARIO2";
    public static String COMENTARIO3 = "COMENTARIO3";
    public static String COMENTARIO4 = "COMENTARIO4";
    public static String COMENTARIO5 = "COMENTARIO5";
    public static String COMENTARIO6 = "COMENTARIO6";
    public static String COMENTARIO7 = "COMENTARIO7";
    public static String COMENTARIO8 = "COMENTARIO8";
    public static String COMENTARIO9 = "COMENTARIO9";
    public static String COMENTARIO10 = "COMENTARIO10";
    public static String COMENTARIO11 = "COMENTARIO11";
    public static String COMENTARIO12 = "COMENTARIO12";
    public static String COMENTARIO13 = "COMENTARIO13";
    public static String COMENTARIO14 = "COMENTARIO14";
    public static String COMENTARIO15 = "COMENTARIO15";
    public static String EST = "EST";
    public static String CLIM1 = "CLIM1";
    public static String CLIM2 = "CLIM2";
    public static String AREAOBRA1 = "AREAOBRA1";
    public static String AREAOBRA2 = "AREAOBRA2";
    public static String AREAOBRA3 = "AREAOBRA3";
    public static String AREAOBRA4 = "AREAOBRA4";
    public static String AREAOBRA5 = "AREAOBRA5";
    public static String AREAOBRA6 = "AREAOBRA6";
    public static String AREAOBRA7 = "AREAOBRA7";
    public static String AREAOBRA8 = "AREAOBRA8";
    public static String AREAOBRA9 = "AREAOBRA9";
    public static String AREAOBRA10 = "AREAOBRA10";
    public static String AREAOBRA11 = "AREAOBRA11";
    public static String AREAOBRA12 = "AREAOBRA12";
    public static String AREAOBRA13 = "AREAOBRA13";
    public static String AREAOBRA14 = "AREAOBRA14";
    public static String AREAOBRA15 = "AREAOBRA15";
    public  static String LOGO = "LOGO";
    public  static String FOTO1 = "FOTO1";
    public  static String FOTO2 = "FOTO2";
    public  static String FOTO3 = "FOTO3";
    public  static String FOTO4 = "FOTO4";
    public  static String FOTO5 = "FOTO5";
    public  static String FOTO6 = "FOTO6";
    public  static String FOTO7 = "FOTO7";
    public  static String FOTO8 = "FOTO8";
    public  static String FOTO9 = "FOTO9";
    public  static String FOTO10 = "FOTO10";
    public  static String FOTO11 = "FOTO11";
    public  static String FOTO12 = "FOTO12";
    public  static String FOTO13 = "FOTO13";
    public  static String FOTO14 = "FOTO14";
    public  static String FOTO15 = "FOTO15";
    public static String DATA = "DATA";
    public static String DATAINI = "DATAINI";
    public static String DATAENT = "DATAENT";



    public long id;
    public String obra;
    public String consta;
    public String end;
    public String num;
    public String cid;
    public String bombconc;
    public String cambet;
    public String retro;
    public String escav;
    public String rolo;
    public String plat;
    public String acab;
    public String espar;
    public String tandem;
    public String guind;
    public String pacar;
    public String bob;
    public String patrol;
    public String compac;
    public String pipa;
    public String munck;
    public String cacamba;
    public String eng;
    public String assist;
    public String mestre;
    public String encforma;
    public String carp;
    public String ajudcarp;
    public String encarm;
    public String arm;
    public String ajudarm;
    public String encped;
    public String ped;
    public String ajudped;
    public String encelet;
    public String elet;
    public String ajudelet;
    public String encpint;
    public String pint;
    public String ajudpint;
    public String encencanador;
    public String enc;
    public String ajudenc;
    public String est;
    public String clim1;
    public String clim2;
    public String comentario1;
    public String comentario2;
    public String comentario3;
    public String comentario4;
    public String comentario5;
    public String comentario6;
    public String comentario7;
    public String comentario8;
    public String comentario9;
    public String comentario10;
    public String comentario11;
    public String comentario12;
    public String comentario13;
    public String comentario14;
    public String comentario15;
    public String areaobra1;
    public String areaobra2;
    public String areaobra3;
    public String areaobra4;
    public String areaobra5;
    public String areaobra6;
    public String areaobra7;
    public String areaobra8;
    public String areaobra9;
    public String areaobra10;
    public String areaobra11;
    public String areaobra12;
    public String areaobra13;
    public String areaobra14;
    public String areaobra15;
    public String logo;
    public String foto1;
    public String foto2;
    public String foto3;
    public String foto4;
    public String foto5;
    public String foto6;
    public String foto7;
    public String foto8;
    public String foto9;
    public String foto10;
    public String foto11;
    public String foto12;
    public String foto13;
    public String foto14;
    public String foto15;
    public String data;
    public String dataini;
    public String dataent;



    public Diario(){

        id = 0;

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getObra() {
        return obra;
    }

    public void setObra(String obra) {
        this.obra = obra;
    }

    public String getConsta() {
        return consta;
    }

    public void setConsta(String consta) {
        this.consta = consta;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getBombconc() {
        return bombconc;
    }

    public void setBombconc(String bombconc) {
        this.bombconc = bombconc;
    }

    public String getCambet() {
        return cambet;
    }

    public void setCambet(String cambet) {
        this.cambet = cambet;
    }

    public String getRetro() {
        return retro;
    }

    public void setRetro(String retro) {
        this.retro = retro;
    }

    public String getEscav() {
        return escav;
    }

    public void setEscav(String escav) {
        this.escav = escav;
    }

    public String getRolo() {
        return rolo;
    }

    public void setRolo(String rolo) {
        this.rolo = rolo;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getAcab() {
        return acab;
    }

    public void setAcab(String acab) {
        this.acab = acab;
    }

    public String getEspar() {
        return espar;
    }

    public void setEspar(String espar) {
        this.espar = espar;
    }

    public String getTandem() {
        return tandem;
    }

    public void setTandem(String tandem) {
        this.tandem = tandem;
    }

    public String getGuind() {
        return guind;
    }

    public void setGuind(String guind) {
        this.guind = guind;
    }

    public String getPacar() {
        return pacar;
    }

    public void setPacar(String pacar) {
        this.pacar = pacar;
    }

    public String getBob() {
        return bob;
    }

    public void setBob(String bob) {
        this.bob = bob;
    }

    public String getPatrol() {
        return patrol;
    }

    public void setPatrol(String patrol) {
        this.patrol = patrol;
    }

    public String getCompac() {
        return compac;
    }

    public void setCompac(String compac) {
        this.compac = compac;
    }

    public String getPipa() {
        return pipa;
    }

    public void setPipa(String pipa) {
        this.pipa = pipa;
    }

    public String getMunck() {
        return munck;
    }

    public void setMunck(String munck) {
        this.munck = munck;
    }

    public String getCacamba() {
        return cacamba;
    }

    public void setCacamba(String cacamba) {
        this.cacamba = cacamba;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getAssist() {
        return assist;
    }

    public void setAssist(String assist) {
        this.assist = assist;
    }

    public String getMestre() {
        return mestre;
    }

    public void setMestre(String mestre) {
        this.mestre = mestre;
    }

    public String getEncforma() {
        return encforma;
    }

    public void setEncforma(String encforma) {
        this.encforma = encforma;
    }

    public String getCarp() {
        return carp;
    }

    public void setCarp(String carp) {
        this.carp = carp;
    }

    public String getAjudcarp() {
        return ajudcarp;
    }

    public void setAjudcarp(String ajudcarp) {
        this.ajudcarp = ajudcarp;
    }

    public String getEncarm() {
        return encarm;
    }

    public void setEncarm(String encarm) {
        this.encarm = encarm;
    }

    public String getArm() {
        return arm;
    }

    public void setArm(String arm) {
        this.arm = arm;
    }

    public String getAjudarm() {
        return ajudarm;
    }

    public void setAjudarm(String ajudarm) {
        this.ajudarm = ajudarm;
    }

    public String getEncped() {
        return encped;
    }

    public void setEncped(String encped) {
        this.encped = encped;
    }

    public String getPed() {
        return ped;
    }

    public void setPed(String ped) {
        this.ped = ped;
    }

    public String getAjudped() {
        return ajudped;
    }

    public void setAjudped(String ajudped) {
        this.ajudped = ajudped;
    }

    public String getEncelet() {
        return encelet;
    }

    public void setEncelet(String encelet) {
        this.encelet = encelet;
    }

    public String getElet() {
        return elet;
    }

    public void setElet(String elet) {
        this.elet = elet;
    }

    public String getAjudelet() {
        return ajudelet;
    }

    public void setAjudelet(String ajudelet) {
        this.ajudelet = ajudelet;
    }

    public String getEncpint() {
        return encpint;
    }

    public void setEncpint(String encpint) {
        this.encpint = encpint;
    }

    public String getPint() {
        return pint;
    }

    public void setPint(String pint) {
        this.pint = pint;
    }

    public String getAjudpint() {
        return ajudpint;
    }

    public void setAjudpint(String ajudpint) {
        this.ajudpint = ajudpint;
    }

    public String getEncencanador() {
        return encencanador;
    }

    public void setEncencanador(String encencanador) {
        this.encencanador = encencanador;
    }

    public String getEnc() {
        return enc;
    }

    public void setEnc(String enc) {
        this.enc = enc;
    }

    public String getAjudenc() {
        return ajudenc;
    }

    public void setAjudenc(String ajudenc) {
        this.ajudenc = ajudenc;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

    public String getClim1() {
        return clim1;
    }

    public void setClim1(String clim1) {
        this.clim1 = clim1;
    }

    public String getClim2() {
        return clim2;
    }

    public void setClim2(String clim2) {
        this.clim2 = clim2;
    }

    public String getComentario1() {
        return comentario1;
    }

    public void setComentario1(String comentario1) {
        this.comentario1 = comentario1;
    }

    public String getComentario2() {
        return comentario2;
    }

    public void setComentario2(String comentario2) {
        this.comentario2 = comentario2;
    }

    public String getComentario3() {
        return comentario3;
    }

    public void setComentario3(String comentario3) {
        this.comentario3 = comentario3;
    }

    public String getComentario4() {
        return comentario4;
    }

    public void setComentario4(String comentario4) {
        this.comentario4 = comentario4;
    }

    public String getComentario5() {
        return comentario5;
    }

    public void setComentario5(String comentario5) {
        this.comentario5 = comentario5;
    }

    public String getComentario6() {
        return comentario6;
    }

    public void setComentario6(String comentario6) {
        this.comentario6 = comentario6;
    }

    public String getComentario7() {
        return comentario7;
    }

    public void setComentario7(String comentario7) {
        this.comentario7 = comentario7;
    }

    public String getComentario8() {
        return comentario8;
    }

    public void setComentario8(String comentario8) {
        this.comentario8 = comentario8;
    }

    public String getComentario9() {
        return comentario9;
    }

    public void setComentario9(String comentario9) {
        this.comentario9 = comentario9;
    }

    public String getComentario10() {
        return comentario10;
    }

    public void setComentario10(String comentario10) {
        this.comentario10 = comentario10;
    }

    public String getComentario11() {
        return comentario11;
    }

    public void setComentario11(String comentario11) {
        this.comentario11 = comentario11;
    }

    public String getComentario12() {
        return comentario12;
    }

    public void setComentario12(String comentario12) {
        this.comentario12 = comentario12;
    }

    public String getComentario13() {
        return comentario13;
    }

    public void setComentario13(String comentario13) {
        this.comentario13 = comentario13;
    }

    public String getComentario14() {
        return comentario14;
    }

    public void setComentario14(String comentario14) {
        this.comentario14 = comentario14;
    }

    public String getComentario15() {
        return comentario15;
    }

    public void setComentario15(String comentario15) {
        this.comentario15 = comentario15;
    }

    public String getAreaobra1() {
        return areaobra1;
    }

    public void setAreaobra1(String areaobra1) {
        this.areaobra1 = areaobra1;
    }

    public String getAreaobra2() {
        return areaobra2;
    }

    public void setAreaobra2(String areaobra2) {
        this.areaobra2 = areaobra2;
    }

    public String getAreaobra3() {
        return areaobra3;
    }

    public void setAreaobra3(String areaobra3) {
        this.areaobra3 = areaobra3;
    }

    public String getAreaobra4() {
        return areaobra4;
    }

    public void setAreaobra4(String areaobra4) {
        this.areaobra4 = areaobra4;
    }

    public String getAreaobra5() {
        return areaobra5;
    }

    public void setAreaobra5(String areaobra5) {
        this.areaobra5 = areaobra5;
    }

    public String getAreaobra6() {
        return areaobra6;
    }

    public void setAreaobra6(String areaobra6) {
        this.areaobra6 = areaobra6;
    }

    public String getAreaobra7() {
        return areaobra7;
    }

    public void setAreaobra7(String areaobra7) {
        this.areaobra7 = areaobra7;
    }

    public String getAreaobra8() {
        return areaobra8;
    }

    public void setAreaobra8(String areaobra8) {
        this.areaobra8 = areaobra8;
    }

    public String getAreaobra9() {
        return areaobra9;
    }

    public void setAreaobra9(String areaobra9) {
        this.areaobra9 = areaobra9;
    }

    public String getAreaobra10() {
        return areaobra10;
    }

    public void setAreaobra10(String areaobra10) {
        this.areaobra10 = areaobra10;
    }

    public String getAreaobra11() {
        return areaobra11;
    }

    public void setAreaobra11(String areaobra11) {
        this.areaobra11 = areaobra11;
    }

    public String getAreaobra12() {
        return areaobra12;
    }

    public void setAreaobra12(String areaobra12) {
        this.areaobra12 = areaobra12;
    }

    public String getAreaobra13() {
        return areaobra13;
    }

    public void setAreaobra13(String areaobra13) {
        this.areaobra13 = areaobra13;
    }

    public String getAreaobra14() {
        return areaobra14;
    }

    public void setAreaobra14(String areaobra14) {
        this.areaobra14 = areaobra14;
    }

    public String getAreaobra15() {
        return areaobra15;
    }

    public void setAreaobra15(String areaobra15) {
        this.areaobra15 = areaobra15;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getFoto1() {
        return foto1;
    }

    public void setFoto1(String foto1) {
        this.foto1 = foto1;
    }

    public String getFoto2() {
        return foto2;
    }

    public void setFoto2(String foto2) {
        this.foto2 = foto2;
    }

    public String getFoto3() {
        return foto3;
    }

    public void setFoto3(String foto3) {
        this.foto3 = foto3;
    }

    public String getFoto4() {
        return foto4;
    }

    public void setFoto4(String foto4) {
        this.foto4 = foto4;
    }

    public String getFoto5() {
        return foto5;
    }

    public void setFoto5(String foto5) {
        this.foto5 = foto5;
    }

    public String getFoto6() {
        return foto6;
    }

    public void setFoto6(String foto6) {
        this.foto6 = foto6;
    }

    public String getFoto7() {
        return foto7;
    }

    public void setFoto7(String foto7) {
        this.foto7 = foto7;
    }

    public String getFoto8() {
        return foto8;
    }

    public void setFoto8(String foto8) {
        this.foto8 = foto8;
    }

    public String getFoto9() {
        return foto9;
    }

    public void setFoto9(String foto9) {
        this.foto9 = foto9;
    }

    public String getFoto10() {
        return foto10;
    }

    public void setFoto10(String foto10) {
        this.foto10 = foto10;
    }

    public String getFoto11() {
        return foto11;
    }

    public void setFoto11(String foto11) {
        this.foto11 = foto11;
    }

    public String getFoto12() {
        return foto12;
    }

    public void setFoto12(String foto12) {
        this.foto12 = foto12;
    }

    public String getFoto13() {
        return foto13;
    }

    public void setFoto13(String foto13) {
        this.foto13 = foto13;
    }

    public String getFoto14() {
        return foto14;
    }

    public void setFoto14(String foto14) {
        this.foto14 = foto14;
    }

    public String getFoto15() {
        return foto15;
    }

    public void setFoto15(String foto15) {
        this.foto15 = foto15;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDataini() {
        return dataini;
    }

    public void setDataini(String dataini) {
        this.dataini = dataini;
    }

    public String getDataent() {
        return dataent;
    }

    public void setDataent(String dataent) {
        this.dataent = dataent;
    }

    @Override
    public String toString ()
    {

        return " Relatório " + " - "+ data + " - "+ obra;

    }

}
