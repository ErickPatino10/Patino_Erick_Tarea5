/*
Enunciado
Una empresa distribuidora necesita desarrollar un sistema para administrar información de sus productos y tomar decisiones de reposición de inventario.
De cada producto se requiere conocer:
•	código del producto,
•	nombre comercial,
•	categoría,
•	precio unitario,
•	stock disponible,
•	stock mínimo permitido.
La empresa desea que la información descriptiva del producto pueda consultarse de manera sencilla, pero que los datos críticos de control, como precio, stock y stock mínimo, sean protegidos y modificados únicamente bajo condiciones válidas.

El sistema debe permitir registrar productos, actualizar su información y evaluar automáticamente su estado dentro del inventario.
Además, el sistema debe ser capaz de determinar:
•	el valor total del inventario de un producto,
•	si el producto necesita reposición,
•	si el stock es crítico,
•	y si los cambios realizados cumplen reglas válidas de negocio.

Reglas del negocio
El sistema debe considerar lo siguiente:
1.	El precio unitario no puede ser menor o igual a cero.
2.	El stock disponible no puede ser negativo.
3.	El stock mínimo no puede ser negativo.
4.	Si el stock actual es menor que el stock mínimo, el producto debe marcarse como “Requiere reposición”.
5.	Si el stock actual es igual a cero, el producto debe marcarse como “Producto agotado”.
6.	Si el stock actual es mayor al mínimo, el producto debe marcarse como “Stock suficiente”.

Situación de trabajo
La gerencia desea registrar inicialmente un producto y luego realizar una actualización de datos para verificar si el sistema valida correctamente la información antes de aceptar cambios.
También desea obtener un reporte final con:
•	datos generales del producto,
•	valor total del inventario,
•	estado del stock,
•	y mensajes de validación.

Datos de prueba sugeridos
Caso inicial:
•	Código: PRD-105
•	Nombre: Disco SSD 1TB
•	Categoría: Almacenamiento
•	Precio unitario: 89.50
•	Stock disponible: 12
•	Stock mínimo: 8
Posteriormente, se desea intentar actualizar:
•	Precio unitario a 95.00
•	Stock disponible a 5
Y luego probar un caso inválido:
•	Stock disponible a -3

 */
import java.util.Scanner;

public class Inventario {
    //Atributos publicos
    public String nombre;
    public String codigo;
    public String categoria;
    //Atributos Privados
    private double  precioUnitario;
    private double stockDisponible;
    private double stockPermitido;


    // Setters validaciones
    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario > 0)
            this.precioUnitario = precioUnitario;
        else
            System.out.println("Precio invalido");
    }

    public void setStockDisponible(double stockDisponible) {
        if (stockDisponible>=0)
            this.stockDisponible = stockDisponible;
        else
            System.out.println("Stock invalido");
    }


    public void setStockPermitido(double stockPermitido) {
        if (stockPermitido >= 0)
            this.stockPermitido = stockPermitido;
        else
            System.out.println("Stock minimo invalido");

    }

    //Metodo registrar datos
    public void registrarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo: ");
        codigo = sc.nextLine();
        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese la categoria: ");
        categoria = sc.nextLine();
        System.out.println("Ingrese el precio unitario: ");
        setPrecioUnitario(sc.nextDouble());
        System.out.println("Ingrese el stock disponible: ");
        setStockDisponible(sc.nextDouble());
        System.out.println("Ingrese el sock minimo permitido: ");
        setStockPermitido(sc.nextDouble());
        sc.nextLine();
    }

    //Metodo valor total del inventario
    public double valorTotalInventario(){
        return precioUnitario * stockDisponible;
    }

    //Metodo evaluar estado
    public String evaluarEstado(){
        if (stockDisponible == 0)
            return "Producto agotado";
        else if (stockDisponible < stockPermitido)
            return "Requiere reposicion";
        else
            return "Stock suficiente";

    }

    //Metodo mostrar reporte
    public void mostrarReporte() {
        System.out.println("\n=== REPORTE DEL PRODUCTO ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Stock disponible: " + stockDisponible);
        System.out.println("Stock mínimo: " + stockPermitido);
        System.out.println("Valor total inventario: $" + valorTotalInventario());
        System.out.println("Estado del stock: " + evaluarEstado());
        System.out.println("============================\n");
    }

    //Metodo menu

    public void menu (){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Registar Datos");
            System.out.println("2. Actualizar precio");
            System.out.println("3. Actualizar Stock");
            System.out.println("4. Mostrar reporte");
            System.out.println("5.Salir");
            System.out.println("Ingrese la opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    registrarDatos();
                    break;
                case 2:
                    System.out.println("Nuevo precio: ");
                    setPrecioUnitario(sc.nextDouble());
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Nuevo stock: ");
                   setStockDisponible(sc.nextDouble());
                   sc.nextLine();
                    break;
                case 4:
                    mostrarReporte();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        }while (opcion != 5);
    }
}
