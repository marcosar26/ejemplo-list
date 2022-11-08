import java.util.*;

public class Agenda {

    private List<Persona> personas = new ArrayList<>();

    public void addPersona(Persona persona) {
        personas.add(persona);
    }

    public boolean buscarPersona(Persona persona) {
        return personas.contains(persona);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("AGENDA\n");
        sb.append("-------------------\n");

        for (Persona p : personas) {
            sb.append(p);
            sb.append("\n");
        }

        return sb.toString();
    }

    public String ordenarPorApellidosConLambda() {
        personas.sort((o1, o2) ->
                o1.getApellidos().compareTo(o2.getApellidos()));
        return this.toString();
    }

    public String ordenarPorApellidosMala() {
        ArrayList<String> apellidos = new ArrayList<>();
        for (Persona persona : personas) {
            apellidos.add(persona.getApellidos());
        }

        Collections.sort(apellidos);
        return apellidos.toString();
    }

    public String ordenarPorApellidosTopSolution() {
        personas.sort(Comparator.comparing(Persona::getApellidos));
        return this.toString();
    }

    public String ordenarPorApellidos() {
        Collections.sort(personas);
        return this.toString();
    }

    public String ordenarPorCorreo() {
        Collections.sort(personas, new ComparadorPorCorreo());

        return this.toString();
    }
}