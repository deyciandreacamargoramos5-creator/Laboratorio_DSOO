import java.util.ArrayList;

public class Main {
    public static void main (String []args){
        ArrayList <Doctor> doctores = new ArrayList<> ();
        ArrayList <Paciente> pacientes = new ArrayList <> ();
        ArrayList <CitaMedica> citas = new ArrayList <> ();
        
        //Crear Hospital 
        Hospital hospital = new Hospital (doctores, pacientes, citas);

        //Registrar doctores
        Doctor doctor1 = new Doctor(1, "Dr. Juan Pérez", "Cardiología", "08:00-17:00");
        Doctor doctor2 = new Doctor(2, "Dra. María López", "Pediatría", "09:00-18:00");
        Doctor doctor3 = new Doctor(3, "Dr. Pedro Sánchez", "Neurología", "07:00-15:00");
        Doctor doctor4 = new Doctor(4, "Dra. Carmen Torres", "Dermatología", "10:00-19:00");
        Doctor doctor5 = new Doctor(5, "Dr. Luis Ramírez", "Traumatología", "08:00-16:00");
        Doctor doctor6 = new Doctor(6, "Dra. Rosa Flores", "Ginecología", "09:00-17:00");
        doctores.add(doctor1);
        doctores.add(doctor2);
        doctores.add(doctor3);
        doctores.add(doctor4);
        doctores.add(doctor5);
        doctores.add(doctor6);

        //Registrar los pacientes
        Paciente paciente1 = new Paciente(1, "Carlos Ruiz", 45, "12345678");
        Paciente paciente2 = new Paciente(2, "Ana García", 8, "87654321");
        Paciente paciente3 = new Paciente(3, "Miguel Ángel Vargas", 67, "23456789");
        Paciente paciente4 = new Paciente(4, "Laura Mendoza", 32, "34567890");
        Paciente paciente5 = new Paciente(5, "José Díaz", 28, "45678901");
        Paciente paciente6 = new Paciente(6, "Sofia Paredes", 15, "56789012");
        Paciente paciente7 = new Paciente(7, "Roberto Castro", 52, "67890123");
        Paciente paciente8 = new Paciente(8, "Elena Quispe", 41, "78901234");
        Paciente paciente9 = new Paciente(9, "Diego Mamani", 19, "89012345");
        Paciente paciente10 = new Paciente(10, "Patricia Condori", 36, "90123456");
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);
        pacientes.add(paciente5);
        pacientes.add(paciente6);
        pacientes.add(paciente7);
        pacientes.add(paciente8);
        pacientes.add(paciente9);
        pacientes.add(paciente10);

        //Registrar las citas medicas
        CitaMedica cita1 = new CitaMedica(1, paciente1, doctor1, "15/10/2025", "10", "atendida");
        CitaMedica cita2 = new CitaMedica(2, paciente2, doctor2, "16/10/2025", "14", "atendida");
        CitaMedica cita3 = new CitaMedica(3, paciente3, doctor3, "17/10/2025", "9", "cancelada");
        CitaMedica cita4 = new CitaMedica(4, paciente4, doctor4, "18/10/2025", "11", "pendiente");
        CitaMedica cita5 = new CitaMedica(5, paciente5, doctor5, "19/10/2025", "8", "atendida");
        CitaMedica cita6 = new CitaMedica(6, paciente6, doctor2, "20/10/2025", "15", "pendiente");
        CitaMedica cita7 = new CitaMedica(7, paciente7, doctor1, "21/10/2025", "10", "atendida");
        CitaMedica cita8 = new CitaMedica(8, paciente8, doctor6, "22/10/2025", "13", "cancelada");
        CitaMedica cita9 = new CitaMedica(9, paciente9, doctor5, "23/10/2025", "16", "atendida");
        CitaMedica cita10 = new CitaMedica(10, paciente10, doctor3, "24/10/2025", "12", "pendiente");
        CitaMedica cita11 = new CitaMedica(11, paciente1, doctor4, "25/10/2025","9", "cancelada");
        CitaMedica cita12 = new CitaMedica(12, paciente3, doctor1, "26/10/2025", "11", "atendida");
        CitaMedica cita13 = new CitaMedica(13, paciente5, doctor2, "27/10/2025", "10", "atendida");
        CitaMedica cita14 = new CitaMedica(14, paciente7, doctor6, "28/10/2025", "14", "pendiente");
        CitaMedica cita15 = new CitaMedica(15, paciente9, doctor3, "29/10/2025", "8", "atendida");
        citas.add(cita1);
        citas.add(cita2);
        citas.add(cita3);
        citas.add(cita4);
        citas.add(cita5);
        citas.add(cita6);
        citas.add(cita7);
        citas.add(cita8);
        citas.add(cita9);
        citas.add(cita10);
        citas.add(cita11);
        citas.add(cita12);
        citas.add(cita13);
        citas.add(cita14);
        citas.add(cita15);
        
        //Informacion
        System.out.println("LISTA DE DOCTORES");
        hospital.ListaCitasDoctores();
        System.out.println("================");
        System.out.println("LISTA DE PACIENTES");
        hospital.ListaCitasPacientes();
        System.out.println("================");
        System.out.println("LISTA DE CITAS MEDICAS");
        hospital.MostrarCitas();
        System.out.println("================");
        System.out.println("ESTADISTICAS");
        hospital.totalAtendidasCanceladas(citas);
    }
}