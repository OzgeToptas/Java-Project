/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evrakkayit.dao;

import evrakkayit.dto.EvrakDTO;
import evrakkayit.vt.VTBaglanti;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author TOPTAS_OZGE
 */
public class EvrakDAO {

    public static int siraNoAl() {
        int siraNo=0;
        try {
            String sorgu = "SELECT MAX(SIRA_NO) AS SIRA_NO FROM EFATURA_EVRAK_TAKIP";
            VTBaglanti vtIslem = new VTBaglanti();
            ResultSet rs = vtIslem.execute(sorgu);
            if (rs.next()) {
                siraNo = Integer.valueOf(rs.getInt("SIRA_NO"));
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(EvrakDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return siraNo + 1;
    }
    
    public static EvrakDTO evrakBul (String siraNo, String vknTckn) throws SQLException {
    EvrakDTO evrak = null;
    VTBaglanti vtIslem = new VTBaglanti(); 
    String sorgu = "SELECT * FROM EFATURA_EVRAK_TAKIP WHERE ";
    
    if(!siraNo.equals("")) 
         sorgu += " SIRA_NO="+siraNo+" AND ";
    
    if(!vknTckn.equals("")) 
         sorgu += "VKN_TCKN='"+vknTckn+"' AND ";
    
    sorgu += "1<2";
    
    System.out.println(sorgu);
    ResultSet rs = vtIslem.execute(sorgu);

    while (rs.next()) {
      evrak = new EvrakDTO();
      evrak.setSiraNo(Integer.parseInt(rs.getString("SIRA_NO")));
      evrak.setVknTckn(rs.getString("VKN_TCKN"));
      evrak.setunvan(rs.getString("UNVAN_AD_SOYAD"));
      evrak.setEarsivBasvurusu(rs.getString("EARSIV_BASVURUSU"));
      evrak.setEbiletBasvurusu(rs.getString("EBILET_BASVURUSU"));
      evrak.setEfaturaBasvurusu(rs.getString("EFKS_BASVURUSU"));
      evrak.setEdefterBasvurusu(rs.getString("EDEFTER_BASVURUSU"));
      evrak.setEirsaliyeBasvurusu(rs.getString("EIRSALIYE_BASVURUSU"));
      evrak.setEdefterUyumluluk(rs.getString("EDEFTER_YAZILIM_UYUMLULUK"));

      
    }
    rs.close();
    vtIslem.closeConnection();
    return evrak ;
  }
    
   public static boolean evrakEkle(EvrakDTO evrak, int siraNo) throws SQLException
   {
    String sorgu = "INSERT INTO EFATURA_EVRAK_TAKIP VALUES(" + siraNo + "," + "'" + evrak.getVknTckn() + "', '" + evrak.getunvan() + "', '" + evrak.getEdefterUyumluluk() + "', '" + evrak.getEbiletBasvurusu() + "'," + " '" + evrak.getEfaturaBasvurusu() + "', '" + evrak.getEdefterBasvurusu() + "', '" + evrak.getEirsaliyeBasvurusu() + "'," + " '" + evrak.getEarsivBasvurusu()+ "')";
    System.out.println(sorgu);
    VTBaglanti vtislem = new VTBaglanti();
    
    int sonuc = vtislem.executeIU(sorgu);
    
    if (sonuc == 0) {
      System.out.println("eklenemedi");
      System.out.println("sonuc:" + sonuc);
      vtislem.closeConnection();
      return false;
    }
    System.out.println("eklendi");
    System.out.println("sonuc:" + sonuc);
    vtislem.closeConnection();
    return true;
  }
    
    public static boolean evrakSil(String siraNo) throws SQLException {
    VTBaglanti vtIslem = new VTBaglanti();
    String SQL = "DELETE FROM EFATURA_EVRAK_TAKIP WHERE SIRA_NO = " + siraNo;
    int sonuc = vtIslem.executeIU(SQL);
    vtIslem.closeConnection();

    return sonuc == 1;
  }
    
    
    public static boolean guncelle(EvrakDTO evrak, String siraNo) throws SQLException
  {
    VTBaglanti vtIslem = new VTBaglanti();
    String sorgu;

      sorgu = "UPDATE EFATURA_EVRAK_TAKIP SET VKN_TCKN='" + evrak.getVknTckn() + "', UNVAN_AD_SOYAD='" + evrak.getunvan() + "', EARSIV_BASVURUSU='" + evrak.getEarsivBasvurusu() + "', EBILET_BASVURUSU='" + evrak.getEbiletBasvurusu() + "' ,EFKS_BASVURUSU='" + evrak.getEfaturaBasvurusu() + "', EDEFTER_BASVURUSU='" + evrak.getEdefterBasvurusu() + "', EIRSALIYE_BASVURUSU='" + evrak.getEirsaliyeBasvurusu() + "', EDEFTER_YAZILIM_UYUMLULUK='" + evrak.getEdefterUyumluluk() + "' WHERE SIRA_NO = " + siraNo;
   
    System.out.println(sorgu);
    int sonuc = vtIslem.executeIU(sorgu);
    vtIslem.closeConnection();
    if (sonuc == 0) {
      System.out.println("sonuc::::::::::::" + sonuc);
      return false;
    }
    System.out.println("sonuc::::::::::::" + sonuc);
    return true;
  }

   public static ArrayList<EvrakDTO> unvanBul (String unvan ) throws SQLException {
    EvrakDTO evrak = null;
    VTBaglanti vtIslem = new VTBaglanti();   
    
    ArrayList<EvrakDTO> firmalar = new ArrayList<>();
    
    String sorgu = "SELECT * FROM EFATURA_EVRAK_TAKIP WHERE UNVAN_AD_SOYAD like '%"+unvan+"%'";
    
    System.out.println(sorgu);
    ResultSet rs = vtIslem.execute(sorgu);

    while (rs.next()) {
      evrak = new EvrakDTO();
      evrak.setSiraNo(Integer.parseInt(rs.getString("SIRA_NO")));
      evrak.setVknTckn(rs.getString("VKN_TCKN"));
      evrak.setunvan(rs.getString("UNVAN_AD_SOYAD"));
      evrak.setEarsivBasvurusu(rs.getString("EARSIV_BASVURUSU"));
      evrak.setEbiletBasvurusu(rs.getString("EBILET_BASVURUSU"));
      evrak.setEfaturaBasvurusu(rs.getString("EFKS_BASVURUSU"));
      evrak.setEdefterBasvurusu(rs.getString("EDEFTER_BASVURUSU"));
      evrak.setEirsaliyeBasvurusu(rs.getString("EIRSALIYE_BASVURUSU"));
      evrak.setEdefterUyumluluk(rs.getString("EDEFTER_YAZILIM_UYUMLULUK"));
      
      firmalar.add(evrak);
      
    }
    rs.close();
    vtIslem.closeConnection();
    return firmalar ;
  }
   
     public static void databaseToExcel()
    throws SQLException, IOException
  {
    String SQL = "SELECT * FROM EFATURA_EVRAK_TAKIP";
    String excelIsmi = "Mükellef Ünvanları Listesi";

    HSSFWorkbook hwb = new HSSFWorkbook();
    HSSFSheet sheet = hwb.createSheet(excelIsmi);

    HSSFCellStyle my_style = hwb.createCellStyle();
    HSSFFont my_font = hwb.createFont();
    my_font.setBoldweight((short) 700);
    my_font.setFontName("Tahoma");
    my_style.setFont(my_font);

    HSSFRow rowhead = sheet.createRow(0);
    rowhead.createCell(0).setCellValue("SIRA_NO");
    rowhead.createCell(1).setCellValue("VKN_TCKN");
    rowhead.createCell(2).setCellValue("UNVAN_AD_SOYAD");
    rowhead.createCell(3).setCellValue("EDEFTER_YAZILIM_UYUMLULUK");
    rowhead.createCell(4).setCellValue("EBILET_BASVURUSU");
    rowhead.createCell(5).setCellValue("EFKS_BASVURUSU");
    rowhead.createCell(6).setCellValue("EDEFTER_BASVURUSU");
    rowhead.createCell(7).setCellValue("EIRSALIYE_BASVURUSU");
    rowhead.createCell(8).setCellValue("EARSIV_BASVURUSU");
   

    for (int i = 0; i < 9; i++) {
      rowhead.getCell(i).setCellStyle(my_style);
    }

    VTBaglanti baglanti = new VTBaglanti();
    ResultSet sonuc = baglanti.execute(SQL);

    int i = 1;
    while (sonuc.next()) {
      HSSFRow row = sheet.createRow((short)i);

      row.createCell(0).setCellValue(sonuc.getString("SIRA_NO"));
      row.createCell(1).setCellValue(sonuc.getString("VKN_TCKN"));
      row.createCell(2).setCellValue(sonuc.getString("UNVAN_AD_SOYAD"));
      row.createCell(3).setCellValue(sonuc.getString("EDEFTER_YAZILIM_UYUMLULUK"));
      row.createCell(4).setCellValue(sonuc.getString("EBILET_BASVURUSU"));
      row.createCell(5).setCellValue(sonuc.getString("EFKS_BASVURUSU"));
      row.createCell(6).setCellValue(sonuc.getString("EDEFTER_BASVURUSU"));
      row.createCell(7).setCellValue(sonuc.getString("EIRSALIYE_BASVURUSU"));
      row.createCell(8).setCellValue(sonuc.getString("EARSIV_BASVURUSU"));
    

      i++;
    }
    String path = System.getProperty("user.home") + "/Desktop";
    hwb.write(new FileOutputStream(path + "/" + excelIsmi + ".xls"));
    sonuc.close();
    baglanti.closeConnection();
    if (i >= 1)
      JOptionPane.showMessageDialog(null, "Excel dosyası \" " + excelIsmi + " \" ismiyle masaüstünüze kaydedildi...");
    else
      JOptionPane.showMessageDialog(null, excelIsmi + " oluşturulurken hata meydana geldi...");
  }

}