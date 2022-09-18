package Hamburguesas;

public abstract class Hamburguesa {
    String id;
    String nombre;
    String descripcion;
    double precio;
    boolean tieneQueso;
    boolean esVegetariano;

    public Hamburguesa(String id,
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

    /**
     * Implementa el proceso de coccion de la hamburguesa.
     */
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

    /**
     * Imprime mensaje de que se puso pan.
     */
    void ponerPan() {
        System.out.println("Ponemos un pan");
    }

    /**
     * Imprime mensaje de que se puso mayonesa.
     */
    void ponerMayonesa() {
        System.out.println("Untamos la mayonesa");
    }

    /**
     * Imprime mensaje de que se puso mostaza.
     */
    void ponerMostaza() {
        System.out.println("Untamos la mostaza");
    }

    /**
     * Imprime mensaje de que se puso carne.
     */
    void ponerCarne() {
        System.out.println("Ponemos la carne");
    }

    /**
     * Imprime mensaje de que se puso queso.
     */
    void ponerQueso() {
        System.out.println("Ponemos dos rebanadas de queso");
    }

    /**
     * Imprime mensaje de que se puso vegetales.
     */
    void ponerVegetales() {
        System.out.println("Ponemos lechuga, tomate y cebolla");
    }

    /**
     * Imprime mensaje de que se puso catsup.
     */
    void ponerCatsup() {
        System.out.println("Ponemos poca catsup");
    }

    /**
     * Determina si la hamburguesa lleva queso.
     */
    boolean clienteQuiereQueso() {
        return tieneQueso;
    }

    /**
     * Especifica la forma especial de preparar la carne.
     */
    protected abstract void prepararCarne();

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