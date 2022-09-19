import java.util.Iterator;

public class MenuGeneralIterator implements Iterator<Hamburguesa> {

    private Hamburguesa[] hamburguesas;
    private int position = 0;

    public MenuGeneralIterator(Hamburguesa[] hamburguesasIn){
        hamburguesas = hamburguesasIn;
    }

    @Override
    public boolean hasNext() {
        if(position >= hamburguesas.length || hamburguesas[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Hamburguesa next() {
        Hamburguesa hamburguesa = hamburguesas[position];
        position += 1;
        return hamburguesa;
    }  
}
