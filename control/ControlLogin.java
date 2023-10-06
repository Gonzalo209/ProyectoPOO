package control;

import vista.VistaLogin;
import vista.VistaRegistroEmpleado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlLogin implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent evento) {

        String menu = evento.getActionCommand();

        String usuario = VistaLogin.getTxtUsuario().getText();
        String password = VistaLogin.getTxtPassword().getText();
        
        //Menú 
        switch (menu) {

            case "Registrar" ->

                    abrirVentanaRegistro();

            case "Ingresar" ->

                    validar(usuario, password);

        }

    }

    private void abrirVentanaRegistro() {

        new VistaRegistroEmpleado();

    }

    private void validar(String usuario, String password) {


        if(usuario.equals("") || password.equals("")) {

            JOptionPane.showMessageDialog(null, "Los campos no deben estar vacios");

        } else if (usuario.equals("Phantom Cookies") && password.equals("PhantomCookies")) {

            JOptionPane.showMessageDialog(null, "Usuario y contraseña correcta");


        } else {

            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");

        }

    }

}
