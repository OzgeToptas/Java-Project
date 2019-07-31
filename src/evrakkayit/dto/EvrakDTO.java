package evrakkayit.dto;

public class EvrakDTO
{
  private String VknTckn;
 
  private String EarsivBasvurusu;
  private String EdefterUyumluluk;
  private String EirsaliyeBasvurusu;
  private String EdefterBasvurusu;
  private String EfaturaBasvurusu;
  private String unvan;
  private String EbiletBasvurusu;
  private String Notlar;
  private int sayfaNo;
  private int siraNo;
  private int ID;
   
  public EvrakDTO()
  {
  }

  public EvrakDTO(String VknTckn, String unvan,String EdefterUyumluluk, String EbiletBasvurusu,String EfaturaBasvurusu,String EdefterBasvurusu,String EirsaliyeBasvurusu, String EarsivBasvurusu )
  {
    this.VknTckn = VknTckn;
    this.unvan = unvan;
    this.EdefterUyumluluk = EdefterUyumluluk;
    this.EbiletBasvurusu = EbiletBasvurusu;
    this.EfaturaBasvurusu = EfaturaBasvurusu;
    this.EdefterBasvurusu = EdefterBasvurusu;
    this.EirsaliyeBasvurusu = EirsaliyeBasvurusu;
    this.EarsivBasvurusu = EarsivBasvurusu;
    
    
    
    
    
   

    
  }

  public String getVknTckn() {
    return this.VknTckn;
  }

  public void setVknTckn(String VknTckn) {
    this.VknTckn = VknTckn;
  }


  public String getEarsivBasvurusu() {
    return this.EarsivBasvurusu;
  }

  public void setEarsivBasvurusu(String EarsivBasvurusu) {
    this.EarsivBasvurusu = EarsivBasvurusu;
  }

  public String getEdefterUyumluluk() {
    return this.EdefterUyumluluk;
  }

  public void setEdefterUyumluluk(String EdefterUyumluluk) {
    this.EdefterUyumluluk = EdefterUyumluluk;
  }

  public String getEirsaliyeBasvurusu() {
    return this.EirsaliyeBasvurusu;
  }

  public void setEirsaliyeBasvurusu(String EirsaliyeBasvurusu) {
    this.EirsaliyeBasvurusu = EirsaliyeBasvurusu;
  }

  public String getEdefterBasvurusu() {
    return this.EdefterBasvurusu;
  }

  public void setEdefterBasvurusu(String EdefterBasvurusu) {
    this.EdefterBasvurusu = EdefterBasvurusu;
  }

  public String getEfaturaBasvurusu() {
    return this.EfaturaBasvurusu;
  }

  public void setEfaturaBasvurusu(String EfaturaBasvurusu) {
    this.EfaturaBasvurusu = EfaturaBasvurusu;
  }

  public String getunvan() {
    return this.unvan;
  }

  public void setunvan(String unvan) {
    this.unvan = unvan;
  }
  

  public String getEbiletBasvurusu() {
    return this.EbiletBasvurusu;
  }

  public void setEbiletBasvurusu(String EbiletBasvurusu) {
    this.EbiletBasvurusu = EbiletBasvurusu;
  }

  public String getNotlar() {
    return this.Notlar;
  }

  public void setNotlar(String Notlar) {
    this.Notlar = Notlar;
  }

  public int getSayfaNo() {
    return this.sayfaNo;
  }

  public void setSayfaNo(int sayfaNo) {
    this.sayfaNo = sayfaNo;
  }

  public int getSiraNo() {
    return this.siraNo;
  }

  public void setSiraNo(int siraNo) {
    this.siraNo = siraNo;
  }

  public int getID() {
    return this.ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }



}