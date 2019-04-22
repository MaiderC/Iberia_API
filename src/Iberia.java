import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import java.util.HashSet;


public class Iberia extends UnicastRemoteObject implements itfCargaVuelos
{
	private HashSet <clsVuelo>  ListaVuelos= new HashSet <clsVuelo>();
	
	public Iberia() throws RemoteException 
	{
		super();
		//En el constructor, creamos todos los vuelos:
				String codVuelo;
				clsAeropuerto aeropuertoOrigen;
				clsAeropuerto aeropuertoDestino;
				Date fecha;
				int numAsientos;
				double precio;
				
				clsVuelo  nuevoVuelo;
		        //Vuelo 1 ( BARCELONA - BERLIN ):
				codVuelo = "IB0001";
				aeropuertoOrigen = new clsAeropuerto("BARC", "Barcelona", "Espa�a");
				aeropuertoDestino = new clsAeropuerto("BER", "Berlin", "Alemania");
				fecha = new Date(30, 05, 2019 );
				numAsientos = 120;
				precio = 180.90;
				nuevoVuelo = new clsVuelo(codVuelo, aeropuertoOrigen, aeropuertoDestino, fecha, numAsientos, precio);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 2 (lo mismo pero en distita fecha con distinto precio:
				nuevoVuelo.setCodVuelo("IB0002");
				nuevoVuelo.setFecha(new Date(23, 05, 2019 ));
				nuevoVuelo.setPrecio(230.15);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo3:
				nuevoVuelo.setCodVuelo("IB0003");
				nuevoVuelo.setFecha(new Date(1, 06, 2019 ));
				nuevoVuelo.setPrecio(79.89);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 4 ( BERLIN - BARCELONA ):
				codVuelo = "IB0004";
				aeropuertoDestino = new clsAeropuerto("BARC", "Barcelona", "Espa�a");
				aeropuertoOrigen = new clsAeropuerto("BER", "Berlin", "Alemania");
				fecha = new Date(13, 06, 2019 );
				numAsientos = 120;
				precio = 180.90;
				nuevoVuelo = new clsVuelo(codVuelo, aeropuertoOrigen, aeropuertoDestino, fecha, numAsientos, precio);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 5 (lo mismo pero en distita fecha con distinto precio:
				nuevoVuelo.setCodVuelo("IB0005");
				nuevoVuelo.setFecha(new Date(2, 05, 2019 ));
				nuevoVuelo.setPrecio(230.15);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo6:
				nuevoVuelo.setCodVuelo("IB0006");
				nuevoVuelo.setFecha(new Date(10, 05, 2019 ));
				nuevoVuelo.setPrecio(79.89);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 7 ( MADRID - DUBLIN )
				codVuelo = "IB0007";
				aeropuertoOrigen = new clsAeropuerto("MAD", "Madrir", "Espa�a");
				aeropuertoDestino = new clsAeropuerto("DUB", "Dublin", "Irlanda");
				fecha = new Date(23, 05, 2019);
				numAsientos = 120;
				precio = 180.90;
				nuevoVuelo = new clsVuelo(codVuelo, aeropuertoOrigen, aeropuertoDestino, fecha, numAsientos, precio);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 8 (lo mismo pero en distita fecha con distinto precio:
				nuevoVuelo.setCodVuelo("IB0008");
				nuevoVuelo.setFecha(new Date(30, 05, 2019 ));
				nuevoVuelo.setPrecio(230.15);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo 9:
				nuevoVuelo.setCodVuelo("IB0009");
				nuevoVuelo.setFecha(new Date(13, 05, 2019 ));
				nuevoVuelo.setPrecio(79.89);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 10 ( DUBLIN - MADRID)
				codVuelo = "IB0010";
				aeropuertoDestino = new clsAeropuerto("MAD", "Madrir", "Espa�a");
				aeropuertoOrigen = new clsAeropuerto("DUB", "Dublin", "Irlanda");
				fecha = new Date(13, 06, 2019 );
				numAsientos = 120;
				precio = 180.90;
				nuevoVuelo = new clsVuelo(codVuelo, aeropuertoOrigen, aeropuertoDestino, fecha, numAsientos, precio);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 11 (lo mismo pero en distita fecha con distinto precio:
				nuevoVuelo.setCodVuelo("IB0011");
				nuevoVuelo.setFecha(new Date(27, 06, 2019 ));
				nuevoVuelo.setPrecio(230.15);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo 12:
				nuevoVuelo.setCodVuelo("IB0012");
				nuevoVuelo.setFecha(new Date(17, 06, 2019 ));
				nuevoVuelo.setPrecio(79.89);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 13 ( ATENAS - TOKIO ):
				codVuelo = "IB0013";
				aeropuertoOrigen = new clsAeropuerto("ATE", "Atenas", "Grecia");
				aeropuertoDestino = new clsAeropuerto("TOK", "Tokio", "Jap�n");
				fecha = new Date(9, 05, 2019 );
				numAsientos = 120;
				precio = 180.90;
				nuevoVuelo = new clsVuelo(codVuelo, aeropuertoOrigen, aeropuertoDestino, fecha, numAsientos, precio);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo 14 (lo mismo pero en distita fecha con distinto precio:
				nuevoVuelo.setCodVuelo("IB0014");
				nuevoVuelo.setFecha(new Date(2, 05, 2019 ));
				nuevoVuelo.setPrecio(230.15);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo 15:
				nuevoVuelo.setCodVuelo("IB0015");
				nuevoVuelo.setFecha(new Date(13, 06, 2019 ));
				nuevoVuelo.setPrecio(79.89);
				ListaVuelos.add(nuevoVuelo);
	}			

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public HashSet<clsVuelo> cargarIda(String aeroOrigen, String ciudadDestino, Date fecha) 
	{
		HashSet<clsVuelo>  retorno = new HashSet<>();
		
		for(clsVuelo a : ListaVuelos)
		{
			if( (a.getAeropuertoOrigen().getCiudad()).equals(aeroOrigen) && (a.getAeropuertoDestino().getCiudad()).equals(ciudadDestino)  && (a.getFecha())==fecha)
			{
				retorno.add(a);
			}
		}
		
		return retorno;
	}

	@Override
	public HashSet<clsVuelo> cargarIdaVuelta(String ciudadOrigen, String ciudadDestino, Date fechaIda,
			Date fechaVuelta) 
	{
		HashSet<clsVuelo>  retorno = new HashSet<>();
		
		for(clsVuelo a : ListaVuelos)
		{
			//Comprobaci�n de la IDA --> s�l comprobamos la vuelta si se cumple la ida
			if( (a.getAeropuertoOrigen().getCiudad()).equals(ciudadOrigen) && (a.getAeropuertoDestino().getCiudad()).equals(ciudadDestino)  && (a.getFecha())==fechaIda)
			{
				if( (a.getAeropuertoOrigen().getCiudad()).equals(ciudadDestino) && (a.getAeropuertoDestino().getCiudad()).equals(ciudadOrigen)  && (a.getFecha())==fechaVuelta)
				{
					retorno.add(a);
				}
			}
		}
		
		return retorno;
	}

	@Override
	public HashSet<clsVuelo> cargarCualquierMomento(String ciudadOrigen, String ciudadDestino) {
		HashSet<clsVuelo>  retorno = new HashSet<>();
		
		for(clsVuelo a : ListaVuelos)
		{
			if( (a.getAeropuertoOrigen().getCiudad()).equals(ciudadOrigen) && (a.getAeropuertoDestino().getCiudad()).equals(ciudadDestino))
			{
				retorno.add(a);
			}
		}
		
		return retorno;
	}

}
