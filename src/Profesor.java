import java.util.Scanner;

public class Profesor {
    private String nombre="";
    private int cedula=0;
    private int cprofesor=0;
    public Profesor() {

    }
    public Profesor(String nombre, int cedula, int cprofesor) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.cprofesor = cprofesor;
    }
    public void ingresarProfesor(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del profesor"+i);
        this.nombre=sc.next();
        System.out.println("Ingrese la cedula del profesor"+i);
        this.cedula=sc.nextInt();
        System.out.println("Ingrese el codigo del profesor"+i);
        this.cprofesor=sc.nextInt();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCprofesor() {
        return cprofesor;
    }

    public void setCprofesor(int cprofesor) {
        this.cprofesor = cprofesor;
    }
}
