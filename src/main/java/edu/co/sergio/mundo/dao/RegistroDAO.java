package edu.co.sergio.mundo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import edu.co.sergio.mundo.vo.Registro;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Isabel-Fabian
 * @since 12/08/2015
 * @version 2
 * Clase que permite la gestion de la tabla Depto en la base de datos.
 * 
 * CREATE TABLE Depto(
 *     id_depto integer,
 *     nom_depto varchar(40),
 *     PRIMARY KEY(id_depto)
 * );
 */
 

public class RegistroDAO     {

      
	public List<Registro> findAll() {
           
        Registro registros= new Registro();
		List<Registro> Registro= null;
	    String query = "SELECT * FROM Registro";
	    Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    int id =0;
	    String nombre = null;
	
	    while (rs.next()){
                Object registro = null;
	    	if(registro == null){
	    		registro= new ArrayList<Registro>();
	    	}
	      
	        
	        id = rs.getInt("idColmena ");
	        registros.se(id);
	        
	        
	        
	        registros.add(registro);
	    }
	    st.close();
	    
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener la lista de Registros");
			e.printStackTrace();
		}
	    
	    return registros;
	}
}

	
	