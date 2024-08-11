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
        System.out.println("Seleccione una figura para calcular Área y Perímetro:");
        System.out.println("1 --- Cuadrado");
        System.out.println("2 --- Rectángulo");
        System.out.println("3 --- Triángulo");
        System.out.println("4 --- Trapecio");
        System.out.println("5 --- Círculo");
        System.out.println("6 --- Pentágono");
        System.out.println("7 --- Hexágono");
        System.out.println("8 --- Octágono");
        
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
                        System.out.println("Introduzca un dijito VÁLIDO!");
                }
            }
            //Clase FRectángulo
            case 2 -> {
                //Salto de linea
                System.out.println("\n");
                
                //Le damos instrucciones al usuario
                System.out.println("Por favor ingrese el alto de su rectángulo");
                double altoR = eTDouble.nextDouble();
                System.out.println("Por favor ingrese el ancho de su rectángulo");
                double anchoR = eTDouble.nextDouble();
                
                //Creamos la clase con los valores dados por el usuario
                FRectangulo rec1 = new FRectangulo(altoR,anchoR);
                
                //Mandamos a realizar calculos de la clase creada
                rec1.realizarCalculos();
                
                //Con el valor dado por el usuario seleccionamos una opcion
                switch (menuMO()) {
                    case 1 -> {
                        //Ejecutamos el AREA del rectangulo
                        rec1.mostrarArea();
                    }
                    case 2 -> {
                        //Ejecutamos el PERIMETRO del rectangulo
                        rec1.mostrarPerimetro();
                    }
                    case 3 -> {
                        //Ejecutamos el AREA y el PERIMETRO del rectangulo
                        rec1.mostrarArea();
                        rec1.mostrarPerimetro();
                    }
                    default -> {//Como seguridad si introduze un dijito no valido le mostramos esto al usuario
                        System.out.println("Introduzca un dijito VÁLIDO");
                    }
                }
            }
            //Clase FTRIÁNGULO
            case 3 -> {
                //Salto de linea
                System.out.println("\n");
                
                //Le damos instrucciones al usuario
                System.out.println("Por favor introduzca la medida de la altura de su triángulo:");
                double alturaT = eTDouble.nextDouble();
                System.out.println("Ahora introduzca la medida de la base:");
                double baseT = eTDouble.nextDouble();
                System.out.println("Ahora introduzca la medida del lado izquiero de si triángulo:");
                double lado1T = eTDouble.nextDouble();
                System.out.println("Ahora introduzca la medida del lado derecho de su triángulo:");
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
                        System.out.println("Introduzca un dijito VÁLIDO!");
                }
            }
            //Clase FTrapecio
            case 4 -> {
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
                        System.out.println("Introduzca un dijito VÁLIDO");
                    }
                }
            }
            //Clase FCírculo
            case 5 -> {
                //Salto de linea
                System.out.println("\n");
                
                //Le damos instrucciones al usuario
                System.out.println("Por favor introduzca el radio del círculo");
                
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
                        System.out.println("Introduzca un dijito VÁLIDO");
                    }
                }
            }
            //Clase FPentágono
            case 6 -> {
                //Salto de linea
                System.out.println("\n");
                
                //Le damos instrucciones al usuario
                System.out.println("Por favor ingrese la medida de uno de los lados del pentágono");
                double ladoP = eTDouble.nextDouble();
                System.out.println("Por favor ingrese la medida de la apotema de su pentágono");
                double apotemaP = eTDouble.nextDouble();
                
                //Creamos la clase con los valores dados
                FPentagono pen1 = new FPentagono(ladoP,apotemaP);
                
                //Realizamos los calculos
                pen1.realizarCalculos();
                
                //Con el valor dijitado por el usuario seleccionamos una tarea a realizar
                switch (menuMO()) {
                    case 1 -> {
                        //Ejecutamos el AREA del pentagono
                        pen1.mostrarArea();
                    }
                    case 2 -> {
                        //Ejecutamos el PERIMETRO del pentagono
                        pen1.mostrarPerimetro();
                    }
                    case 3 -> {
                        //Ejecutamos el AREA y el PERIMETRO pentagono
                        pen1.mostrarArea();
                        pen1.mostrarPerimetro();
                    }
                    default -> { //Como seguridad si introduze un dijito no valido le mostramos esto al usuario
                        System.out.println("Introduzca un dijito VÁLIDO");
                    }
                }
            }
            //Clase FHexágono
            case 7 -> {
                //Salto de linea
                System.out.println("\n");
                
                //Le damos instrucciones al usuario
                System.out.println("Por favor ingrese la medida de uno de los lados de su hexágono");
                double ladoH = eTDouble.nextDouble();
                System.out.println("Por favor ingrese la medida de la apotema de su hexágono");
                double apotemaH = eTDouble.nextDouble();
                
                //Creamos la clase con los valores dados
                FHexagono hexa1 = new FHexagono(ladoH,apotemaH);
                
                //Realizamos los calculos
                hexa1.realizarCalculos();
                
                //Con el valor dado por el usuario ejecutamos una tarea
                switch (menuMO()) {
                    case 1 -> {
                        //Elecutamos el AREA del hexagono
                        hexa1.mostrarArea();
                    }
                    case 2 -> {
                        //Ejecutamos el PERIMETRO del hexagono
                        hexa1.mostrarPerimetro();
                    }
                    case 3 ->{
                        //Ejecutamos el AREA y el PERIMETRO del hexagono
                        hexa1.mostrarArea();
                        hexa1.mostrarPerimetro();
                    }
                    default -> {//Como seguridad si introduze un dijito no valido le mostramos esto al usuario
                        System.out.println("Introduzca un dijito VÁLIDO");
                    }
                }
            }
            //Clase FOctágono
            case 8 -> {
                //Salto de linea
                System.out.println("\n");
                
                //Le damos instrucciones al usuario
                System.out.println("Por favor introduzca la medida de uno de sus lados de su octágono");
                double ladoO = eTDouble.nextDouble();
                System.out.println("Por favor introduzca la medida de la apotema de su octágono");
                double apotemaO = eTDouble.nextDouble();
                
                //Creamos la clase con los valores dados
                FOctagono octa1 = new FOctagono(ladoO,apotemaO);
                
                //Realizamos los calculos
                octa1.realizarCalculos();
                
                //Con el valor dado por el usuario ejecutamos una tarea
                switch (menuMO()) {
                    case 1 -> {
                        //Ejecutamos el AREA del octagono
                        octa1.mostrarArea();
                    }
                    case 2 -> {
                        //Ejecutamos el PERIMETRO del octagono
                        octa1.mostrarPerimetro();
                    }
                    case 3 -> {
                        //Ejecutamos el AREA y el PERIMETRO del octagono
                        octa1.mostrarArea();
                        octa1.mostrarPerimetro();
                    }
                    default -> {//Como seguridad si introduze un dijito no valido le mostramos esto al usuario
                        System.out.println("Introduzca un dijito VÁLIDO");
                    }
                }
            }
            //Default
            default -> {
                //Salto de linea
                System.out.println("\n");
                System.out.println("Introduzca un numero VÁLIDO!!!");
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
        System.out.println("Seleccione una opción a realizar:");
        System.out.println("1 -- Área");
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
            System.out.println("Introduzca un dijito válido!");
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
                System.out.println("Ingrese un dijito VÁLIDO");
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
