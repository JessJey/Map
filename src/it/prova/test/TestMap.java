package it.prova.test;

import java.util.HashMap;
import java.util.Map;

import it.prova.model.Indirizzo;
import it.prova.model.Persona;

public class TestMap {
public static void main(String[] args) {
	
	
	Map<Persona,Indirizzo> personeConIndirizzo = new HashMap<Persona,Indirizzo>();
	
	//inserimento
	personeConIndirizzo.put(new Persona("Mario","Rossi"),new Indirizzo("via Po",30));
	personeConIndirizzo.put(new Persona("Jessica","blu"),new Indirizzo("via Tivoli",14));
	personeConIndirizzo.put(new Persona("Anna","Verdi"),new Indirizzo("via dei laghi",80));
	
	//creazione persona e indirizzo
	Persona p1 = new Persona("Aurora","Pet");
	Indirizzo i1 = new Indirizzo("Via Sole",2);
	
	//inserimento
	personeConIndirizzo.put(p1, i1);
	
	// contains key
	System.out.println(personeConIndirizzo.containsKey(p1));
	
	//stampa mappa
	for (Map.Entry<Persona, Indirizzo> mapItem : personeConIndirizzo.entrySet()) {
		System.out.println(mapItem);
	}
	
	//stampa key = persona
	System.out.println("stampa key" +personeConIndirizzo.keySet());
	
	

	
}
}
