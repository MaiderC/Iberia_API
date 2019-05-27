package COMUN;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;

import APIs.itfCargaVuelosIberia;



public class Iberia extends UnicastRemoteObject implements itfCargaVuelosIberia
{
	private ArrayList <clsVuelo>  ListaVuelos= new ArrayList <clsVuelo>();	
	
	public ArrayList<clsVuelo> getListaVuelos() {
		return ListaVuelos;
	}

	public void setListaVuelos(ArrayList<clsVuelo> listaVuelos) {
		ListaVuelos = listaVuelos;
	}
	
	public Iberia() throws RemoteException 
	{
		super();
		//En el constructor, creamos todos los vuelos:
				String codVuelo;
				clsAeropuerto aeropuertoOrigen;
				clsAeropuerto aeropuertoDestino;
				String fecha;
				int numAsientos;
				double precio;
				ArrayList<Integer> Asientos;
				ArrayList<Integer> AsientosOcupados;
				
				clsVuelo  nuevoVuelo;
		        //Vuelo 1 ( BARCELONA - BERLIN ):
				codVuelo = "IB0001";
				aeropuertoOrigen = new clsAeropuerto("BARC", "Barcelona", "España");
				aeropuertoDestino = new clsAeropuerto("BER", "Berlin", "Alemania");
				fecha = "30/05/2019";
				numAsientos = 120;
				precio = 180.90;
				Asientos= new ArrayList<Integer>();
				for(int i=0; i<numAsientos; i++)
				{
					Asientos.add(i);
				}
				AsientosOcupados = new ArrayList<Integer>();
								
				nuevoVuelo = new clsVuelo(Asientos,AsientosOcupados,codVuelo,aeropuertoOrigen,aeropuertoDestino, fecha, precio);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 2 (lo mismo pero en distita fecha con distinto precio:
				nuevoVuelo.setCodVuelo("IB0002");
				nuevoVuelo.setFecha("23/05/2019");
				nuevoVuelo.setPrecio(230.15);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo3:
				nuevoVuelo.setCodVuelo("IB0003");
				nuevoVuelo.setFecha("01/06/2019");
				nuevoVuelo.setPrecio(79.89);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 4 ( BERLIN - BARCELONA ):
				codVuelo = "IB0004";
				aeropuertoDestino = new clsAeropuerto("BARC", "Barcelona", "España");
				aeropuertoOrigen = new clsAeropuerto("BER", "Berlin", "Alemania");
				fecha = "13/06/2019";
				numAsientos = 120;
				precio = 180.90;
				nuevoVuelo = new clsVuelo(Asientos,AsientosOcupados,codVuelo,aeropuertoOrigen,aeropuertoDestino, fecha, precio);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 5 (lo mismo pero en distita fecha con distinto precio:
				nuevoVuelo.setCodVuelo("IB0005");
				nuevoVuelo.setFecha("02/05/2019");
				nuevoVuelo.setPrecio(230.15);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo6:
				nuevoVuelo.setCodVuelo("IB0006");
				nuevoVuelo.setFecha("10/05/2019");
				nuevoVuelo.setPrecio(79.89);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 7 ( MADRID - DUBLIN )
				codVuelo = "IB0007";
				aeropuertoOrigen = new clsAeropuerto("MAD", "Madrir", "España");
				aeropuertoDestino = new clsAeropuerto("DUB", "Dublin", "Irlanda");
				fecha = "23/05/2019";
				numAsientos = 120;
				precio = 180.90;
				nuevoVuelo = new clsVuelo(Asientos,AsientosOcupados,codVuelo,aeropuertoOrigen,aeropuertoDestino, fecha, precio);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 8 (lo mismo pero en distita fecha con distinto precio:
				nuevoVuelo.setCodVuelo("IB0008");
				nuevoVuelo.setFecha("30/05/2019");
				nuevoVuelo.setPrecio(230.15);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo 9:
				nuevoVuelo.setCodVuelo("IB0009");
				nuevoVuelo.setFecha("13/05/2019");
				nuevoVuelo.setPrecio(79.89);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 10 ( DUBLIN - MADRID)
				codVuelo = "IB0010";
				aeropuertoDestino = new clsAeropuerto("MAD", "Madrir", "España");
				aeropuertoOrigen = new clsAeropuerto("DUB", "Dublin", "Irlanda");
				fecha = "13/06/2019";
				numAsientos = 120;
				precio = 180.90;
				nuevoVuelo = new clsVuelo(Asientos,AsientosOcupados,codVuelo,aeropuertoOrigen,aeropuertoDestino, fecha, precio);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 11 (lo mismo pero en distita fecha con distinto precio:
				nuevoVuelo.setCodVuelo("IB0011");
				nuevoVuelo.setFecha("27/06/2019");
				nuevoVuelo.setPrecio(230.15);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo 12:
				nuevoVuelo.setCodVuelo("IB0012");
				nuevoVuelo.setFecha("17/06/2019");
				nuevoVuelo.setPrecio(79.89);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 13 ( ATENAS - TOKIO ):
				codVuelo = "IB0013";
				aeropuertoOrigen = new clsAeropuerto("ATE", "Atenas", "Grecia");
				aeropuertoDestino = new clsAeropuerto("TOK", "Tokio", "Japón");
				fecha = "09/05/2019";
				numAsientos = 120;
				precio = 180.90;
				nuevoVuelo = new clsVuelo(Asientos,AsientosOcupados,codVuelo,aeropuertoOrigen,aeropuertoDestino, fecha, precio);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo 14 (lo mismo pero en distita fecha con distinto precio:
				nuevoVuelo.setCodVuelo("IB0014");
				nuevoVuelo.setFecha("02/05/2019");
				nuevoVuelo.setPrecio(230.15);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo 15:
				nuevoVuelo.setCodVuelo("IB0015");
				nuevoVuelo.setFecha("13/06/2019");
				nuevoVuelo.setPrecio(79.89);
				ListaVuelos.add(nuevoVuelo);
				
			
	}			

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ArrayList<clsVuelo> cargarIda(String aeroOrigen, String ciudadDestino, String fecha)  throws RemoteException
	{
		ArrayList<clsVuelo> retorno = new ArrayList<clsVuelo>();
		
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
	public ArrayList<clsVuelo> cargarIdaVuelta(String ciudadOrigen, String ciudadDestino, String fechaIda, String fechaVuelta)  throws RemoteException
	{
		ArrayList<clsVuelo>  retorno = new ArrayList<clsVuelo>();
		
		for(clsVuelo a : ListaVuelos)
		{
			//Comprobación de la IDA --> sól comprobamos la vuelta si se cumple la ida
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
	public ArrayList<clsVuelo> cargarCualquierMomento(String ciudadOrigen, String ciudadDestino) throws RemoteException 
	{
		ArrayList<clsVuelo>  retorno = new ArrayList<clsVuelo>();
		
		for(clsVuelo a : ListaVuelos)
		{
			if( (a.getAeropuertoOrigen().getCiudad()).equals(ciudadOrigen) && (a.getAeropuertoDestino().getCiudad()).equals(ciudadDestino))
			{
				retorno.add(a);
			}
		}
		
		return retorno;
	}

	@Override
	public ArrayList<clsVuelo> cargarTodos()  throws RemoteException
	{
		return ListaVuelos;
	}

}
