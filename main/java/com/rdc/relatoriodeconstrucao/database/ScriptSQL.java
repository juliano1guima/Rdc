package com.rdc.relatoriodeconstrucao.database;

/**
 * Created by 40833 on 28/02/2016.
 */
public class ScriptSQL {

    public static String getCreateRelatorio()
    {

        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append(" CREATE TABLE IF NOT EXISTS RELATORIO ( ");
        sqlBuilder.append("_id                INTEGER       NOT NULL ");
        sqlBuilder.append("PRIMARY KEY AUTOINCREMENT, ");
        sqlBuilder.append("OBRA                 VARCHAR (50), ");
        sqlBuilder.append("CONSTA               VARCHAR (14), ");
        sqlBuilder.append("END                  VARCHAR (25), ");
        sqlBuilder.append("NUM                  VARCHAR (25), ");
        sqlBuilder.append("CID                  VARCHAR (25), ");
        sqlBuilder.append("CAMBET               VARCHAR (25), ");
        sqlBuilder.append("BOMBCONC             VARCHAR (25), ");
        sqlBuilder.append("RETRO                VARCHAR (25), ");
        sqlBuilder.append("ESCAV                VARCHAR (25), ");
        sqlBuilder.append("ROLO                 VARCHAR (25), ");
        sqlBuilder.append("PLAT                 VARCHAR (25), ");
        sqlBuilder.append("ACAB                 VARCHAR (25), ");
        sqlBuilder.append("ESPAR                VARCHAR (25), ");
        sqlBuilder.append("TANDEM               VARCHAR (25), ");
        sqlBuilder.append("GUIND                VARCHAR (25), ");
        sqlBuilder.append("PACAR                VARCHAR (25), ");
        sqlBuilder.append("BOB                  VARCHAR (25), ");
        sqlBuilder.append("PATROL               VARCHAR (25), ");
        sqlBuilder.append("COMPAC               VARCHAR (25), ");
        sqlBuilder.append("PIPA                 VARCHAR (25), ");
        sqlBuilder.append("MUNCK                VARCHAR (25), ");
        sqlBuilder.append("CACAMBA              VARCHAR (25), ");
        sqlBuilder.append("ENG                  VARCHAR (25), ");
        sqlBuilder.append("ASSIST               VARCHAR (25), ");
        sqlBuilder.append("MESTRE               VARCHAR (25), ");
        sqlBuilder.append("ENCFORMA             VARCHAR (25), ");
        sqlBuilder.append("CARP                 VARCHAR (25), ");
        sqlBuilder.append("AJUDCARP             VARCHAR (25), ");
        sqlBuilder.append("ENCARM               VARCHAR (25), ");
        sqlBuilder.append("ARM                  VARCHAR (25), ");
        sqlBuilder.append("AJUDARM              VARCHAR (25), ");
        sqlBuilder.append("ENCPED               VARCHAR (25), ");
        sqlBuilder.append("PED                  VARCHAR (25), ");
        sqlBuilder.append("AJUDPED              VARCHAR (25), ");
        sqlBuilder.append("ENCELET              VARCHAR (25), ");
        sqlBuilder.append("ELET                 VARCHAR (25), ");
        sqlBuilder.append("AJUDELET             VARCHAR (25), ");
        sqlBuilder.append("ENCPINT              VARCHAR (25), ");
        sqlBuilder.append("PINT                 VARCHAR (25), ");
        sqlBuilder.append("AJUDPINT             VARCHAR (25), ");
        sqlBuilder.append("ENCENCANADOR         VARCHAR (25), ");
        sqlBuilder.append("ENC                  VARCHAR (25), ");
        sqlBuilder.append("AJUDENC              VARCHAR (25), ");
        sqlBuilder.append("COMENTARIO1          VARCHAR (200), ");
        sqlBuilder.append("COMENTARIO2          VARCHAR (200), ");
        sqlBuilder.append("COMENTARIO3          VARCHAR (200), ");
        sqlBuilder.append("COMENTARIO4          VARCHAR (200), ");
        sqlBuilder.append("COMENTARIO5          VARCHAR (200), ");
        sqlBuilder.append("COMENTARIO6          VARCHAR (200), ");
        sqlBuilder.append("COMENTARIO7          VARCHAR (200), ");
        sqlBuilder.append("COMENTARIO8          VARCHAR (200), ");
        sqlBuilder.append("COMENTARIO9          VARCHAR (200), ");
        sqlBuilder.append("COMENTARIO10         VARCHAR (200), ");
        sqlBuilder.append("COMENTARIO11         VARCHAR (200), ");
        sqlBuilder.append("COMENTARIO12         VARCHAR (200), ");
        sqlBuilder.append("COMENTARIO13         VARCHAR (200), ");
        sqlBuilder.append("COMENTARIO14         VARCHAR (200), ");
        sqlBuilder.append("COMENTARIO15         VARCHAR (200), ");
        sqlBuilder.append("EST                  VARCHAR (25), ");
        sqlBuilder.append("CLIM1                VARCHAR (25), ");
        sqlBuilder.append("CLIM2                VARCHAR (25), ");
        sqlBuilder.append("AREAOBRA1            VARCHAR (25), ");
        sqlBuilder.append("AREAOBRA2            VARCHAR (25), ");
        sqlBuilder.append("AREAOBRA3            VARCHAR (25), ");
        sqlBuilder.append("AREAOBRA4            VARCHAR (25), ");
        sqlBuilder.append("AREAOBRA5            VARCHAR (25), ");
        sqlBuilder.append("AREAOBRA6            VARCHAR (25), ");
        sqlBuilder.append("AREAOBRA7            VARCHAR (25), ");
        sqlBuilder.append("AREAOBRA8            VARCHAR (25), ");
        sqlBuilder.append("AREAOBRA9            VARCHAR (25), ");
        sqlBuilder.append("AREAOBRA10           VARCHAR (25), ");
        sqlBuilder.append("AREAOBRA11           VARCHAR (25), ");
        sqlBuilder.append("AREAOBRA12           VARCHAR (25), ");
        sqlBuilder.append("AREAOBRA13           VARCHAR (25), ");
        sqlBuilder.append("AREAOBRA14           VARCHAR (25), ");
        sqlBuilder.append("AREAOBRA15           VARCHAR (25), ");
        sqlBuilder.append("LOGO                 VARCHAR (200), ");
        sqlBuilder.append("FOTO1                VARCHAR (200), ");
        sqlBuilder.append("FOTO2                VARCHAR (200), ");
        sqlBuilder.append("FOTO3                VARCHAR (200), ");
        sqlBuilder.append("FOTO4                VARCHAR (200), ");
        sqlBuilder.append("FOTO5                VARCHAR (200), ");
        sqlBuilder.append("FOTO6                VARCHAR (200), ");
        sqlBuilder.append("FOTO7                VARCHAR (200), ");
        sqlBuilder.append("FOTO8                VARCHAR (200), ");
        sqlBuilder.append("FOTO9                VARCHAR (200), ");
        sqlBuilder.append("FOTO10               VARCHAR (200), ");
        sqlBuilder.append("FOTO11               VARCHAR (200), ");
        sqlBuilder.append("FOTO12               VARCHAR (200), ");
        sqlBuilder.append("FOTO13               VARCHAR (200), ");
        sqlBuilder.append("FOTO14               VARCHAR (200), ");
        sqlBuilder.append("FOTO15               VARCHAR (200), ");
        sqlBuilder.append("DATAINI              VARCHAR (14), ");
        sqlBuilder.append("DATAENT              VARCHAR (14), ");
        sqlBuilder.append("DATA                 VARCHAR (14)); ");

        return sqlBuilder.toString();

    }

}
