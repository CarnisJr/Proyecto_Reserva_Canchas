package Logic.Usuario;

public class Estudiante{

    private int id;
    private String nombre;
    private String contrasenia;

    public Estudiante(int id, String nombre, String contrasenia) {

        this.id = id;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getNombre() {

        return this.nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getContrasenia() {

        return this.contrasenia;
    }

    public void setContrasenia(String contrasenia) {

        this.contrasenia = contrasenia;
    }

}
