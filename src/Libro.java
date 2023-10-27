	public class Libro {
	
  private String tituloLibro;
  private String autor;
  private int numEjemplares;
  private int numEjemPrestados;
  private int idLibro = 0;
 
   
  // declaracion de constructores
  public Libro() {    //constructor vacio
	                         
  }
  public Libro(int idLibro, String tituloLibro, String autor, int numEjemplares, int numEjemPrestamos) {    // constructor con parametros
	  this.idLibro = idLibro;
	  this.tituloLibro = tituloLibro;
	  this.autor = autor;
	  this.numEjemplares = numEjemplares;
	  this.numEjemPrestados = numEjemPrestamos;
  }
   
  
   public int getIdLibro() {
	return idLibro;
}
public void setIdLibro(int idLibro) {
	this.idLibro = idLibro;
}
public String getTituloLibro() {
	return tituloLibro;
}



public void setTituloLibro(String tituloLibro) {
	this.tituloLibro = tituloLibro;
}



public String getAutor() {
	return autor;
}



public void setAutor(String autor) {
	this.autor = autor;
}



public int getNumEjemplares() {
	return numEjemplares;
}



public void setNumEjemplares(int numEjemplares) {
	 this.numEjemplares = numEjemplares;
}



public int getNumEjemPrestados() {
	return numEjemPrestados;
}



public void setNumEjemPrestados(int numEjemPrestados) {
	this.numEjemPrestados = numEjemPrestados;
}

public  boolean prestamoLibro(int numEjemplares) {
	return  numEjemplares > 0;
			
}
public boolean devolucionLibro(int numEjemPrestados) {
	return getNumEjemPrestados() > 0;
}

@Override
public String toString() {
	return "Libro " + "\n\t idLibro= "+ idLibro  + 
			"\n\t tituloLibro= " + tituloLibro + 
			"\n\t autor= " + autor + 
			"\n\t numEjemplares= " + numEjemplares +
			"\n\t numEjemPrestados= " + numEjemPrestados + "]";
}


   
}
