package Menus;

import java.util.Iterator;

import Hamburguesas.Hamburguesa;

import java.util.Hashtable;

public class MenuEspecialIterator implements Iterator<Hamburguesa> {

    private Hashtable<String, Hamburguesa> hamburguesas;
    private String[] hamburguesasId = new String[3];
    private int position = 0;

    public MenuEspecialIterator(Hashtable<String, Hamburguesa> hamburguesasIn) {
        System.out.println(hamburguesasIn);
        hamburguesas = hamburguesasIn;

        hamburguesasId = hamburguesas.keySet().toArray(hamburguesasId);


    }

    @Override
    public boolean hasNext() {
        if (position >= hamburguesasId.length || hamburguesasId[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Hamburguesa next() {
        Hamburguesa hamburguesa = hamburguesas.get(hamburguesasId[position]);
        position += 1;
        return hamburguesa;
    }

}
