
import java.rmi.Remote;
import java.util.ArrayList;

public interface itfCargaVuelosIberia extends Remote
{
	ArrayList<clsVuelo> cargarIda(String aeroOrigen, String ciudadDestino, String fecha);
	ArrayList <clsVuelo> cargarIdaVuelta(String ciudadOrigen, String ciudadDestino, String fechaIda,String fechaVuelta);
	ArrayList <clsVuelo> cargarCualquierMomento(String ciudadoOrigen, String ciudadDestino);
}
