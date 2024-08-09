package javafiguraspoo03;

public class FCuadrado extends Figura implements IArea,IPerimetro {

    //Definimos atributo propio
    double ladoC;
    
    //Definimos constructor
    public FCuadrado(double ladoC) {
        this.ladoC = ladoC;
        setLado1(ladoC);
    }
    
    
    //Metodo abtracto de la clase Figura
    @Override
    public void realizarCalculos() {
        //Ajustamos el valor de area
        setArea(getLado1() * getLado1());
        
        //Ajustamos el valor del perimetro
        setPerimetro(getLado1() * 4);
    }

    
    //Metodo de la interfaz IArea
    @Override
    public void mostrarArea() {
        System.out.println("El area de su cuadrado es " + getArea() + "u");
    }

    //Metodo de la interfaz IPerimetro
    @Override
    public void mostrarPerimetro() {
        System.out.println("El perimetro de su cuadrado es " + getPerimetro() + "u");
    }
    
}
