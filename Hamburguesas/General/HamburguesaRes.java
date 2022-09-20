package Hamburguesas.General;

public class HamburguesaRes extends HamburguesaGeneral {

    public HamburguesaRes(String id, String nombre, String descripcion, double precio, boolean tieneQueso,
            boolean esVegetariano) {
        super(id, nombre, descripcion, precio, tieneQueso, esVegetariano);
    }

    @Override
    protected void prepararCarne() {
        System.out.println("Preparamos una jugosa carne de res");
    }

}
