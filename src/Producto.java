/*
PRÁCTICA 2: MÉTODOS void
Tema
Control de producto
Objetivo
Reforzar el uso de métodos void aplicando ingreso de datos con Scanner, uso de atributos, cálculo simple y presentación clara de resultados.
🟦 CONCEPTO CLAVE
Un método void NO devuelve valores (no usa return). Solo ejecuta acciones como ingresar datos o mostrar información.
Enunciado
Crear una clase llamada Producto que permita registrar:
• nombre del producto
• precio
• cantidad
Requerimientos
El programa debe utilizar métodos void para:
✔ ingresar los datos
✔ calcular el total
✔ mostrar la información
Métodos obligatorios
• ingresarDatos() → ingresar datos con Scanner
• mostrarFactura() → calcular total y mostrar resultados
🟥 ERROR COMÚN
No usar return en este ejercicio. Si lo usas, el método deja de ser void.
Formato de salida esperado
--------------------------------
Ejemplo de ejecución
Ingrese el nombre del producto: Laptop
Ingrese el precio: 800
Ingrese la cantidad: 2

----------- FACTURA -----------

Producto: Laptop
Precio unitario: 800.0
Cantidad: 2

Total a pagar: 1600.0

--------------------------------
 */

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
