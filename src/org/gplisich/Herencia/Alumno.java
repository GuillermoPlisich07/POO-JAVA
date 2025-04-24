package org.gplisich.Herencia;

public class Alumno extends Persona{
    protected String institucion;
    protected double notaMatematica;
    protected double notaLiteratura;
    protected double notaHistoria;

    public Alumno(){
        System.out.println("Creando la instancia Alumno");
    }

    public Alumno(String nombre, String apellido){

    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLiteratura() {
        return notaLiteratura;
    }

    public void setNotaLiteratura(double notaLiteratura) {
        this.notaLiteratura = notaLiteratura;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}
