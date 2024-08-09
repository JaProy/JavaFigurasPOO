package javafiguraspoo03;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    
    //Declaramos variable para entrada de Int
    Scanner eTInt = new Scanner(System.in);
    
    //Declaramos variable para entrada de double
    Scanner eTDouble = new Scanner(System.in);
    
    //Declaramos variable para LimpiarConsola
    LimpiarConsola lC = new LimpiarConsola();
    
    //Declaramos metodo principal
    public void menuOpciones() throws IOException, InterruptedException{
        //Le decimos al usuario las opciones disponibles
        System.out.println("Seleccione una figura para calcular Area y Perimetro:");
        System.out.println("1 --- Cuadrado");
        System.out.println("2 --- Triangulo");
        System.out.println("3 --- Trapecio");
        System.out.println("4 --- Circulo");
        
        //Realizamos switch y a su vez leemos la entrada del usuario
        switch (eTInt.nextInt()) {
            //Clase FCUADRADO
            case 1 -> {
                //Salto de linea
                System.out.println("\n");
                
                //Damos instrucciones al usuario
                System.out.println("Por favor introduzca la medida de uno de los lados de su cuadrado:");
                FCuadrado cuad1 = new FCuadrado(eTDouble.nextDouble());
                
                //Con la clase creada y valores asignados, le decimos que realize los calculos
                cuad1.realizarCalculos();
                
                //Mostramos resultados segun el valor optenido
                switch (menuMO()){
                    case 1 -> //Ejecutamos el AREA de la clase FCuadrado
                        cuad1.mostrarArea();
                    case 2 -> //Ejecutamos el PERIMETRO de la clase FCuadrado
                        cuad1.mostrarArea();
                    case 3 -> {
                        //Ejecutamos el AREA y PERIMETRO de la clase FCuadrado
                        cuad1.mostrarArea();
                        cuad1.mostrarPerimetro();
                    }
                    default -> //Como seguridad si introduze un dijito no valido le mostramos esto al usuario
                        System.out.println("Introduzca un dijito VALIDO!");
                }
            }
            //Clase FTRIANGULO
            case 2 -> {
                //Salto de linea
                System.out.println("\n");
                
                //Le damos instrucciones al usuario
                System.out.println("Por favor introduzca la medida de la altura de su triangulo:");
                double alturaT = eTDouble.nextDouble();
                System.out.println("Ahora introduzca la medida de la base:");
                double baseT = eTDouble.nextDouble();
                System.out.println("Ahora introduzca la medida del lado izquiero de si triangulo:");
                double lado1T = eTDouble.nextDouble();
                System.out.println("Ahora introduzca la medida del lado derecho de su triangulo:");
                double lado2T = eTDouble.nextDouble();
                
                //Creamos la clase con los dijitos ingresados
                FTriangulo tri1 = new FTriangulo(lado1T,lado2T,baseT,alturaT);
                
                //Ejecutamos los calculos de la clase
                tri1.realizarCalculos();
                
                //Mostramos resultados segun el valor obtenido
                switch (menuMO()){
                    case 1 -> //Ejecutamos el AREA de la clase FTriangulo
                        tri1.mostrarArea();
                    case 2 -> //Ejecutamos el PERIMETRO de la clase FTiangulo
                        tri1.mostrarPerimetro();
                    case 3 -> {
                        //Ejecutamos el AREA y el PERIMETRO de la clase FTriangulo
                        tri1.mostrarArea();
                        tri1.mostrarPerimetro();
                    }
                    default -> //Como seguridad si introduze un dijito no valido le mostramos esto al usuario
                        System.out.println("Introduzca un dijito VALIDO!");
                }
            }
            //Clase FTrapecio
            case 3 -> {
                //Salto de linea
                System.out.println("\n");
                
                //Le damos intrucciones al usuario
                System.out.println("Por favor introduzca la medida de la altura de su trapecio");
                double alturaTR = eTDouble.nextDouble();
                System.out.println("Por favor introduzca la medida de la base mayor de su trapecio");
                double baseMenorTR = eTDouble.nextDouble();
                System.out.println("Por favor introduzca la medida de la base mayor de su trapecio");
                double baseMayorTR = eTDouble.nextDouble();
                System.out.println("Por favor introduzca la medida del lado izquierdo de su trapecio");
                double lado1TR = eTDouble.nextDouble();
                System.out.println("Por favor introzca la medida del lado derecho de su trapecio");
                double lado2TR = eTDouble.nextDouble();
                
                //Cremos la clase Ftrapecio con los datos ingresados
                FTrapecio tra1 = new FTrapecio(baseMenorTR,baseMayorTR,alturaTR,lado1TR,lado2TR);
                
                //Ejecutamos los calculos
                tra1.realizarCalculos();
                
                //Seleccionamos una opcion segun el valor dijitado por el usuario
                switch (menuMO()) {
                    case 1 -> {
                        //Ejecutamos la opcion AREA del trapecio
                        tra1.mostrarArea();
                    }
                    case 2 -> {
                        //Ejecutamos la opcion PERIMETRO del trapecio
                        tra1.mostrarPerimetro();
                    }
                    case 3 -> {
                        //Ejecutamos tanto la opcion AREA como PERIMETRO del trapecio
                        tra1.mostrarArea();
                        tra1.mostrarPerimetro();
                    }
                    default -> {//Como seguridad si introduze un dijito no valido le mostramos esto al usuario
                        System.out.println("Introduzca un dijito VALIDO");
                    }
                }
            }
            //Clase FCirculo
            case 4 -> {
                //Salto de linea
                System.out.println("\n");
                
                //Le damos instrucciones al usuario
                System.out.println("Por favor introduzca el radio del circulo");
                
                //Creamos la clase y directamente leemos el valor del radio
                FCirculo cir1 = new FCirculo(eTDouble.nextDouble());
                
                //Realizamos los calculos
                cir1.realizarCalculos();
                
                //Seleccionamos una opcion segun el valor ingresado por el usuario
                switch (menuMO()) {
                    case 1 -> {
                        //Ejecutamos la opcion AREA
                        cir1.mostrarArea();
                    }
                    case 2 -> {
                        //Ejecutamos la opcion PERIMETRO
                        cir1.mostrarPerimetro();
                    }
                    case 3 -> {
                        //Ejecutamos las opciones AREA y PERIMETRO
                        cir1.mostrarArea();
                        cir1.mostrarPerimetro();
                    }
                    default -> {//Como seguridad si introduze un dijito no valido le mostramos esto al usuario
                        System.out.println("Introduzca un dijito VALIDO");
                    }
                }
            }
            //Default
            default -> {
                //Salto de linea
                System.out.println("\n");
                System.out.println("Introduzca un numero VALIDO!!!");
            }
        }
        
        //Ejecutamos el metodo menuPS
        menuPS();
    }
    
    
    //Declaramos metodo para preguntarle al usuario que desea realizar con la figura x creada
    private int menuMO(){
        //salto de linea
        System.out.println("\n");
        //Preguntamos al usuario que desea realizar
        System.out.println("Seleccione una opcion a realizar:");
        System.out.println("1 -- Area");
        System.out.println("2 -- Perimetro");
        System.out.println("3 -- Ambas");
        
        //Declaramos una variable donde almazenaremos el valor ingresado, el valor de esta se leera
        int valor = eTInt.nextInt();
        
        //Comprobamos si el valor esta en el rango perimtido
        if (valor >= 1 && valor <= 3 ) {
            //Salto de linea
            System.out.println("\n");
            //Si lo esta retornamos el valor dijitado
            return valor;
        }else{ //En caso de no serlo realiamos lo siguiente
            //Salto de linea
            System.out.println("\n");
            //Le decimos al usuairo que ocurrio un problema al dijitar el numero (por numero no valido)
            System.out.println("Introduzca un dijito valido!");
            //Volvemos a ejecutar la funcion y devolvemos el valor obtenido de esta
            return menuMO();
        }
    }
    
    
    //Declaramos metodo para preguntar si desea salir del programa
    public void menuPS() throws IOException, InterruptedException{
        //Salto de linea
        System.out.println("\n");
        //Le preguntamos y mostramos al usaurio las opciones a realizar
        System.out.println("Desea salir del programa??");
        System.out.println("1 -- no");
        System.out.println("2 -- si");
        
        //Declaramos una variable donde almacenaremos el dijito ingresado
        int opcion = eTInt.nextInt();
        
        //Ejecutamos segun la opcion seleccionada
        switch (opcion) {
            case 1 -> {
                //Limpiamos el cmd
                lC.limpiarCMD();
                //Volvemos a ejecutar el menu
                menuOpciones();
            }
            case 2 -> //Salimos del programa
                menuSalir();
            default -> {
                //Le decimos al usuario que ingreso un dijito incorrecto
                System.out.println("Ingrese un dijito VALIDO");
                //Si selecciona una opcion incorrecta, volvemos a ejecutar esta funcion
                menuPS();
            }
        }
    }
    
    
    //Declaramos metodo salir
    private void menuSalir(){
        //Salto de linea
        System.out.println("\n");
        //Le mostramos este mensaje al usuairo 
        System.out.println("PROGRAMA TERMINADO!!!");
    }
}
