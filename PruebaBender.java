import java.util.ArrayList;
import java.util.Scanner;

import Menus.Menu;
import Menus.MenuDia;
import Menus.MenuGeneral;
import Menus.MenuEspecial;
import Robot.*;

public class PruebaBender {
	public static void main(String[] args) {
		Robot bender = new Robot();
		Scanner sc = new Scanner(System.in);
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(new MenuDia());
		menus.add(new MenuGeneral());
		//menus.add(new MenuEspecial());


		int opcion;
		System.out.println("***BIENVENIDO A LA CONSOLA DE Bender.***"
				+ "\nPor favor elige la opcion que deseas ejecutar.");

		do {
			System.out.println(
					"1.- Llamar a Bender.\n" +
							"2.- atender.\n" +
							"3.- cocinar.\n" +
							"4.- suspender.\n" +
							"0.- Terminar simulacion.\n");

			while (true) {
				try {
					String opcionUsuario = sc.nextLine();
					opcion = Integer.parseInt(opcionUsuario);
					break;
				} catch (NumberFormatException ex) {
					System.out.println("Por favor elige la opcion VALIDA "
							+ "que deseas ejecutar.\n" +
							"1.- Llamar a Bender.\n" +
							"2.- atender.\n" +
							"3.- cocinar.\n" +
							"4.- suspender.\n" +
							"0.- Terminar simulacion.\n");

				}
			}

			switch (opcion) {
				case 1:
					bender.caminar();
					break;

				case 2:
					bender.atender(menus);
					break;

				case 3:
					bender.cocinar();
					break;

				case 4:
					bender.suspender();
					break;

				case 0:
					break;

				default:
					System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
					break;

			}

		} while (opcion != 0);
		sc.close();
	}
}
