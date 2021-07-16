package carteiraInvestimentos;

import acaoBolsa.AcaoBolsa;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class MainJFrame extends javax.swing.JFrame {

    //variável que conecta a tabela da interface com o modelo de tabela criado
    private ModeloTabela modeloTab;
    Calendar thisData; //Variável usada para pegar a data atual do computador do usuário

    public MainJFrame() {
        initComponents();
        meuInitComponents();
    }

    //metodo usado para declarar as variáveis criadas
    private void meuInitComponents() {
        this.modeloTab = new ModeloTabela();
        tabela1.setModel(modeloTab);
        thisData = Calendar.getInstance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JFormattedTextField();
        aporteTxt = new javax.swing.JFormattedTextField();
        dataTxt = new javax.swing.JFormattedTextField();
        valorAtualTxt = new javax.swing.JFormattedTextField();
        dataAtualCheck = new javax.swing.JCheckBox();
        valorAtualCheck = new javax.swing.JCheckBox();
        adicionarBtn = new javax.swing.JButton();
        deletarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        limparBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        painelPrincipal.setBackground(new java.awt.Color(250, 250, 250));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText(" Carteira de Investimentos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Aporte:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Data aporte:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Valor Atual:");

        nomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxtActionPerformed(evt);
            }
        });

        try {
            dataTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        dataAtualCheck.setBackground(new java.awt.Color(250, 250, 250));
        dataAtualCheck.setText("hoje?");
        dataAtualCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataAtualCheckActionPerformed(evt);
            }
        });

        valorAtualCheck.setBackground(new java.awt.Color(250, 250, 250));
        valorAtualCheck.setText("repetir aporte?");
        valorAtualCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorAtualCheckActionPerformed(evt);
            }
        });

        adicionarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adicionarBtn.setText("Adicionar");
        adicionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarBtnActionPerformed(evt);
            }
        });

        deletarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deletarBtn.setText("Deletar Investimento");
        deletarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarBtnActionPerformed(evt);
            }
        });

        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabela1);

        limparBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        limparBtn.setText("Limpar Campos de Texto");
        limparBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                        .addComponent(adicionarBtn)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(deletarBtn))
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(limparBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aporteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataAtualCheck))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valorAtualTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valorAtualCheck)))
                .addContainerGap())
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(aporteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(dataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataAtualCheck))
                        .addGap(18, 18, 18)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(valorAtualTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorAtualCheck))
                        .addGap(18, 18, 18)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionarBtn)
                            .addComponent(limparBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deletarBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTxtActionPerformed

    }//GEN-LAST:event_nomeTxtActionPerformed

    //metodo chamado quando a caixa de chequagem dataAtualCheck está selecionada
    private void dataAtualCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataAtualCheckActionPerformed
        //variaveis que vão receber o dia, mes e o ano
        String dia;
        String mes;
        String ano;

        //cada if é usado para verificar o valor recebido e adicionar um zero antes do número
        //caso ele não tenha dois digitos, necessário para a formatação da caixa dataTxt
        if (thisData.get(Calendar.DATE) < 10) {
            dia = (0 + "" + thisData.get(Calendar.DATE));
        } else {
            dia = ("" + thisData.get(Calendar.DATE));
        }
        if (thisData.get(Calendar.MONTH) < 10) {
            //como o java conta os meses a partir do zero é necessário somar + 1
            mes = (0 + "" + (thisData.get(Calendar.MONTH) + 1));
        } else {
            mes = ("" + (thisData.get(Calendar.MONTH) + 1));
        }
        ano = "" + thisData.get(Calendar.YEAR);

        if (dataAtualCheck.isSelected()) {

            dataTxt.setText(dia + "" + mes + "" + ano);
        }
    }//GEN-LAST:event_dataAtualCheckActionPerformed

    //metodo usado quando a caixa de chequagem valorAtualCheck for selecionada
    private void valorAtualCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorAtualCheckActionPerformed
        if (valorAtualCheck.isSelected()) {

            valorAtualTxt.setText(aporteTxt.getText());
        }
    }//GEN-LAST:event_valorAtualCheckActionPerformed

    //metodo usado quando o botao adicionarBtn receber uma ação
    //este metodo irá adicionar uma nova linha na tabela com base nas informações digitadas pelo usuário
    private void adicionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarBtnActionPerformed

        //caso exista algum valor errado nas caixas de texto, uma mensagem de erro irá aparecer 
        if ((!nomeTxt.getText().isEmpty()) && (!aporteTxt.getText().isEmpty())
                && (!dataTxt.getText().isEmpty()) && (!valorAtualTxt.getText().isEmpty())) {

            try {
                AcaoBolsa a = new AcaoBolsa(nomeTxt.getText(), Double.parseDouble(aporteTxt.getText()),
                        dataTxt.getText(), Double.parseDouble(valorAtualTxt.getText()));

                modeloTab.addAcao(a);

                limparBtn.doClick();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Valor incorreto no campo de números", "ERRO",
                        JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "O formato de um ou mais campos está incorreto!",
                    "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adicionarBtnActionPerformed

    //metodo usado quando o botao deletarBtn receber uma ação
    //este metodo irá deletar uma linha da tabela que está selecionada
    private void deletarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarBtnActionPerformed
        //caso não tenham linhas selecionadas ba tabela, uma mensagem será exibida
        if (tabela1.getSelectedRow() >= 0) {
            modeloTab.removeAcao(tabela1.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma coluna para ser deletada",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_deletarBtnActionPerformed

    //metodo usado quando o botao limparBtn receber uma ação
    //este metodo irá limpar todos os campos de texto e caixas de checagem
    private void limparBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparBtnActionPerformed
        nomeTxt.setText("");
        aporteTxt.setText("");
        dataTxt.setText("");
        valorAtualTxt.setText("");
        if (dataAtualCheck.isSelected()) {
            dataAtualCheck.doClick();
        }
        if (valorAtualCheck.isSelected()) {
            valorAtualCheck.doClick();
        }
    }//GEN-LAST:event_limparBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarBtn;
    private javax.swing.JFormattedTextField aporteTxt;
    private javax.swing.JCheckBox dataAtualCheck;
    private javax.swing.JFormattedTextField dataTxt;
    private javax.swing.JButton deletarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparBtn;
    private javax.swing.JFormattedTextField nomeTxt;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTable tabela1;
    private javax.swing.JCheckBox valorAtualCheck;
    private javax.swing.JFormattedTextField valorAtualTxt;
    // End of variables declaration//GEN-END:variables
}
