/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tela;

import Visão.Pagamento;

/**
 *
 * @author adriano
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNomeCompleto = new javax.swing.JLabel();
        jLabelMatricula = new javax.swing.JLabel();
        jLabelSalarioBase = new javax.swing.JLabel();
        jLabelProducao = new javax.swing.JLabel();
        jLabelNumeroDependentes = new javax.swing.JLabel();
        jTextFieldNomeCompleto = new javax.swing.JTextField();
        jTextFieldMatriculaFuncionario = new javax.swing.JTextField();
        jTextFieldSalarioBase = new javax.swing.JTextField();
        jTextFieldProducao = new javax.swing.JTextField();
        jTextFieldNumeroDependentes = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jLabelNomeCompleto1 = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jScrollPaneSaida = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pagamento Funcionario");

        jPanel1.setBackground(new java.awt.Color(41, 39, 39));

        jLabelNomeCompleto.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNomeCompleto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelNomeCompleto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeCompleto.setText("Nome Completo:");

        jLabelMatricula.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMatricula.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelMatricula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMatricula.setText("Matricula:");

        jLabelSalarioBase.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSalarioBase.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelSalarioBase.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalarioBase.setText("Salario Base:");

        jLabelProducao.setBackground(new java.awt.Color(255, 255, 255));
        jLabelProducao.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelProducao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProducao.setText("Produção:");

        jLabelNumeroDependentes.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNumeroDependentes.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelNumeroDependentes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumeroDependentes.setText("N°. Dependentes:");

        jTextFieldMatriculaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatriculaFuncionarioActionPerformed(evt);
            }
        });

        jTextFieldNumeroDependentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroDependentesActionPerformed(evt);
            }
        });

        jButtonCalcular.setIcon(new javax.swing.ImageIcon("C:\\Users\\adria\\Downloads\\icons8-calculator-ios-17-outlined\\icons8-calculator-50.png")); // NOI18N
        jButtonCalcular.setText("CALCULAR");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabelNomeCompleto1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNomeCompleto1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelNomeCompleto1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeCompleto1.setText("INFORMAÇÕES FUNCIONARIOS");

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ativo 1.png"))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPaneSaida.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelLogo)
                                .addGap(75, 75, 75)
                                .addComponent(jLabelNomeCompleto1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomeCompleto)
                                    .addComponent(jLabelMatricula)
                                    .addComponent(jLabelSalarioBase)
                                    .addComponent(jLabelProducao))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldSalarioBase)
                                    .addComponent(jTextFieldProducao)
                                    .addComponent(jTextFieldMatriculaFuncionario)
                                    .addComponent(jTextFieldNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNumeroDependentes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNumeroDependentes, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jScrollPaneSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabelLogo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabelNomeCompleto1)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeCompleto)
                    .addComponent(jTextFieldNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMatriculaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCalcular)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSalarioBase)
                            .addComponent(jTextFieldSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelProducao)
                            .addComponent(jTextFieldProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroDependentes)
                    .addComponent(jTextFieldNumeroDependentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMatriculaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatriculaFuncionarioActionPerformed

    private void jTextFieldNumeroDependentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroDependentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroDependentesActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        // TODO add your handling code here:
           try{
            String nome = jTextFieldNomeCompleto.getText();
            int matricula  = Integer.parseInt(jTextFieldMatriculaFuncionario.getText());
            int numeroDependentes = Integer.parseInt(jTextFieldNumeroDependentes.getText());
            float salarioBase = Float.parseFloat(jTextFieldSalarioBase.getText());
            int producaoItem = Integer.parseInt(jTextFieldProducao.getText());
            
            Pagamento funcionario = new Pagamento (nome, matricula, numeroDependentes , salarioBase, producaoItem);
            funcionario.setNomeFuncionario(nome);
            funcionario.setMatriculaFuncionario(matricula);        
            funcionario.setNumeroDependentes(numeroDependentes);
            funcionario.setSalarioBase(salarioBase);
            funcionario.setProducaoItem(producaoItem);

            String saida = "Pagamento GYN ALIMENTOS \n";
            saida += "DADOS DE PAGAMENTO \n";
            saida += "Nome funcionário: " + funcionario.getNomeFuncionario() + "\n";
            saida += "Matrícula funcionário: " + funcionario.getMatriculaFuncionario() + "\n";
            saida += "Número de dependentes: " + funcionario.getNumeroDependentes() + "\n";
            saida += "Salário Base: " + String.format("%.2f", funcionario.getSalarioBase()) + "\n";
            saida += "Valor gratificação: " + String.format("%.2f", funcionario.calcularGratificacao()) + "\n";
            saida += "Salário bruto: " + String.format("%.2f", funcionario.calcularSalarioBruto()) + "\n";
            saida += "Valor desconto por filhos: " + String.format("%.2f", funcionario.calcularDescontoDependentes()) + "\n";
            saida += "Valor desconto do INSS: " + String.format("%.2f", funcionario.calcularDescontoInss()) + "\n";
            saida += "Valor desconto IRPF: " + String.format("%.2f", funcionario.calcularDescontoIrpf()) + "\n";
            saida += "Salário líquido: " + String.format("%.2f", funcionario.calcularSalarioLiquido()) + "\n";
             jTextArea1.setText(saida);
            } catch (Exception e) {
            }

    }//GEN-LAST:event_jButtonCalcularActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelNomeCompleto;
    private javax.swing.JLabel jLabelNomeCompleto1;
    private javax.swing.JLabel jLabelNumeroDependentes;
    private javax.swing.JLabel jLabelProducao;
    private javax.swing.JLabel jLabelSalarioBase;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneSaida;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldMatriculaFuncionario;
    private javax.swing.JTextField jTextFieldNomeCompleto;
    private javax.swing.JTextField jTextFieldNumeroDependentes;
    private javax.swing.JTextField jTextFieldProducao;
    private javax.swing.JTextField jTextFieldSalarioBase;
    // End of variables declaration//GEN-END:variables
}
