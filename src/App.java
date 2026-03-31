import java.util.Scanner;
import java.util.List;

public class App {
    //execute o codigo com javac src/*.java; java -cp src App
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        biblioteca biblioteca = new biblioteca();
        List<Livro> livros = biblioteca.Getlivros();
        


        while (true) {
            System.out.println("Voce deseja ver a lista de livros?: ");
            String escolha = scanner.nextLine().trim().toLowerCase();

            if (escolha.equals("nao")) {
                System.out.println("Sistema encerrado!");
                break;
            }  
            else if (escolha.equals("sim")) {
                System.out.println("Livros disponíveis:");
                for (int i = 0; i < livros.size(); i++) {
                    Livro livro = livros.get(i);
                    if (livro.getdisponivel()) {
                        System.out.println("ID: " + livro.getIdLivro() + " | Título: " + livro.getTituloLivro());
                    }
                }

                System.out.println("Escolha o Livro pelo ID: ");
                System.out.println("Se quiser sair Digite 'sair'");
                String escolhaID = scanner.nextLine().trim().toLowerCase();

                if (escolhaID.equals("sair")) {
                    System.out.println("Voltando ao menu.");
                    continue;
                }
                int idEscolhido;
                try {
                    idEscolhido = Integer.parseInt(escolhaID);
                } catch (NumberFormatException e) {
                    System.out.println("ID inválido. Digite um número.");
                    continue;
                }
                System.out.println("Digite seu nome para confirmar o emprestimo: ");
                String nomeCliente = scanner.nextLine().trim().toLowerCase();


                Livro livroEscolhido = null;
                for (int j = 0; j < livros.size(); j++) {
                    if (livros.get(j).getIdLivro() == idEscolhido) {
                        livroEscolhido = livros.get(j);
                        break;
                    }
                }

                if (livroEscolhido == null) {
                    System.out.println("Livro não encontrado.");
                    continue;
                }

                if (!livroEscolhido.getdisponivel()) {
                    System.out.println("Livro já está emprestado.");
                    continue;
                }

                livroEscolhido.setdisponivel(false);
                System.out.println("Emprestimo realizado com sucesso: " + livroEscolhido.getTituloLivro() + " | Cliente: " + nomeCliente);

                
            }  
                
            
        }

        scanner.close();
    }
}
