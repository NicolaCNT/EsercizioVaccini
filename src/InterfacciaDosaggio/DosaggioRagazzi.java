package InterfacciaDosaggio;

public class DosaggioRagazzi implements Dosaggio{
    private int dosaggio;

    public DosaggioRagazzi(int dosaggio){
        this.dosaggio = dosaggio;
    }

    public int getQuantitaDosaggio(){
        return this.dosaggio * 10;
    }
}
