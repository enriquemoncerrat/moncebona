package DAO.Interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Modelo.Cliente;

public interface ClienteDAO {

	public Cliente getCliente(int clie_id);
	
	public Cliente buscarCliente(String search);

	public ArrayList<Cliente> getClientes();

	public boolean addCliente(Cliente cli) throws FileNotFoundException, IOException;

	public boolean removeCliente(int clie_id);

	public boolean modifyCliente(Cliente cli);
	
	public int getTotalCount();

	List<Cliente> getAllCliente() throws FileNotFoundException, IOException;

}

