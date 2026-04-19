/*
Tema: Cálculo de promedio final
Objetivo
Aplicar métodos con return para devolver resultados numéricos y textuales.
Enunciado
Crear una clase Calificacion con nombre y tres notas. Calcular promedio y estado.
Entrada
- nombre del estudiante
- nota 1, nota 2, nota 3
Proceso
Calcular promedio y determinar estado (>=7 Aprobado, <7 Reprobado).
Salida esperada
-------- REPORTE ACADÉMICO --------
Nombre: Carla Pérez
Promedio final: 8.5
Estado: Aprobado
-----------------------------------

 */
import java.util.Scanner;

public class Calificacion {
    //Atributos
    public String nombre;
    private double nota1,nota2,nota3;

    //Metodo Ingresar Datos
    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese la nota 1: ");
        nota1 = sc.nextInt();
        System.out.println("Ingrese la nota 2: ");
        nota2 = sc.nextInt();
        System.out.println("Ingrese la nota 3: ");
        nota3 = sc.nextInt();
    }

    //Metodo Calcular Promedio
    public double calcularPromedio(){
        return (nota1+nota2+nota3)/3;
    }

    //Metodo Determinar Estado
    public String determinarEstado(){
        if (calcularPromedio() >= 7)
            return "Aprobado";
        else
            return "Reprobado";
    }

    //Metodo Mostrar Rerporte
    public void mostrarReporte() {
        double promedio = calcularPromedio();
        String estado = determinarEstado();

        System.out.println("\n-------- REPORTE ACADÉMICO --------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio final: " + promedio);
        System.out.println("Estado: " + estado);
        System.out.println("-----------------------------------");
    }
}
