package GUI;

import javax.swing.*;

public class AdminSide extends JFrame {
    private JTabbedPane paneTabs;
    public JPanel gestorAdmin;

    public AdminSide() {

        add(gestorAdmin);
        setTitle("Udla reservas");
        setSize(1000, 1000);
    }
}
