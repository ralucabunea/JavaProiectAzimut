package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


// cand ai o insirare de nume aceasta este o multime :[ alex, irina. raluca, bogdan] alex=index 0
// progr nu recunoaste numele de ex ANA
// fiecare nume este un INDEX=1, INDEX=1 etc la fiecare nume
//Array= toate elem sunt de acelasi fel, cu paranteze drepte mereu; array si lista cere doar 1 singur element
//List= nu imi bat capul cu pozitii,e mai ok
//Hashmap= are 2 categorii , de e x FRUCT=MAR, HAINA=PANTALON, LEGUMA=CARTOF, HASHMAP=KEY VALUE

 public class Obiect {
     @Test
     public void Obiect() {
         //PrintNumeArray();
         //PrintNumeLista();
         //PrintValoriHashmap();
         //TariOrase();
         ReteteSiIngrediente();
     }


     //Printam toate valorile dintr-un ARRAY
     public void PrintNumeArray() {
         String[] Sir = new String[4];
         //ai un sir care poate sa contina maxim 5 caractere printre care se aduna si zero
         Sir[0] = "Ana";
         Sir[1] = "Alex";
         Sir[2] = "Bogdan";
         Sir[3] = "Rares";

         for (Integer index = 0; index < Sir.length; index++) {
             System.out.println(Sir[index]);
         }
         //mereu pui sir . length ca sa nu mai modifici dupa orice ai pune sus la STRING

     }


     //Printam nume lista
     //am defenit o lista de stringuri goala ca si cum ai avea [alex, ioana , rares etc]dar e goala
     //pas 2 iti scri lista cu nume mereu cu lista.add string e apare automat

     public void PrintNumeLista() {
         List<String> Lista = new ArrayList<>();
         Lista.add("Ana");
         Lista.add("Alex");
         Lista.add("Bogdan");
         Lista.add("Rares");
         for (Integer index = 0; index < Lista.size(); index++) {
             System.out.println(Lista.get(index));
         }

     }


     //Printeaza valori diferite dintr-o multime
     public void PrintValoriHashmap() {
         HashMap<String, String> HHBB = new HashMap<>();
         HHBB.put("Fruct", " Mar");
         HHBB.put("Haina", " Pantalon");
         HHBB.put("Leguma", " Cartof");
         for (String key : HHBB.keySet()) {
             System.out.println(" Cheia este " + key);
             System.out.println(" Valoarea este " + HHBB.get(key));
         }
     }


     //Printam Tari si Orase
     public void TariOrase() {
         List<String> OraseRomania = new ArrayList<>();
         OraseRomania.add(" Dej");
         OraseRomania.add(" Gherla");
         OraseRomania.add(" Cluj");
         List<String> OraseItalia = new ArrayList<>();
         OraseItalia.add(" Roma ");
         OraseItalia.add(" Torino ");
         List<String> OraseSpania = new ArrayList<>();
         OraseSpania.add(" Barcelona ");
         OraseSpania.add(" Madrid ");
         OraseSpania.add(" Valencia ");
         OraseSpania.add(" Malaga ");

         HashMap<String, List<String>> HMAP = new HashMap<>();
         HMAP.put(" Romania ", OraseRomania);
         HMAP.put(" Italia", OraseItalia);
         HMAP.put(" Spania ", OraseSpania);

         for (String key : HMAP.keySet()) {
             System.out.println(" Tara este " + key);
             System.out.println(" Orasele sunt " + HMAP.get(key));
         }
     }
     //TEMA 1: ALEGI 3 RETETE si faci dupa modelul de mai sus

     public void ReteteSiIngrediente() {
         List<String> Reteta1 = new ArrayList<>();
         Reteta1.add(" lapte");
         Reteta1.add(" oua");
         Reteta1.add(" sare");
         Reteta1.add(" zahar");
         Reteta1.add(" vanilie");
         List<String> Reteta2 = new ArrayList<>();
         Reteta2.add(" lapte");
         Reteta2.add(" oua");
         Reteta2.add(" sare");
         Reteta2.add(" zahar");
         Reteta2.add(" vanilie");
         Reteta2.add(" lamaie");
         Reteta2.add(" visine");
         Reteta2.add(" ulei");
         List<String> Reteta3 = new ArrayList<>();
         Reteta3.add(" apa");
         Reteta3.add(" ceapa");
         Reteta3.add(" telina");
         Reteta3.add(" morcovi");
         Reteta3.add(" cartofi");
         Reteta3.add(" conopida");
         Reteta3.add(" sare");
         Reteta3.add(" piper");
         Reteta3.add(" ulei");
         Reteta3.add(" patrunjel");

         HashMap<String, List<String>> Hmap = new HashMap<>();
         Hmap.put(" Crema de zahar ars ", Reteta1);
         Hmap.put(" Prajitura cu visine", Reteta2);
         Hmap.put(" Ciorba de legume ", Reteta3);

         for (String key : Hmap.keySet()) {
             System.out.println(" Reteta este " + key);
             System.out.println(" Ingredientele sunt " + Hmap.get(key));

         }
     }
 }
