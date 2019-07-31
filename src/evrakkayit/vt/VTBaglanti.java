/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evrakkayit.vt;


import com.sybase.jdbc2.jdbc.SybDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author TOPTAS_OZGE
 */
public class VTBaglanti {
 private Connection conn;
  private String ipport = "10.252.63.13:5000/SUBE33";

  public VTBaglanti() throws SQLException {
    try {
      this.conn = null;
      Properties dbprops = new Properties();
      SybDriver sybDriver = (SybDriver)Class.forName("com.sybase.jdbc2.jdbc.SybDriver").newInstance();

      DriverManager.registerDriver(sybDriver);

      dbprops.setProperty("USER", "sa");
      dbprops.setProperty("PASSWORD", "");
      dbprops.setProperty("CHARSET", "cp1254");

      this.conn = DriverManager.getConnection("jdbc:sybase:Tds:" + this.ipport, dbprops);
    }
    catch (SQLException e) {
      System.err.println("\n\t" + e.getMessage());
    } catch (Exception e) {
      System.err.println("\n\t" + e.getMessage());
    }
  }

  public Connection getConnection() {
    return this.conn;
  }

  public void closeConnection() {
    try {
      this.conn.close();
    } catch (SQLException e) {
      System.err.println("\n\t" + e.getMessage());
    }
  }

  public ResultSet execute(String pSQL)
  {
    Statement stmt = null;
    ResultSet results = null;
    try {
      stmt = this.conn.createStatement();
      results = stmt.executeQuery(pSQL);
    } catch (SQLException e) {
      System.err.println("\n\t" + e.getMessage());
    }
    return results;
  }

  public int executeIU(String pSQL)
  {
    Statement stmt = null;
    int sonuc = 0;
    try {
      stmt = this.conn.createStatement();
      sonuc = stmt.executeUpdate(pSQL);
      return sonuc;
    } catch (SQLException e) {
      System.err.println("\n\t" + e.getMessage());
    }return sonuc;
  }
}    

