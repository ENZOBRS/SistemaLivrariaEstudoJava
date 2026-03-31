import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Autor {
    long idAutor;
    String nome;
    LocalDate dataNascimentoAutor;

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Autor(long id, String nome, LocalDate dataNascimento) {
        this.idAutor = id;
        this.nome = nome;
    }

    public long getId() {
        return idAutor;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimentoAutor() {
        return dataNascimentoAutor;
    }

    public String getDataFormatada() {
        return dataNascimentoAutor.format(formatter);
    }
}
