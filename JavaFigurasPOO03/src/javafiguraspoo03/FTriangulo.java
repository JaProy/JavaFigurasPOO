package javafiguraspoo03;

public class FTriangulo extends Figura implements IArea,IPerimetro{

    //Metodos propios de esta clase
    private double lado1T,lado2T,baseMenorT,alturaT;
    
    
    //Constructor de esta clase
    public FTriangulo(double lado1T, double lado2T, double baseMenorT, double alturaT) {
        this.lado1T = lado1T;
        setLado1(lado1T);
        this.lado2T = lado2T;
        setLado2(lado2T);
        this.baseMenorT = baseMenorT;
        setBaseMenor(baseMenorT);
        this.alturaT = alturaT;
        setAltura(alturaT);
    }
    
    
    
    //Metodo abstracto de la clase Figura
    @Override
    public void realizarCalculos() {
        setArea((getBaseMenor() * getAltura()) / 2);
        
        setPerimetro(getLado1() + getLado2() + getBaseMenor());
    }

    
    //Metodo de la interfaz IArea
    @Override
    public void mostrarArea() {
        System.out.println("El area de tu triangulo es " + getArea() + "u");
    }

    //Metodo de la interfaz IPerimetro
    @Override
    public void mostrarPerimetro() {
        System.out.println("El perimetro de tu triangulo es " + getPerimetro() + "u");
    }
    
}
