import java.util.*;
public class Paciente{
    private int codigo;
    private String nombre;
    private int edad;
    private String numeroDocumento;
    
    public Paciente(int codigo, String nombre, int edad, String numeroDocumento){
        setCodigo(codigo);
        setNombre(nombre);
        setEdad(edad);
        setNumeroDocumento(numeroDocumento);
    }
    // GET Y SET DE CODIGO
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
        
    }
    public void ValidarCodigo (ArrayList<Paciente> pacientes, int nuevoCodigo) {
        for (Paciente paciente: pacientes) {
            if (paciente.getCodigo()==nuevoCodigo) {
                System.out.println("ERROR");;
            }
        }
    }
    // GET Y SET DE NOMBRE
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    // GET Y SET DE EDAD
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
        if (edad<0) {
            System.out.println("ERROR");
        }
    }
    // GET Y SET DEL NUMERO DE DOCUMENTO
    public String getNUmeroDocumento(){
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento){
        this.numeroDocumento = numeroDocumento;
        if (numeroDocumento==null || numeroDocumento.length()!=8) {
            System.out.println("EROR");
        }
        
    }

    @Override
    public String toString(){
        return "codigo:" + codigo + "\tnombre:" + nombre + "\tedad:" + edad + "\tNumero de Documento:" + numeroDocumento;
    }
  
}
