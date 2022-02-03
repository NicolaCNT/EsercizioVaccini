package InterfacciaDosaggio;

public class DosaggioAdolescenti implements Dosaggio{
    private int dosaggio;

    public DosaggioAdolescenti(int dosaggio){
        this.dosaggio = dosaggio;
    }

    public int getQuantitaDosaggio(){
        return this.dosaggio * 15;
    }
}