public class HamburguesaVegetariana extends Hamburguesa {
    boolean conQueso;

    HamburguesaVegetariana(boolean conQueso) {
        this.conQueso = conQueso;
    }

    @Override
    void prepararCarne() {
        System.out.println("Preparamos una carne vegatariana");

    }

    @Override
    boolean llevaQueso() {
        return this.conQueso;
    }

}