package javafiguraspoo03;

public class FTrapecio extends Figura implements IArea,IPerimetro {

    //Metodos propios de esta clase
    double baseMenorT,baseMayorT,alturaT,lado1T,lado2T;
    
    
    //Constructor de esta clase
    public FTrapecio(double baseMenorT, double baseMayorT, double alturaT, double lado1T, double lado2T) {
        this.baseMenorT = baseMenorT;
        setBaseMenor(baseMenorT);
        this.baseMayorT = baseMayorT;
        setBaseMayor(baseMayorT);
        this.alturaT = alturaT;
        setAltura(alturaT);
        this.lado1T = lado1T;
        setLado1(lado1T);
        this.lado2T = lado2T;
        setLado2(lado2T);
    }

    //Metodo abstracto de la clase Figura
    @Override
    public void realizarCalculos() {
        setArea(((getBaseMenor() + getBaseMayor()) /2 ) * getAltura() );
        
        setPerimetro(getLado1() + getLado2() + getBaseMayor() + getBaseMenor());
    }

    
    //Metodo de la interfaz IArea
    @Override
    public void mostrarArea() {
        System.out.println("El area de tu trapecio es de " + getArea() + "u");
    }

    //Metodo de la interfaz IPerimetro
    @Override
    public void mostrarPerimetro() {
        System.out.println("El perimetro de tu trapecio es " + getPerimetro() + "u");
    }
    
}
