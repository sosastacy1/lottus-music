import java.sql.Time;
import java.time.LocalDate;

public class Musica {

    public String titulo;
    public String artista;
    private double duracao;
    public LocalDate lancamento;
    public Genero genero;
    public String album;
    public int reproducoes;

    //metodo get
    public double getDuracao(){
        return duracao;
    }

    // metodo set || musica.setDuracao(3)
    public void setDuracao (double duracao){
        if (duracao > 0){
            this.duracao = duracao;
        }else{
            IO.println("A duração não pode ser negativa");

        }
    }
}
