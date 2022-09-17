import java.util.Iterator;

public class MenuGeneral extends Menu{

    private Hamburguesa[] hamburguesas;
    private int disponibilidad;

    public MenuGeneral(){
        super("GENERAL"); 
        hamburguesas = new Hamburguesa[3];
        disponibilidad = 0;  
    }

    public void agregarHamburguesa(Hamburguesa hamburguesa){
        if (disponibilidad == hamburguesas.length){
            throw new CantidadHamburguesas();
        }

        for(int i = 0; i < hamburguesas.length; i++){
            if(hamburguesas[i] == null){
                hamburguesas[i] = hamburguesa;
                break;
            }
        }
        disponibilidad += 1;
    }

    public Iterator<Hamburguesa> iterator() {
        return new Iterator<Hamburguesa>() {

            int position = 0;

            @Override
            public boolean hasNext() {
                if (position >= hamburguesas.length || hamburguesas[position] == null){
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
        };
    }
}
