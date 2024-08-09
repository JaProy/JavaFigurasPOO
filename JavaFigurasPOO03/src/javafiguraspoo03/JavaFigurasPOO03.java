package javafiguraspoo03;

import java.io.IOException;

public class JavaFigurasPOO03 {

    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        
        //Creamos referencia a clase Menu (donde esta programada la interfaz mediante CMD)
        Menu men1 = new Menu();
        
        //Le decimos que ejecute el metodo menuOpciones
        men1.menuOpciones();
    }
    
}
