public class Main {
    public static void main(String[] args) {
        Parcial1 lg = new Parcial1();
        lg.insertar(10,20);
        lg.insertar(5,8);
        lg.insertar(200,4);
        lg.insertar(1,2);
        lg.imprimir();

        lg.sumarNodos();
        lg.borrarNodos();
        lg.imprimir();
        lg.nodosIguales();
        lg.imprimir();

    }
}