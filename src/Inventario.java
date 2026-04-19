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
