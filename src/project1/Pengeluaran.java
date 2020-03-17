/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Pengeluaran {
    private Date Tanggal;
    private int Harga;
    private String Keterangan;

    public Pengeluaran(Date Tanggal, int Harga, String Keterangan) {
        this.Tanggal = Tanggal;
        this.Harga = Harga;
        this.Keterangan = Keterangan;
    }
    
    public Date getTanggal(){
        return Tanggal;
    }
    public int getHarga(){
        return Harga;
    }
    public String getKeterangan(){
        return Keterangan;
    }
}
