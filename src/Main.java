import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static List<String> professores = new ArrayList<>(); // Cria lista de profs
    public static List<String> cursos = new ArrayList<>(); // Cria lista de curso
    public static List<String> cursosConcluidos = new ArrayList<>(); //Cria lista de cursos concluidos

    public static int index; // cria variavel global index para ser usado no codigo inteiro


    public static void main(String[] args) {

        while (true) { // loop principal do programa
            Scanner scanner = new Scanner(System.in); //cria scanner

            System.out.println("==================================================");
            System.out.println("|                  Bem-vindo                     |");
            System.out.println("|------------------------------------------------|");
            System.out.println("|            1. Adicionar Curso                  |");
            System.out.println("|            2. Listar Cursos                    |");
            System.out.println("|            3. Remover Curso                    |");
            System.out.println("|            4. Marcar Curso Concluído           |");
            System.out.println("|            0. Sair                             |");
            System.out.println("==================================================");
            System.out.print("Escolha uma opção: "); // perguntas menu inical
            String resposta = scanner.next(); // pega resposta
            switch (resposta) {
                case "1":
                    adicionar(); // add caso digite 1
                    break;
                case "2":
                    listar(); // lista caso digite 2 e pergunta qual lista para listar
                    break;
                case "3":
                    removerdaLista();
                    break;
                case "4":
                    pegarIndex(); //pega o index para ser usado em baixo novamente
                    marcarConcluido(index); // marca o index como conluido
                    break;
                case "0":
                    sair(); //sai e lista todos
                default:
                    System.out.println("escreva uma opção que exista"); // caso o user digite algo errado
            }
        }
    }

    public static void adicionar() {

        System.out.println("=============================================");
        System.out.println("|           O que deseja adicionar?         |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|  (1) Adicionar Professores                |");
        System.out.println("|  (2) Adicionar Cursos                     |");
        System.out.println("=============================================");
        System.out.print("Escolha uma opção: "); // pergunta oque add
        Scanner scanner = new Scanner(System.in);

        String resposta = scanner.next();

        if (Objects.equals(resposta, "1")) {

            System.out.print("adicione um professor: ");
            String professor = scanner.next();
            professores.add(professor);
            System.out.println("Adicionado!");

        } else if (Objects.equals(resposta, "2")) {

            System.out.print("adicione um curso: ");
            String curso = scanner.next();
            cursos.add(curso);
            System.out.println("Adicionado!");
        }
    }

    public static int pegarIndex() {
        listar();
        Scanner scanner = new Scanner(System.in);
        System.out.print("qual o index?: ");
        index = scanner.nextInt(); //pega e index
        return index; // retorna
    }


    public static void remover(int index) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================================");
        System.out.println("|       Deseja remover de qual lista?              |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|  (1) Professores                                 |");
        System.out.println("|  (2) Cursos                                      |");
        System.out.println("|  (3) Cursos Concluídos                           |");
        System.out.println("====================================================");
        System.out.print("Escolha uma opção: ");  // pergunta oque remover

        int resposta = scanner.nextInt();

        switch (resposta){
            case 1:
                professores.remove(index); //remove o index fornecido anteriormente
                System.out.println("Removido!");
                break;
            case 2:
                cursos.remove(index);
                System.out.println("Removido!");
                break;

            case 3:
                cursosConcluidos.remove(index);
                System.out.println("Removido!");
                break;

        }
    }

    public static void removerdaLista(){
        pegarIndex();
        remover(index);
    }

    // criar função removerdaLista

    public static void marcarConcluido(int index) {
        String curso = cursos.get(index);

        cursos.remove(index);

        cursosConcluidos.add(curso);
        System.out.println("Marcado como concluido!");

    }

    public static void sair() {
        System.out.println("Professores: ");
        for (int i = 0; i < professores.size(); i++) {
            String prof = professores.get(i);
            System.out.println(i + "-" + prof);
        }
        System.out.println("Cursos:");
        for (int i = 0; i < cursos.size(); i++) {
            String curso = cursos.get(i);
            System.out.println(i + "-" + curso);
        }
        System.out.println("Cursos Concluidos:");
        for (int i = 0; i < cursosConcluidos.size(); i++) {
            String cursoConcludos = cursosConcluidos.get(i);
            System.out.println(i + "-" + cursoConcludos);
        }
        System.exit(0); //sai
    }
    public  static void listar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("|              Quer exibir:               |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| (1) Cursos e Professores                |");
        System.out.println("| (2) Cursos Concluídos                   |");
        System.out.println("===========================================");
        System.out.print("Escolha uma opção: ");
        String resposta2 = scanner.next();

        if (Objects.equals(resposta2, "1")){
            System.out.println("Professores: ");
            for (int i = 0; i < professores.size(); i++) {
                String prof = professores.get(i);
                System.out.println(i + "-" + prof);
            }
            System.out.println("Cursos:");
            for (int i = 0; i < cursos.size(); i++) {
                String curso = cursos.get(i);
                System.out.println(i + "-" + curso);
            }
        } else if (Objects.equals(resposta2, "2")){
            System.out.println("Cursos Concluidos:");
            for (int i = 0; i < cursosConcluidos.size(); i++) {
                String cursoConcludos = cursosConcluidos.get(i);
                System.out.println(i + "-" + cursoConcludos);
            }
        }
    }
}