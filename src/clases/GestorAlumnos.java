package clases;

import java.util.ArrayList;
import java.util.List;

public class GestorAlumnos {
	   private List<Alumno> alumnos = new ArrayList<>();

	    public void añadirAlumno(Alumno alumno) {
	        alumnos.add(alumno);
	        System.out.println("Alumno añadido: " + alumno);
	    }

	    public List<Alumno> getAlumnos() {
	        return alumnos;
	    }

}
