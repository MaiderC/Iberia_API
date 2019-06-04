package COMUN;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import APIs.itfCargaVuelosIberia;



public class Iberia extends UnicastRemoteObject implements itfCargaVuelosIberia
{
	private ArrayList<String>  ListaVuelos= new ArrayList<String>();	
	
	public ArrayList<String> getListaVuelos() {
		return ListaVuelos;
	}

	public void setListaVuelos(ArrayList<String> listaVuelos) {
		ListaVuelos = listaVuelos;
	}
	
	public Iberia() throws RemoteException 
	{
		super();
		//En el constructor, creamos todos los vuelos:
				
		        //( BARCELONA - BERLIN )
				ListaVuelos.add("IB0001;Barcelona;Berlin;30/05/2019;180.90;120");
				ListaVuelos.add("IB0002;Barcelona;Berlin;23/05/2019;230.15;120");
				ListaVuelos.add("IB0002;Barcelona;Berlin;01/06/2019;79.79;120");
				
				//( BERLIN - BARCELONA )
				ListaVuelos.add("IB0004;Berlin;Barcelona;13/06/2019;180.90;120");
				ListaVuelos.add("IB0005;Berlin;Barcelona;02/05/2019;230.15;120");
				ListaVuelos.add("IB0006;Berlin;Barcelona;10/05/2019;79.89;120");
				
				//( MADRID - DUBLIN )
				ListaVuelos.add("IB0007;Madrid;Dublin;23/05/2019;180.90;120");
				ListaVuelos.add("IB0008;Madrid;Dublin;30/05/2019;230.15;120");
				ListaVuelos.add("IB0009;Madrid;Dublin;13/05/2019;79.89;120");
				
				//( DUBLIN - MADRID)
				ListaVuelos.add("IB0010;Dublin;Madrid;13/06/2019;180.90;120");
				ListaVuelos.add("IB0011;Dublin;Madrid;27/06/2019;230.15;120");
				ListaVuelos.add("IB0012;Dublin;Madrid;17/06/2019;79.89;120");
				
				//( ATENAS - TOKIO )
				ListaVuelos.add("IB0013;Atenas;Tokio;09/05/2019;180.90;120");
				ListaVuelos.add("IB0014;Atenas;Tokio;02/05/2019;230.15;120");
				ListaVuelos.add("IB0015;Atenas;Tokio;13/06/2019;79.89;120");
				
				//( TOKIO - ATENAS )
				ListaVuelos.add("IB0016;Tokio;Atenas;13/06/2019;180.90;120");
				ListaVuelos.add("IB0017;Tokio;Atenas;27/06/2019;230.15;120");
				ListaVuelos.add("IB0018;Tokio;Atenas;17/06/2019;79.89;120");
	}			
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ArrayList<String> cargarIda(String ciudadOrigen, String ciudadDestino, String fecha)  throws RemoteException
	{
		ArrayList<String> retorno = new ArrayList<String>();
		String[] vueloToken;
		
		for(String aux: ListaVuelos)
		{
			vueloToken = aux.split(";");
			
			if(vueloToken[1].equals(ciudadOrigen) && vueloToken[2].equals(ciudadDestino) && vueloToken[3].equals(fecha))
			{
				retorno.add(aux);
			}
		}
		
		return retorno;
	}

	@Override
	public ArrayList<String> cargarIdaVuelta(String ciudadOrigen, String ciudadDestino, String fechaIda, String fechaVuelta)  throws RemoteException
	{
		ArrayList<String> retorno = new ArrayList<String>();
		String[] vueloToken;
		
		for(String aux: ListaVuelos)
		{
			vueloToken = aux.split(";");
			
			if(vueloToken[1].equals(ciudadOrigen) && vueloToken[2].equals(ciudadDestino) && vueloToken[3].equals(fechaIda))
			{
				retorno.add(aux);
			}
			
			if(vueloToken[1].equals(ciudadDestino) && vueloToken[2].equals(ciudadOrigen) && vueloToken[3].equals(fechaVuelta))
			{
				retorno.add(aux);
			}
		}
		
		return retorno;
	}

	@Override
	public ArrayList<String> cargarCualquierMomento(String ciudadOrigen, String ciudadDestino) throws RemoteException 
	{
		ArrayList<String> retorno = new ArrayList<String>();
		String[] vueloToken;
		
		for(String aux: ListaVuelos)
		{
			vueloToken = aux.split(";");
			
			if(vueloToken[1].equals(ciudadOrigen) && vueloToken[2].equals(ciudadDestino))
			{
				retorno.add(aux);
			}
		}
		
		return retorno;
	}

	@Override
	public ArrayList<String> cargarTodos()  throws RemoteException
	{
		return ListaVuelos;
	}
}
