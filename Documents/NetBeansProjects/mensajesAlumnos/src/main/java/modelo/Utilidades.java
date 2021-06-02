/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author DAW-B
 */
public class Utilidades {
    public static ArrayList<Alumno> getAlumnos(String archivo){
        
        String SEPARATOR=";";
        ArrayList<Alumno> miListaAlumnos = new ArrayList<Alumno> ();
        
        try {
            BufferedReader br =new BufferedReader(new FileReader("files/Libro1.csv"));
            String line = br.readLine();
            while (null!=line) {
                String [] fields = line.split(SEPARATOR);
                for (int i=0; i<fields.length; i++){

                    Alumno miAlumno = new Alumno (fields[0],fields[1],fields[2],fields[3]);
            }
                     
            line = br.readLine();
            }   
        }catch(Exception e){
            
        }
        return miListaAlumnos;
    }
}    
    


        
        


