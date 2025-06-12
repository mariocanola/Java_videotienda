package uniandes.cupi2.videotienda.mundo;

/**
 * Representa una copia específica de una película en la videotienda.
 * Cada copia tiene un código único y pertenece a una película determinada.
 */
public class Copia {
	
	//-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------
	
	/**
     * Titulo de la pelicula.
     */
	private String tituloPelicula;
	
	/**
     * Codigo de la pelicula
     */
	private int codigo;
	
	/**
     * Crea una copia con película y código dados.
     * @param laPelicula Película a la que pertenece.
     * @param elCodigo Código de la copia.
	 * @param elcodigo 
     */
	public Copia (String laPelicula, int elCodigo)
	{ 
		if (tituloPelicula == null || tituloPelicula.trim().isEmpty()) {
            throw new IllegalArgumentException("El t�tulo no puede ser null o vac�o");
        }
        if (codigo <= 0) {
            throw new IllegalArgumentException("El c�digo debe ser positivo");
        }
        
        tituloPelicula = laPelicula.trim();
        codigo = elCodigo;
	}
	
	 /**
     * Retorna el código de la copia.
     * @return Código de la copia.
     */
	public int darCodigo()
	{
		return codigo;
	}
	
	/**
     * Retorna el título de la película.
     * @return Título de la película.
     */
	public String darTituloPelicula()
	{
		return tituloPelicula;
	}

	/**
     * Compara si esta copia es igual a otra.
     * @param otra Copia a comparar.
     * @return true si son iguales, false en caso contrario.
     */
	public boolean esIgualA(Copia otra)
	{
		return codigo == otra.codigo && tituloPelicula.equals(otra.tituloPelicula);
	}
}
