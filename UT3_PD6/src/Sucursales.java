public class Sucursales implements ISucursales{
private String nombre;
private Lista<ISucursales> listaSucursales;
public Sucursales() {
    this.nombre = "";
    this.listaSucursales = new Lista<>();
}

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void insertarSucursal(Sucursales sucursal, String nombre) {
        listaSucursales.insertar(sucursal, nombre);
    }

    @Override
    public ISucursales buscarPorNombre(Comparable nombreSucursal) {
        return listaSucursales.buscar(nombreSucursal);
    }


    @Override
    public boolean eliminarSucursal(Comparable nombre) {
        return listaSucursales.eliminar(nombre);
    }


    public String imprimir() {
        return listaSucursales.imprimir();
    }
    @Override
    public String imprimirConSeparador(String separador) {
        return listaSucursales.imprimirConSeparador(separador);
    }
    @Override
    public int cantidadSucursales() {
        return listaSucursales.cantElementos();
    }

    @Override
    public boolean esVacio() {
        return listaSucursales.esVacia();
    }
}
