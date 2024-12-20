public class Dipendente {
    private String nome;
    private double stipendio;
    public Dipendente(){
        nome="";
        stipendio=0;
    }
    public Dipendente(String nome,double stipendio){
        this.nome=nome;
        this.stipendio=stipendio;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setStipendio(double stipendio){
        this.stipendio=stipendio;
    }
    public double getStipendio(){
        return stipendio;
    }
}