package modelo;

public interface DAOObjecto {

    public void agregar(Object objecto);
    public void consultar(int id);
    public void modificar(int id);
    public void eliminar(int id);
    public int buscar(int id);

}
