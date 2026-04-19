import java.util.Scanner;

public class Producto {
    //Atrributos
    public String nombreProducto;
    public double precio;
    public  int cantidad;

    //Metodos
    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        nombreProducto = sc.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        precio = sc.nextDouble();
        System.out.println("Ingrese la cantidad del producto: ");
        cantidad = sc.nextInt();
    }

    //Metodo Calcular total
    public void calcularTotal(){
         double total = precio * cantidad;
         System.out.println("\nTotal a pagar: "+total);
         if (total > 1000){
             double descuento  = total * 0.1;
             total = total - descuento;
             System.out.println("Descuento aplicado: "+descuento);
         }
         System.out.println("---------------------------");

    }

    //Metodo Mostrar Factura
    public void mostrarFactura(){
        System.out.println("\n------ Factura ------");
        System.out.println("Producto: "+nombreProducto);
        System.out.println("Precio Unitario: "+nombreProducto);
        System.out.println("Cantidad: "+cantidad);
    }
}
