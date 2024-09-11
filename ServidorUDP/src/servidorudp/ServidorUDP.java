/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servidorudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

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
                System.out.println("MENSGAEM ===== " + mensagem);

                String separadorMensagem[] = mensagem.split(";");
                System.out.println("SEPARADOR ===== " + separadorMensagem);

                int opcaoMenu, nomeUsuario, nomeFilme, nota, resp = 0;
                String resposta = "";

                opcaoMenu = Integer.parseInt(separadorMensagem[0].trim());
                System.out.println("OPCAO MENU ===" + opcaoMenu);
                nomeUsuario = Integer.parseInt(separadorMensagem[1].trim());
                System.out.println("ind usuario ===" + nomeUsuario);

                switch (opcaoMenu) {
                    case 1:
                        resposta = bd.solicitarFilme(nomeUsuario);
                        break; 
                    case 2:
                        nomeFilme = Integer.parseInt(separadorMensagem[2].trim());
                        System.out.println("filme  ===" + nomeFilme);

                        nota = Integer.parseInt(separadorMensagem[3].trim());
                        System.out.println("nota ===" + nota);

                        bd.avaliar(nomeUsuario, nomeFilme, nota);
                        resposta = String.valueOf(resp);
                        break;
                    case 3:
                        resposta = bd.recomendar(nomeUsuario);
                        break;
                    case 4:
                        bd.listarAvaliacoes(nomeUsuario);
                        resposta = bd.le();
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
