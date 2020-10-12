package LintubongarinTietokanta;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        HashMap<String, String> linnut = new HashMap<>();
        HashMap<String, Integer> tilasto = new HashMap<>();

        while (true) {
            System.out.println("?");
            String syote = lukija.nextLine();
            if (syote.equals("Lopeta")) {
                break;
            }
            if (syote.equals("Lisaa")) {
                System.out.println("Nimi: ");
                String nimi = lukija.nextLine();
                System.out.println("Latinankielinen nimi: ");
                String latino = lukija.nextLine();
                linnut.put(nimi,latino);
            }
            if (syote.equals("Havainto")) {
                System.out.print("Mikä havaittu: ");
                String havainto = lukija.nextLine();
                if (linnut.containsKey(havainto)) {
                    tilasto.put(havainto, tilasto.getOrDefault(havainto, 0) + 1);
                } else {
                    System.out.println("Ei ole lintu!");
                }
            }
            if (syote.equals("Tilasto")) {
                for(String h: linnut.keySet())
                {
                    System.out.println(h+" ("+linnut.get(h) + "): " +tilasto.getOrDefault(h,0) + " havaintoa" );
                }
                }
            if (syote.equals("Nayta")) {
                System.out.println("Mikä?");
                String h = lukija.nextLine();
                    System.out.println(h+" ("+linnut.get(h) + "): " +tilasto.getOrDefault(h,0) + " havaintoa" );
        }
    }
    }
    }