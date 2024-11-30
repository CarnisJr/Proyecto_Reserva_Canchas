package GUI;

import Logic.GestionSistema.UsrDataBase;
import Logic.Usuario.Admin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame {
    public JPanel logIn;
    private JPasswordField textContrasenia;
    private JTextField textUsuario;
    private JButton ingresarButton;
    private UsrDataBase usuario = new UsrDataBase();
    private AdminSide ventanaAdmin = new AdminSide();
    private boolean flag;

    public LogIn() {

        add(logIn);
        setSize(500, 500);
        setTitle("Udla reservas");

        isLogged();
    }

    public void isLogged(){

        ingresarButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                switch (usuario.logIn(textUsuario.getText(), textContrasenia.getText())) {

                    case -1:

                        JOptionPane.showMessageDialog(null, "Datos incorrectos");
                        break;

                    case 0:

                        JOptionPane.showMessageDialog(null, "Estudiante Logueado Correctamente");
                        break;

                    case 1:

                        Admin usrAdmin = new Admin(textUsuario.getText(), textContrasenia.getText());
                        JOptionPane.showMessageDialog(null, "Bienvenido " + usrAdmin.getNombre());
                        ventanaAdmin.setVisible(true);
                        ventanaAdmin.setLocationRelativeTo(null);
                        LogIn.this.setVisible(false);
                        break;
                }
            }
        });
    }

/*
    public static void main(String[] args) {
        JFrame frame = new JFrame("ReservaCanchas");
        frame.setContentPane(new LogIn().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

 */
}
