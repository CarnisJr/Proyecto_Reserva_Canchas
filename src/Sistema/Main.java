package Sistema;

import GUI.AdminSide;
import GUI.LogIn;
import Logic.GestionSistema.Cola;
import Logic.Usuario.Admin;

import javax.swing.*;

public class Main {

    private static JFrame frame = new JFrame();

    public static void main(String[] args){

        Cola colaFrame = new Cola();
        LogIn principal = new LogIn();
        AdminSide admin = new AdminSide();
        boolean flag = true;

        colaFrame.agregarElemento(principal);
        colaFrame.agregarElemento(admin);

        frame = colaFrame.quitarElemento();
        principal = (LogIn) frame;
        setUpFrame();

        while(flag){

            System.out.println("Dentro " + principal.logUser);
            if(principal.logUser == 1 || principal.logUser == 0 || principal.logUser == -1){

                flag = false;
            }
        }

        System.out.println(principal.logUser);
        switch (principal.logUser) {

            case -1:

                break;

            case 0:

                break;

            case 1:

                frame = colaFrame.quitarElemento();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                admin = (AdminSide) frame;
                admin.setVisible(true);
                principal.setVisible(false);
                break;
        }
    }

    public static void setUpFrame(){

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
