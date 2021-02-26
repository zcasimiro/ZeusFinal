package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {

    public Properties get(){
        Properties props =new Properties();

        //usar la funcion getAbsolutePath para leer el archivo desde donde sea
        String  filePath = new File("params.properties").getAbsolutePath();
        //esta funcion convierte el params en un archivo en memoria
        File file = new File(filePath);
        //Inicializamos el archivo como null
        FileInputStream fileInput = null;
        //intentar leer el archivo
        try {
            fileInput = new FileInputStream(file);
            props.load(fileInput);
        } catch (IOException e){ // y si falla cachamos el error
            e.printStackTrace();

        }
        return props;
    }
}