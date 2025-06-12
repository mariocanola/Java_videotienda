package uniandes.cupi2.videotienda.mundo;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Representa un cliente de la videotienda.
 * Cada cliente tiene nombre, cédula, dirección y un saldo.
 */
public class Cliente {

	//-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
	
    /**
     * Cedula del cliente.
     */
	private String cedula; 
	

    /**
     * Nombre del cliente.
     */
	private String nombre;
	

    /**
     * Direccion del cliente.
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

    public Cliente (String laCedula, String elNombre, String laDireccion)
	{
		cedula = laCedula;
		nombre = elNombre;
		direccion = laDireccion;
		saldo = 0;
	    copiasAlquiladas = new ArrayList<Copia>();	
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
	
	public void alquilarCopia()
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
		 if (monto <= 0) {
	            throw new IllegalArgumentException("El monto debe ser positivo");
	        }
	        saldo += monto;
	}
	
	/**
     * Descarga saldo de la cuenta del cliente. <br>
     * <b>pre: </b> monto > 0 y monto <= saldo. <br>
     * <b>post: </b> El saldo del cliente se reduce en el monto especificado.
     * @param monto Cantidad a descargar del saldo. monto > 0 y monto <= saldo.
     */
	public void descargarSaldo(int monto)
	{
		if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        if (monto > saldo) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        saldo -= monto;
	}
	
	/**
     * Retorna la lista de copias alquiladas por el cliente.
     * @return Lista de copias alquiladas.
     */
	public ArrayList<Copia> darAlquiladas()
	{
		 return copiasAlquiladas;
	}
	
	public int darNumeroAlquiladas()
	{
		 
	}
	/**
     * Busca una copia específica entre las películas alquiladas por el cliente.
     * @param pelicula Título de la película a buscar. pelicula != null.
     * @param codigo Código de la copia a buscar. codigo > 0.
     * @return Copia encontrada o null si no existe.
     */
	 public Copia buscarPeliculaAlquilada(String titulo, int codigo) {
	        Objects.requireNonNull(titulo, "El t�tulo no puede ser null");
	        return copiasAlquiladas.stream()
	            .filter(copia -> copia.darCodigo() == codigo && 
	                           copia.darTituloPelicula().equals(titulo))
	            .findFirst()
	            .orElse(null);
	    }
	 
	 public void devolverCopia(String pelicula, int codigo)
	 {
		 
	 }
}
