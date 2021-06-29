/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializepraktikum;

import java.io.Serializable;

/**
 *
 * @author AdminLabPSSN
 */
public class Mahasiswa implements Serializable{
    private String nim;
    private String nama;
    
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public String toString() {
        return "Mahasiswa{" + "nim = " + nim + ", nama = " + nama + "}";
    }
}
