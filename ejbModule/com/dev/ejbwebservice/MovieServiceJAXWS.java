package com.dev.ejbwebservice;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Session Bean implementation class MovieServiceJAXWS
 */
@Stateless
@LocalBean
@WebService
public class MovieServiceJAXWS {

	@EJB
	MovieData moviedata;
	
	
    /**
     * Default constructor. 
     */
    public MovieServiceJAXWS() {
        // TODO Auto-generated constructor stub
    }

    @WebMethod(operationName="getMovie")
    @WebResult(name = "returnMovie")
    public Movie getmovie(@WebParam(name = "id") int id){
    	return moviedata.getMovie(id);
    }
 
    @WebMethod(operationName="getMovies")
    @WebResult(name = "returnMovies")
    public List<Movie> getmovies(){
    	return moviedata.getMovies();
    }
    
}
