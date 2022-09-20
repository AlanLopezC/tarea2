package Menus;

import java.util.Hashtable;
import java.util.Iterator;

import Hamburguesas.Hamburguesa;
import Hamburguesas.Especial.HamburguesaCuadruple;
import Hamburguesas.Especial.HamburguesaDoble;
import Hamburguesas.Especial.HamburguesaTriple;

public class MenuEspecial extends Menu {
    private Hashtable<String, Hamburguesa> hamburguesas;

    public MenuEspecial() {
        super("ESPECIAL");
        hamburguesas = new Hashtable<>();

        agregarHamburguesa(new HamburguesaDoble("11", "Doble",
                "Rica hamburguesa doble.", 200, true, false));
        agregarHamburguesa(new HamburguesaTriple("12", "Triple",
                "Rica hamburguesa triple", 250, true, false));
        agregarHamburguesa(new HamburguesaCuadruple("13", "Cuadruple",
                "Rica hamburguesa cuadruple.", 150, true, false));
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
