import java.util.Scanner;

public class Empleado {
    //Atributos
    public String nombre;
    public int horasTrabajadas;
    public double pagoHoras;

    //Metodo Ingresar Datos
    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa las horas trabajadas: ");
        horasTrabajadas = sc.nextInt();
        System.out.println("Ingresa el pago por hora: ");
        pagoHoras = sc.nextDouble();
    }

    //Metodo Sueldo Base
    public double sueldoBase(){
        return horasTrabajadas*pagoHoras;
    }
     //Metodo Bono
    public double bono(){
        if (sueldoBase() > 450)
            return 20.0;
        else
            return 0.0;
    }

    //Metodo sueldo final
    public double sueldoFinal(){
        return sueldoBase() + bono();
    }

    //Metodo mostar reporte
    public void mostrarReporte(){
        System.out.println("\n--- REPORTE EMPLEADO ----");
        System.out.println("Nombre: "+nombre);
        System.out.println("Sueldo base: "+sueldoBase());
        System.out.println("Bono: "+bono());
        System.out.println("Sueldo final: "+sueldoFinal());
        System.out.println("----------------------------");
    }
}
