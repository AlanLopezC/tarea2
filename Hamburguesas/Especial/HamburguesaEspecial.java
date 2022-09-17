package Hamburguesas.Especial;

import Hamburguesas.Hamburguesa;

public abstract class HamburguesaEspecial extends Hamburguesa {

    public HamburguesaEspecial(String id, String nombre, String descripcion, double precio, boolean tieneQueso,
            boolean esVegetariano) {
        super(id, nombre, descripcion, precio, tieneQueso, esVegetariano);
    }

}