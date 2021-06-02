package MíticoSC;

/**
 * 
 * @author Mario Cerezo González
 * @version 1.0
 * @since 01/06/21
 *
 */

public class CCuenta {

	private String nombre;

	private String cuenta;

	private double saldo;

	private double tipoInteres;

	public CCuenta() {
	}

	/**
	 * 
	 * @param nom
	 * @param cue
	 * @param sal
	 * @param tipo
	 */
	public CCuenta(String nom, String cue, double sal, double tipo)

	{

		this.nombre = nom;

		this.cuenta = cue;

		this.saldo = sal;

		this.tipoInteres = tipo;

	}

	/**
	 * 
	 * @param nom
	 */
	public void asignarNombre(String nom)

	{

		setNombre(nom);

	}

	/**
	 * 
	 * @return
	 */
	public String obtenerNombre()

	{

		return getNombre();

	}

	/**
	 * 
	 * @return
	 */
	public double estado()

	{

		return getSaldo();

	}

	/**
	 * 
	 * @param cantidad
	 * @throws Exception
	 */
	public void ingresar(double cantidad) throws Exception

	{

		if (cantidad < 0)

			throw new Exception("No se puede ingresar una cantidad negativa");

		saldo = saldo + cantidad;

	}

	/**
	 * 
	 * @param cantidad
	 * @throws Exception
	 */
	public void retirar(double cantidad) throws Exception

	{

		if (cantidad <= 0)

			throw new Exception("No se puede retirar una cantidad negativa");

		if (estado() < cantidad)

			throw new Exception("No se hay suficiente saldo");

		saldo = saldo - cantidad;

	}

	/**
	 * 
	 * @return
	 */
	public String obtenerCuenta()

	{

		return getCuenta();

	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {

		return nombre;

	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	/**
	 * 
	 * @return
	 */
	public double getTipoInteres() {

		return tipoInteres;

	}

	/**
	 * 
	 * @return
	 */
	public double tipoInteres() {

		return getTipoInteres();

	}

	/**
	 * 
	 * @param tipoInteres
	 */
	public void setTipoInteres(double tipoInteres) {

		this.tipoInteres = tipoInteres;

	}

	/**
	 * 
	 * @param tipoInteres
	 */
	public void cambiarTipoInteres(double tipoInteres) {

		setTipoInteres(tipoInteres);

	}

	/**
	 * 
	 * @return
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * 
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * 
	 * @param cuenta
	 */
	public void cambiarCuenta(String cuenta) {
		setCuenta(cuenta);
	}

	/**
	 * 
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * 
	 * @param saldo
	 */
	public void cambiarSaldo(double saldo) {
		setSaldo(saldo);
	}

}