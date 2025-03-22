import java.util.Scanner;

public class EjercicioLogico {public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in); 

    System.out.println("Ingrese la cantida de empleados: ");

    int cantidadEmpleados = input.nextInt();

    if (cantidadEmpleados>10||cantidadEmpleados<=0) {
        System.out.println("Cantidad de empleados incorrecta. ");
        System.exit(0);
    }
    System.out.println("Ingrese el salario del empleado #1: ");
    int salarioEmpleadoUno = input.nextInt(); 
    if (salarioEmpleadoUno<=0) {
        System.out.println("Rango de salario no valido.");
        System.exit(0);
        
    } if (salarioEmpleadoUno>=100||salarioEmpleadoUno<=300){
        System.out.println("Es usted un guerrero del equilibrio:)");

    } else { System.out.println("Tiene usted un sueldo VIP");}

    System.out.println("Ingrese el salario del empleado #2: ");
    int salarioEmpleadoDos = input.nextInt(); 
    if (salarioEmpleadoDos<=0) {
        System.out.println("Rango de salario no valido.");
        System.exit(0);
    } if (salarioEmpleadoDos>=100||salarioEmpleadoDos<=300){
        System.out.println("Es usted un guerrero del equilibrio:)");
    } else {
        System.out.println("Tiene usted un sueldo VIP");
    }

    System.out.println("Ingrese el salario del empleado #3: ");
    int salarioEmpleadoTres = input.nextInt(); 
    if (salarioEmpleadoTres<=0) {
        System.out.println("Rango de salario no valido.");
        System.exit(0);
    } if (salarioEmpleadoTres>=100||salarioEmpleadoTres<=300){
        System.out.println("Es usted un guerrero del equilibrio:)");
    } else { System.out.println("Tiene usted un sueldo VIP");
    }

    System.out.println("Ingrese el salario del empleado #4: ");
    int salarioEmpleadoCuatro = input.nextInt(); 
    if (salarioEmpleadoCuatro<=0) {
        System.out.println("Rango de salario no valido.");
        System.exit(0);
    } if (salarioEmpleadoCuatro>=100||salarioEmpleadoCuatro<=300){
        System.out.println("Es usted un guerrero del equilibrio:)");
    } else { System.out.println("Tiene usted un sueldo VIP");
    }

    System.out.println("Ingrese el salario del empleado #5: ");
    int salarioEmpleadoCinco = input.nextInt(); 
    if (salarioEmpleadoCinco<=0) {
        System.out.println("Rango de salario no valido.");
        System.exit(0);
    } if (salarioEmpleadoCinco>=100||salarioEmpleadoCinco<=300){
        System.out.println("Es usted un guerrero del equilibrio:)");
    } else { System.out.println("Tiene usted un sueldo VIP");
    }

    System.out.println("Ingrese el salario del empleado #6: ");
    int salarioEmpleadoSeis = input.nextInt(); 
    if (salarioEmpleadoSeis<=0) {
        System.out.println("Rango de salario no valido.");
        System.exit(0);
    } if (salarioEmpleadoSeis>=100||salarioEmpleadoSeis<=300){
        System.out.println("Es usted un guerrero del equilibrio:)");
    } else { System.out.println("Tiene usted un sueldo VIP");
    }

    System.out.println("Ingrese el salario del empleado #7: ");
    int salarioEmpleadoSiete = input.nextInt(); 
    if (salarioEmpleadoSiete<=0) {
        System.out.println("Rango de salario no valido.");
        System.exit(0);
    } if (salarioEmpleadoSiete>=100||salarioEmpleadoSiete<=300){
        System.out.println("Es usted un guerrero del equilibrio:)");
    } else { System.out.println("Tiene usted un sueldo VIP");
    }

    System.out.println("Ingrese el salario del empleado #8: ");
    int salarioEmpleadoOcho = input.nextInt(); 
    if (salarioEmpleadoOcho<=0) {
        System.out.println("Rango de salario no valido.");
        System.exit(0);
    } if (salarioEmpleadoOcho>=100||salarioEmpleadoOcho<=300){
        System.out.println("Es usted un guerrero del equilibrio:)");
    } else { System.out.println("Tiene usted un sueldo VIP");
    }

    System.out.println("Ingrese el salario del empleado #9: ");
    int salarioEmpleadoNueve = input.nextInt(); 
    if (salarioEmpleadoNueve<=0) {
        System.out.println("Rango de salario no valido.");
        System.exit(0);
    } if (salarioEmpleadoNueve>=100||salarioEmpleadoNueve<=300){
        System.out.println("Es usted un guerrero del equilibrio:)");
    } else { System.out.println("Tiene usted un sueldo VIP");
    }

    System.out.println("Ingrese el salario del empleado #10: ");
    int salarioEmpleadoDiez = input.nextInt(); 
    if (salarioEmpleadoDiez<=0) {
        System.out.println("Rango de salario no valido.");
        System.exit(0);
    } if (salarioEmpleadoDiez>=100||salarioEmpleadoDiez<=300){
        System.out.println("Es usted un guerrero del equilibrio:)");
    } else { System.out.println("Tiene usted un sueldo VIP");
    }

    double totalSueldos = (float) (salarioEmpleadoUno+salarioEmpleadoDos+salarioEmpleadoTres+salarioEmpleadoCuatro+salarioEmpleadoCinco+salarioEmpleadoSeis+salarioEmpleadoSiete+salarioEmpleadoOcho+salarioEmpleadoNueve+salarioEmpleadoDiez);

    System.out.println("El total de sueldos el dia de hoy fue de " +totalSueldos);

}
    
}
