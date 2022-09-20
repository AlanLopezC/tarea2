package Hamburguesas.Especial;

public class HamburguesaDoble extends HamburguesaEspecial {

    public HamburguesaDoble(String id, String nombre, String descripcion, double precio, boolean tieneQueso,
            boolean esVegetariano) {
        super(id, nombre, descripcion, precio, tieneQueso, esVegetariano);
    }

    @Override
    protected void prepararCarne() {
        System.out.println("Preparamos 2 jugosas carnes");
    }

}
