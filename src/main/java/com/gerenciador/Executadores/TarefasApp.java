package com.gerenciador.Executadores;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import com.gerenciador.Entidades.Tarefas;

public class TarefasApp {
    public void executar() {

        Scanner scanner = new Scanner(System.in);
        Tarefas tarefa = new Tarefas();

        System.out.print("Qual é o titulo da tarefa? ");
        tarefa.setTitulo(scanner.nextLine());

        System.out.print("Descrição da tarefa: ");
        tarefa.setDescricao(scanner.nextLine());

        System.out.print("Digite uma data limite no formato 'AAAA-MM-DD': ");
        String dataInput = scanner.nextLine();
        try {
            LocalDate dataUsuario = LocalDate.parse(dataInput);
            tarefa.setData(dataUsuario);
            System.out.println("Data inserida pelo usuário: " + tarefa.getData());
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data inválido. Use o formato 'AAAA-MM-DD''.");
        }

        System.out.print("Qual é o processo da tarefa? \n1 - Em progresso \n2 - A fazer \n3 - Concluida ");
        int escolha = scanner.nextInt();
		scanner.nextLine();
        if (escolha == 1) {

		} else if (escolha == 2) {

		} else if (escolha == 3){

		} else {
            System.out.println();
        } 
        tarefa.setStatus(scanner.nextBoolean());
        System.out.println("---------------------------");
        System.out.println("Tarefa adicionada:");
        System.out.println("Titulo da Tarefa: " + tarefa.getTitulo());
        System.out.println("Descrição: " + tarefa.getDescricao());
        System.out.println("Data limite da Tarefa:" + tarefa.getData());
        System.out.println("Concluída: " + tarefa.getStatus());

        scanner.close();
    }
}
