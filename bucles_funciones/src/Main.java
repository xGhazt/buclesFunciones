public class Main {

    public static void main(String[] args) {
        // Ejercicio 1
        System.out.println("Ejercicio 1: Cálculo de ingresos mensuales");
        double[] ventas = {100.50, 200.75, 150.20, 300.00, 250.50, 180.00, 220.10, 190.00, 210.00, 240.30, 210.50, 230.00, 250.20, 240.10, 260.00, 220.50, 190.20, 210.30, 200.00, 220.40, 230.50, 210.00, 180.00, 190.10, 210.30, 250.10, 240.00, 220.00, 250.40, 240.30};
        calcularIngresosMensuales(ventas);

        // Ejercicio 2
        System.out.println("\nEjercicio 2: Generar reportes de inventario");
        String[] productos = {"Televisor", "Celular", "Laptop", "Tablet", "Cámara"};
        int[] stocks = {3, 10, 2, 6, 4};
        generarReporteBajoStock(productos, stocks);

        // Ejercicio 3
        System.out.println("\nEjercicio 3: Gestión de clientes");
        String[] clientes = {"Ana", "Luis", "Pedro", "María"};
        double[] facturasPendientes = {400, 600, 350, 550};
        enviarFacturas(clientes, facturasPendientes);

        // Ejercicio 4
        System.out.println("\nEjercicio 4: Cálculo de descuentos para fidelización");
        String[] clientesDescuento = {"Juan", "Laura", "Carlos", "Sofia"};
        int[] compras = {5, 12, 8, 15};
        calcularDescuentos(clientesDescuento, compras);

        // Ejercicio 5
        System.out.println("\nEjercicio 5: Promedio de satisfacción del cliente");
        int[] calificaciones = {4, 5, 3, 4, 5, 2};
        calcularPromedioSatisfaccion(calificaciones);

        // Ejercicio 6
        System.out.println("\nEjercicio 6: Cálculo de impuestos");
        double[] facturas = {100.00, 200.00, 300.00, 150.00, 250.00};
        calcularImpuesto(facturas);

        // Ejercicio 7
        System.out.println("\nEjercicio 7: Descuento por compras grandes");
        double[] comprasGrandes = {400, 600, 150, 700};
        aplicarDescuento(comprasGrandes);

        // Ejercicio 8
        System.out.println("\nEjercicio 8: Control de horas trabajadas");
        String[] empleados = {"Juan", "Pedro", "María", "Luis"};
        int[] horasTrabajadas = {40, 42, 38, 45};
        calcularPagoSemanal(empleados, horasTrabajadas);

        // Ejercicio 9
        System.out.println("\nEjercicio 9: Calcular el precio final con descuentos");
        double[] preciosOriginales = {100, 200, 150, 180};
        calcularPrecioFinal(preciosOriginales);
    }

    // Ejercicio 1: Cálculo de ingresos mensuales
    public static void calcularIngresosMensuales(double[] ventas) {
        double total = 0;
        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i];
        }
        System.out.println("El total de ingresos mensuales es: $" + total);
    }

    // Ejercicio 2: Generar reportes de inventario
    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        System.out.println("Productos con bajo stock:");
        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) {
                System.out.println(productos[i] + " - Unidades: " + stocks[i]);
            }
        }
    }

    // Ejercicio 3: Gestión de clientes
    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas mayores a $500:");
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println(clientes[i] + " - Factura pendiente: $" + facturasPendientes[i]);
            }
        }
    }

    // Ejercicio 4: Cálculo de descuentos para fidelización
    public static void calcularDescuentos(String[] clientes, int[] compras) {
        System.out.println("Clientes que califican para descuento:");
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                System.out.println(clientes[i] + " - Descuento del 10%");
            }
        }
    }

    // Ejercicio 5: Promedio de satisfacción del cliente
    public static void calcularPromedioSatisfaccion(int[] calificaciones) {
        double total = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            total += calificaciones[i];
        }
        double promedio = total / calificaciones.length;
        System.out.println("El promedio de satisfacción del cliente es: " + promedio);
    }

    // Ejercicio 6: Cálculo de impuestos
    public static void calcularImpuesto(double[] facturas) {
        double tasaImpuesto = 0.21;
        for (int i = 0; i < facturas.length; i++) {
            double impuesto = facturas[i] * tasaImpuesto;
            System.out.println("Factura: $" + facturas[i] + " - Impuesto: $" + impuesto);
        }
    }

    // Ejercicio 7: Descuento por compras grandes
    public static void aplicarDescuento(double[] compras) {
        double descuento = 0.15;
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                double precioConDescuento = compras[i] - (compras[i] * descuento);
                System.out.println("Compra original: $" + compras[i] + " - Precio con descuento: $" + precioConDescuento);
            }
        }
    }

    // Ejercicio 8: Control de horas trabajadas
    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        double tarifaPorHora = 15.0;
        for (int i = 0; i < empleados.length; i++) {
            double pago = horasTrabajadas[i] * tarifaPorHora;
            System.out.println("Empleado: " + empleados[i] + " - Pago semanal: $" + pago);
        }
    }

    // Ejercicio 9: Calcular el precio final con descuentos
    public static void calcularPrecioFinal(double[] preciosOriginales) {
        double descuento = 0.10;
        for (int i = 0; i < preciosOriginales.length; i++) {
            double precioConDescuento = preciosOriginales[i] - (preciosOriginales[i] * descuento);
            System.out.println("Precio original: $" + preciosOriginales[i] + " - Precio con descuento: $" + precioConDescuento);
        }
    }
}
