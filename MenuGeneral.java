import java.util.Iterator;

public class MenuGeneral extends Menu{

    private Hamburguesa[] hamburguesas;
    private int disponibilidad = 0;
    private final int CAPACIDAD = 3;

    public MenuGeneral(){
        super("GENERAL"); 
        hamburguesas = new Hamburguesa[CAPACIDAD]; 
    }

    public void agregarHamburguesa(Hamburguesa hamburguesa){

        if (disponibilidad >= CAPACIDAD){
            throw new CantidadHamburguesas();
        }
        hamburguesas[disponibilidad] = hamburguesa;
        disponibilidad += 1;
    }

    public Iterator<Hamburguesa> iterator() {
        return new MenuGeneralIterator(hamburguesas);
    }
}
