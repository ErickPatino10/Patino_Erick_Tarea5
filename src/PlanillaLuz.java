import java.util.Scanner;

public class PlanillaLuz {
    //Atributos
    public String nombreCliente;
    public double consumo;
    public  double costoKW;

    //Metodo Ingresar Datos
    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del cliente: ");
        nombreCliente = sc.nextLine();
        System.out.println("Ingresa el consumo: ");
        consumo = sc.nextDouble();
        System.out.println("Ingresa el costo por KW: ");
        costoKW = sc.nextDouble();
    }

    //Metodo Calcular Subtotal
    public double calcularSubtotal(){
        return consumo * costoKW;
    }

    //Metodo Calcular IVA
    public double calcularIVA(){
        return calcularSubtotal() * 0.12;
    }

    // Metodo Calcular Total
    public double calcularTotal(){
        return calcularSubtotal()+calcularIVA();
    }

    //Metodo Mostrar Informacion
    public void mostrarInformacion(){
        System.out.println("\n--- PLANTILLA DE LUZ ---");
        System.out.println("Cliente: "+nombreCliente);
        System.out.println("Subtotal: "+calcularSubtotal());
        System.out.println("IVA: "+calcularIVA());
        System.out.println("Total a pagar: "+calcularTotal());
        System.out.println("-------------------------------");
    }
}
