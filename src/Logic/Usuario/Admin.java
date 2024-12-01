package Logic.Usuario;

import Logic.GestionSistema.UsrDataBase;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

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

    public Estudiante buscarEstudiante(UsrDataBase usrDataBase, int search){

        Estudiante estudiante = null;

        for(Estudiante aux: usrDataBase.getUsrsEstudiantes()){

            if(aux.getId() == search){

                estudiante = aux;
                usrDataBase.getUsrsEstudiantes().remove(aux);
            }
        }

        return estudiante;
    }

    public Estudiante editarEstudiantes(Estudiante estudiante, String nombre) {

        Estudiante nuevoEstudiante = new Estudiante(estudiante.getId(), nombre, estudiante.getContrasenia());
        return nuevoEstudiante;
    }

    public void mostrarEstudiantes(UsrDataBase usrDataBase, JTable table) {

        DefaultTableModel model = new DefaultTableModel(new Object[]{"ID", "Nombre", "Contraseña"}, 0);
        model.addRow(new Object[]{"ID", "Nombre", "Constraseña"});

        for(Estudiante aux: usrDataBase.getUsrsEstudiantes()){

            model.addRow(new Object[]{aux.getId(), aux.getNombre(), "****"});
        }

        table.setModel(model);
    }
}
