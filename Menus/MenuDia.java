package Menus;

import java.util.Iterator;

import Hamburguesas.Hamburguesa;

import java.util.ArrayList;

public class MenuDia extends Menu {

    private ArrayList<Hamburguesa> hamburguesas;

    public MenuDia() {
        super("DIA");
        hamburguesas = new ArrayList<>();
    }

    public void agregarHamburguesa(Hamburguesa hamburguesa) {
        if (hamburguesas.size() == 3) {
            throw new CantidadHamburguesas();
        }
        hamburguesas.add(hamburguesa);
    }

    /**
     * Método para elminar una Hamburguesa del Menu.
     * 
     * @param String - Id de la Hamburguesa.
     */
    public Hamburguesa eliminarHamburguesa(String id) {

        Iterator<Hamburguesa> hamburguesasIterador = hamburguesas.iterator();
        while (hamburguesasIterador.hasNext()) {
            Hamburguesa hamburguesa = hamburguesasIterador.next();
            if (hamburguesa.getId().equals(id)) {
                hamburguesasIterador.remove();
                return hamburguesa;
            }
        }
        return null;
    }

    @Override
    public Iterator<Hamburguesa> iterator() {
        return new MenuDiaIterator(hamburguesas);
    }

}
