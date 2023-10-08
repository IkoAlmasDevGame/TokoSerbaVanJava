/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author okinand
 */
public class barang {
    public String kd, nm;
    public int jml;
    public double hrg,ttl,ub,uk;
    
    public void setKd(String val){
        kd=val;
    }
    
    public String getKd(){
        return kd;        
    }
    
    public void setSeleksiKd(){
        if(kd.equalsIgnoreCase("B001")){
            nm = "";
            hrg = 3000;
        }else if(kd.equalsIgnoreCase("B002")){
            nm = "";
            hrg = 1500;
        }else if(kd.equalsIgnoreCase("B003")){
            nm = "";
            hrg = 5000;
        }else{
            nm = "";
            hrg = 0;
        }
    }
    //* Nama barang *//
    public void setNM(String val){
        nm=val;
    }
    public String getNM(){
        return nm;
    }
    // * Harga Barang *//
    public void SetHrg(double val){
        hrg=val;
    }
    public Double getHrg(){
        return hrg;
    }
    // * jumlah Barang * //
    public void setJml(int val){
        jml=val;
    }
    public int getJml(){
        return jml;
    }
    // * Total Bayar * //
    public Double getTot(){
        ttl=hrg*jml;
        return ttl;
    }
    // * Uang Bayar * //
    public void setUb(double val){
        ub=val;
    }
    public double getUb(){
        return ub;
    }
    // * Uang kembalian * //
    public double getUk(){
        return (ub-ttl);
    }
}
