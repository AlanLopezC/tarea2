public class HamburguesaNormal extends Hamburguesa {
    boolean conQueso;

    HamburguesaNormal(boolean conQueso) {
        this.conQueso = conQueso;
    }

    @Override
    void prepararCarne() {
        System.out.println("Preparamos una carne de res");

    }

    @Override
    boolean llevaQueso() {
        return this.conQueso;
    }
}
