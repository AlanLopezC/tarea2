package Menus;

import java.util.Iterator;

import Hamburguesas.Hamburguesa;
import Hamburguesas.General.HamburguesaRes;
import Hamburguesas.General.HamburguesaTerminoMedio;
import Hamburguesas.General.HamburguesaTresCuartos;

public class MenuGeneral extends Menu {

    private Hamburguesa[] hamburguesas;
    private int disponibilidad = 0;
    private final int CAPACIDAD = 3;

    public MenuGeneral() {
        super("GENERAL");
        hamburguesas = new Hamburguesa[CAPACIDAD];

        agregarHamburguesa(new HamburguesaRes("21", "Res",
                "Rica hamburguesa res.", 200, true, false));
        agregarHamburguesa(new HamburguesaTerminoMedio("22", "Termino Medio",
                "Rica hamburguesa termino medio", 250, true, false));
        agregarHamburguesa(new HamburguesaTresCuartos("23", "Tres Cuartos",
                "Rica hamburguesa tres cuartos.", 150, true, false));
    }

    public void agregarHamburguesa(Hamburguesa hamburguesa) {

        if (disponibilidad >= CAPACIDAD) {
            throw new CantidadHamburguesas();
        }
        hamburguesas[disponibilidad] = hamburguesa;
        disponibilidad += 1;
    }

    public Iterator<Hamburguesa> iterator() {
        return new MenuGeneralIterator(hamburguesas);
    }
}
