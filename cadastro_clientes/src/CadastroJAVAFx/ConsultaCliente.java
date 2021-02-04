/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastroJAVAFx;

import javax.swing.JDesktopPane;

/**
 *
 * @author jefferson_B
 */
public class ConsultaCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaCliente
     */
    private JDesktopPane jdpPrincipal;
    public ConsultaCliente(JDesktopPane jdp) {
        initComponents();
        jdpPrincipal = jdp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeCliente = new javax.swing.JLabel();
        lblConsultaNomeCliente = new javax.swing.JTextField();
        btnPesquisarCliente = new javax.swing.JButton();
        btnNovoCliente = new javax.swing.JButton();
        btnAlterarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        btnCancelarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCliente = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Cliente");

        nomeCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nomeCliente.setForeground(new java.awt.Color(204, 0, 0));
        nomeCliente.setText("NOME:");

        lblConsultaNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblConsultaNomeClienteActionPerformed(evt);
            }
        });

        btnPesquisarCliente.setText("Pesquisar");

        btnNovoCliente.setText("Novo");

        btnAlterarCliente.setText("Alterar");

        btnExcluirCliente.setText("Excluir");

        btnCancelarCliente.setText("Cancelar");

        TableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "DDD", "Telefone", "E-mail", "CPF", "RG", "Nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(nomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblConsultaNomeCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPesquisarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnNovoCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarCliente)
                        .addGap(0, 153, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConsultaNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarCliente)
                    .addComponent(btnNovoCliente)
                    .addComponent(btnAlterarCliente)
                    .addComponent(btnExcluirCliente)
                    .addComponent(btnCancelarCliente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblConsultaNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblConsultaNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblConsultaNomeClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableCliente;
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblConsultaNomeCliente;
    private javax.swing.JLabel nomeCliente;
    // End of variables declaration//GEN-END:variables
}
