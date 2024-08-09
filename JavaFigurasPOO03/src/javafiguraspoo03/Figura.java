package javafiguraspoo03;

public abstract class Figura {
    
    //Definimos atributos
    private double baseMenor,baseMayor,altura,lado1,lado2,radio;
    //Definimos variables para guardar los resultados
    private double area,perimetro;
    
    //Definimos una constante ESTATICA para futuras operaciones
    protected static double pI = 3.1416;
    
    
    //Definimos constructor vacio (las variables las inicializo con getter y setter)
    public Figura() {
    }
    
    
    
    //Definimos getters y setters
    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area>=0) {
            this.area = area;
        }else{
            System.out.println("El valor de AREA es menor a 0");
        }
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        if (perimetro>=0) {
            this.perimetro = perimetro;
        }else{
            System.out.println("El valor del perimetro es menor a 0");
        }
    }

    

    //Metodo abstrascto a realizar
    public abstract void realizarCalculos();
}
