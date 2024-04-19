public class Ejercicios {
    public static void main(String[] args) {
        /*
            String[] lineasArchivo = ManejadorArchivosGenerico.leerArchivo("/C:/Users/Leo84/OneDrive/Imágenes/Escritorio/UT3_PD6/out/production/UT3_PD6/suc1.txt");
            Sucursales sucursales = new Sucursales();
            for(String linea : lineasArchivo) {
                sucursales.insertarSucursal(sucursales, linea);
                sucursales.eliminarSucursal("Chicago");
                //System.out.println(sucursales.cantidadSucursales());
            }
            System.out.println(sucursales.imprimir());

            //Ejercicio1 = 107;
            //Ejercicio2 = Shenzhen
         */
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


                String[] lineasArchivo = ManejadorArchivosGenerico.leerArchivo("/C:/Users/Leo84/OneDrive/Imágenes/Escritorio/UT3_PD6/out/production/UT3_PD6/suc3.txt");
                Sucursales sucursales = new Sucursales();
                for(String linea : lineasArchivo) {
                    sucursales.insertarSucursal(sucursales, linea);
                }
                sucursales.imprimirConSeparador(";_");

                //Ejercicio 4 =  Montreal;_Caracas;_Tulsa;_Mobile;_Vancouver;_


    }
}