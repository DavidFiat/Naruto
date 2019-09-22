package model;
//import java.util.*;

public class Clan {

	private String name;
	private Personage firstPersonage;

	public Clan(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Personage getFirstPersonage() {
		return firstPersonage;
	}

	public void setFirstPersonage(Personage firstPersonage) {
		this.firstPersonage = firstPersonage;
	}

	public int compareByName(Clan p) {
		return name.compareTo(p.getName());
	}
	//By bubble
	public void sortPersonageByScore() {

	     Personage aux2 = firstPersonage;
	     Personage aux1 = firstPersonage.getNext();
         while(aux1!=null){
        	 
             aux1 = aux1.getNext();
             aux2 = aux2.getNext();
         }

				}
			}
		}

	}
	
	//Clase Lista:

	// class Lista {
		   
	//	    Nodo tope;

	//	    public Lista() {
	//	        tope = null;
	//	    }      
		   
		    boolean Vacia(){
		        return tope==null;
		    }
		   
		    void Ingresar(Nodo temp){
		        if(Vacia()){
		            tope = temp;
		        }else{
		       
		        }
		    }
		}
	
}
