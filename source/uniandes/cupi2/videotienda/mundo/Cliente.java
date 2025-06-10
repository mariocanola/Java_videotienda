package uniandes.cupi2.videotienda.mundo;
import java.util.ArrayList;

/**
 * Representa un cliente de la videotienda.
 * Cada cliente tiene nombre, cédula, dirección y un saldo.
 */
public class Cliente {

	//-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
	
    /**
     * Nombre del cliente.
     */
	private String cedula; 
	

    /**
     * Cedula del cliente.
     */
	private String nombre;
	

    /**
     * Dirección del cliente.
     */
	private String direccion;
	

    /**
     * Saldo del cliente.
     */
	private int saldo;
	

    /**
     * Lista de copias alquiladas por el cliente.
     */
	private ArrayList<Copia> copiasAlquiladas;
	
	//-----------------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------------

    /**
     * Crea un nuevo cliente con los datos proporcionados.
     * @param laCedula Cédula del cliente. laCedula != null.
     * @param elNombre Nombre del cliente. elNombre != null.
     * @param laDireccion Dirección del cliente. laDireccion != null.
     */
	@SuppressWarnings("unused")
	public Cliente (String laCedula, String elNombre, String laDireccion)
	{
		this.cedula = laCedula;
		this.nombre = elNombre;
		this.direccion = laDireccion;
		this.saldo = 0;
	    this.copiasAlquiladas = new ArrayList<Copia>();	
	}
	

    //-----------------------------------------------------------------
    // M�todos
    //-----------------------------------------------------------------
	
	/**
	 * Retorna la Cedula del cliente 
	 * @return Valor de la cedula
	 */
	public String darCedula()
	{
		return cedula;
	}
	
	/**
	 * Retorna el saldo actual del cliente
	 * @return Valor de saldo
	 */
	public int darSaldo()
	{
		return saldo;
	}
	
	/**
	 * implementacion del método darNombre
	 * @return Valor de Nombre
	 */
	public String darNombre()
	{
		return nombre;
	}
	
	/**
	 * implementacion del método darSaldo
	 * @return Valor de la Dirección
	 */
	public String darDireccion() 
	{
		return direccion; 
	}
	
	/**
     * Alquila una copia de película al cliente. <br>
     * <b>pre: </b> La copia no está alquilada. <br>
     * <b>post: </b> La copia se agrega a la lista de copias alquiladas del cliente.
     * @param copia Copia a alquilar. copia != null.
     */
	public void alquilarCopia(Copia copia)
	{
		
	}
	
	/**
     * Carga saldo a la cuenta del cliente. <br>
     * <b>pre: </b> monto > 0. <br>
     * <b>post: </b> El saldo del cliente se incrementa en el monto especificado.
     * @param monto Cantidad a cargar al saldo. monto > 0.
     */
	public void cargarSaldo(int monto)
	{
		
	}
	
	/**
     * Descarga saldo de la cuenta del cliente. <br>
     * <b>pre: </b> monto > 0 y monto <= saldo. <br>
     * <b>post: </b> El saldo del cliente se reduce en el monto especificado.
     * @param monto Cantidad a descargar del saldo. monto > 0 y monto <= saldo.
     */
	public void descargarSaldo(int monto)
	{
		
	}
	
	 /**
     * Retorna el número de copias alquiladas por el cliente.
     * @return Número de copias alquiladas.
     */
	public int darNumeroAlquiladas()
	{
		
	}
	
	/**
     * Retorna la lista de copias alquiladas por el cliente.
     * @return Lista de copias alquiladas.
     */
	public ArrayList darAlquiladas()
	{
		
	}
	
	/**
     * Busca una copia específica entre las películas alquiladas por el cliente.
     * @param pelicula Título de la película a buscar. pelicula != null.
     * @param codigo Código de la copia a buscar. codigo > 0.
     * @return Copia encontrada o null si no existe.
     */
	public Copia buscarPeliculaAlquilada(String pelicula, int codigo)
	{
		
	}
	
	/**
     * Devuelve una copia alquilada por el cliente. <br>
     * <b>pre: </b> La copia está alquilada por este cliente. <br>
     * <b>post: </b> La copia se remueve de la lista de copias alquiladas.
     * @param pelicula Título de la película a devolver. pelicula != null.
     * @param codigo Código de la copia a devolver. codigo > 0.
     */x	
	public void devolverCopia(String pelicula, int codigo)
	{
		
	}
}
