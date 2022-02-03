package InterfacciaDosaggio;

public class DosaggioBambini implements Dosaggio{
    private int dosaggio;

    public DosaggioBambini(int dosaggio){
        this.dosaggio = dosaggio;
    }

    public int getQuantitaDosaggio(){
        return this.dosaggio * 5;
    }
}
