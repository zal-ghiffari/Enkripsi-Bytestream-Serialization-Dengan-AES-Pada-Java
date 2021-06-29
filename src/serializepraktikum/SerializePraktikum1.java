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
import static serializepraktikum.SerializePraktikum.key;

/**
 *
 * @author AdminLabPSSN
 */
public class SerializePraktikum1 {
    
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
        try {
            String readObject = (String) readObject();
            System.out.println("" +readObject);
        } catch (Exception ex) {
            Logger.getLogger(SerializePraktikum1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
