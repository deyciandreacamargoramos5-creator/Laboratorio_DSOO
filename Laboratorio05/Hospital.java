import java.util.*;
public class Hospital {
    public ArrayList<Doctor> doctores;
    public ArrayList<Paciente> pacientes;
    public ArrayList<CitaMedica> citaMedica;
    public String estado;
    public int codigo;
    //metodo constructor de hospital
    public Hospital(ArrayList<Doctor> doctor,ArrayList<Paciente> paciente,ArrayList<CitaMedica> citaMedica) {
        this.doctores=doctor;
        this.pacientes=paciente;
        this.citaMedica=citaMedica;
    }
    
    //metodo para imprimir el arraylist de citas medicas
    public void MostrarCitas() {
        for (CitaMedica c : citaMedica) {
            System.out.println(c.toString());
        }
    }
    
    //metodo para imprimir el arraylist de doctores
    public void ListaCitasDoctores() {
        for (Doctor doctor : doctores) {
            System.out.println(doctor.toString());
        }
    }
    
    public void ListaCitasPacientes() {
        for (Paciente p : pacientes) {
            System.out.println(p.toString());
        }
    }
    
    //metodo para mostrar el numero de citas atendidas y canceladas
    public void totalAtendidasCanceladas(ArrayList<CitaMedica> citaMedica) {
        int atendidas = 0, canceladas = 0;
        for (CitaMedica cita : citaMedica) {
            if (cita.getEstado().equalsIgnoreCase("atendida")) 
            atendidas++;
            else if (cita.getEstado().equalsIgnoreCase("cancelada")) 
            canceladas++;
        }
        System.out.println("TOTALES");
        System.out.println("Citas atendidas: " + atendidas);
        System.out.println("Citas canceladas: " + canceladas);
    }
    
    
}