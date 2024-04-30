package cuenta;

public class Cuenta {
	
	private String iban;
	private String cliente;
	private double cantidad;
	private String estado;
	/**
	 * 
	 * @param iban Codigo del banco
	 * @param cliente Nombre del cliente
	 * @param cantidad Cantidad de dinero
	 * @param estado Estado del banco en activo
	 */
	public Cuenta(String iban, String cliente, double cantidad, String estado) {
		super();
		this.iban = iban;
		this.cliente = cliente;
		this.cantidad = cantidad;
		this.estado = "activo";
	}
	

}
