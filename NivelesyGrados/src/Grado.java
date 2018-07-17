//AndresQuinto 18288
import java.util.HashMap;

public class Grado {
//El HashMap sirve para darle a un dato una key y despues llamarlo
    private HashMap<String, String> estudiantes;

//Publico para que despues lo pueda modificar
    public Grado() {
        estudiantes = new HashMap<>();
    }
    public HashMap<String, String> getEstudiantes() {
        return estudiantes;
    }
//Void para que haya la posibilidad de que no regrese nada
    public void agregarEstudiante(String nombre, String codigo) {
        estudiantes.put(nombre, codigo);
    }
}
