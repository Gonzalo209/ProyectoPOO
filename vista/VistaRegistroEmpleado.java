package vista;

import control.ControlRegistroEmpleado;

import javax.swing.*;
import java.awt.*;

public class VistaRegistroEmpleado extends JFrame {

    private static JTextField txtNombre = new JTextField();
    private static JTextField txtApPaterno = new JTextField();
    private static JTextField txtApMaterno = new JTextField();
    private static JTextField txtRFC = new JTextField();
    private static JTextField txtNumCasa = new JTextField();
    private static JTextField txtNumTelefono = new JTextField();
    private static JTextField txtNumEmergencia = new JTextField();
    private static JTextField txtNumBancaria = new JTextField();

    public VistaRegistroEmpleado() {

        super("Registro De Empleados");

        setSize(600, 300);

        setVisible(true);

        add(crearPanelPrincipal());

        setLocationRelativeTo(null);


    }

    private JPanel crearPanelEdicion() {

        JPanel pnlEdicion = new JPanel();

        JLabel lblNombre = new JLabel("Nombre: ");

        JLabel lblApPat = new JLabel("Apellido Paterno: ");

        JLabel lblApMat = new JLabel("Apellido Materno: ");

        JLabel lblRFC = new JLabel("RFC: ");

        JLabel lblNumCasa = new JLabel("Numero Casa: ");

        JLabel lblNumTelefono = new JLabel("Numero Telefono: ");

        JLabel lblNumEmerge = new JLabel("Numero Emergencia: ");

        JLabel lblNumBancaria = new JLabel("Numero Bancaria: ");

        pnlEdicion.setLayout(new GridLayout(4, 4));

        pnlEdicion.add(lblNombre);

        pnlEdicion.add(txtNombre);

        pnlEdicion.add(lblApPat);

        pnlEdicion.add(txtApPaterno);

        pnlEdicion.add(lblApMat);

        pnlEdicion.add(txtApMaterno);

        pnlEdicion.add(lblRFC);

        pnlEdicion.add(txtRFC);

        pnlEdicion.add(lblNumCasa);

        pnlEdicion.add(txtNumCasa);

        pnlEdicion.add(lblNumTelefono);

        pnlEdicion.add(txtNumTelefono);

        pnlEdicion.add(lblNumEmerge);

        pnlEdicion.add(txtNumEmergencia);

        pnlEdicion.add(lblNumBancaria);

        pnlEdicion.add(txtNumBancaria);

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

        JButton btnRegistro = new JButton("Registrarse");

        btnRegistro.addActionListener(new ControlRegistroEmpleado());

        pnlControl.add(btnRegistro);

        return pnlControl;

    }

    public static JTextField getTxtNombre() {

        return txtNombre;

    }

    public static JTextField getTxtApPaterno() {

        return txtApPaterno;

    }

    public static JTextField getTxtApMaterno() {

        return txtApMaterno;

    }

    public static JTextField getTxtRFC() {

        return txtRFC;

    }

    public static JTextField getTxtNumCasa() {

        return txtNumCasa;

    }

    public static JTextField getTxtNumTelefono() {

        return txtNumTelefono;

    }

    public static JTextField getTxtNumEmergencia() {

        return txtNumEmergencia;

    }

    public static JTextField getTxtNumBancaria() {

        return txtNumBancaria;

    }

}