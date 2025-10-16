import java.util.*;
public class Usuario {
    private String nombre;
    private int codigo;
    ArrayList <Libro> librito = new ArrayList <> ();
    // metodo constructor
    public Usuario (String nombre,int codigo) {
        setNombre(nombre);
        setCodigo(codigo);
    }
    //metodo get y set de Nombre
    public void setNombre (String nombre) {
        this.nombre=nombre;
    } 
    public String getNombre () {
        return nombre;
    }
    //metodo get y set de Codigo
    public void setCodigo (int codigo) {
        this.codigo=codigo;
    }
    public int getCodigo () {
        return codigo;
    }
    // metodo toString
    public String toString () {
        return "Nombre: "+nombre+"\tCódigo: "+codigo;
    } 
    // metodo para obtener la respuesta de si el usuario quiere prestarse el libro o no
    public String Respuesta () {
        Scanner scanner =new Scanner (System.in);
        System.out.println("Ingrese su respuesta");
        return scanner.next();
    }
    // metodo para tomar prestado el libro 
    public Boolean TomarPrestado (Libro libro, String respuesta) {
        if (libro.estaDisponible(respuesta)) {
            libro.prestar();
            librito.add (libro);
            return true;
        } else System.out.println("El libro no esta disponible por el momento");
        return false;
    }
    // metodo para devolver el libro
    public Boolean Devolver (Libro libro) {
        if (librito.contains(libro)) {
            libro.devolver();  // vuelve a estar disponible
            librito.remove(libro);
            return true;
        }
        System.out.println("El usuario no tiene este libro.");
        return false;
    }
    // metodo para verificar si el libro esta disponible
    public boolean VerificarDisponibilidad(Libro libro, String respuesta) {
        return libro.estaDisponible(respuesta);
    }
}
