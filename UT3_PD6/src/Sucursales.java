import java.util.ArrayList;

public class Sucursales implements ISucursales {
    private String nombre;
    private ArrayList<String> listaSucursales;

    public Sucursales() {
        this.nombre = "";
        this.listaSucursales = new ArrayList<>();
    }
    //1
    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void insertarSucursal(Sucursales sucursal, String nombre) {
        listaSucursales.add(nombre); //O(1)
    }

    @Override
    public String buscarPorNombre(Comparable nombreSucursal) {
        for(int i = 0; i < listaSucursales.size(); i++) {
            if(listaSucursales.get(i).equals(nombreSucursal)) {
                return listaSucursales.get(i);
            }
        }
        return null; //O(n)
    }


    @Override
    public boolean eliminarSucursal(Comparable nombreSucursal) {
        for(int i = 0; i < listaSucursales.size(); i++) {
            if(listaSucursales.get(i).equals(nombreSucursal)) {
                listaSucursales.remove(i);
                return true;
            }
        }
        return false; //O(n)
    }


    public String imprimir() {
        for(int i = 0; i < listaSucursales.size(); i++) {
            System.out.println(listaSucursales.get(i));
        }
        return ""; // O(n)
    }
    @Override
    public String imprimirConSeparador(String separador) {
        for(int i = 0; i < listaSucursales.size(); i++) {
            System.out.print(listaSucursales.get(i) + separador);
        }
        return ""; //O(n)
    }
    @Override
    public int cantidadSucursales() {
        return listaSucursales.size(); //O(1)
    }

    @Override
    public boolean esVacio() {
        return listaSucursales.isEmpty(); //O(1)
    }
}
