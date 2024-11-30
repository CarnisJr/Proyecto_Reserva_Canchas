package Logic.Usuario;

public class Admin {

    private String nombre;
    private String contrasenia;

    public Admin(String nombre, String contrasenia) {

        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {

        return this.nombre;
    }

    public String getContrasenia() {

        return this.contrasenia;
    }
}
