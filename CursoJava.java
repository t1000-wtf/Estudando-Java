public class CursoJava {
    public static void main(String[] args) {

        // Animal n1 = new Animal();

        Animal a1 = new Sapo(0, 0, 0);
        Animal a2 = new Aranha(5, 3, 5, 5);
        Formiga f1 = new Formiga(2, 2, 2);
        Vegetal v1 = new Vegetal(1);
        Vegetal v2 = new Vegetal(2);
        Vegetal v3 = new Vegetal(3);

        // a2.info();
        // a2.atacar(a3);
        // a2.comer(a3.getMassa());
        // a2.info();
        // System.out.println(a3.getVivo());

        // f1.atacarVegetal(v1);

        v1.info();
    }
}