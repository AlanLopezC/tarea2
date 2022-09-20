package Menus;

import java.util.Hashtable;
import java.util.Iterator;

import Hamburguesas.Hamburguesa;

public class MenuEspecial extends Menu {
    private Hashtable<String, Hamburguesa> hamburguesas;

    public MenuEspecial() {
        super("ESPECIAL");
        hamburguesas = new Hashtable<>();
    }

    @Override
    public void agregarHamburguesa(Hamburguesa hamburguesa) {
        if (hamburguesas.size() == 3) {
            throw new CantidadHamburguesas();
        }
        hamburguesas.put(hamburguesa.getId(), hamburguesa);
    }

    @Override
    Iterator<Hamburguesa> iterator() {
        return new MenuEspecialIterator(hamburguesas);
    }

}
