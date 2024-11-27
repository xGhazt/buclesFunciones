import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ejercicio 1: Cálculo del tiempo dedicado a cada actividad");
        calcularTiempoActividades();

        System.out.println("\nEjercicio 2: Cálculo de salarios semanales");
        calcularSalarios();

        System.out.println("\nEjercicio 3: Control de inventario");
        controlarInventario();

        System.out.println("\nEjercicio 4: Registro de ventas diarias");
        registrarVentas();

        System.out.println("\nEjercicio 5: Cálculo de horas extras");
        calcularHorasExtras();
    }

    // Ejercicio 1: Cálculo del tiempo dedicado a cada actividad
    public static void calcularTiempoActividades() {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int actividad = 1;


        while (actividad <= 4) {
            String nombreActividad = "";
            switch (actividad) {
                case 1:
                    nombreActividad = "estudiar";
                    break;
                case 2:
                    nombreActividad = "hacer ejercicios";
                    break;
                case 3:
                    nombreActividad = "leer";
                    break;
                case 4:
                    nombreActividad = "tiempo libre";
                    break;
            }

            System.out.print("Introduce las horas dedicadas a " + nombreActividad + ": ");
            int horas = scanner.nextInt();
            total += horas;
            actividad++;
        }

        System.out.println("El tiempo total dedicado es: " + total + " horas.");
    }

    // Ejercicio 2: Cálculo de salarios semanales
    public static void calcularSalarios() {
        Scanner scanner = new Scanner(System.in);
        final double tarifaPorHora = 15.0;

        System.out.print("Introduce la cantidad de empleados: ");
        int numEmpleados = scanner.nextInt();

        for (int i = 1; i <= numEmpleados; i++) {
            System.out.print("Introduce las horas trabajadas por el empleado " + i + ": ");
            int horasTrabajadas = scanner.nextInt();
            double salario = horasTrabajadas * tarifaPorHora;
            System.out.println("El salario del empleado " + i + " es: $" + salario);
        }
    }

    // Ejercicio 3: Control de inventario
    public static void controlarInventario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de productos: ");
        int numProductos = scanner.nextInt();

        for (int i = 1; i <= numProductos; i++) {
            System.out.print("Introduce la cantidad disponible del producto " + i + ": ");
            int cantidad = scanner.nextInt();
            if (cantidad < 5) {
                System.out.println("Producto " + i + " tiene menos de 5 unidades. Es necesario realizar un pedido.");
            }
        }
    }

    // Ejercicio 4: Registro de ventas diarias
    public static void registrarVentas() {
        Scanner scanner = new Scanner(System.in);
        double totalVentas = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Introduce las ventas del día " + i + ": ");
            double ventasDia = scanner.nextDouble();
            totalVentas += ventasDia;
        }

        System.out.println("El total de ventas de la semana es: $" + totalVentas);
    }

    // Ejercicio 5: Cálculo de horas extras
    public static void calcularHorasExtras() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de empleados: ");
        int numEmpleados = scanner.nextInt();

        for (int i = 1; i <= numEmpleados; i++) {
            System.out.print("Introduce las horas trabajadas por el empleado " + i + ": ");
            int horasTrabajadas = scanner.nextInt();

            if (horasTrabajadas > 40) {
                int horasExtras = horasTrabajadas - 40;
                System.out.println("El empleado " + i + " trabajó " + horasExtras + " horas extras.");
            } else {
                System.out.println("El empleado " + i + " no trabajó horas extras.");
            }
        }
    }
}
