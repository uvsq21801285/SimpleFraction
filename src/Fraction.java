public class Fraction {

    private int nume;
    private int denume;

    public Fraction(){
        this.nume = 0;
        this.denume = 0;
    }

    public Fraction(int nume, int denume){
        this.nume = nume;
        this.denume = denume;
    }

    public int get_nume(){
        return nume;
    }

    public int get_denume(){
        return denume;
    }

    public void set_nule(int nume){
        this.nume = nume;
    }

    public void set_denume(int denume){
        this.denume = denume;
    }

    public String To_String(){
        return "la fraction est "+nume+"/"+denume+"";
    }
}