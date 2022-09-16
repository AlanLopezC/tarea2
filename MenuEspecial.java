import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class MenuEspecial extends Menu {
    private Hashtable<String , Hamburguesa> hamburguesas;

    public MenuEspecial(){
        super("ESPECIAL");
        hamburguesas = new Hashtable<>();
    }

    @Override
    public void agregarHamburguesa(Hamburguesa hamburguesa){
        if(hamburguesas.size() == 3){
            throw new CantidadHamburguesas();
        }
        hamburguesas.put(hamburguesa.getId(), hamburguesa);
    }

    @Override
    Iterator<Hamburguesa> iterator() {
        return new Iterator<Hamburguesa>() {

            Iterator<String> keyIterator = hamburguesas.keySet().iterator();

            @Override
            public boolean hasNext() {
                return keyIterator.hasNext();
            }

            @Override
            public Hamburguesa next() {
                String key = keyIterator.next();
                return hamburguesas.get(key);
            }
        } ;
    }

}

    
