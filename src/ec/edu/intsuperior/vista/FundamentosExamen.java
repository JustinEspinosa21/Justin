
package ec.edu.intsuperior.vista;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class FundamentosExamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de grados centígrados: ");
        double gradosC = scanner.nextDouble();
        
        double gradosF = 32 + (9 * gradosC / 5);
        
        System.out.println(gradosC + " grados centígrados son equivalentes a " + gradosF + " grados Fahrenheit.");
    }
    
    public static void Hipotenusa (){
        
        // Crear un objeto Scanner para leer desde la entrada estándar
        Scanner input = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese la longitud de los catetos
        System.out.print("Ingrese la longitud del cateto a: ");
        double a = input.nextDouble();
        
        System.out.print("Ingrese la longitud del cateto b: ");
        double b = input.nextDouble();
        
        // Calcular la hipotenusa utilizando la fórmula de Pitágoras
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        // Mostrar el resultado
        System.out.println("La longitud de la hipotenusa es: " + c);
    }
    
    public static void VelocidadConversion (){
        // Pedir la velocidad en Km/h al usuario
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la velocidad en Km/h: ");
        double velocidadKmh = sc.nextDouble();
        
        // Convertir la velocidad a m/s
        double velocidadMs = velocidadKmh / 3.6;
        
        // Mostrar la velocidad convertida en m/s
        System.out.println("La velocidad en m/s es: " + velocidadMs);
    }
    
    public static void Circunferencia () {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor del radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área de la circunferencia es: " + area);
    }
    
    public static void GestionPaciente () {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            // Mostrar el menú de opciones
            System.out.println("****** GESTION DE PACIENTE ********");
            System.out.println("1-NUEVO PACIENTE");
            System.out.println("2-BUSCAR PACIENTE");
            System.out.println("3-ELIMINAR PACIENTE");
            System.out.println("4-MODIFICAR PACIENTE");
            System.out.println("5-VER TODOS LOS PACIENTES");
            System.out.println("6-SALIR");

            // Leer la opción seleccionada por el usuario
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();

            // Realizar una acción en función de la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado la opción NUEVO PACIENTE");
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opción BUSCAR PACIENTE");
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opción ELIMINAR PACIENTE");
                    break;
                case 4:
                    System.out.println("Ha seleccionado la opción MODIFICAR PACIENTE");
                    break;
                case 5:
                    System.out.println("Ha seleccionado la opción VER TODOS LOS PACIENTES");
                    break;
                case 6:
                    System.out.println("Ha seleccionado la opción SALIR. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción incorrecta. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 6);
    }
    
    public static void calcularCrecimiento(double poblacionActual, double tasaCrecimiento) {
        double poblacionDespuesDe1Anio = poblacionActual * (1 + tasaCrecimiento);
        double poblacionDespuesDe2Anios = poblacionDespuesDe1Anio * (1 + tasaCrecimiento);
        double poblacionDespuesDe3Anios = poblacionDespuesDe2Anios * (1 + tasaCrecimiento);
        double poblacionDespuesDe4Anios = poblacionDespuesDe3Anios * (1 + tasaCrecimiento);
        double poblacionDespuesDe5Anios = poblacionDespuesDe4Anios * (1 + tasaCrecimiento);
        
        System.out.println("Población después de 1 año: " + poblacionDespuesDe1Anio);
        System.out.println("Población después de 2 años: " + poblacionDespuesDe2Anios);
        System.out.println("Población después de 3 años: " + poblacionDespuesDe3Anios);
        System.out.println("Población después de 4 años: " + poblacionDespuesDe4Anios);
        System.out.println("Población después de 5 años: " + poblacionDespuesDe5Anios);
    }
    
    public static void Producto () {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        float costoTotal = 0;
        
        do {
            System.out.println("MENU:");
            System.out.println("1. Insertar producto");
            System.out.println("2. Consultar costo total");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el código del producto: ");
                    int codigo = scanner.nextInt();
                    System.out.print("Ingrese la cantidad del producto: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Ingrese el precio del producto: ");
                    float precio = scanner.nextFloat();
                    float costoProducto = cantidad * precio;
                    costoTotal += costoProducto;
                    System.out.printf("Costo total del producto: $%.2f\n", costoProducto);
                    break;
                case 2:
                    System.out.printf("Costo total de los productos: $%.2f\n", costoTotal);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
            
        } while (opcion != 3);
        
    }
    
    public static void Ascii (){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número del 0 al 127: ");
        int num = scanner.nextInt();

        if (num < 0 || num > 127) {
            System.out.println("El número ingresado no está en el rango válido.");
        } else {
            char c = (char) num;
            System.out.println("El carácter ASCII correspondiente es: " + c);
        }

    }
    
        public static void SerieF (){
        Scanner input = new Scanner(System.in);
        
        // Pedir el valor de X al usuario
        System.out.print("Ingrese el valor de X: ");
        double x = input.nextDouble();
        
        double termino = x;
        double resultado = 1;
        int n = 2; // n es el número de término actual en la serie
        double error = Math.pow(10, -3);
        
        while (Math.abs(termino) >= error) {
            resultado -= termino;
            termino = (termino * x) / n;
            n++;
        }
        
        System.out.println("F(" + x + ") = " + resultado);
    }
    
        public static void Fumigacion (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del granjero: ");
        String nombre = sc.nextLine();
        System.out.print("Tipo de fumigación (1, 2, 3, 4): ");
        int tipo = sc.nextInt();
        System.out.print("Número de hectáreas a fumigar: ");
        int hectareas = sc.nextInt();
        double precio;
        switch (tipo) {
            case 1:
                precio = 10 * hectareas;
                break;
            case 2:
                precio = 15 * hectareas;
                break;
            case 3:
                precio = 20 * hectareas;
                break;
            default:
                precio = 30 * hectareas;
                break;
        }
        if (hectareas >= 1000) {
            precio *= 0.95;
        }
        double excedente = precio - 3000;
        if (excedente > 0) {
            precio = 3000 + excedente * 0.9;
        }
        System.out.println("Nombre del granjero: " + nombre);
        System.out.println("Valor a pagar: " + precio + " dólares.");
    }
    
    public static void Taxista(){
        Scanner sc = new Scanner(System.in);

        int[] carreras = new int[30]; // Vector para almacenar el número de carreras realizadas en cada día del mes

        // Leer el número de carreras realizadas en cada día del mes
        for (int i = 0; i < carreras.length; i++) {
            System.out.print("Ingrese el número de carreras del día " + (i + 1) + ": ");
            carreras[i] = sc.nextInt();
        }

        // Encontrar el día en que más carreras hizo el taxista
        int maxCarreras = carreras[0];
        int diaMaxCarreras = 1;
        for (int i = 1; i < carreras.length; i++) {
            if (carreras[i] > maxCarreras) {
                maxCarreras = carreras[i];
                diaMaxCarreras = i + 1;
            }
        }
        System.out.println("El día en que más carreras hizo el taxista fue el día " + diaMaxCarreras);

        // Calcular el total de dinero que hizo el taxista en el mes
        int totalDinero = 0;
        for (int i = 0; i < carreras.length; i++) {
            if (carreras[i] < 10) {
                totalDinero += carreras[i] * 2000;
            } else if (carreras[i] >= 11 && carreras[i] <= 30) {
                totalDinero += carreras[i] * 4000;
            } else {
                totalDinero += carreras[i] * 5000;
            }
        }
        System.out.println("El taxista hizo un total de $" + totalDinero + " en el mes");

        // Calcular el promedio de carreras realizadas por el taxista
        int totalCarreras = 0;
        for (int i = 0; i < carreras.length; i++) {
            totalCarreras += carreras[i];
        }
        double promedioCarreras = (double) totalCarreras / carreras.length;
        System.out.println("El promedio de carreras realizadas por el taxista fue de " + promedioCarreras);
    }

       public static void IngreseUnNuemro(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número de tres dígitos: ");
        int num = scanner.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("El número no es de tres dígitos.");
            return;
        }

        System.out.println("El número es " + (num % 2 == 0 ? "par" : "impar"));
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int count = 0;
        while (num > 0) {
            int digito = num % 10;
            suma += digito;
            mayor = Math.max(mayor, digito);
            menor = Math.min(menor, digito);
            num /= 10;
            count++;
        }
        System.out.println("La suma de sus dígitos es " + suma);
        System.out.println("El promedio de sus dígitos es " + ((double) suma / count));
        System.out.println("El mayor dígito es " + mayor);
        System.out.println("El menor dígito es " + menor);
    }

    public static int sumaPares(int n) {
        int suma = 0;
        for (int i = 2; i <= n; i += 2) {
            suma += i;
        }
        return suma;
    }

    public static int sumaImpares(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i += 2) {
            suma += i;
        }
        return suma;
    }

    public static void multiplosDeTres(int n) {
        System.out.print("Múltiplos de tres: ");
        for (int i = 3; i <= n; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int mayor(int n) {
        int mayor = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un número positivo: ");
            int num = scanner.nextInt();
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }
    
    public static void Productos() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> productos = new HashMap<>();
        
        // Pedimos al usuario que ingrese los productos y sus precios
        while (true) {
            System.out.print("Ingrese el nombre del producto o 'fin' para terminar: ");
            String nombre = scanner.nextLine();
            
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            
            System.out.print("Ingrese el precio del producto: ");
            int precio = scanner.nextInt();
            scanner.nextLine(); // Consumimos la nueva línea
            
            productos.put(nombre, precio);
        }
        
        // Pedimos al usuario que ingrese la cantidad de cada producto que se llevó
        Map<String, Integer> cantidades = new HashMap<>();
        productos.keySet().stream().map((producto) -> {
            System.out.print("Ingrese la cantidad de " + producto + " que se llevó: ");
            return producto;
        }).forEachOrdered((producto) -> {
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Consumimos la nueva línea
            
            cantidades.put(producto, cantidad);
        });
        
        // Mostramos la tabla con los resultados
        System.out.println("Producto\tPrecio\tCantidad\tTotal");
        int total = 0;
        for (String producto : productos.keySet()) {
            int precio = productos.get(producto);
            int cantidad = cantidades.get(producto);
            int subtotal = precio * cantidad;
            total += subtotal;
            
            System.out.println(producto + "\t\t" + precio + "\t" + cantidad + "\t\t" + subtotal);
        }
        
        System.out.println("Total\t\t\t\t\t\t" + total);
    }
    
    public static void SumayOpuesto(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int num = entrada.nextInt();
        
        if (num < 0) {
            num = num * -1; // Cambia el número negativo por su opuesto
        }
        
        int suma = 0;
        for (int i = 0; i <= num; i++) {
            suma += i; // Acumula la suma de todos los números del 0 al número ingresado
        }
        
        System.out.println("La suma de todos los números entre 0 y " + num + " es: " + suma);
    }
    
    public static void Calculadora(){
        
        double num1, num2, resultado;
        String operador;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número:"));
        
        do {
            operador = JOptionPane.showInputDialog(null, "Ingrese el operador (+, -, *, /):");
        } while (!operador.equals("+") && !operador.equals("-") && !operador.equals("*") && !operador.equals("/"));
        
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número:"));
        
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
                break;
            case "/":
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "La operación no existe.");
                } else {
                    resultado = num1 / num2;
                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
                }
                break;
        }
        
        
    }
      public static void Valor(){
        int n = 1; // Inicializamos el primer término de la serie
        int termino = 0; // Inicializamos una variable para almacenar cada término de la serie
        while (termino < 1000) { // Mientras el término sea menor que 1000
            System.out.print(termino + " "); // Imprimimos el término en la consola
            termino = 2 * n + 1; // Calculamos el siguiente término de la serie
            n++; // Incrementamos el valor de n para calcular el siguiente término
        }
    }
    
       public static void CalculadorAreas(){
        Scanner scanner = new Scanner(System.in);

        // Calcular el área de un cuadrado (1 lado la base y 1 lado la altura)
        System.out.print("Ingresa el valor de la base del cuadrado: ");
        int baseCuadrado = scanner.nextInt();
        System.out.print("Ingresa el valor de la altura del cuadrado: ");
        int alturaCuadrado = scanner.nextInt();
        int areaCuadrado = calcularAreaCuadrado(baseCuadrado, alturaCuadrado);
        System.out.println("El área del cuadrado es: " + areaCuadrado);

        // Calcular el área de un rectángulo (1 lado la base y 1 lado la altura)
        System.out.print("Ingresa el valor de la base del rectángulo: ");
        int baseRectangulo = scanner.nextInt();
        System.out.print("Ingresa el valor de la altura del rectángulo: ");
        int alturaRectangulo = scanner.nextInt();
        int areaRectangulo = calcularAreaRectangulo(baseRectangulo, alturaRectangulo);
        System.out.println("El área del rectángulo es: " + areaRectangulo);

        // Calcular el área de un triángulo (1 lado la base y 1 lado la altura)
        System.out.print("Ingresa el valor de la base del triángulo: ");
        int baseTriangulo = scanner.nextInt();
        System.out.print("Ingresa el valor de la altura del triángulo: ");
        int alturaTriangulo = scanner.nextInt();
        double areaTriangulo = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
        System.out.println("El área del triángulo es: " + areaTriangulo);

        // Calcular el área de un círculo
        System.out.print("Ingresa el valor del radio del círculo: ");
        double radio = scanner.nextDouble();
        double areaCirculo = calcularAreaCirculo(radio);
        System.out.println("El área del círculo es: " + areaCirculo);

        scanner.close();
    }

    public static int calcularAreaCuadrado(int base, int altura) {
        int area = base * altura;
        return area;
    }

    public static int calcularAreaRectangulo(int base, int altura) {
        int area = base * altura;
        return area;
    }

    public static double calcularAreaTriangulo(int base, int altura) {
        double area = (base * altura) / 2.0;
        return area;
    }

    public static double calcularAreaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    
    public static void ordena() {
    Scanner leer = new Scanner(System.in);
    System.out.println("Introduce el valor de a: ");
    int a = leer.nextInt();
    System.out.println("Introduce el valor de b: ");
    int b = leer.nextInt();
    System.out.println("Introduce el valor de c: ");
    int c = leer.nextInt();
    leer.close();

    int temp;
    if (a > b) {
        temp = a;
        a = b;
        b = temp;
    }
    if (a > c) {
        temp = a;
        a = c;
        c = temp;
    }
    if (b > c) {
        temp = b;
        b = c;
        c = temp;
    }
    System.out.println("a=" + a + " b=" + b + " c=" + c);
}
    public static void dado_aleatorio(int n) {
    int contador = 0;
    int dado;
    do {
        dado = (int) (Math.random() * 6) + 1;
        contador++;
    } while (dado != n);
    System.out.println("Se lanzó el dado " + contador + " veces para obtener el número " + n);
}
    
}

    


    

