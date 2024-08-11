package javafiguraspoo03;

public class FHexagono extends Figura implements IArea,IPerimetro {

    //Declaramos atributos propios de la clase
    private double ladoH,apotemaH;
    
    //Creamos metodo constructor
    public FHexagono(double ladoH, double apotemaH) {
        this.ladoH = ladoH;
        setLado1(ladoH);
        this.apotemaH = apotemaH;
        setAltura(apotemaH);
    }
    
    
    //Metodo abstracto de la clase Figura
    @Override
    public void realizarCalculos() {
        //Realizamos calculo del perimetro
        setPerimetro(getLado1() * 6);
        
        //Realizamos calculo del area
        setArea((getPerimetro() * getAltura()) / 2);
    }

    
    //Metodo de la interfaz IArea
    @Override
    public void mostrarArea() {
        System.out.println("El area de tu hexágono es " + getArea() + "u");    
    }

    
    //Metodo de la interfaz IPerimetro
    @Override
    public void mostrarPerimetro() {
        System.out.println("El perimetro de tu hexágono es " + getPerimetro() + "u");    
    }
    
}
