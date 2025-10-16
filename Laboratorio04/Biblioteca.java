import java.util.*;
public class Biblioteca {
    private ArrayList <Libro> libros = new ArrayList<> ();
    private ArrayList <Usuario> usuarios = new ArrayList <> ();

    public Biblioteca(ArrayList<Usuario> usuarios, ArrayList<Libro> libros) {
        this.usuarios = usuarios;
        this.libros = libros;
    }
    
    public void AgregarUsuario (Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public void AgregarLibro (Libro libro) {
        libros.add(libro);
    }

    public String toString () {
        return "LIBRO:\n"+libros.toString()+"\nUSUARIO:\n"+usuarios.toString();
    }
    public void mostrarBiblioteca() {
    System.out.println("LIBROS:");
        for (Libro libro : libros) {
            System.out.println(" - " + libro);
        }
    System.out.println("\nUSUARIOS:");
        for (Usuario usuario : usuarios) {
            System.out.println(" - " + usuario);
        }
    }
}