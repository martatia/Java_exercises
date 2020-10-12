package elaimia;

public class Kissa extends Elain implements Aanteleva{

    public Kissa(String nimi){
        super (nimi);
    }

    public Kissa(){
        super("Kissa");
    }

    public void mourua(){
        System.out.println(this.nimi +" mouruaa");
    }

    @Override
    public void aantele() {
        mourua();
    }
}