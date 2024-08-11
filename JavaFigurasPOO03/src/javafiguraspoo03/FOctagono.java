package javafiguraspoo03;

public class FOctagono extends Figura implements IArea,IPerimetro {

    //Atributos propios
    private double ladoH,apotemaH;
    
    //Metodo constructor de esta clase
    public FOctagono(double ladoH, double apotemaH) {
        this.ladoH = ladoH;
        setLado1(ladoH);
        this.apotemaH = apotemaH;
        setAltura(apotemaH);
    }
    
    
    //Metodo de la clase Figura
    @Override
    public void realizarCalculos() {
        //Realizamos el calculo del perimetro
        setPerimetro(getLado1() * 8);
        
        //Realizamos el calculo del area
        setArea((getPerimetro() * getAltura()) /2);
    }

    //Metodo de la interfaz IArea
    @Override
    public void mostrarArea() {
        System.out.println("El area de tu octágono es " + getArea() + "u");  
    }

    //Metodo de la interfaz IPerimetro
    @Override
    public void mostrarPerimetro() {
        System.out.println("El perimetro de tu octágono es " + getPerimetro() + "u");    
    }
    
}
