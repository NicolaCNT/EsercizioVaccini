package InterfacciaDosaggio;

public class DosaggioMaggiorenni implements Dosaggio{
    private int dosaggio;

    public DosaggioMaggiorenni(int dosaggio){
        this.dosaggio = dosaggio;
    }

    public int getQuantitaDosaggio(){
        return this.dosaggio * 20;
    }
}
