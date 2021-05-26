package modelo;

import java.util.ArrayList;

/**
 *
 * @author DAW-B
 */
public class Utilidades {

    public static ArrayList<String> llenarLista() {
        ArrayList<String> meses = new ArrayList();
        int item = 12;
        for (int i = 0; i < 15; i++) {
            meses.add(String.valueOf(item));
            item = item + 12;
        }
        return meses;
    }
}    