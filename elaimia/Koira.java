package elaimia;

public class Koira extends Elain implements Aanteleva{

    public Koira(String nimi){
        super (nimi);
    }

    public Koira(){
        super("Koira");
    }

    public void hauku(){
        System.out.println(this.nimi +" haukkuu");
    }

    @Override
    public void aantele() {
        hauku();
    }
}
