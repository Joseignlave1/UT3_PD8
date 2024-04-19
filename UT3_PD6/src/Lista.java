public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }

    @Override
    public void insertar(T dato, Comparable clave) {
        Nodo<T> nuevoNodo = new Nodo<T>(clave, dato);
        if(primero == null) { //Si la lista no tiene elementos
            primero = new Nodo<T>(clave,dato);
        } else {
                Nodo<T> actual = primero;
            while(actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);// Cuándo se encuentra un nodo en la lista que sea null
            // indica que estamos en el último nodo de la lista
            // entonces ese nodo pasa a apuntar al nuevo nodo, y ese nuevo nodo
            // pasa a apuntar a null;
        }
    }

    @Override
    public T buscar(Comparable clave) {
        if(primero == null) { //No tiene elementos
            return null;
        } else {
            Nodo<T> actual = primero;
            while(actual != null) {
                if(actual.getEtiqueta().compareTo(clave) == 0) {
                    return actual.getDato();
                }
                actual = actual.getSiguiente();
            }
            return null;
        }
    }

    @Override
    public boolean eliminar(Comparable clave) {
        if(primero == null) { //Caso lista vacia
            return false;
        }
            Nodo<T>  actual = primero;
            Nodo<T> anterior = null;

            while(actual != null) {
                if(actual.getEtiqueta().compareTo(clave) == 0) { //Encuentro un match
                    if(anterior == null) { //Caso en el que el nodo a eliminar es el prim de la lista.
                        primero = actual.getSiguiente();
                    } else {
                        anterior.setSiguiente(actual.getSiguiente());
                    }
                    return true;
                }
                anterior = actual;
                actual = actual.getSiguiente();
            }

        return false;
    }

    @Override
    public String imprimir() {
        Nodo<T> actual = primero;
        while(actual != null) {
            System.out.println(actual.getEtiqueta().toString());
            actual = actual.getSiguiente();
        }
        return null;
    }


    @Override
    public String imprimirConSeparador(String separador) {
       Nodo<T> actual = primero;
       while(actual != null) {
           System.out.print(actual.getEtiqueta().toString() + separador);
           actual = actual.getSiguiente();
       }
       return null;
    }

    @Override
    public int cantElementos() {
        int contador = 0;
        Nodo<T> actual = primero;
        while (actual != null) {
            actual = actual.getSiguiente();
            contador++;
        }
        return contador;
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPrimero'");
    }


    // implementar los metodos indicados en la interfaz
}
