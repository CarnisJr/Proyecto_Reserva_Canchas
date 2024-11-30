package GUI;

import Logic.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservaCanchas {
    private JPanel Principal;
    private JPasswordField textContrasenia;
    private JTextField textUsuario;
    private JButton ingresarButton;
    private Usuario usuario = new Usuario();

    public ReservaCanchas() {
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

                        JOptionPane.showMessageDialog(null, "Administrador Logueado Correctamente");
                    break;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ReservaCanchas");
        frame.setContentPane(new ReservaCanchas().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
