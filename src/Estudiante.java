import java.util.Scanner;

public class Estudiante {
    //Atributos
    public String nombre;
    private String carrera;
    private int edad;

    //Metodo Registrar Datos
    public void registrarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su carrera: ");
        carrera = sc.nextLine();
        do {
            System.out.println("Ingrese su edad: ");
            edad = sc.nextInt();
            if (edad<0)
                System.out.println("Edad invalida");
        }while (edad < 0);


    }

    //Metodo Mostrar estudiante
    public void mostrarEstudiante(){
        System.out.println("\n----- DATOS ESTUDIANTES -----");
        System.out.println("Nombre: "+nombre);
        System.out.println("Carrera: "+carrera);
        System.out.println("Edad: "+edad);

    }
}
