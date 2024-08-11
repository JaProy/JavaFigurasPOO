package javafiguraspoo03;

public class FPentagono extends Figura implements IArea,IPerimetro {

    //Declaramos atributos propios
    private double ladoH,apotemaH;
    
    //Metodo constructor
    public FPentagono(double ladoH, double apotemaH) {
        this.ladoH = ladoH;
        setLado1(ladoH);
        this.apotemaH = apotemaH;
        setAltura(apotemaH);
    }
    
    
    //Metodo abstracto de la clase Figura
    @Override
    public void realizarCalculos() {
        //Realizamos el calculo del perimetro
        setPerimetro(getLado1() * 5);
        
        //Realizamos el calculo del area
        setArea((getPerimetro() * getAltura()) / 2);
    }

    //Metodo de la interfaz IArea
    @Override
    public void mostrarArea() {
        System.out.println("El area de tu pentágono es " + getArea() + "u");  
    }

    //Metodo de la interfaz IPerimetro
    @Override
    public void mostrarPerimetro() {
        System.out.println("El perimetro de tu pentágono es " + getPerimetro() + "u");
    }
    
}
