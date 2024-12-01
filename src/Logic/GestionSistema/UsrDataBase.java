package Logic.GestionSistema;

import Logic.Usuario.Admin;
import Logic.Usuario.Estudiante;

import java.util.LinkedList;
import java.util.List;

public class UsrDataBase {

    private List<Estudiante> usrsEstudiantes = new LinkedList<>();

    private List<Admin> usrsAdmins = new LinkedList<>();

    public UsrDataBase() {

        Estudiante est1 = new Estudiante(1, "Pepe", "Pepe1");
        Estudiante est2 = new Estudiante(2,"Carlos", "Carlos1");
        Estudiante est3 = new Estudiante(3, "Juan", "Juan1");

        usrsEstudiantes.add(est1);
        usrsEstudiantes.add(est2);
        usrsEstudiantes.add(est3);

        Admin admin1 = new Admin("Julian", "Julian1");
        Admin admin2 = new Admin("Pedro", "Pedro1");
        Admin admin3 = new Admin("Pablo", "Pablo1");

        usrsAdmins.add(admin1);
        usrsAdmins.add(admin2);
        usrsAdmins.add(admin3);
    }

    public List<Estudiante> getUsrsEstudiantes() {

        return usrsEstudiantes;
    }

    public int logIn(String usuario, String contrasenia) {

        int flag = -1;

        for(Estudiante aux: usrsEstudiantes) {

            if(usuario.equals(aux.getNombre()) && contrasenia.equals(aux.getContrasenia())){

                flag = 0;
                break;
            }
        }

        for(Admin aux: usrsAdmins) {

            if(usuario.equals(aux.getNombre()) && contrasenia.equals(aux.getContrasenia())){

                flag = 1;
                break;
            }
        }

        return flag;
    }
}
