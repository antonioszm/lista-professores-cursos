package Classes;

import java.util.List;

public class Cursos {
    //Atributos:-> Nome-> Descrição-> Professores-> Carga horária
    //Métodos:-> Progresso-> Notas-> Participação

    public String nome;

    public String descricao;

    public List<String> professores;

    public float cargaHoraria;

    public void progresso(){
        System.out.println("Progredindo!");
    }
    public void notas(){
        System.out.println("Notas[100, 90, 80, 1]!");
    }

    public void participação(){
        System.out.println("Você está participando do curso!");
    }

}
