package MíticoSC;

public class CCuenta {

	private String nombre;

	private String cuenta;

	private double saldo;

	private double tipoInteres;

	public CCuenta() {
	}

	public CCuenta(String nom, String cue, double sal, double tipo)

	{

		this.nombre = nom;

		this.cuenta = cue;

		this.saldo = sal;

		this.tipoInteres = tipo;

	}

	public void asignarNombre(String nom)

	{

		setNombre(nom);

	}

	public String obtenerNombre()

	{

		return getNombre();

	}

	public double estado()

	{

		return getSaldo();

	}

	public void ingresar(double cantidad) throws Exception

	{

		if (cantidad < 0)

			throw new Exception("No se puede ingresar una cantidad negativa");

		saldo = saldo + cantidad;

	}

	public void retirar(double cantidad) throws Exception

	{

		if (cantidad <= 0)

			throw new Exception("No se puede retirar una cantidad negativa");

		if (estado() < cantidad)

			throw new Exception("No se hay suficiente saldo");

		saldo = saldo - cantidad;

	}

	public String obtenerCuenta()

	{

		return getCuenta();

	}

	public String getNombre() {

		return nombre;

	}

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public double getTipoInteres() {

		return tipoInteres;

	}

	public double tipoInteres() {

		return getTipoInteres();

	}

	public void setTipoInteres(double tipoInteres) {

		this.tipoInteres = tipoInteres;

	}

	public void cambiarTipoInteres(double tipoInteres) {

		setTipoInteres(tipoInteres);

	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public void cambiarCuenta(String cuenta) {
		setCuenta(cuenta);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void cambiarSaldo(double saldo) {
		setSaldo(saldo);
	}

}