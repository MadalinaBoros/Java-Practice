import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    @Test
    public void testAutomat(){
        System.out.println("1.ArrayNumere");
        printeazaArrayNumere();
        System.out.println("2.ArrayValori");
        printeazaArrayValori();
        System.out.println("3.ListaValori");
        printeazaListaValori();
        System.out.println("4.HashMapValori");
        printeazaHashMapValori();
        System.out.println("5.AfisamOraseleCareApartinDeAnumiteTari");
        printeazaListaOrase();
    }

    public void printeazaArrayNumere(){
        Integer[] ArrayNumere=new Integer[4];
        ArrayNumere[0]=4;
        ArrayNumere[1]=5;
        ArrayNumere[2]=6;
        ArrayNumere[3]=7;
        for (Integer index=0; index<ArrayNumere.length; index++){
            System.out.println("Numarul curent este "+ArrayNumere[index]);
        }
        System.out.println("Ultimul element din Array este "+ArrayNumere[ArrayNumere.length-1]);
    }

    public void printeazaArrayValori(){
        String[] ArrayValori=new String[4];
        ArrayValori[0]="Madalina";
        ArrayValori[1]="Alex";
        ArrayValori[2]="Paul";
        for (int index=0; index<ArrayValori.length-1; index++){
            System.out.println("Numele curent este "+ArrayValori[index]);
        }
    }

    public void printeazaListaValori(){
        List<String> ListaValori=new ArrayList<>();
        ListaValori.add("Madalina");
        ListaValori.add("Alex");
        ListaValori.add("Paul");
        for (int index=0; index<ListaValori.size(); index++){
            System.out.println("Numele curent este "+ListaValori.get(index));
        }
    }

    public void printeazaHashMapValori(){
        //Hash Map functioneaza dupa logica de key=value
        HashMap<String,String> MapValori=new HashMap<>();
        MapValori.put("nume","Boros");
        MapValori.put("prenume1","Madalina");
        MapValori.put("prenume2","Georgeta");
        for (String key: MapValori.keySet()){
            System.out.println("Cheia este "+key);
            System.out.println("Valoarea este "+MapValori.get(key));
        }
    }

    public void printeazaListaOrase(){
        List<String> ListaOraseRomania=new ArrayList<>();
        ListaOraseRomania.add("Cluj Napoca");
        ListaOraseRomania.add("Timisoara");
        ListaOraseRomania.add("Bucuresti");
        ListaOraseRomania.add("Satu Mare");
        ListaOraseRomania.add("Oradea");
        ListaOraseRomania.add("Sibiu");
        ListaOraseRomania.add("Brasov");
        ListaOraseRomania.add("Gherla");
        ListaOraseRomania.add("Constanta");
        ListaOraseRomania.add("Baia Mare");
        List<String> ListaOraseSpania=new ArrayList<>();
        ListaOraseSpania.add("Madrid");
        ListaOraseSpania.add("Barcelona");
        ListaOraseSpania.add("Valencia");
        ListaOraseSpania.add("Bilbao");
        ListaOraseSpania.add("Malaga");
        ListaOraseSpania.add("Marbella");
        ListaOraseSpania.add("Sevilla");
        ListaOraseSpania.add("Cordoba");
        List<String> ListaOraseItalia=new ArrayList<>();
        ListaOraseItalia.add("Roma");
        ListaOraseItalia.add("Sicilia");
        ListaOraseItalia.add("Bari");
        ListaOraseItalia.add("Milano");
        ListaOraseItalia.add("Venetia");
        ListaOraseItalia.add("Palermo");
        ListaOraseItalia.add("Torino");
        ListaOraseItalia.add("Verona");
        HashMap<String,List<String>> MapTari=new HashMap<>();
        MapTari.put("Romania",ListaOraseRomania);
        MapTari.put("Spania",ListaOraseSpania);
        MapTari.put("Italia",ListaOraseItalia);
        for (String key: MapTari.keySet()){
            System.out.println("Orasele care apartin de tara "+key+" sunt urmatoarele:");
            List<String> Orase=MapTari.get(key);
            for (Integer index=0; index<Orase.size();index++){
                System.out.println(Orase.get(index));
            }
        }
    }



}
