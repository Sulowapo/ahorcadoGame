
package modelo;

import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ReceptorEventos {
    
    private static Serializable ConvertirMensaje(byte[] serializedObject) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(serializedObject);
             ObjectInputStream ois = new ObjectInputStream(bais)) {
            return (Serializable) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
