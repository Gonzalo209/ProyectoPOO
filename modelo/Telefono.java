package modelo;

public class Telefono {

    private String numCasa;
    private String numTelefono;
    private String numEmergencia;

    public Telefono(String numCasa, String numTelefono, String numEmergencia) {

        this.numCasa = numCasa;
        this.numTelefono = numTelefono;
        this.numEmergencia = numEmergencia;

    }

    public void setNumCasa(String numCasa) {

        this.numCasa = numCasa;

    }

    public void setNumTelefono(String numTelefono) {

        this.numTelefono = numTelefono;

    }

    public void setNumEmergencia(String numEmergencia) {

        this.numEmergencia = numEmergencia;

    }

    public String getNumCasa() {

        return numCasa;

    }

    public String getNumTelefono() {

        return numTelefono;

    }

    public String getNumEmergencia() {

        return numEmergencia;

    }

    public String toString() {

        return "[Num Casa: " + numCasa + " Num Telefono: " + numTelefono + " Num Emergencia: " + numEmergencia + "]";

    }

}