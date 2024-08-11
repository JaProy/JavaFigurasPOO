package javafiguraspoo03;

public class FCirculo extends Figura implements IArea,IPerimetro {

    //Declaramos metodos propios de la clase
    double radioC;
    
    //Constructor de la clase
    public FCirculo(double radioC) {
        this.radioC = radioC;
        setRadio(radioC);
    }
    
    
    //Metodo abstracto de la clase Figura
    @Override
    public void realizarCalculos() {
        setArea(pI * (getRadio() * getRadio()));
        
        setPerimetro((pI * 2) * getRadio());
    }

    //Metodo de la interfaz IArea
    @Override
    public void mostrarArea() {
        System.out.println("El area de su círculo es " + getArea() + "u");
    }

    //Metodo de la interfaz IPerimetro
    @Override
    public void mostrarPerimetro() {
        System.out.println("El perimetro de su círculo es " + getPerimetro() + "u");
    }
    
}
