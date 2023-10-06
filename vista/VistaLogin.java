package vista;

import control.ControlLogin;

import javax.swing.*;
import java.awt.*;

public class VistaLogin extends JFrame {

    private static JTextField txtUsuario = new JTextField();
    private static JPasswordField txtPassword = new JPasswordField();

    public VistaLogin() {

        super("Login");

        add(crearPanelPrincipal());

        setVisible(true);

        setSize(600, 300);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private JPanel crearPanelEdicion() {

        JPanel pnlEdicion = new JPanel();

        JLabel lblUsuario = new JLabel("Usuario: ");

        JLabel lblPassword = new JLabel("Password: ");

        pnlEdicion.setLayout(new GridLayout(6, 6));

        pnlEdicion.add(lblUsuario);

        pnlEdicion.add(txtUsuario);

        pnlEdicion.add(lblPassword);

        pnlEdicion.add(txtPassword);

        return pnlEdicion;

    }

    private JPanel crearPanelPrincipal() {

        JPanel pnlPrincipal = new JPanel();

        pnlPrincipal.setLayout(new BorderLayout());

        pnlPrincipal.add(crearPanelEdicion(), BorderLayout.CENTER);

        pnlPrincipal.add(crearPanelControl(), BorderLayout.SOUTH);

        return pnlPrincipal;

    }

    private JPanel crearPanelControl() {

        JPanel pnlControl = new JPanel();

        JButton btnRegistrar = new JButton("Registrar");

        JButton btnIngresar = new JButton("Ingresar");

        btnRegistrar.addActionListener(new ControlLogin());

        btnIngresar.addActionListener(new ControlLogin());

        pnlControl.add(btnRegistrar);

        pnlControl.add(btnIngresar);

        return pnlControl;

    }

    public static JTextField getTxtUsuario() {

        return txtUsuario;

    }

    public static JPasswordField getTxtPassword() {

        return txtPassword;

    }

}