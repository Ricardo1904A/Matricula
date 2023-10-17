import java.util.Scanner;

public class Estudiante {
    private int cedula = 0;
    private int edad = 0;
    private String nombre = "";
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;

    public Estudiante(int cedula, int edad, String nombre, Materia materia1, Materia materia2, Materia materia3) {
        this.cedula = cedula;
        this.edad = edad;
        this.nombre = nombre;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }

    public void ingresarDatosEstudiante(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante " + i);
        this.nombre = sc.next();
        System.out.println("Ingrese la cedula del estudiante " + i);
        this.cedula = sc.nextInt();
        System.out.println("Ingrese la edad del estudiante " + i);
        this.edad = sc.nextInt();
    }

    public void ingresarMateria(int i) {
        if (i == 1) {
            materia1.ingresarDatosMateria(1);
        } else if (i == 2) {
            materia2.ingresarDatosMateria(2);
        } else {
            materia3.ingresarDatosMateria(3);
        }
    }

    public void ingresarProfesor(int i) {
        if (i == 1) {
            materia1.ingresarProfesor(1);
        } else if (i == 2) {
            materia2.ingresarProfesor(2);
        } else {
            materia3.ingresarProfesor(3);
        }
    }

    public void imprimirDatosEstudiante() {
        System.out.println("Datos del estudiante:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Edad: " + this.edad);

        imprimirDatosMateria(materia1, 1);
        imprimirDatosMateria(materia2, 2);
        imprimirDatosMateria(materia3, 3);
    }

    private void imprimirDatosMateria(Materia materia, int numeroMateria) {
        if (materia != null) {
            System.out.println("Datos de Materia " + numeroMateria + ":");
            System.out.println("Nombre: " + materia.getNombre());
            System.out.println("Código: " + materia.getCodigo());
            System.out.println("Número de Horas: " + materia.getNum_horas());

            imprimirDatosProfesor(materia.getProfesor1(), 1, numeroMateria);
            imprimirDatosProfesor(materia.getProfesor2(), 2, numeroMateria);
            imprimirDatosProfesor(materia.getProfesor3(), 3, numeroMateria);
        }
    }

    private void imprimirDatosProfesor(Profesor profesor, int numeroProfesor, int numeroMateria) {
        if (profesor != null) {
            System.out.println("Datos de Profesor " + numeroProfesor + " de Materia " + numeroMateria + ":");
            System.out.println("Nombre: " + profesor.getNombre());
            System.out.println("Cedula: " + profesor.getCedula());
            System.out.println("Código del Profesor: " + profesor.getCprofesor());
        }
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia getMateria1() {
        return materia1;
    }

    public void setMateria1(Materia materia1) {
        this.materia1 = materia1;
    }

    public Materia getMateria2() {
        return materia2;
    }

    public void setMateria2(Materia materia2) {
        this.materia2 = materia2;
    }

    public Materia getMateria3() {
        return materia3;
    }

    public void setMateria3(Materia materia3) {
        this.materia3 = materia3;
    }
}
