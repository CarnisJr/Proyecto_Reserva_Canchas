package Logic;

public class Usuario {

    private String[] usrsAdmins = {"Pepe", "Carlos", "Antonio", "Jorge"};
    private String[] passUsrsAdmins = {"Pepe1", "Carlos2", "Antonio3", "Jorge4"};

    private String[] usrsEstu = {"Kevin", "Leonardo", "Enner", "Pedro"};
    private String[] passUsrsEstu = {"Kevin1", "Leonardo2", "Enner3", "Pedro4"};

    private String nombre;
    private String contrasenia;

    public Usuario() {

        this.nombre = "";
        this.contrasenia = "";
    }

    public int logIn(String usuario, String contrasenia) {

        int flag = -1;

        for (int i = 0; i < usrsAdmins.length; i++) {

            if(usuario.equals(usrsAdmins[i]) && contrasenia.equals(passUsrsAdmins[i])) {

                flag = 1;
                break;
            }
        }

        for (int i = 0; i < usrsEstu.length; i++) {

            if(usuario.equals(usrsEstu[i]) && contrasenia.equals(passUsrsEstu[i])) {

                flag = 0;
                break;
            }
        }

        return flag;
    }
}
