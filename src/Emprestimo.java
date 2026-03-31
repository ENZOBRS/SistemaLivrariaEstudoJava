// terminar isso quando voltar, antes de comecar a parte da biblioteca denovo

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    long idEmprestimo;
    Livro livro;
    Autor autor;
    String nomeCliente;
    LocalDate dataEmprestimo;
    LocalDate dataDevolucao;
    static DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Emprestimo(long idataEmprestimo, Livro livro, Autor autor, String nomeCliente, LocalDate dataEmprestimo, LocalDate dataDevolucao){

        this.idEmprestimo = idataEmprestimo;
        this.livro = livro;
        this.autor = autor;
        this.nomeCliente = nomeCliente;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;


    }

    public long getIdEmprestimo() {
        return idEmprestimo;
    }
    public Livro getLivro() {
        return livro;
    }
    public Autor getAutor() {
        return autor;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }
    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
}
