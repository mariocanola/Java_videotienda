package uniandes.cupi2.videotienda.mundo;

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
		String cedula = laCedula;
		String nombre = elNombre;
		String direccion = laDireccion;
	}
	
	public String darCedula()
	{
		return cedula;
	}
	
	public int darSaldo()
	{
		return saldo;
	}
	
	public String darNombre()
	{
		return nombre;
	}
	
	public String darDireccion() 
	{
		return direccion; 
	}
	
	public void alquilarCopia(Copia copia)
	{
		
	}
	
	public void cargarSaldo(int monto)
	{
		
	}
	
	public void descargarSaldo(int monto)
	{
		
	}
	
	public int darNumeroAlquiladas()
	{
		
	}
	
	public ArrayList darAlquiladas()
	{
		
	}
	
	public Copia buscarPeliculaAlquilada(String pelicula, int codigo)
	{
		
	}
	
	public void devolverCopia(String pelicula, int codigo)
	{
		
	}
}
