/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidorudp;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDados {

    private int qtdFilmes = 15;
    private int qtdUsuarios = 10;

    private ArrayList lista = null;
    private int matriz[][] = null;

    public BaseDeDados() {
        lista = new ArrayList();
        matriz = new int[qtdUsuarios][qtdFilmes];

        for (int i = 0; i < qtdUsuarios; i++) {
            for (int j = 0; j < qtdFilmes; j++) {
                matriz[i][j] = 0;
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println("\n");
        }
    }

    public String le() {
        String s = "\n";
        int fim = lista.size();

        for (int pos = 0; pos < fim; pos++) {
            s = s + "[" + (pos + 1) + "] " + lista.get(pos) + "\n";
        }

        return s;
    }

    public String solicitarFilme(int usuario) {
        System.out.println("ENTROU NO nao avaliado ==== " + usuario);
        String s = "\n";

        int filme = -1;
        for (int i = 0; i < qtdFilmes; i++) {
            if (matriz[usuario][i] == 0) {

                filme = i;
                s = s + "[1]" + filme + "\n";
                return s;
            }

        }
        return s;

    }

    public void avaliar(int nomeUsuario, int filme, int nota) {

        matriz[nomeUsuario][filme] = nota;

        for (int i = 0; i < qtdUsuarios; i++) {
            for (int j = 0; j < qtdFilmes; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println("\n");
        }
    }

    public String recomendar(int nomeUsuario) {
        System.out.println("ENTROU NO RECOMENDAR ==== " + nomeUsuario);

        String filmes = "oi";
        return filmes;
    }

    public void listarAvaliacoes(int usuario) {


        for (int i = 0; i < qtdFilmes; i++) {
            if (matriz[usuario][i] != 0) {

                lista.add(i);
                
            }

        }

    }
}
