package Hamburguesas.General;

import Hamburguesas.Hamburguesa;

public abstract class HamburguesaGeneral extends Hamburguesa {

    HamburguesaGeneral(String id, String nombre, String descripcion, double precio, boolean tieneQueso,
            boolean esVegetariano) {
        super(id, nombre, descripcion, precio, tieneQueso, esVegetariano);
    }

}
