/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.Date;
public class InputData {
    ArrayList<Pengeluaran> ListDataPengeluaran;
  
    public InputData(){
        ListDataPengeluaran = new ArrayList();
    }
    
    public void isiData (Date Tanggal, int Harga, String Keterangan){
        Pengeluaran pg = new Pengeluaran(Tanggal, Harga, Keterangan);
        ListDataPengeluaran.add(pg);
    }
    public ArrayList<Pengeluaran> getData(){
        return ListDataPengeluaran;
    }
}
