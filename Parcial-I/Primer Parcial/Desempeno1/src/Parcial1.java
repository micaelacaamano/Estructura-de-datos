public class Parcial1 {

    class Nodo {
        int info;
        Nodo ante, sig;
    }

    private Nodo raiz;

    public Parcial1() {
        raiz = null;
    }

    public void insertar(int x1, int x2) {
        Nodo nuevo1 = new Nodo();
        Nodo nuevo2 = new Nodo();

        nuevo1.info = x1;
        nuevo2.info = x2;

        nuevo1.ante = null;
        nuevo1.sig = nuevo2;
        nuevo2.ante = nuevo1;
        nuevo2.sig = null;

        // Si la lista está vacía
        if (raiz == null) {
            raiz = nuevo1;
        } else {
            // Si la lista tiene MENOS de 4 nodos → agregar al final
            if (cantNodos() < 4) {
                Nodo reco = raiz;
                while (reco.sig != null) {
                    reco = reco.sig;
                }
                reco.sig = nuevo1;
                nuevo1.ante = reco;
            }
            // Si tiene 4 o más → agregar al principio
            else {
                nuevo2.sig = raiz;
                raiz.ante = nuevo2;
                raiz = nuevo1;
            }
        }
    }

    public int cantNodos() {
        int cant = 0;
        Nodo reco = raiz;
        while (reco != null) {
            cant++;
            reco = reco.sig;
        }
        return cant;
    }

    public void sumarNodos() {
        Nodo reco = raiz;
        int pos = 1;
        int suma = 0;

        while (reco != null) {
            if (pos % 2 != 0) {
                suma = suma + reco.info;
            }
            reco = reco.sig;
            pos++;
        }

        System.out.print("La suma de los nodos impares es: " + suma);
    }
    
    public void nodosIguales() {
        if (raiz == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        int primero = raiz.info;
        Nodo reco = raiz.sig;

        while (reco != null) {
            Nodo siguiente = reco.sig;

            if (reco.info == primero) {
                if (reco.ante != null) {
                    reco.ante.sig = reco.sig;
                }
                if (reco.sig != null) {
                    reco.sig.ante = reco.ante;
                }
            }
            reco = siguiente;
        }

        System.out.println("Se eliminaron los nodos iguales a la raíz.");
    }

    public void borrarNodos() {
        int cantidad = cantNodos();

        if (cantidad <= 2) {
            raiz = null;
        } else {
            // borrar primero
            raiz = raiz.sig;
            raiz.ante = null;

            // borrar último
            Nodo reco = raiz;
            while (reco.sig != null) {
                reco = reco.sig;
            }
            reco.ante.sig = null;
        }

        System.out.println("Se eliminó el primer y último nodo.");
    }

    public void imprimir() {
        Nodo reco = raiz;
        while (reco != null) {
            System.out.print(reco.info + "-");
            reco = reco.sig;
        }
        System.out.println();
    }
}
