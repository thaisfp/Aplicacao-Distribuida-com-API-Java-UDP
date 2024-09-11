/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package usuarioudp;

import java.awt.Color;
import javax.swing.JOptionPane;

public class FormularioUsuario extends javax.swing.JFrame {

    public FormularioUsuario() {
        initComponents();
        jPanelAvaliar.setVisible(false);
        jPanelMostrarResposta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcoesMenuGrp = new javax.swing.ButtonGroup();
        nome = new javax.swing.JLabel();
        painelMenu = new javax.swing.JPanel();
        naoAvaliado = new javax.swing.JRadioButton();
        avaliar = new javax.swing.JRadioButton();
        recomendacoes = new javax.swing.JRadioButton();
        avaliados = new javax.swing.JRadioButton();
        btnOk = new javax.swing.JButton();
        jPanelMostrarResposta = new javax.swing.JPanel();
        painelResposta = new javax.swing.JScrollPane();
        areaResposta = new javax.swing.JTextPane();
        jPanelAvaliar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbTitulo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nota = new javax.swing.JSpinner();
        btnEnviarAvaliacao = new javax.swing.JButton();
        nomeUsuario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(496, 600));
        setMinimumSize(new java.awt.Dimension(496, 600));
        getContentPane().setLayout(null);

        nome.setText("Nome");
        getContentPane().add(nome);
        nome.setBounds(80, 30, 60, 16);

        painelMenu.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));

        opcoesMenuGrp.add(naoAvaliado);
        naoAvaliado.setText("1 - Sem Avaliação");
        naoAvaliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoAvaliadoActionPerformed(evt);
            }
        });

        opcoesMenuGrp.add(avaliar);
        avaliar.setText("2 - Avaliar");
        avaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaliarActionPerformed(evt);
            }
        });

        opcoesMenuGrp.add(recomendacoes);
        recomendacoes.setText("3 - Recomendações");
        recomendacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recomendacoesActionPerformed(evt);
            }
        });

        opcoesMenuGrp.add(avaliados);
        avaliados.setText("4 - Avaliados");
        avaliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaliadosActionPerformed(evt);
            }
        });

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelMenuLayout = new javax.swing.GroupLayout(painelMenu);
        painelMenu.setLayout(painelMenuLayout);
        painelMenuLayout.setHorizontalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(avaliados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelMenuLayout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addComponent(btnOk)))
                    .addComponent(avaliar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(recomendacoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(naoAvaliado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        painelMenuLayout.setVerticalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(naoAvaliado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avaliar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recomendacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avaliados)
                .addGap(18, 18, 18)
                .addComponent(btnOk)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(painelMenu);
        painelMenu.setBounds(60, 80, 360, 200);

        jPanelMostrarResposta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelMostrarResposta.setLayout(null);

        painelResposta.setViewportView(areaResposta);

        jPanelMostrarResposta.add(painelResposta);
        painelResposta.setBounds(20, 20, 320, 171);

        getContentPane().add(jPanelMostrarResposta);
        jPanelMostrarResposta.setBounds(60, 290, 360, 210);

        jPanelAvaliar.setBorder(javax.swing.BorderFactory.createTitledBorder("Avaliar"));

        jLabel2.setText("Filmes/Séries");

        cmbTitulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tempos Modernos", "Star Wars", "Friends", "Ratatouille", "Modern Family", "Carros", "Rio 2", "Esquadrão Classe A", "Rei Leão", "O Poderoso Chefão", "A Origem", "Jurassic Park", "Titanic", "Breaking Bad", "Game of Thrones" }));

        jLabel3.setText("Nota");

        nota.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));

        btnEnviarAvaliacao.setText("Enviar");
        btnEnviarAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarAvaliacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAvaliarLayout = new javax.swing.GroupLayout(jPanelAvaliar);
        jPanelAvaliar.setLayout(jPanelAvaliarLayout);
        jPanelAvaliarLayout.setHorizontalGroup(
            jPanelAvaliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvaliarLayout.createSequentialGroup()
                .addGroup(jPanelAvaliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAvaliarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAvaliarLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAvaliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAvaliarLayout.createSequentialGroup()
                        .addComponent(nota)
                        .addGap(168, 168, 168))
                    .addGroup(jPanelAvaliarLayout.createSequentialGroup()
                        .addComponent(cmbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelAvaliarLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(btnEnviarAvaliacao)
                .addGap(139, 139, 139))
        );
        jPanelAvaliarLayout.setVerticalGroup(
            jPanelAvaliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAvaliarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelAvaliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAvaliarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEnviarAvaliacao)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelAvaliar);
        jPanelAvaliar.setBounds(60, 510, 360, 170);

        nomeUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lucas", "Mariana", "Zé", "Martha", "Ana", "Ricardo", "Fernanda", "Gabriel", "Miguel", "Flavia" }));
        getContentPane().add(nomeUsuario);
        nomeUsuario.setBounds(120, 30, 270, 22);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void naoAvaliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoAvaliadoActionPerformed
        
        jPanelMostrarResposta.setVisible(true);
        jPanelAvaliar.setVisible(false);

    }//GEN-LAST:event_naoAvaliadoActionPerformed

    private void avaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaliarActionPerformed
        jPanelMostrarResposta.setVisible(false);

        jPanelAvaliar.setLocation(60, 290);
        jPanelAvaliar.setVisible(true);

    }//GEN-LAST:event_avaliarActionPerformed

    private void recomendacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recomendacoesActionPerformed
        jPanelMostrarResposta.setVisible(true);
        jPanelAvaliar.setVisible(false);

    }//GEN-LAST:event_recomendacoesActionPerformed

    private void avaliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaliadosActionPerformed
        jPanelMostrarResposta.setVisible(true);
        jPanelAvaliar.setVisible(false);

    }//GEN-LAST:event_avaliadosActionPerformed

    private void verificarSeNomeSelecionado(int indexNome) {

        String msg = null;

        if (!naoAvaliado.isSelected() && !avaliados.isSelected() && !recomendacoes.isSelected() && !avaliar.isSelected()) {

            JOptionPane.showMessageDialog(null, "Selecione uma opção do menu.");
            painelMenu.requestFocus();

        } else {

            if (naoAvaliado.isSelected() || avaliados.isSelected() || recomendacoes.isSelected()) {

                if (naoAvaliado.isSelected()) {

                    msg = "1;" + indexNome;
                    jPanelMostrarResposta.setName("Sem Avaliação");

                } else if (recomendacoes.isSelected()) {

                    msg = "3;" + indexNome;
                    jPanelMostrarResposta.setName("Recomendados");

                } else {

                    msg = "4;" + indexNome;
                    jPanelMostrarResposta.setName("Avaliados");

                }
            } else {
                
                msg = "2;" + indexNome + ";" + cmbTitulo.getSelectedIndex() + ";" + nota.getValue();
            }

            Usuario usuario = new Usuario();
            String resposta = usuario.enviaMensagem(msg);
            JOptionPane.showMessageDialog(null, "Avalido com sucesso!.");

            areaResposta.setText(resposta);
            naoAvaliado.setSelected(false);
            avaliar.setSelected(false);
            recomendacoes.setSelected(false);
            avaliados.setSelected(false);
        }
    }

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed

        int indexNome = nomeUsuario.getSelectedIndex();
        verificarSeNomeSelecionado(indexNome);
        
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnEnviarAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarAvaliacaoActionPerformed

        int indexNome = nomeUsuario.getSelectedIndex();
        verificarSeNomeSelecionado(indexNome);

    }//GEN-LAST:event_btnEnviarAvaliacaoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane areaResposta;
    private javax.swing.JRadioButton avaliados;
    private javax.swing.JRadioButton avaliar;
    private javax.swing.JButton btnEnviarAvaliacao;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> cmbTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelAvaliar;
    private javax.swing.JPanel jPanelMostrarResposta;
    private javax.swing.JRadioButton naoAvaliado;
    private javax.swing.JLabel nome;
    private javax.swing.JComboBox<String> nomeUsuario;
    private javax.swing.JSpinner nota;
    private javax.swing.ButtonGroup opcoesMenuGrp;
    private javax.swing.JPanel painelMenu;
    private javax.swing.JScrollPane painelResposta;
    private javax.swing.JRadioButton recomendacoes;
    // End of variables declaration//GEN-END:variables
}
