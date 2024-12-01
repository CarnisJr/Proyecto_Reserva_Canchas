package GUI;

import Logic.GestionSistema.*;
import Logic.Usuario.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminSide extends JFrame {
    private JTabbedPane paneTabs;
    public JPanel gestorAdmin;
    private JButton mostrarButton;
    private JTable table1;
    private JTextField idBuscar;
    private JTextField nombreEdit;
    private JButton buscarButton;
    private JButton aceptarEdiciónButton;
    private JTextArea mostrarBusqueda;
    private JTextField contraseniaAdd;
    private JButton agregarEstudianteButton;
    private Admin admin = new Admin("", "");
    private UsrDataBase usrDataBase = new UsrDataBase();
    private UsrDataBase auxDataBase = new UsrDataBase();
    private Estudiante estudiante;

    public AdminSide() {

        add(gestorAdmin);
        setTitle("Udla reservas");
        setSize(1000, 1000);
        nombreEdit.setEnabled(false);
        contraseniaAdd.setEnabled(false);
        agregarEstudianteButton.setEnabled(false);
        aceptarEdiciónButton.setEnabled(false);

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                admin.mostrarEstudiantes(auxDataBase, table1);
            }
        });

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                estudiante = admin.buscarEstudiante(usrDataBase, Integer.parseInt(idBuscar.getText()));

                if(estudiante != null) {

                    mostrarBusqueda.setText("Estudiante encotrado: " + estudiante.getId() + " " + estudiante.getNombre());
                    nombreEdit.setEnabled(true);
                    aceptarEdiciónButton.setEnabled(true);
                }else{

                    mostrarBusqueda.setText("No existe el estudiante");
                    nombreEdit.setEnabled(true);
                    contraseniaAdd.setEnabled(true);
                    agregarEstudianteButton.setEnabled(true);
                }
            }
        });

        aceptarEdiciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                usrDataBase.getUsrsEstudiantes().add(admin.editarEstudiantes(estudiante, nombreEdit.getText()));
                nombreEdit.setText("");
                mostrarBusqueda.setText("");
                nombreEdit.setEnabled(false);
                aceptarEdiciónButton.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Estudiante editado correctamente");
                auxDataBase = usrDataBase;
            }
        });

        agregarEstudianteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                estudiante = new Estudiante(Integer.parseInt(idBuscar.getText()), nombreEdit.getText(), contraseniaAdd.getText());
                usrDataBase.getUsrsEstudiantes().add(estudiante);
                nombreEdit.setText("");
                contraseniaAdd.setText("");
                mostrarBusqueda.setText("");
                agregarEstudianteButton.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Estudiante agregado exitosamente");
                auxDataBase = usrDataBase;
            }
        });
    }
}
