//package ziemansoft.ziemapp.coinsonline.pojo
//
//import com.google.gson.annotations.Expose
//import com.google.gson.annotations.SerializedName
//
//data class CoinPriceInfo(
//        @SerializedName("TYPE")
//        @Expose
//        private String tYPE;
//@SerializedName("MARKET")
//@Expose
//private String mARKET;
//@SerializedName("FROMSYMBOL")
//@Expose
//private String fROMSYMBOL;
//@SerializedName("TOSYMBOL")
//@Expose
//private String tOSYMBOL;
//@SerializedName("FLAGS")
//@Expose
//private String fLAGS;
//@SerializedName("PRICE")
//@Expose
//private double pRICE;
//@SerializedName("LASTUPDATE")
//@Expose
//private int lASTUPDATE;
//@SerializedName("MEDIAN")
//@Expose
//private int mEDIAN;
//@SerializedName("LASTVOLUME")
//@Expose
//private double lASTVOLUME;
//@SerializedName("LASTVOLUMETO")
//@Expose
//private double lASTVOLUMETO;
//@SerializedName("LASTTRADEID")
//@Expose
//private String lASTTRADEID;
//@SerializedName("VOLUMEDAY")
//@Expose
//private double vOLUMEDAY;
//@SerializedName("VOLUMEDAYTO")
//@Expose
//private double vOLUMEDAYTO;
//@SerializedName("VOLUME24HOUR")
//@Expose
//private double vOLUME24HOUR;
//@SerializedName("VOLUME24HOURTO")
//@Expose
//private double vOLUME24HOURTO;
//@SerializedName("OPENDAY")
//@Expose
//private double oPENDAY;
//@SerializedName("HIGHDAY")
//@Expose
//private double hIGHDAY;
//@SerializedName("LOWDAY")
//@Expose
//private int lOWDAY;
//@SerializedName("OPEN24HOUR")
//@Expose
//private double oPEN24HOUR;
//@SerializedName("HIGH24HOUR")
//@Expose
//private double hIGH24HOUR;
//@SerializedName("LOW24HOUR")
//@Expose
//private double lOW24HOUR;
//@SerializedName("LASTMARKET")
//@Expose
//private String lASTMARKET;
//@SerializedName("VOLUMEHOUR")
//@Expose
//private double vOLUMEHOUR;
//@SerializedName("VOLUMEHOURTO")
//@Expose
//private double vOLUMEHOURTO;
//@SerializedName("OPENHOUR")
//@Expose
//private double oPENHOUR;
//@SerializedName("HIGHHOUR")
//@Expose
//private double hIGHHOUR;
//@SerializedName("LOWHOUR")
//@Expose
//private double lOWHOUR;
//@SerializedName("TOPTIERVOLUME24HOUR")
//@Expose
//private double tOPTIERVOLUME24HOUR;
//@SerializedName("TOPTIERVOLUME24HOURTO")
//@Expose
//private double tOPTIERVOLUME24HOURTO;
//@SerializedName("CHANGE24HOUR")
//@Expose
//private double cHANGE24HOUR;
//@SerializedName("CHANGEPCT24HOUR")
//@Expose
//private double cHANGEPCT24HOUR;
//@SerializedName("CHANGEDAY")
//@Expose
//private double cHANGEDAY;
//@SerializedName("CHANGEPCTDAY")
//@Expose
//private double cHANGEPCTDAY;
//@SerializedName("CHANGEHOUR")
//@Expose
//private double cHANGEHOUR;
//@SerializedName("CHANGEPCTHOUR")
//@Expose
//private double cHANGEPCTHOUR;
//@SerializedName("CONVERSIONTYPE")
//@Expose
//private String cONVERSIONTYPE;
//@SerializedName("CONVERSIONSYMBOL")
//@Expose
//private String cONVERSIONSYMBOL;
//@SerializedName("SUPPLY")
//@Expose
//private int sUPPLY;
//@SerializedName("MKTCAP")
//@Expose
//private int mKTCAP;
//@SerializedName("MKTCAPPENALTY")
//@Expose
//private int mKTCAPPENALTY;
//@SerializedName("TOTALVOLUME24H")
//@Expose
//private double tOTALVOLUME24H;
//@SerializedName("TOTALVOLUME24HTO")
//@Expose
//private double tOTALVOLUME24HTO;
//@SerializedName("TOTALTOPTIERVOLUME24H")
//@Expose
//private double tOTALTOPTIERVOLUME24H;
//@SerializedName("TOTALTOPTIERVOLUME24HTO")
//@Expose
//private double tOTALTOPTIERVOLUME24HTO;
//@SerializedName("IMAGEURL")
//@Expose
//private String iMAGEURL;
//
//public String getTYPE() {
//    return tYPE;
//}
//
//public void setTYPE(String tYPE) {
//    this.tYPE = tYPE;
//}
//
//public String getMARKET() {
//    return mARKET;
//}
//
//public void setMARKET(String mARKET) {
//    this.mARKET = mARKET;
//}
//
//public String getFROMSYMBOL() {
//    return fROMSYMBOL;
//}
//
//public void setFROMSYMBOL(String fROMSYMBOL) {
//    this.fROMSYMBOL = fROMSYMBOL;
//}
//
//public String getTOSYMBOL() {
//    return tOSYMBOL;
//}
//
//public void setTOSYMBOL(String tOSYMBOL) {
//    this.tOSYMBOL = tOSYMBOL;
//}
//
//public String getFLAGS() {
//    return fLAGS;
//}
//
//public void setFLAGS(String fLAGS) {
//    this.fLAGS = fLAGS;
//}
//
//public double getPRICE() {
//    return pRICE;
//}
//
//public void setPRICE(double pRICE) {
//    this.pRICE = pRICE;
//}
//
//public int getLASTUPDATE() {
//    return lASTUPDATE;
//}
//
//public void setLASTUPDATE(int lASTUPDATE) {
//    this.lASTUPDATE = lASTUPDATE;
//}
//
//public int getMEDIAN() {
//    return mEDIAN;
//}
//
//public void setMEDIAN(int mEDIAN) {
//    this.mEDIAN = mEDIAN;
//}
//
//public double getLASTVOLUME() {
//    return lASTVOLUME;
//}
//
//public void setLASTVOLUME(double lASTVOLUME) {
//    this.lASTVOLUME = lASTVOLUME;
//}
//
//public double getLASTVOLUMETO() {
//    return lASTVOLUMETO;
//}
//
//public void setLASTVOLUMETO(double lASTVOLUMETO) {
//    this.lASTVOLUMETO = lASTVOLUMETO;
//}
//
//public String getLASTTRADEID() {
//    return lASTTRADEID;
//}
//
//public void setLASTTRADEID(String lASTTRADEID) {
//    this.lASTTRADEID = lASTTRADEID;
//}
//
//public double getVOLUMEDAY() {
//    return vOLUMEDAY;
//}
//
//public void setVOLUMEDAY(double vOLUMEDAY) {
//    this.vOLUMEDAY = vOLUMEDAY;
//}
//
//public double getVOLUMEDAYTO() {
//    return vOLUMEDAYTO;
//}
//
//public void setVOLUMEDAYTO(double vOLUMEDAYTO) {
//    this.vOLUMEDAYTO = vOLUMEDAYTO;
//}
//
//public double getVOLUME24HOUR() {
//    return vOLUME24HOUR;
//}
//
//public void setVOLUME24HOUR(double vOLUME24HOUR) {
//    this.vOLUME24HOUR = vOLUME24HOUR;
//}
//
//public double getVOLUME24HOURTO() {
//    return vOLUME24HOURTO;
//}
//
//public void setVOLUME24HOURTO(double vOLUME24HOURTO) {
//    this.vOLUME24HOURTO = vOLUME24HOURTO;
//}
//
//public double getOPENDAY() {
//    return oPENDAY;
//}
//
//public void setOPENDAY(double oPENDAY) {
//    this.oPENDAY = oPENDAY;
//}
//
//public double getHIGHDAY() {
//    return hIGHDAY;
//}
//
//public void setHIGHDAY(double hIGHDAY) {
//    this.hIGHDAY = hIGHDAY;
//}
//
//public int getLOWDAY() {
//    return lOWDAY;
//}
//
//public void setLOWDAY(int lOWDAY) {
//    this.lOWDAY = lOWDAY;
//}
//
//public double getOPEN24HOUR() {
//    return oPEN24HOUR;
//}
//
//public void setOPEN24HOUR(double oPEN24HOUR) {
//    this.oPEN24HOUR = oPEN24HOUR;
//}
//
//public double getHIGH24HOUR() {
//    return hIGH24HOUR;
//}
//
//public void setHIGH24HOUR(double hIGH24HOUR) {
//    this.hIGH24HOUR = hIGH24HOUR;
//}
//
//public double getLOW24HOUR() {
//    return lOW24HOUR;
//}
//
//public void setLOW24HOUR(double lOW24HOUR) {
//    this.lOW24HOUR = lOW24HOUR;
//}
//
//public String getLASTMARKET() {
//    return lASTMARKET;
//}
//
//public void setLASTMARKET(String lASTMARKET) {
//    this.lASTMARKET = lASTMARKET;
//}
//
//public double getVOLUMEHOUR() {
//    return vOLUMEHOUR;
//}
//
//public void setVOLUMEHOUR(double vOLUMEHOUR) {
//    this.vOLUMEHOUR = vOLUMEHOUR;
//}
//
//public double getVOLUMEHOURTO() {
//    return vOLUMEHOURTO;
//}
//
//public void setVOLUMEHOURTO(double vOLUMEHOURTO) {
//    this.vOLUMEHOURTO = vOLUMEHOURTO;
//}
//
//public double getOPENHOUR() {
//    return oPENHOUR;
//}
//
//public void setOPENHOUR(double oPENHOUR) {
//    this.oPENHOUR = oPENHOUR;
//}
//
//public double getHIGHHOUR() {
//    return hIGHHOUR;
//}
//
//public void setHIGHHOUR(double hIGHHOUR) {
//    this.hIGHHOUR = hIGHHOUR;
//}
//
//public double getLOWHOUR() {
//    return lOWHOUR;
//}
//
//public void setLOWHOUR(double lOWHOUR) {
//    this.lOWHOUR = lOWHOUR;
//}
//
//public double getTOPTIERVOLUME24HOUR() {
//    return tOPTIERVOLUME24HOUR;
//}
//
//public void setTOPTIERVOLUME24HOUR(double tOPTIERVOLUME24HOUR) {
//    this.tOPTIERVOLUME24HOUR = tOPTIERVOLUME24HOUR;
//}
//
//public double getTOPTIERVOLUME24HOURTO() {
//    return tOPTIERVOLUME24HOURTO;
//}
//
//public void setTOPTIERVOLUME24HOURTO(double tOPTIERVOLUME24HOURTO) {
//    this.tOPTIERVOLUME24HOURTO = tOPTIERVOLUME24HOURTO;
//}
//
//public double getCHANGE24HOUR() {
//    return cHANGE24HOUR;
//}
//
//public void setCHANGE24HOUR(double cHANGE24HOUR) {
//    this.cHANGE24HOUR = cHANGE24HOUR;
//}
//
//public double getCHANGEPCT24HOUR() {
//    return cHANGEPCT24HOUR;
//}
//
//public void setCHANGEPCT24HOUR(double cHANGEPCT24HOUR) {
//    this.cHANGEPCT24HOUR = cHANGEPCT24HOUR;
//}
//
//public double getCHANGEDAY() {
//    return cHANGEDAY;
//}
//
//public void setCHANGEDAY(double cHANGEDAY) {
//    this.cHANGEDAY = cHANGEDAY;
//}
//
//public double getCHANGEPCTDAY() {
//    return cHANGEPCTDAY;
//}
//
//public void setCHANGEPCTDAY(double cHANGEPCTDAY) {
//    this.cHANGEPCTDAY = cHANGEPCTDAY;
//}
//
//public double getCHANGEHOUR() {
//    return cHANGEHOUR;
//}
//
//public void setCHANGEHOUR(double cHANGEHOUR) {
//    this.cHANGEHOUR = cHANGEHOUR;
//}
//
//public double getCHANGEPCTHOUR() {
//    return cHANGEPCTHOUR;
//}
//
//public void setCHANGEPCTHOUR(double cHANGEPCTHOUR) {
//    this.cHANGEPCTHOUR = cHANGEPCTHOUR;
//}
//
//public String getCONVERSIONTYPE() {
//    return cONVERSIONTYPE;
//}
//
//public void setCONVERSIONTYPE(String cONVERSIONTYPE) {
//    this.cONVERSIONTYPE = cONVERSIONTYPE;
//}
//
//public String getCONVERSIONSYMBOL() {
//    return cONVERSIONSYMBOL;
//}
//
//public void setCONVERSIONSYMBOL(String cONVERSIONSYMBOL) {
//    this.cONVERSIONSYMBOL = cONVERSIONSYMBOL;
//}
//
//public int getSUPPLY() {
//    return sUPPLY;
//}
//
//public void setSUPPLY(int sUPPLY) {
//    this.sUPPLY = sUPPLY;
//}
//
//public int getMKTCAP() {
//    return mKTCAP;
//}
//
//public void setMKTCAP(int mKTCAP) {
//    this.mKTCAP = mKTCAP;
//}
//
//public int getMKTCAPPENALTY() {
//    return mKTCAPPENALTY;
//}
//
//public void setMKTCAPPENALTY(int mKTCAPPENALTY) {
//    this.mKTCAPPENALTY = mKTCAPPENALTY;
//}
//
//public double getTOTALVOLUME24H() {
//    return tOTALVOLUME24H;
//}
//
//public void setTOTALVOLUME24H(double tOTALVOLUME24H) {
//    this.tOTALVOLUME24H = tOTALVOLUME24H;
//}
//
//public double getTOTALVOLUME24HTO() {
//    return tOTALVOLUME24HTO;
//}
//
//public void setTOTALVOLUME24HTO(double tOTALVOLUME24HTO) {
//    this.tOTALVOLUME24HTO = tOTALVOLUME24HTO;
//}
//
//public double getTOTALTOPTIERVOLUME24H() {
//    return tOTALTOPTIERVOLUME24H;
//}
//
//public void setTOTALTOPTIERVOLUME24H(double tOTALTOPTIERVOLUME24H) {
//    this.tOTALTOPTIERVOLUME24H = tOTALTOPTIERVOLUME24H;
//}
//
//public double getTOTALTOPTIERVOLUME24HTO() {
//    return tOTALTOPTIERVOLUME24HTO;
//}
//
//public void setTOTALTOPTIERVOLUME24HTO(double tOTALTOPTIERVOLUME24HTO) {
//    this.tOTALTOPTIERVOLUME24HTO = tOTALTOPTIERVOLUME24HTO;
//}
//
//public String getIMAGEURL() {
//    return iMAGEURL;
//}
//
//public void setIMAGEURL(String iMAGEURL) {
//    this.iMAGEURL = iMAGEURL;
//}
//
//)