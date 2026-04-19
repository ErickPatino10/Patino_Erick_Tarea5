import java.util.Scanner;

public class Pedido {
    //Atributos
    public String cliente;
    public  String plato;
    public double precio;
    public int cantidad;

    //Metodo registar pedido
    public void registarPedido(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        cliente = sc.nextLine();
        System.out.println("Ingrese su plato pedido: ");
        plato = sc.nextLine();
        System.out.println("Ingrese el precio: ");
        precio = sc.nextDouble();
        System.out.println("Ingrese la cantidad: ");
        cantidad = sc.nextInt();
    }

    //Metodo calcular subtotal
    public double calcularSubtotal(){
        return precio * cantidad;
    }

    //Metodo calcular descuento
    public double calcularDescuento(){
        if (calcularSubtotal() > 25)
            return calcularSubtotal()*0.10;
        else
            return  0;
    }

    //Metodo Calcular total final
    public double totalFinal(){
        return calcularSubtotal() - calcularDescuento();
    }

    //Metodo mostrar pedido
    public void mostarPedido(){
        System.out.println("--- CUENTA DEL PEDIDO ---");
        System.out.println("Cliente: "+cliente);
        System.out.println("Plato: "+plato);
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Subtotal: "+calcularSubtotal());
        System.out.println("Descuento: "+calcularDescuento());
        System.out.println("Total final: "+totalFinal());
    }

}
