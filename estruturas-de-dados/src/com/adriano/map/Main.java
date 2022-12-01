package com.adriano.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> aluno = new HashMap<>();
        aluno.put("Nome","Adriano");
        aluno.put("Idade","35");
        aluno.put("Media","9.0");
        aluno.put("Turma","3a");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String,String>> listAlunos = new ArrayList<>();
        listAlunos.add(aluno);

        Map<String,String> aluno2 = new HashMap<>();
        aluno2.put("Nome","Bruno");
        aluno2.put("Idade","20");
        aluno2.put("Media","8.0");
        aluno2.put("Turma","2b");

        listAlunos.add(aluno2);

        System.out.println(listAlunos);



    }
}
