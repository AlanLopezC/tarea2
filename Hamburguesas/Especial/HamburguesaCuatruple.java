package Hamburguesas.Especial;

public class HamburguesaCuatruple extends HamburguesaEspecial {

    HamburguesaCuatruple(String id, String nombre, String descripcion, double precio, boolean tieneQueso,
            boolean esVegetariano) {
        super(id, nombre, descripcion, precio, tieneQueso, esVegetariano);
    }

    @Override
    protected void prepararCarne() {
        System.out.println("Preparamos 4 jugosas carnes");
    }

}
