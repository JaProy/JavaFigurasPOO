package javafiguraspoo03;

import java.io.IOException;
import java.util.ArrayList;

public class LimpiarConsola {
    
    //Metodo limpiarCMD
    public void limpiarCMD() throws IOException, InterruptedException{
        //Detectamos el Sistema Operativo
        String sO = System.getProperty("os.name");
        
        //Creamos un array list para guardar los comandos
        ArrayList<String> comando = new ArrayList();
        
        //Comprobamos sistema operativo WINDOWS
        if (sO.contains("Windows")){
            comando.add("cmd");
            comando.add("/C");
            comando.add("cls");
        }//En caso de no ser Windows tendria que poner aqui el codigo para limpiar consola
        
        //Creamos un proceso para ejecutar comandos
        ProcessBuilder pB = new ProcessBuilder(comando);
        
        //Ejecutamos el comando
        Process iP = pB.inheritIO().start();
        
        //Esperamos a que se limpie la consola para continuar
        iP.waitFor();
    }
}
