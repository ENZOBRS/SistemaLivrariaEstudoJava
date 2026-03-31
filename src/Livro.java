import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Livro {
long idLivro;
Autor autor;
String tituloLivro;
Boolean disponivel;
LocalDate dataCadastro;
LocalDate dataAtualizacao;

static DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("dd/MM/yyyy");


public Livro(long idLivro,String tituloLivro, boolean disponivel,LocalDate dataCadastro,LocalDate dataAtualizacao, Autor autor){

    this.idLivro = idLivro;
    this.tituloLivro = tituloLivro;
    this.disponivel = disponivel;
    this.dataCadastro = dataCadastro;
    this.dataAtualizacao = dataAtualizacao;
    this.autor = autor;



}
public long getIdLivro(){
    return idLivro;
}
public String getTituloLivro(){
    return tituloLivro;
}
public Boolean getdisponivel(){
    return disponivel;
}   
public LocalDate getDataCadastro(){
    return dataCadastro;
}
public LocalDate getDataAtualizacao(){
    return dataAtualizacao;
}
public Autor getautor(){
    return autor;
}
public void setdisponivel(Boolean disponivel){
    this.disponivel = disponivel;
}
}
