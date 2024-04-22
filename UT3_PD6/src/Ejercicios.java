public class Ejercicios {
    public static void main(String[] args) {

        //4
        /*
            String[] lineasArchivo = ManejadorArchivosGenerico.leerArchivo("/C:/Users/Leo84/OneDrive/Imágenes/Escritorio/UT3_PD6/out/production/UT3_PD6/suc1.txt");
            Sucursales sucursales = new Sucursales();
            for(String linea : lineasArchivo) {
                sucursales.insertarSucursal(sucursales, linea);
                sucursales.eliminarSucursal("Chicago");
                //System.out.println(sucursales.cantidadSucursales());
            }
            System.out.println(sucursales.cantidadSucursales());
            System.out.println(sucursales.imprimir());
         */


            //Ejercicio1 = 107;
            //Ejercicio2 = Shenzhen

        /*
            String[] lineasArchivo = ManejadorArchivosGenerico.leerArchivo("/C:/Users/Leo84/OneDrive/Imágenes/Escritorio/UT3_PD6/out/production/UT3_PD6/suc2.txt");
            Sucursales sucursales = new Sucursales();
            for(String linea : lineasArchivo) {
                sucursales.insertarSucursal(sucursales, linea);
                sucursales.eliminarSucursal("Shenzen");
                sucursales.eliminarSucursal("Tokio");
            }
            sucursales.imprimir();
            //Ejercicio 3 = , queda vacía y no da error de ejecución.(PREGUNTAR miércoles)
         */

        /*
             String[] lineasArchivo = ManejadorArchivosGenerico.leerArchivo("/C:/Users/Leo84/OneDrive/Imágenes/Escritorio/UT3_PD6/out/production/UT3_PD6/suc3.txt");
                Sucursales sucursales = new Sucursales();
                for(String linea : lineasArchivo) {
                    sucursales.insertarSucursal(sucursales, linea);
                }
                sucursales.imprimirConSeparador(";_");
         */

                //Ejercicio 4 =  Montreal;_Caracas;_Tulsa;_Mobile;_Vancouver;_

        /*
            2)Comparando la implementación con la realizada anteriormente, tuve que hacer que el
            ArrayList sea de tipo String y por lo tanto añadir el nombre de las sucursales
            y no el objeto de tipo sucursal, ya que no podía mediante el metodo add añadirle el objeto de tipo sucursal
            y el nombre de la sucursal.
            Debido a esta implementación, tuve que cambiar el método buscarPorNombre(Comparable nombreSucursal) para
            que sea de tipo String.
            3)Consumos de memoria:
                Implementación con ArrayList:

                En la implementación utilizando ArrayList, se asigna memoria para un array interno, el cuál se va redimensionando
                según sea necesario en relación a la cantidad de elementos
                Esto significa que aunque el ArrayList inicialmente puede consumir más
                a medida que se agregan más elementos, esta implementación puede resultar más eficaz en términos de memoria.

                Implementación con TAD Lista Enlazada:

                En esta implementación se asigna memoria para cada nodo individualmente, esto puede resultar en
                un mayor consumo de memoria, ya que cada nodo debe contener al menos dos referencias, una para el dato y la del nodo siguiente.

                4)
         */
    }
}