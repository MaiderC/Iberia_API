import java.io.Serializable;
import java.util.ArrayList;

public class clsVuelo implements Serializable
{
	private String codVuelo;
	private clsAeropuerto aeropuertoOrigen;
	private clsAeropuerto aeropuertoDestino;
	private String fecha;
	private ArrayList<Integer> Asientos;
	private ArrayList<Integer> AsientosOcupados;
	private double precio;

	public clsVuelo() 
	{
		this.codVuelo = null;
		this.aeropuertoOrigen = null;
		this.aeropuertoDestino = null;
		this.fecha = null;
		this.Asientos = null;
		this.AsientosOcupados = null;
		this.precio = 0;
	}
	
	public clsVuelo( ArrayList<Integer> Asientos,  ArrayList<Integer> AsientosOcupados, String codVuelo, clsAeropuerto aeropuertoOrigen, clsAeropuerto aeropuertoDestino, String fecha, double precio) 
	{
		this.codVuelo = codVuelo;
		this.aeropuertoOrigen = aeropuertoOrigen;
		this.aeropuertoDestino = aeropuertoDestino;
		this.fecha = fecha;
		this.Asientos = Asientos;
		this.AsientosOcupados = AsientosOcupados;
		this.precio = precio;
	}

	public String getCodVuelo() {
		return codVuelo;
	}

	public void setCodVuelo(String codVuelo) {
		this.codVuelo = codVuelo;
	}

	public clsAeropuerto getAeropuertoOrigen() {
		return aeropuertoOrigen;
	}

	public void setAeropuertoOrigen(clsAeropuerto aeropuertoOrigen) {
		this.aeropuertoOrigen = aeropuertoOrigen;
	}

	public clsAeropuerto getAeropuertoDestino() {
		return aeropuertoDestino;
	}

	public void setAeropuertoDestino(clsAeropuerto aeropuertoDestino) {
		this.aeropuertoDestino = aeropuertoDestino;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Integer> getAsientosOcupados() {
		return AsientosOcupados;
	}

	public void setAsientosOcupados(ArrayList<Integer> asientosOcupados) {
		AsientosOcupados = asientosOcupados;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codVuelo == null) ? 0 : codVuelo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		clsVuelo other = (clsVuelo) obj;
		if (codVuelo == null) {
			if (other.codVuelo != null)
				return false;
		} else if (!codVuelo.equals(other.codVuelo))
			return false;
		return true;
	}
	
	public void addAsientoOcupado(int asiento)
	{
		AsientosOcupados.add(asiento);
	}
}
