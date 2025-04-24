package org.gplisich.Herencia;

public class Profesor extends Persona{
    private String asignatura;

    public Profesor(){
        System.out.println("Creando la instancia Profesor");
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
