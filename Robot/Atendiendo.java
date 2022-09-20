import java.util.ArrayList;

import Menus.Menu;

/*
Esta clase simula el estado atendiendo de un robot. 
*/
public class Atendiendo implements EstadoRobot {
  /*
   * objeto de la clase robot que implementará el estado atendiendo.
   */
  private Robot bender;

  /**
   * Constructor de la clase Atendiendo
   * 
   * @param bender Robot que tendrá el estado atendendiendo.
   **/
  public Atendiendo(Robot bender) {
    this.bender = bender;
  }

  /**
   * Metodo que permite al botot cambiar del estado Atendiendo al estado
   * Cocinando, en caso de que sea permitido.
   **/
  public void cocinar() {
    if (bender.getOrdenRecibida()) {
      System.out.println("En seguida preparo tu orden ");
      bender.asignarNuevoEstado(bender.getCocinando());
      bender.getHamburguesaSeleccionada().procesoCoccion();
      bender.setOrdenEntregada(true);
    } else {
      System.out.println("todavia no recivo tu orden.");
    }

  }

  /**
   * Metodo que permite al botot cambiar del estado Atendiendo al estado
   * Atendiendo, en caso de que sea permitido.
   **/
  public void atender(ArrayList<Menu> menus) {
    System.out.println("Ya te estoy atendiendo :D");

  }

  /**
   * Metodo que permite al botot cambiar del estado Atendiendo al estado
   * Caminando, en caso de que sea permitido.
   **/
  public void caminar() {
    System.out.println("¿Eres ciego? o por qué quieres que camine más si ya estoy en tu lugar.  :D");
  }

  /**
   * Metodo que permite al botot cambiar del estado Atendiendo al estado
   * Suspender, en caso de que sea permitido.
   **/
  public void suspender() {
    System.out.println("No puedo suspenderme si te estoy atendiendo");

  }
}
