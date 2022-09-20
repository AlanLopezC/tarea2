import java.util.ArrayList;

import Menus.Menu;

/**
 * Clase que simula los estados de un robot que venderá hamburguesas.
 **/
public interface EstadoRobot {
  /**
   * Método que simula estado caminando del robot.
   **/
  public void caminar();

  /**
   * Método que simula estado cocinando del robot.
   **/
  public void cocinar();

  /**
   * Método que simula estado suspendido del robot.
   **/
  public void suspender();

  /**
   * Método que simula estado atendiendo del robot.
   **/
  public void atender(ArrayList<Menu> menus);

}
