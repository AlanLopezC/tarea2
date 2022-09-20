package Robot;
import java.util.ArrayList;

import Menus.Menu;

/*
Esta clase simula el estado cocinando de un robot.
*/
public class Cocinando implements EstadoRobot {
  /*
   * objeto de la clase robot que implementará el estado Cocinando.
   */
  private Robot bender;

  /**
   * Constructor de la clase Cocinando
   *
   * @param bender Robot que tendrá el estado cocinando.
   **/
  public Cocinando(Robot bender) {
    this.bender = bender;
  }

  /**
   * Metodo que permite al botot cambiar del estado Cocinando al estado
   * Cocinando, en caso de que sea permitido.
   **/
  public void cocinar() {

    if (bender.getOrdenEntregada()) {
      System.out.println("Ya entregué tu orden, no hay nada más que cocinar.");
    } else {
      System.out.println("Ya estoy cocinando :D");
    }
  }

  /**
   * Metodo que permite al botot cambiar del estado Cocinando al estado
   * Atendiendo, en caso de que sea permitido.
   **/
  public void atender(ArrayList<Menu> menus) {
    System.out.println("ya te atendí.");

  }

  /**
   * Metodo que permite al botot cambiar del estado Cocinando al estado
   * Caminando, en caso de que sea permitido.
   **/
  public void caminar() {
    System.out.println("¿Eres ciego? o por qué quieres que camine más si ya estoy en tu lugar.  :D");
  }

  /**
   * Metodo que permite al botot cambiar del estado Cocinando al estado
   * Suspendido, en caso de que sea permitido.
   **/
  public void suspender() {
    if (bender.getOrdenEntregada() == false) {
      System.out.println("No puedo suspenderme si te estoy cocinando");
    } else {
      System.out.println("Buen provecho, procederé a suspenderme  XD ");
      bender.asignarNuevoEstado(bender.getSuspendido());
    }

  }
}
