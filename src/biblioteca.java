import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public biblioteca(){

    }
public List<Livro> Getlivros(){
    Autor autorJurassic = new Autor(1, "Michael Crichton", LocalDate.of(1942, 10, 23));
    Autor autorInterestelar = new Autor(2, "Jonathan Nolan", LocalDate.of(1976, 6, 6));
    Autor autorSenhor = new Autor(3, "J.R.R. Tolkien", LocalDate.of(1892, 1, 3));

    livros.add(new Livro(1, "Jurassic Park", true, LocalDate.of(2026, 3, 25), LocalDate.of(2026, 3, 25), autorJurassic));
    livros.add(new Livro(2, "Interestelar", true, LocalDate.of(2026, 3, 25), LocalDate.of(2026, 3, 25), autorInterestelar));
    livros.add(new Livro(3, "O Senhor dos Anéis", true, LocalDate.of(2026, 3, 25), LocalDate.of(2026, 3, 25), autorSenhor));

    return livros;
}
public List<Autor> Getautores(){
    autores.add(new Autor(1, "Michael Crichton", LocalDate.of(1942, 10, 23)));
    autores.add(new Autor(2, "Jonathan Nolan", LocalDate.of(1976, 6, 6)));
    autores.add(new Autor(3, "J.R.R. Tolkien", LocalDate.of(1892, 1, 3)));
    return autores;
}
public List<Emprestimo> Getemprestimos(){
    return emprestimos;
}
}
