import java.util.Scanner;

public class ReMal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Nombre vendedor:");
        String vendedorNombre = input.nextLine();

        System.out.println("Cantidad de productos vendidos:");
        int cantidadProductosVendidos = input.nextInt();

        if (cantidadProductosVendidos>7) {
            System.out.println("cantidad erronea. ");
            System.exit(0);
        }

        System.out.println("Ingrese valor producto 1:");
        int valorProductoUno = input.nextInt();

        System.out.println("Ingrese valor producto 2:");
        int valorProductoDos = input.nextInt();

        System.out.println("Ingrese valor producto 3:");
        int valorProductoTres = input.nextInt();

        System.out.println("Ingrese valor producto 4:");
        int valorProductoCuatro = input.nextInt();

        System.out.println("Ingrese valor producto 5:");
        int valorProductoCinco = input.nextInt();

        System.out.println("Ingrese valor producto 6:");
        int valorProductoSeis = input.nextInt();

        System.out.println("Ingrese valor producto 7:");
        int valorProductoSiete = input.nextInt();

        int todosLosProductos = valorProductoUno+valorProductoDos+valorProductoTres+valorProductoCuatro+valorProductoCinco+valorProductoSeis+valorProductoSiete;

        double comisiones = 0;

        if (todosLosProductos >= 100000) {
        comisiones = comisiones + (todosLosProductos * 0.10);
    } else {
        comisiones = comisiones + (todosLosProductos * 0.05);
        }
    int totalVentas = todosLosProductos;
    double salario = (double) (comisiones + 1000000);

    System.out.println("Vendedor: " +vendedorNombre);
    System.out.println("Total ventas: " +totalVentas);
    System.out.println("Comisiones: " +comisiones);
    System.out.println("Salario total: " +salario);
}

}

