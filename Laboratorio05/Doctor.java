import java.util.*;
public class Doctor {
    private int codigo;
    private String nombre;
    public String especialidad;
    public String horarioAtencion; 

    public Doctor (int codigo, String nombre, String especialidad, String horarioAtencion){
        setCodigo(codigo);
        setNombre(nombre);
        setEspecialidad(especialidad);
        setHorarioAtencion(horarioAtencion);
    }
    // GET Y SET DE CODIGO
    public int getCodigo(){
        return codigo; 
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
        
    }
    public void ValidarCodigo (ArrayList<Doctor> doctores, int nuevoCodigo) {
        for(Doctor doctor: doctores){
            if(doctor.getCodigo()==nuevoCodigo){
                System.out.println("ERROR");
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
    // GET Y SET DE ESPECIALIDAD
    public String getEspecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    // GET Y SET DE HORARIO DE ATENCION 
    public String horarioAtencion(){
        return horarioAtencion;
    }
    public void setHorarioAtencion(String horarioAtencion){
        this.horarioAtencion = horarioAtencion;
    }

    @Override
    public String toString(){
        return "codigo:" + codigo + "\tnombre:" + nombre + "\tespecialidad:" + especialidad + "\tHorario de Atención:" + horarioAtencion; 
    }
    
}