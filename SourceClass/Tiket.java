/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceClass;

/**
 *
 * @author heavydude
 */
public class Tiket extends KA {
    private String idTiket;
    private KA keretaTiket;
    private int gerbongNo;
    private int Kursino;
    private String Kategori;

    public Tiket(String idTiket){
      this.idTiket=idTiket;
    }
    public Tiket(KA KeretaTiket, int gerbongNo, int Kursino, String Kategori){
      super(KA);
      this.gerbongNo=gerbongNo;
      this.kursiNo=kursiNo;
      this.Kategori=Kategori;
   }
   public void setgerbongNo(int gerbongNo){
     this.gerbongNo=gerbongNo;
   }
   public int getgerbongNo(){
     return this.gerbongNo;
   }
   public void setKursino(int Kursino){
     this.Kursino=Kursino;
   }
   public int getKursino(){
     return this.Kursino;
   }
   public void setKategori(String Kategori){
     this.Kategori=Kategori;
   }
   public int getKategori(){
     return this.Kategori;
   } 
}
