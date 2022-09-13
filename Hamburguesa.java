public abstract class Hamburguesa {
    void preparar() {
        ponerPan();
        ponerMayonesa();
        ponerMostaza();
        prepararCarne();
        ponerCarne();
        if (llevaQueso()) {
            ponerQueso();
        }
        ponerVegetales();
        ponerCatsup();
        ponerPan();
    }

    void ponerPan() {
        System.out.println("Ponemos un pan");
    }

    void ponerMayonesa() {
        System.out.println("Untamos la mayonesa");
    }

    void ponerMostaza() {
        System.out.println("Untamos la mostaza");
    }

    void ponerCarne() {
        System.out.println("Ponemos la carne");
    }

    void ponerQueso() {
        System.out.println("Ponemos dos rebanadas de queso");
    }

    void ponerVegetales() {
        System.out.println("Ponemos lechuga, tomate y cebolla");
    }

    void ponerCatsup() {
        System.out.println("Ponemos poca catsup");
    }

    // vegetariana o normal
    abstract void prepararCarne();

    // Hook
    boolean llevaQueso() {
        return true;
    }
}