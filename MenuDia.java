import java.util.Iterator;
import java.util.ArrayList;

public class MenuDia extends Menu {

    private ArrayList<Hamburguesa> hamburguesas;

    public MenuDia(){
        super("DIA");
        hamburguesas = new ArrayList<>();
    }

    public void agregarHamburguesa(Hamburguesa hamburguesa){
        if(hamburguesas.size() == 3){
            throw new CantidadHamburguesas(); 
        }
        hamburguesas.add(hamburguesa);
    }
    
    public Hamburguesa eliminarHamburguesa(String id){

        Iterator<Hamburguesa> hamburguesasIterador = hamburguesas.iterator();
        while(hamburguesasIterador.hasNext()){
            Hamburguesa hamburguesa = hamburguesasIterador.next();
            if(hamburguesa.getId.equals(id)){
                hamburguesasIterador.remove();
                return hamburguesa;
            }
        }
        return null;
    }

    @Override
    public Iterator<Hamburguesa> iterator() {
        return new Iterator<Hamburguesa>() {

            private int position = 0;

            @Override
            public boolean hasNext() {
                if(position >= hamburguesas.size()){
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
        };
    }
    
}