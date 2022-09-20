import Menus.Menu;
import java.util.ArrayList;
import java.util.Scanner;

import Hamburguesas.Hamburguesa;

/*
Esta clase simula el estado caminando de un robot.
*/
public class Caminando implements EstadoRobot {
  /*
   * objeto de la clase robot que implementará el estado caminando.
   */
  private Robot bender;

  /**
   * Constructor de la clase Caminando
   * 
   * @param bender Robot que tendrá el estado caminando.
   **/
  public Caminando(Robot bender) {
    this.bender = bender;
  }

  /**
   * Metodo que permite al botot cambiar del estado Caminando al estado
   * Cocinando, en caso de que sea permitido.
   **/
  public void cocinar() {
    if (bender.getLlegarDestino() == false) {
      System.out.println("No puedo cocinar, estoy caminando >:v ");
    } else {
      System.out.println("No puedo cocinar, aun no te atiendo.");
    }

  }

  /**
   * Metodo que permite al botot cambiar del estado Caminando al estado
   * Atendiedno, en caso de que sea permitido.
   **/
  public void atender(ArrayList<Menu> menus) {
    if (bender.getLlegarDestino()) {
      System.out.println("¿Qué desea ordenar?");
      imprimirMenus(menus);

      bender.resetProximidadDestino();
      bender.asignarNuevoEstado(bender.getAtendiendo());
    } else {
      System.out.println("Aun no llego a tu mesa,espera por favor");
    }
  }

  private void imprimirMenus(ArrayList<Menu> menus) {
    for (Menu menu : menus) {
      System.out.println(menu.mostrarMenu());
      System.out.println("********************************");
    }
    System.out.println("Selecciona el numero de menu que deseas: ");
    final Scanner sc = new Scanner(System.in);

    try {
      String opcionUsuario = sc.nextLine();
      int menuSeleccionadoIndex = Integer.parseInt(opcionUsuario);

      Menu menuSeleccionado = menus.get(menuSeleccionadoIndex - 1);
      menuSeleccionado.mostrarMenu();

      String opcionUsuario2 = sc.nextLine();
      Hamburguesa hamburguesaSeleccionada = menuSeleccionado.obtenerHamburguesa(opcionUsuario2);
      bender.setHamburguesaSeleccionada(hamburguesaSeleccionada);

    } catch (NumberFormatException ex) {
      System.out.println(ex);
    }

    sc.close();
  }

  /**
   * Metodo que permite al botot cambiar del estado Caminando al estado
   * Caminando, en caso de que sea permitido.
   **/
  public void caminar() {
    bender.setProximidadDestino(1);
    if (bender.getProximidadDestino() == 1) {
      System.out.println("Ya voy a mitad de camino, no te desesperes");
    } else if (bender.getProximidadDestino() == 2) {
      System.out.println("Dame 5, no seas gacho.");
    } else {
      bender.setLlegarDestino(true);
      System.out.println("Ya estoy en tu mesa :D ");
    }
  }

  /**
   * Metodo que permite al botot cambiar del estado Caminando al estado
   * Suspendido, en caso de que sea permitido.
   **/
  public void suspender() {
    if (bender.getLlegarDestino() == false) {
      System.out.println("Pasaré a modo suspendido. zZz");
      bender.asignarNuevoEstado(bender.getSuspendido());
    } else {
      System.out.println("No puedo suspenderme, ya estoy en tu mesa");
    }

  }

}
