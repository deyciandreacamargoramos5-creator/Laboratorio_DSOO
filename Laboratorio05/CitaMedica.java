import java.text.SimpleDateFormat;
import java.util.*;
public class CitaMedica {
    private int codigo;
    public Paciente paciente;
    public Doctor doctor;
    public String fecha;
    public String hora;
    public String estado;

    public CitaMedica (int codigo, Paciente paciente, Doctor doctor, String fecha, String hora, String estado){
        setCodigo(codigo);
        setPaciente(paciente);
        setDoctor(doctor);
        setFecha(fecha);
        setHora(hora);
        setEstado(estado);

    }
    // GET Y SET DE CODIGO
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
        
    }
    public void ValidarCodigo (ArrayList<CitaMedica> citaMedica, int nuevoCodigo) {
        for (CitaMedica cita: citaMedica) {
            if (cita.getCodigo()==nuevoCodigo) {
                System.out.println("Codigo invalido");
            }
        }
    }
    // GET Y SET DE PACIENTE
    public Paciente getPaciente(){
        return paciente;
    }
    public void setPaciente (Paciente paciente){
        this.paciente = paciente;
    }
    // GET Y SET DE DOCTOR
    public Doctor getDoctor(){
        return doctor;
    }
    public void setDoctor (Doctor doctor){
        this.doctor = doctor;
    }
    // GET Y SET DE FECHA
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
        Date today = new Date ();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
    }
    // GET Y SET DE HORA
    public String getHora(){
        return hora;
    }
    public void setHora(String horaStr) {
    this.hora = horaStr;
        if (horaStr.length() != 5 || horaStr.charAt(2) != ':') {
            System.out.println("Formato incorrecto");
        return;
        }

        for (int i = 0; i < 5; i++) {
            if (i == 2) 
		    continue;
            if (!esDigito(horaStr.charAt(i))) {
                System.out.println("Solo numeros");
            return;
            }
        }
    
    int hh = Integer.parseInt(horaStr.substring(0, 2));
    int mm = Integer.parseInt(horaStr.substring(3, 5));
        if (hh < 0 || hh > 23 || mm < 0 || mm > 59) {
            System.out.println("Fuera de rango");
        return;
        }
    }
    private boolean esDigito(char c) {
    return c >= '0' && c <= '9';
    }

    // GET Y SET DE ESTADO 
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }

    public String toString(){
        return "Codigo: " + codigo + "\nPaciente: " + paciente + "\nDoctor: " + doctor + "\nFecha: " + fecha + "\nHora: " + hora + "\nEstado: " + estado;
     }
}
