package javafiguraspoo03;

public class FRectangulo extends Figura implements IArea,IPerimetro{

    //Definimos atributos propios
    private double ladoR,baseR;
    
    //Creamos metodo constructor
    public FRectangulo(double ladoR, double baseR) {
        this.ladoR = ladoR;
        setLado1(ladoR);
        this.baseR = baseR;
        setBaseMenor(baseR);
    }
    
    
    //Metodo abstractos de la clase Figura
    @Override
    public void realizarCalculos() {
        //Realizamos el calculo del area
        setArea(getLado1() * getBaseMenor());    
        
        //Realizamos el calculo del perimetro
        setPerimetro((getLado1() * 2) + (getBaseMenor() * 2));
    }

    //Metodo de la interfaz IArea
    @Override
    public void mostrarArea() {
        System.out.println("El area de su rectángulo es " + getArea() + "u");
    }

    //Metodo de la interfaz IPerimetro
    @Override
    public void mostrarPerimetro() {
        System.out.println("El perimetro de su rectángulo es " + getPerimetro() + "u");    
    }
    
}
