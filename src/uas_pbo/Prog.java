package uas_pbo;

public class Prog {
    private String Nama;
    private int Sem;
    private Data Data;
    
    public Prog (String Nama, int Sem){
        this.Nama = Nama;
        this.Sem = Sem;
    }
    
    public void setData (Data Data) {
        this.Data = Data;
    }
    
    public String getNama () {
        return Nama;
    }
    
    public int getSem () {
        return Sem;
    }  
}