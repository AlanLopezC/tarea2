import java.util.ArrayList;

import Menus.Menu;

/*
* Esta clase simula el estado caminando de un robot.
*/
public class Suspendido implements EstadoRobot {
  /*
   * objeto de la clase robot que implementará el estado Cocinando.
   */
  private Robot bender;

  /**
   * Constructor de la clase Suspendido.
   * 
   * @param bender Robot que tendrá el estado suspendido.
   **/
  public Suspendido(Robot bender) {
    this.bender = bender;
  }

  /**
   * Metodo que permite al botot cambiar del estado Suspendido al estado
   * Cocinando, en caso de que sea permitido.
   **/
  public void cocinar() {
    System.out.println("No puedo cocinar, estoy en modo suspendido.");
  }

  /**
   * Metodo que permite al botot cambiar del estado Suspendido al estado
   * Atendiendo, en caso de que sea permitido.
   **/
  public void atender(ArrayList<Menu> menus) {
    System.out.println("No puedo atender, estoy en modo suspendido.");

  }

  /**
   * Metodo que permite al botot cambiar del estado Suspendido al estado
   * Caminando, en caso de que sea permitido.
   **/
  public void caminar() {
    bender.asignarNuevoEstado(bender.getCaminando());
    if (bender.getProximidadDestino() == 0) {
      System.out.println("Me has activado. En seguida voy a tu mesa");
    } else if (bender.getProximidadDestino() == 1) {
      System.out.println("Ya voy a mitad de camino, no te desesperes");
    } else if (bender.getProximidadDestino() == 2) {
      System.out.println("Dame 5, no seas gacho.");
    }

  }

  /**
   * Metodo que permite al botot cambiar del estado Suspendido al estado
   * Suspendido, en caso de que sea permitido.
   **/
  public void suspender() {
    System.out.println("Ya estoy supendido xd");

  }
}
