package Hamburguesas.General;

public class HamburguesaTerminoMedio extends HamburguesaGeneral {

    public HamburguesaTerminoMedio(String id, String nombre, String descripcion, double precio, boolean tieneQueso,
            boolean esVegetariano) {
        super(id, nombre, descripcion, precio, tieneQueso, esVegetariano);
    }

    @Override
    protected void prepararCarne() {
        System.out.println("Preparamos una carne termino medio");
    }

}
