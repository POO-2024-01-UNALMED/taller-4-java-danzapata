package classroom;
import java.util.ArrayList;

public class Grupo {

    public ArrayList<Persona> estudiantes = new ArrayList<>();
    public Persona profesor;
    public Asignatura asignatura;
    public int codigo = 0;
    public String horario;

    public Grupo(ArrayList<Persona> estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }


    public Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        for (int i=0; i==cantidadEstudiantes; i++){
            Persona estu = new Persona("Sin nombre");
            this.estudiantes.add(estu);
        } 
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    public Grupo(ArrayList<Persona> estudiantes, Persona profesor, Asignatura asignatura) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
    }

    void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getCedula() == estudianteViejo.getCedula()) {
                estudiantes.set(i, estudianteNuevo);
                break;
            }
        }
    }
    
    void cambiarEstudiante(int indice, Persona estudiante) {
        estudiantes.set(indice, estudiante);
    }
}
