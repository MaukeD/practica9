package MíticoSC;

/**
 * 
 * @author Mario Cerezo González
 * @version 1.0
 * @since 01/06/21
 *
 */

public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		CCuenta cuentaUno;

		double saldoActual;

		cuentaUno = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

		saldoActual = cuentaUno.estado();

		System.out.println("El saldo actual es" + saldoActual);

		operacuenta(cuentaUno);

	}

	/**
	 * 
	 * @param cuentaUno
	 */
	private static void operacuenta(CCuenta cuentaUno) {
		try {

			cuentaUno.retirar(2300);

		} catch (Exception e) {

			System.out.print("Fallo al retirar");

		}

		try {

			System.out.println("Ingreso en cuenta");

			cuentaUno.ingresar(695);

		} catch (Exception e) {

			System.out.print("Fallo al ingresar");

		}
	}

}
