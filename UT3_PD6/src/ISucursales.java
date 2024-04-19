
public interface ISucursales {


    public String getNombre();
    public void insertarSucursal(Sucursales sucursales, String nombre);



    public boolean eliminarSucursal(Comparable sucursal);

    public String imprimir();
    public String imprimirConSeparador(String separador);



    public ISucursales buscarPorNombre(Comparable sucursal);

    public int cantidadSucursales();

    public boolean esVacio();

}
