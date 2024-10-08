/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servidorudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.List;

public class ServidorUDP {

    private static BaseDeDados bd = null;
    private static int[] separadorMensagemInt = null;

    public static void main(String[] args) {
        DatagramSocket aSocket = null;

        bd = new BaseDeDados();

        try {
            aSocket = new DatagramSocket(6789);

            while (true) {

                byte[] buffer = new byte[600];
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                aSocket.receive(request);

                String mensagem = new String(request.getData());

                String separadorMensagem[] = mensagem.split(";");

                int opcaoMenu, indiceNome, indiceFilme, nota, resp = 0;
                String resposta = "";

                opcaoMenu = Integer.parseInt(separadorMensagem[0].trim());
                
                indiceNome = Integer.parseInt(separadorMensagem[1].trim());

                switch (opcaoMenu) {
                    case 1:
                        resposta = String.valueOf(bd.semAvaliacao(indiceNome));
                        break;
                    case 2:
                        indiceFilme = Integer.parseInt(separadorMensagem[2].trim());

                        nota = Integer.parseInt(separadorMensagem[3].trim());

                        bd.avaliar(indiceNome, indiceFilme, nota);
                        resposta = String.valueOf(resp);
                        break;
                    case 3:
                        resposta = String.valueOf(bd.recomendar(indiceNome));
                        break;
                    case 4:
                        List<Integer> filmesAvaliados = bd.listarAvaliacoes(indiceNome);
                        resposta = filmesAvaliados.toString();
                        break;

                }

                byte[] todasMsg = resposta.getBytes();

                DatagramPacket reply = new DatagramPacket(todasMsg, todasMsg.length, request.getAddress(), request.getPort());
                aSocket.send(reply);

            }
        } catch (SocketException e) {
            System.out.println("SERVIDOR - socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("SERVIDOR - input Output: " + e.getMessage());
        } finally {
            if (aSocket != null) {
                aSocket.close();
            }
        }
    }

}
