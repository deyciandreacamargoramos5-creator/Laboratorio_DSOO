import java.util.*;
public class Libro {
    private String titulo, autor;
    private int issn;
    private boolean disponible;
    //metodo constructor
    public Libro (String titulo, String autor, int issn, String respuesta) {
        setTitulo(titulo);
        setAutor(autor);
        setIssn(issn);
        this.disponible = respuesta.equals("si");
    }
    //metodo get y set de Titulo
    public void setTitulo (String titulo) {
        this.titulo=titulo;
    }
    public String getTitulo (){
        return titulo;
    }
    //metodo get y set de Autor
    public void setAutor (String autor) {
        this.autor=autor;
    }
    public String getAutor () {
        return autor;
    }
    //metodo get y set de Issn
    public void setIssn (int issn) {
        this.issn=issn;
    }
    public int getIssn () {
        return issn;
    }
    // metodo de estar disponible el libro 
    public Boolean estaDisponible (String respuesta) {
        return disponible;
    }
    // metodo toString
    public String toString () {
        return "Titulo: "+titulo+"\tAutor: "+autor+"\tISSN: "+issn+"\tDisponible: "+disponible;
    }
    // metodo para añadir el libro en el arraylist
    public void CreacionLibro (String titulo, String autor, int issn, String respuesta) {
        ArrayList <Libro> libros=new ArrayList <> ();
        libros.add(new Libro(titulo, autor, issn, respuesta));
    }

    //metodo prestar libro
    public void prestar () {
        if (disponible==false) {
            System.out.println("libro prestado");
        } else System.out.println("libro no disponible por el momento");
    }
    // metodo para devolver libro
    public void devolver () {
        disponible=true;
        System.out.println("El libro ha sido devuelto");
    }
}