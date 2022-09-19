import java.util.Iterator;
import java.util.ArrayList;

public class MenuDiaIterator implements Iterator<Hamburguesa> {

    private ArrayList<Hamburguesa> hamburguesas;
    private int position = 0;

    public MenuDiaIterator(ArrayList<Hamburguesa> hamburguesasIn){
        hamburguesas = hamburguesasIn;
    }

    @Override
    public boolean hasNext() {
        if (position >= hamburguesas.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Hamburguesa next() {
        Hamburguesa hamburguesa = hamburguesas.get(position);
        position += 1;
        return hamburguesa;
    } 
}
