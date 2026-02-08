import java.util.Arrays;
import java.util.List;

public class Examen {

    class Nodo {
        int info;
        Nodo izq, der;
    }

    int cant;
    Nodo raiz;

    // 1 => Insertar elementos en el arbol
    public void insertar(int info) {
        Nodo nuevo = new Nodo();
        nuevo.info = info;
        nuevo.der = null;
        nuevo.izq = null;

        // Si el árbol está vacío, el nuevo nodo será la raíz
        if (raiz == null) {
            raiz = nuevo;
        } else {
            // Recorremos el árbol para encontrar la posición correcta
            Nodo anterior = null;
            Nodo reco = raiz;

            while (reco != null) {
                anterior = reco;
                if (info < reco.info) {
                    reco = reco.izq;
                } else {
                    reco = reco.der;
                }
            }

            // Insertamos el nodo según corresponda
            if (info < anterior.info) {
                anterior.izq = nuevo;
            } else {
                anterior.der = nuevo;
            }
        }
    }

    // 2 => Encuentra el menor valor del subárbol derecho
    public void menorValorDerecha() {
        if (raiz != null && raiz.der != null) {
            Nodo reco = raiz.der;
            while (reco.izq != null) {
                reco = reco.izq;
            }
            System.out.println("El menor valor del subárbol derecho es: " + reco.info);
        } else {
            System.out.println("No existe subárbol derecho.");
        }
    }

    // 3 => Encuentra el mayor valor del subárbol izquierdo
    public void mayorValorIzquierda() {
        if (raiz != null && raiz.izq != null) {
            Nodo reco = raiz.izq;
            while (reco.der != null) {
                reco = reco.der;
            }
            System.out.println("El mayor valor del subárbol izquierdo es: " + reco.info);
        } else {
            System.out.println("No existe subárbol izquierdo.");
        }
    }

    // 4 => Buscar un valor e informar el nivel
    public void existeValorEnNivel(int info) {
        if (raiz == null) {
            System.out.println("El árbol está vacío.");
            return;
        }

        Nodo reco = raiz;
        int nivel = 0;
        boolean encontrado = false;

        while (reco != null) {
            if (info == reco.info) {
                System.out.println("El valor " + info + " está en el nivel " + nivel);
                encontrado = true;
                break;
            } else {
                if (info > reco.info) {
                    reco = reco.der;
                } else {
                    reco = reco.izq;
                }
                nivel++;
            }
        }

        if (!encontrado) {
            System.out.println("El valor " + info + " no existe en el árbol.");
        }
    }

    // 5 => Calcular el total de nodos hoja del árbol
    private void totalNodosHoja(Nodo reco) {
        if (reco != null) {
            if (reco.izq == null && reco.der == null) {
                cant++;
            }
            totalNodosHoja(reco.izq);
            totalNodosHoja(reco.der);
        }
    }

    public int totalNodosHoja() {
        cant = 0;
        totalNodosHoja(raiz);
        return cant;
    }

    // Impresión en entreorden
    private void imprimirEntre(Nodo reco) {
        if (reco != null) {
            imprimirEntre(reco.izq);
            System.out.print(reco.info + " ");
            imprimirEntre(reco.der);
        }
    }

    public void imprimirEntre() {
        imprimirEntre(raiz);
        System.out.println();
    }

    public static void main(String[] args) {
        Examen abo = new Examen();

        List<Integer> valores = Arrays.asList(400, 100, 700, 200, 50, 1200, 15, 75, 300, 850);
        for (int x : valores) {
            abo.insertar(x);
        }

        System.out.println("1 = Impresión en entreorden:");
        abo.imprimirEntre();

        System.out.println("2 = Menor valor del subárbol derecho:");
        abo.menorValorDerecha();

        System.out.println("3 = Mayor valor del subárbol izquierdo:");
        abo.mayorValorIzquierda();

        System.out.println("4 = Buscar valor en el árbol e informar nivel:");
        abo.existeValorEnNivel(100);
        abo.existeValorEnNivel(45);

        System.out.println("5 = Total de nodos hoja en el árbol: " + abo.totalNodosHoja());
    }
}
