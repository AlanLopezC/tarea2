public class CantidadHamburguesas extends RuntimeException {

    public CantidadHamburguesas(){
        super("No puedes agregar más hamburguesas");
    }

    public CantidadHamburguesas(String message){
        super(message);
    }
}
