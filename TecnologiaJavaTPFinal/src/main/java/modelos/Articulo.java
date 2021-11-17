package modelos;

public class Articulo {
	private String nombre;
	private int stock, codigo;
	private double PrecioIVA,PrecioSinIVA,CostoIVA,CostoSinIVA;
	
	public static Articulo instance;
	
	public static Articulo getInstance(){
		if (instance == null) {
			instance = new Articulo();
		}
		return instance;
		
	}
	private Articulo() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrecioIVA() {
		return PrecioIVA;
	}
	public void setPrecioIVA(double precioIVA) {
		PrecioIVA = precioIVA;
	}
	public double getPrecioSinIVA() {
		return PrecioSinIVA;
	}
	public void setPrecioSinIVA(double precioSinIVA) {
		PrecioSinIVA = precioSinIVA;
	}
	public double getCostoIVA() {
		return CostoIVA;
	}
	public void setCostoIVA(double costoIVA) {
		CostoIVA = costoIVA;
	}
	public double getCostoSinIVA() {
		return CostoSinIVA;
	}
	public void setCostoSinIVA(double costoSinIVA) {
		CostoSinIVA = costoSinIVA;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	 
}
