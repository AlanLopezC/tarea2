public abstract class Hamburguesa {
    String id;
    String nombre;
    String descripcion;
    double precio;
    boolean tieneQueso;
    boolean esVegetariano;

    Hamburguesa(String id,
            String nombre,
            String descripcion,
            double precio,
            boolean tieneQueso,
            boolean esVegetariano) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tieneQueso = tieneQueso;
        this.esVegetariano = esVegetariano;
    }

    void procesoCoccion() {
        ponerPan();
        ponerMayonesa();
        ponerMostaza();
        prepararCarne();
        ponerCarne();
        if (clienteQuiereQueso()) {
            ponerQueso();
        }
        ponerVegetales();
        ponerCatsup();
        ponerPan();
    }

    void ponerPan() {
        System.out.println("Ponemos un pan");
    }

    void ponerMayonesa() {
        System.out.println("Untamos la mayonesa");
    }

    void ponerMostaza() {
        System.out.println("Untamos la mostaza");
    }

    void ponerCarne() {
        System.out.println("Ponemos la carne");
    }

    void ponerQueso() {
        System.out.println("Ponemos dos rebanadas de queso");
    }

    void ponerVegetales() {
        System.out.println("Ponemos lechuga, tomate y cebolla");
    }

    void ponerCatsup() {
        System.out.println("Ponemos poca catsup");
    }

    // Hook
    boolean clienteQuiereQueso() {
        return tieneQueso;
    }

    // vegetariana o normal
    abstract void prepararCarne();

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isTieneQueso() {
        return tieneQueso;
    }

    public boolean isEsVegetariano() {
        return esVegetariano;
    }

}