package LintubongarinTietokanta;

import java.util.HashMap;

public class Tietokanta {
   private String nimi;
   private String latino;
   private HashMap<String,String>lintu;

   private Tietokanta(String nimi, String latino){
        this.nimi=nimi;
        this.latino=latino;
        this.lintu = new HashMap<>();
   }

   public void lisaaLintu (HashMap<String,String>lintu){
       lintu.put(nimi,latino);
   }

    public boolean nimiSisaltaa(String haettu) {
        return this.nimi.equals(haettu);
}
}
