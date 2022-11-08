import java.util.Comparator;

public class ComparadorPorCorreo implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getCorreo().compareTo(o2.getCorreo());
    }
}
