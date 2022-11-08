import java.util.Objects;

public class Persona implements Comparable<Persona> {

    private String telefono;
    private String correo;
    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos,
                   String telefono, String correo) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(telefono, persona.telefono) &&
                Objects.equals(correo, persona.correo) &&
                Objects.equals(nombre, persona.nombre) &&
                Objects.equals(apellidos, persona.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefono, correo, nombre, apellidos);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("telefono='").append(telefono).append('\'');
        sb.append(", correo='").append(correo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public int compareTo(Persona persona) {
        return this.apellidos.compareTo(persona.getApellidos());
    }


}
