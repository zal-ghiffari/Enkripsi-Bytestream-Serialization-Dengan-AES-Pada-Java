/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializepraktikum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AdminLabPSSN
 */
public class SerializePraktikum {
    final static String key = "In1P4s5w0rdNy4";

    private static void writeObject(Object o) throws Exception {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mhs.obj"));
            oos.writeObject(EnkripBytestream.encrypt(o.toString(), key));
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            throw ex;
        } catch (IOException ex) {
            throw ex;
        }
    }
    
    private static Object readObject() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mhs.obj"));
        try {
            Object readObject = ois.readObject();
            String data = EnkripBytestream.decrypt(readObject.toString(), key);
            ois.close();
            return data;
        } catch (ClassNotFoundException ex) {
            throw ex;
        }
    }
    
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa("1817101440", "Muhammad Novrizal Ghiffari");
        try {
            writeObject(m);
            String readObject = (String) readObject();
            System.out.println("" +readObject);
        } catch (Exception ex) {
            Logger.getLogger(SerializePraktikum.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
