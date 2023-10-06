package modelo;

public abstract class Empleado {

    protected String nombre;
    protected String apPaterno;
    protected String apMaterno;
    protected String RFC;
    protected Telefono telefono;
    protected String numBancaria;

    public Empleado(String nombre, String apPaterno, String apMaterno, String RFC,
                    Telefono telefono, String numBancaria) {

        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.RFC = RFC;
        this.telefono = telefono;
        this.numBancaria = numBancaria;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setApPaterno(String apPaterno) {

        this.apPaterno = apPaterno;

    }

    public void setApMaterno(String apMaterno) {

        this.apMaterno = apMaterno;

    }

    public void setRFC(String RFC) {

        this.RFC = RFC;

    }

    public void setTelefono(Telefono telefono) {

        this.telefono = telefono;

    }

    public void setNumBancaria(String numBancaria) {

        this.numBancaria = numBancaria;

    }

    public String getNombre() {

        return nombre;

    }

    public String getApPaterno() {

        return apPaterno;

    }

    public String getApMaterno() {

        return apMaterno;

    }

    public String getRFC() {

        return RFC;

    }

    public Telefono getTelefono() {

        return telefono;

    }

    public String getNumBancaria() {

        return numBancaria;

    }

}