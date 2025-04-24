package org.gplisich.Ejemplo;

import org.gplisich.Herencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("===== Creando la instancia de la clase Alumno =====");
        Alumno alumno = new Alumno();
        alumno.setNombre("Guillermo");
        alumno.setApellido("Plisich");
        alumno.setInstitucion("ORT Universidad");
        alumno.setNotaHistoria(6.8);
        alumno.setNotaLiteratura(5.8);
        alumno.setNotaMatematica(7.0);

        System.out.println("===== Creando la instancia de la clase AlumnoInteracional =====");
        AlumnoInternacional alumInter = new AlumnoInternacional();
        alumInter.setNombre("Antonio");
        alumInter.setApellido("Carbajal");
        alumInter.setInstitucion("ORT Universidad");
        alumInter.setPais("New Zeland");
        alumInter.setNotaHistoria(6.8);
        alumInter.setNotaLiteratura(5.8);
        alumInter.setNotaMatematica(7.0);
        alumInter.setNotaIdiomas(6.2);

        System.out.println("===== Creando la instancia de la clase Profesor =====");
        Profesor profesor = new Profesor();
        profesor.setNombre("Miriam");
        profesor.setApellido("Ponse");
        profesor.setAsignatura("Literatura");

        System.out.println("===========================================");



        System.out.println(alumno.getNombre()+" "+alumno.getApellido()+" "+alumno.getInstitucion());
        System.out.println(alumInter.getNombre()+" "+alumInter.getApellido()+" "+alumInter.getInstitucion()+" "+alumInter.getPais());
        System.out.println("Profesor/a "+profesor.getAsignatura()+": "+profesor.getNombre()+" "+profesor.getApellido());

        Class claseAlumnoInt = alumInter.getClass();
        while(claseAlumnoInt.getSuperclass() != null){
            String claseHija = claseAlumnoInt.getName();
            String clasePadre = claseAlumnoInt.getSuperclass().getName();
            System.out.println(claseHija+" es una clase hija de la clase padre "+clasePadre);
            claseAlumnoInt = claseAlumnoInt.getSuperclass();
        }
    }
}
