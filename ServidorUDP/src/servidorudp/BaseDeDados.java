/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidorudp;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDados {

    private int qtdFilmes = 2;
    private int qtdCliente = 3;

    private ArrayList lista = null;
    private int matriz[][] = null;

    public BaseDeDados() {
        lista = new ArrayList();
        matriz = new int[qtdCliente][qtdFilmes];

        for (int i = 0; i < qtdCliente; i++) {
            for (int j = 0; j < qtdFilmes; j++) {
                matriz[i][j] = 0;
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println("\n");
        }
    }
//
//    public String le() {
//        String s = "";
//        int fim = lista.size();
//
//        for (int pos = 0; pos < fim; pos++) {
//            s = s + lista.get(pos) + ";";
//        }
//
//        return s;
//    }

    public int solicitarFilme(int cliente) {

        int filme = 0;
        for (int i = 0; i < qtdFilmes; i++) {
            if (matriz[cliente][i] == 0) {
                filme = i;
                return filme;
            }

        }
        return filme;

    }

    public void avaliar(int cliente, int filme, int nota) {

        matriz[cliente][filme] = nota;

        for (int i = 0; i < qtdCliente; i++) {
            for (int j = 0; j < qtdFilmes; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println("\n");
        }
    }

    public int recomendar(int cliente) {

        double menorDistancia = Double.MAX_VALUE;
        int clienteProximo = -1;
        int filmeRecomendado = -1;

        for (int i = 0; i < qtdCliente; i++) {
            if (i != cliente) {
                double conta = 0.0;

                for (int j = 0; j < qtdFilmes; j++) {
                    conta += Math.pow(matriz[cliente][j] - matriz[i][j], 2);
                }

                double distEuclidiana = Math.sqrt(conta);

                if (distEuclidiana < menorDistancia) {
                    menorDistancia = distEuclidiana;
                    clienteProximo = i;
                    System.out.println(clienteProximo + " esta mais próximo de " + cliente);
                }
            }
        }

        for (int i = 0; i < qtdFilmes; i++) {
            if (matriz[clienteProximo][i] != 0 && matriz[cliente][i] == 0) {
                filmeRecomendado = i;
                System.out.println("FILME RECOMENDADO = " + filmeRecomendado);
                break; 
            }
        }

        System.out.println("MENOR DISTANCIA = " + menorDistancia);
        return filmeRecomendado;
    }

    public List<Integer> listarAvaliacoes(int cliente) {
        List<Integer> filmesAvaliados = new ArrayList<>();
        for (int i = 0; i < qtdFilmes; i++) {
            if (matriz[cliente][i] != 0) {
                filmesAvaliados.add(i);
            }
        }
        return filmesAvaliados;
    }
}
