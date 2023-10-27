import java.util.ArrayList;
import java.util.Scanner;

public class EjemploLibro {
  public static void main (String args[])
  {
	  
	  Scanner tec = new Scanner(System.in);
	  int cons = 0,op = 0;
	  int numLibro;
	  	  
	  System.out.println("\t Bienvenido");
	  System.out.println("cuantos libros desea agregar");// valido cuantos libros quiere inresar el usuario
	  cons = Integer.parseInt(tec.nextLine());
	  
	  ArrayList<Libro> lista = new ArrayList<Libro>(); //creo una lista de tipo objeto para guardar la informacion obtenida
	  Libro ejemp = new Libro();
	  
	  for(int i = 0 ; i < cons ; i++){
		  //se capturan los datos del los libros
		  int id = i + 1; //con esto le  asignaremos un id a cada libro ingresado
		  System.out.print("Ingresa el titulo del libro " + id + " :"); 
		  String titulo = tec.nextLine();
		  System.out.print("Ingresa el autor: ");
		  String autor = tec.nextLine();
		  System.out.print("Ingrese el total de ejemplares existentes: ");
		  int numEjemplares=Integer.parseInt(tec.nextLine());
		  System.out.print("Ingresa la cantidad que se ha prestado: ");
		  int numEjemPrestados = Integer.parseInt(tec.nextLine());
		  ejemp = new Libro(id,titulo,autor,numEjemplares,numEjemPrestados);//  le pasamos los argumentos al constructor
		  System.out.println("\n");
		  lista.add(ejemp);
		  
	  }
	
	  do // utilizamos el bucle do while 
	  {
		  //una vez intreducidos los libros preguntamos que desea realizar
		  System.out.println(" \n Que desea realizar. ");
		  System.out.println(" 1.- Realizar un prestamo. ");
		  System.out.println(" 2.- Realizar una devolucion. ");
		  System.out.println(" 3.- consultar los libros. ");
		  System.out.println(" 4.- salir. ");
		  op = Integer.parseInt(tec.nextLine());
		  switch(op){
		  case 1:// en este se realiza el proceso para el prestamo
			  System.out.print("Ingresa el id del libro  a prestar: ");
			  numLibro=Integer.parseInt(tec.nextLine());// capturamos el id del libro a prestar
			  for(Libro lib : lista) { // con este ciclo recorremos la lista
				    if(lib.getIdLibro() == numLibro) { // buscamos que el id coincida con el de alguno de la lista
				    	
				      	if(lib.prestamoLibro(lib.getNumEjemplares())) { //invocamos  nuestro metodo para validar si se puede realizar el prestamo
				      		System.out.println("se realiza el prestamo"); // si resulta verdadero nos mostrara esto en pantalla
				      		
				   		    lib.setNumEjemplares(lib.getNumEjemplares()- 1 ) ;//actualizamos el valor del atributo
				   		    lib.setNumEjemPrestados(lib.getNumEjemPrestados() + 1);//actualizamos el valor del atributo
				   		 
				      		
				      	}else //si el resultado del metodo el falso  
				      	 {
				      		System.out.println("no es posible realizar el prestamo sin libros disponibles");//mostramos esto en pantalla
				      	 }
				    	
				    	
				    }
			  }
			break;
		  case 2: //para realizar la devolucion de un lbro
			  
			  System.out.print("Ingresa el id del libro a devolver: ");
			  numLibro=Integer.parseInt(tec.nextLine()); //le asigno el id que desean devolver
			  for(Libro prac : lista) {//recorre toda la lista
				  
				 if(prac.getIdLibro() == numLibro) { // buscamos que el id coincida con el de alguno de la lista
				 
					 if(prac.devolucionLibro(prac.getNumEjemPrestados())) {//invocamos  nuestro metodo para validar si se puede realizar la devolucion.
			      		System.out.println("se realiza la devolucion");//si resulta verdadero nos mostrara esto en pantalla
			      		
			   		    prac.setNumEjemPrestados(prac.getNumEjemPrestados() - 1);//actualizamos el valor del atributo
			   		    prac.setNumEjemplares(prac.getNumEjemplares() + 1 );//actualizamos el valor del atributo
			      		
			      	}else // si el resultado del metodo es falso  
			      	 {
			      		System.out.println(" sin libros que devolver");//mostramos esto en pantalla
			      	 }
				 }	 
			  }
			break;
		  case 3:
			  for (Libro obj : lista) { // recorremos toda la lista
		            System.out.println(obj); //mostramos todos los objetos que contienen la lista
		        }
			  break;
		  case 4:
			  break;
		  default:
			  System.out.println("ingresa solo numeros del 1 al 4");
		  }
		  
	  }while(op != 4);
	  
  }
}
