
public class Main {
    public static void main(String[] args) {
        Materia materia1 = new Materia();
        Materia materia2 = new Materia();
        Materia materia3 = new Materia();


        Estudiante estudiante = new Estudiante(123456, 20, "Juan", materia1, materia2, materia3);

        estudiante.ingresarDatosEstudiante(1);

        estudiante.ingresarMateria(1);
        estudiante.ingresarMateria(2);
        estudiante.ingresarMateria(3);

        estudiante.ingresarProfesor(1);
        estudiante.ingresarProfesor(2);
        estudiante.ingresarProfesor(3);

        estudiante.imprimirDatosEstudiante();
    }
}