package com.mycompany.asistencia;

public class Estudiante {
    
    // Atributos del estudiante
    String nombre;
    String codigo;

    // Constructor: sirve para crear un objeto estudiante
    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    // Método normal: muestra datos simples
    public String mostrar(){
        return nombre + " - " + codigo;
    }

    //  SOBRECARGA DE MÉTODOS
    // Este método tiene el mismo nombre pero recibe un parámetro
    public String mostrar(boolean detalle){
        if(detalle){
            // Si detalle es true, muestra más información
            return "Nombre: " + nombre + " | Código: " + codigo;
        }
        // Si no, usa el método normal
        return mostrar();
    }

    // Getter para obtener el código (lo usamos para validar duplicados)
    public String getCodigo(){
        return codigo;
    }
}