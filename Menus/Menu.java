package Menus;

import java.text.NumberFormat;
import java.util.Iterator;

import Hamburguesas.Hamburguesa;

public abstract class Menu {

        private String nombre;

        public Menu(String nombreIn) {
                nombre = nombreIn;
        }

        abstract Iterator<Hamburguesa> iterator();

        abstract void agregarHamburguesa(Hamburguesa hamburguesa);

        String mostrarMenu() {

                Iterator<Hamburguesa> iteradorHamburgesas = this.iterator();
                NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
                String menu = "";

                menu += formatoColumna(
                                "a---------------------------------------------------------------------------------------------------------------------------------------------------------------------------c\n");
                if (nombre.equals("ESPECIAL")) {
                        menu += formatoFila(
                                        "|                                                                                MENU "
                                                        + nombre
                                                        + "                                                                              |\n");
                } else if (nombre.equals("DIA")) {
                        menu += formatoFila(
                                        "|                                                                                MENU "
                                                        + nombre
                                                        + "                                                                                   |\n");
                } else {
                        menu += formatoFila(
                                        "|                                                                                MENU "
                                                        + nombre
                                                        + "                                                                               |\n");
                }
                menu += formatoFila(
                                "|                                                                                MENU GENERAL                                                                               |\n");
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
                                        String.format("| %4s | %-24s | %4s| %-76s |\n", hamburguesa.getId(),
                                                        hamburguesa.getNombre(),
                                                        numberFormat.format(hamburguesa.getPrecio()),
                                                        hamburguesa.getDescripcion()));
                }

                menu += formatoColumna(
                                "g------h--------------------------h------h----------------------------------------------------------------------------------------------------------------------------------i\n");
                return menu;
        }

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

        static String formatoFila(String fila) {
                return fila.replace('|', '\u2502');
        }

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
