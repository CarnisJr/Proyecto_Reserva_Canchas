package GUI;

import Logic.GestionSistema.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame {
    private JPanel logIn;
    private JPasswordField textContrasenia;
    private JTextField textUsuario;
    private JButton ingresarButton;
    private UsrDataBase usuario = new UsrDataBase();
    public int logUser = -2;

    public LogIn() {

        add(logIn);
        setSize(500, 500);
        setTitle("Udla reservas");
        isLogged();
    }

    public void isLogged() {

        ingresarButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                logUser =  usuario.logIn(textUsuario.getText(), textContrasenia.getText());
                System.out.println("Desde la funcion isLogged: " + logUser);
                switch (logUser) {

                    case -1:

                        JOptionPane.showMessageDialog(null, "Datos incorrectos");
                        break;

                    case 0:

                        JOptionPane.showMessageDialog(null, "Estudiante Logueado Correctamente");
                        break;

                    case 1:

                        JOptionPane.showMessageDialog(null, "Admin logueado");
                        //ventanaAdmin.setVisible(true);
                        //ventanaAdmin.setLocationRelativeTo(null);
                        //LogIn.this.setVisible(false);
                        break;
                }
            }
        });
    }
}
