package Hamburguesas.Especial;

public class HamburguesaTriple extends HamburguesaEspecial {

    public HamburguesaTriple(String id, String nombre, String descripcion, double precio, boolean tieneQueso,
            boolean esVegetariano) {
        super(id, nombre, descripcion, precio, tieneQueso, esVegetariano);
    }

    @Override
    protected void prepararCarne() {
        System.out.println("Preparamos 3 jugosas carnes");
    }

}
