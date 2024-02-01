import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static List<String> professores = new ArrayList<>();
    public static List<String> cursos = new ArrayList<>();
    public static List<String> cursosConcluidos = new ArrayList<>();

    public static int index;


    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite: 1 para adicionar / 2 para listar/3 remover /4 marcar curso concluido/ 0 para sair : "); //
            String resposta = scanner.next();
            switch (resposta) {
                case "1":
                    adicionar();
                    break;
                case "2":
                    System.out.println("Quer exibir (1)cursos e professores ou (2)cursos concluidos?: ");
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
                    break;
                case "3":
                    pegarIndex();
                    remover(index);
                    break;
                case "4":
                    pegarIndex();
                    marcarConcluido(index);
                    break;
                case "0":
                    sair();
                default:
                    System.out.println("escreva uma opção que exista");
            }
        }
    }

    public static void adicionar() {

        System.out.println("oque quer adicionar?: (1) Professores ou (2) Cursos");
        Scanner scanner = new Scanner(System.in);

        String resposta = scanner.next();

        if (Objects.equals(resposta, "1")) {

            System.out.print("adicione um professor:");
            String professor = scanner.next();
            professores.add(professor);

        } else if (Objects.equals(resposta, "2")) {

            System.out.print("adicione um curso:");
            String curso = scanner.next();
            cursos.add(curso);
        }
    }

    public static int pegarIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual o index?");
        index = scanner.nextInt();
        return index;
    }

    public static void remover(int index) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("deseja remover de qual lista (1)Professores/ (2)Cursos)");

        String resposta = scanner.next();

        if (Objects.equals(resposta, "1")) {
            professores.remove(index);
        } else if (Objects.equals(resposta, "2")) {
            cursos.remove(index);
        }
    }

    public static void marcarConcluido(int index) {
        Scanner scanner = new Scanner(System.in);

        String curso = cursos.get(index);

        cursos.remove(index);

        cursosConcluidos.add(curso);
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
        System.exit(0);
    }
}