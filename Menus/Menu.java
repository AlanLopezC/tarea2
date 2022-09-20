package Menus;

import java.text.NumberFormat;
import java.util.Iterator;

import Hamburguesas.Hamburguesa;

public abstract class Menu {

    private String nombre;

    /**
     * Constructor de la clase Menu
     * 
     * @param String - Nombre del Menu.
     */
    public Menu(String nombreIn) {
        nombre = nombreIn;
    }

    /**
     * Crea un objeto de la clase MenuGeneralIterdor
     * 
     * @return Iterator<Hamburguesa> - El Iterador.
     */
    abstract Iterator<Hamburguesa> iterator();

    /**
     * Método para agregar una hamburguesa al Menu.
     * 
     * @param Hamburguesa - Hamburguesa a agregar.
     */
    abstract void agregarHamburguesa(Hamburguesa hamburguesa);

    /**
     * Método para mostrar el Menu.
     */
    String mostrarMenu() {

        Iterator<Hamburguesa> iteradorHamburgesas = this.iterator();
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        String menu = "";

        menu += formatoColumna(
                "a---------------------------------------------------------------------------------------------------------------------------------------------------------------------------c\n");
        if (nombre.equals("ESPECIAL")) {
            menu += formatoFila("|                                                                                MENU "
                    + nombre + "                                                                              |\n");
        } else if (nombre.equals("DIA")) {
            menu += formatoFila(
                    "|                                                                                MENU " + nombre
                            + "                                                                                   |\n");
        } else {
            menu += formatoFila("|                                                                                MENU "
                    + nombre + "                                                                               |\n");
        }
        menu += formatoColumna(
                "g---------------------------------------------------------------------------------------------------------------------------------------------------------------------------i\n");
        menu += formatoColumna(
                "a------b--------------------------b------b----------------------------------------------------------------------------------------------------------------------------------c\n");
        menu += formatoFila(
                "|  ID  |          NOMBRE          |   $  |                                                        DESCRIPCIÓN                                                               |\n");
        menu += formatoColumna(
                "d------e--------------------------e------e----------------------------------------------------------------------------------------------------------------------------------f\n");

        while (iteradorHamburgesas.hasNext()) {
            Hamburguesa hamburguesa = iteradorHamburgesas.next();
            menu += formatoFila(
                    String.format("| %4s | %-24s | %4s| %-76s |\n", hamburguesa.getId(), hamburguesa.getNombre(),
                            numberFormat.format(hamburguesa.getPrecio()), hamburguesa.getDescripcion()));
        }

        menu += formatoColumna(
                "g------h--------------------------h------h----------------------------------------------------------------------------------------------------------------------------------i\n");
        return menu;
    }

    /**
     * Método para obtener hamburguesas.
     * 
     * @param String - Id de la Hamburguesa.
     */
    Hamburguesa obtenerHamburguesa(String id) {
        Iterator<Hamburguesa> iteradorHamburgesas = this.iterator();
        while (iteradorHamburgesas.hasNext()) {
            Hamburguesa hamburguesa = iteradorHamburgesas.next();
            if (hamburguesa.getId().equals(id)) {
                return hamburguesa;
            }
        }
        return null;
    };

    /**
     * Método para formar la Fila de la tabla utilizada para la representación del
     * Menu.
     * Se remplaza el caracter '|' con el símbolo Unicode Character '\u2502'
     */
    static String formatoFila(String fila) {
        return fila.replace('|', '\u2502');
    }

    /**
     * Método para formar la columna de la tabla utilizada para la representación
     * del Menu.
     * Se remplaza cada letra con un símbolo Unicode Character para representar la
     * tabla.
     */
    static String formatoColumna(String columna) {
        return columna.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }

}
