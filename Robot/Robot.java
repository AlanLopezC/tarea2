import java.util.ArrayList;

import Hamburguesas.Hamburguesa;
import Menus.Menu;

/*
* Clase que simula a un robot de restaurante.
*/
public class Robot {
  private Hamburguesa hamburguesaSeleccionada;

  public Hamburguesa getHamburguesaSeleccionada() {
    return hamburguesaSeleccionada;
  }

  public void setHamburguesaSeleccionada(Hamburguesa hamburguesaSeleccionada) {
    this.hamburguesaSeleccionada = hamburguesaSeleccionada;
  }

  /*
   * atributo auxiliar que ayuda a saber si
   * el robot llegó a su destino.
   */
  private boolean llegarDestino;

  /*
   * atributo que nos dice qué tan lejos está el robot de
   * la mesa del cliente.
   */
  private int proximidadDestino;

  /*
   * atributo auxiliar que ayuda a saber si
   * el robot recibió la oden del cliente.
   */
  private boolean ordenRecibida;

  /*
   * atributo auxiliar que ayuda a saber si
   * el robot ya entregó la oden del cliente.
   */
  private boolean ordenEntregada;

  /*
   * Estado en el que se encuentra el robot
   */
  private EstadoRobot estadoActual;
  /*
   * atributo que simula el estado caminando del robot.
   */
  private EstadoRobot caminando;
  /*
   * atributo que simula el estado atendiendo del robot.
   */
  private EstadoRobot atendiendo;
  /*
   * atributo que simula el estado cocinando del robot.
   */
  private EstadoRobot cocinando;
  /*
   * atributo que simula el estado suspendido del robot.
   */
  private EstadoRobot suspendido;

  /*
   * Método constructor del robot*
   */
  public Robot() {
    llegarDestino = false;
    ordenRecibida = false;
    ordenEntregada = false;

    suspendido = new Suspendido(this);
    caminando = new Caminando(this);
    atendiendo = new Atendiendo(this);
    cocinando = new Cocinando(this);

    estadoActual = suspendido;

  }

  /*
   * Método que recibe la orden del cliente, por lo que cambia el valor del
   * atributo
   * orden recibida.
   * 
   * @param ordenMenu id del platillo ordenado.
   */
  public void ingresarOrden(int ordenMenu) {
    ordenRecibida = true;
    System.out.println("En seguida preparé tu orden");
  }

  /*
   * Método que devuelve el valor del atributo ordenRecivida.
   * 
   * @return boolean true si ya se recibió la orden, false en caso contrario.
   */
  public boolean getOrdenRecibida() {
    return ordenRecibida;
  }

  /*
   * Método que devuelve el valor del atributo ordenEntregada.
   * 
   * @return boolean true si ya se entregó la orden, false en caso contrario.
   */
  public boolean getOrdenEntregada() {
    return ordenEntregada;
  }

  /*
   * Método que devuelve el valor del atributo llegarDestino.
   * 
   * @return boolean true si ya llegó a su destino, false en caso contrario.
   */
  public boolean getLlegarDestino() {
    return llegarDestino;
  }

  /*
   * Método que devuelve el estado actual del robot.
   * 
   * @return EstadoRobot estado en el que se encuentra el robot cuando se manda a
   * llamar el método.
   */
  public EstadoRobot getEstadoActual() {
    return estadoActual;
  }

  /*
   * Método que devuelve el valor del atributo proximidadDestino.
   * 
   * @return int cercanía del robot hacia la mesa del cliente.
   */
  public int getProximidadDestino() {
    return proximidadDestino;
  }

  /*
   * Método que modifica el valor del atributo proximidadDestino.
   * 
   * @param proximidad qué tan cerca o lejos se encuentra el robot de la mesa del
   * cliente.
   */
  public void setProximidadDestino(int proximidad) {
    proximidadDestino += proximidad;
  }

  /*
   * Método que modifica el valor del atributo llegarDestino.
   * 
   * @param sn s representa si (en referencia a que ya se llegó al destino) y n
   * representa no
   * (en referencia a que no ha llegado a su destino).
   */
  public void setLlegarDestino(boolean sn) {
    llegarDestino = sn;

  }

  /*
   * Método que modifica el valor del atributo ordenEntregada.
   * 
   * @param sn s representa si (en referencia a que ya se entregó la orden) y n
   * representa no
   * (en referencia a que no se ha entregado la orden).
   */
  public void setOrdenEntregada(boolean sn) {
    ordenEntregada = sn;
  }

  /*
   * Método que restablece el valor del atributo proximidadDestino.
   */
  public void resetProximidadDestino() {
    proximidadDestino = 0;
  }

  /*
   * Método que devuelve el estado suspendido del robot.
   * 
   * @return EstadoRobot.
   */
  public EstadoRobot getSuspendido() {
    return suspendido;
  }

  /*
   * Método que devuelve el estado caminando del robot.
   * 
   * @return EstadoRobot.
   */
  public EstadoRobot getCaminando() {
    return caminando;
  }

  /*
   * Método que devuelve el estado atendiendo del robot.
   * 
   * @return EstadoRobot.
   */
  public EstadoRobot getAtendiendo() {
    return atendiendo;
  }

  /*
   * Método que devuelve el estado cocinando del robot.
   * 
   * @return EstadoRobot.
   */
  public EstadoRobot getCocinando() {
    return cocinando;
  }

  /*
   * Método que llama al método suspender del estado actual.
   */
  public void suspender() {
    estadoActual.suspender();
  }

  /*
   * Método que llama al método caminar del estado actual.
   */
  public void caminar() {
    estadoActual.caminar();
  }

  /*
   * Método que llama al método atender del estado actual.
   */
  public void atender(ArrayList<Menu> menus) {
    estadoActual.atender(menus);
  }

  /*
   * Método que llama al método cocinar del estado actual.
   */
  public void cocinar() {
    estadoActual.cocinar();
  }

  /*
   * Método que modifica el estado actual del robot.
   * 
   * @param nuevoEstado
   */
  public void asignarNuevoEstado(EstadoRobot nuevoEstado) {
    estadoActual = nuevoEstado;
  }

}
