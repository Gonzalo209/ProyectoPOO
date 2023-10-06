package control;

import vista.VistaRegistroEmpleado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlRegistroEmpleado implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        limpiarCampos();

        JOptionPane.showMessageDialog(null, "Registro agregado");

    }

    private void limpiarCampos() {

        VistaRegistroEmpleado.getTxtNombre().setText("");
        VistaRegistroEmpleado.getTxtApPaterno().setText("");
        VistaRegistroEmpleado.getTxtApMaterno().setText("");
        VistaRegistroEmpleado.getTxtRFC().setText("");
        VistaRegistroEmpleado.getTxtNumCasa().setText("");
        VistaRegistroEmpleado.getTxtNumTelefono().setText("");
        VistaRegistroEmpleado.getTxtNumEmergencia().setText("");
        VistaRegistroEmpleado.getTxtNumBancaria().setText("");

    }

}
