import java.util.*;

public class Main {
    public static void main (String [] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();

        Biblioteca biblioteca = new Biblioteca(usuarios, libros);
        Libro libro1 = new Libro(titulo:"Structured thoracic ", autor:"Hamilton Shoji", issn:16794508, respuesta:"si");
        Libro libro2 = new Libro(titulo:"MICROTRAUMAS", autor:"Ariany Lima Jorge", issn:16794508 , respuesta:"no");
        Libro libro3 = new Libro(titulo:"Cien años de soledad", autor:"Gabriel García Márquez", issn:978030747, respuesta:"si");
        Libro libro4 = new Libro(titulo:"El principito", autor:"Antoine de Saint-Exupéry", issn:978842041, respuesta:"si");
        Libro libro5 = new Libro(titulo:"Don Quijote de la Mancha", autor:"Miguel de Cervantes Saavedra", issn:97884204, respuesta:"no");
        Libro libro6 = new Libro(titulo:"La sombra del viento", autor:"Carlos Ruiz Zafón", issn:97884084, respuesta:"no");
        Libro libro7 = new Libro(titulo:"Pedro Páramo", autor:"Juan Rulfo", issn:97860772,respuesta:"si");

        Usuario usuario1 = new Usuario(nombre:"Carlo",codigo:2024321);
        Usuario usuario2 = new Usuario(nombre:"Sheyla",codigo:2023659);

        biblioteca.AgregarUsuario(usuario1);
        biblioteca.AgregarUsuario(usuario2);

        biblioteca.AgregarLibro(libro1);
        biblioteca.AgregarLibro(libro2);
        biblioteca.AgregarLibro(libro3);
        biblioteca.AgregarLibro(libro4);
        biblioteca.AgregarLibro(libro5);
        biblioteca.AgregarLibro(libro6);
        biblioteca.AgregarLibro(libro7);

        biblioteca.mostrarBiblioteca();
        usuario1.TomarPrestado(libro2, usuario1.Respuesta());
        usuario2.Devolver(libro1);

        libro1.setTitulo("Cien años de soledad");
        libro1.setAutor("Gabriel García Márquez");
        libro1.setIssn(978030747);

        libro2.setTitulo("El principito");
        libro2.setAutor("Antoine de Saint-Exupéry");
        libro2.setIssn(978842041);

        libro3.setTitulo("Don Quijote de la Mancha");
        libro3.setAutor("Miguel de Cervantes Saavedra");
        libro3.setIssn(97884204);

        libro4.setTitulo("La sombra del viento");
        libro4.setAutor("Carlos Ruiz Zafón");
        libro4.setIssn(97884084);

        libro5.setTitulo("Pedro Páramo");
        libro5.setAutor("Juan Rulfo");
        libro5.setIssn(97860772);
    }
}
