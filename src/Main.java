public class Main {
    static public void main(String[] args){
        //Objeto Estudiante
        Estudiante e1 = new Estudiante();
        //LLamo a los metodos
        e1.registrarDatos();
        e1.mostrarEstudiante();

        //Objeto Producto
        Producto p1 = new Producto();
        //Llamo a los metodos
        p1.ingresarDatos();
        p1.mostrarFactura();
        p1.calcularTotal();

        //Objeto Calificacion
        Calificacion c1 = new Calificacion();
        //LLamo al metodo
        c1.ingresarDatos();
        c1.mostrarReporte();

        //Objeto Plantilla de Luz
        PlanillaLuz pl1 = new PlanillaLuz();
        pl1.ingresarDatos();
        pl1.mostrarInformacion();

        //Objeto Empleado
        Empleado emp1 = new Empleado();
        //LLamo a los metodos
        emp1.ingresarDatos();
        emp1.mostrarReporte();

        //Objeto Pedido
        Pedido pedido1 = new Pedido();
        //Llamo a los metodos
        pedido1.registarPedido();
        pedido1.mostarPedido();

        //Objeto inventario
        Inventario inventario1 = new Inventario();
        //LLamo a los metodos
        inventario1.menu();

    }
}