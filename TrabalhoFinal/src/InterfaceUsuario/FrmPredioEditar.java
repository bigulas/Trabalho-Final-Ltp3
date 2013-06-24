/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;

/**
 *
 * @author John Kevin
 */
public class FrmPredioEditar extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmPredio
     */
    public FrmPredioEditar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlEditarPedido = new javax.swing.JPanel();
        TxtNome = new javax.swing.JTextField();
        LblNome = new javax.swing.JLabel();
        LblIdFuncionario = new javax.swing.JLabel();
        TxtIdFuncionario = new javax.swing.JTextField();
        TxtCodCampus = new javax.swing.JTextField();
        LblCodCampus = new javax.swing.JLabel();
        BrnSalvar = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnApagar = new javax.swing.JButton();

        setTitle("Editar Pedido");

        PnlEditarPedido.setBackground(new java.awt.Color(255, 255, 255));
        PnlEditarPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 3, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        PnlEditarPedido.setToolTipText("Editar Pedido");
        PnlEditarPedido.setAutoscrolls(true);

        TxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeActionPerformed(evt);
            }
        });

        LblNome.setText("Nome:");

        LblIdFuncionario.setText("ID Funcionario: ");

        TxtIdFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdFuncionarioActionPerformed(evt);
            }
        });

        LblCodCampus.setText("Cod Campus:");

        BrnSalvar.setText("Salvar");

        BtnLimpar.setText("Limpar");

        BtnCancelar.setText("Cancelar");

        BtnApagar.setText("Apagar");

        javax.swing.GroupLayout PnlEditarPedidoLayout = new javax.swing.GroupLayout(PnlEditarPedido);
        PnlEditarPedido.setLayout(PnlEditarPedidoLayout);
        PnlEditarPedidoLayout.setHorizontalGroup(
            PnlEditarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlEditarPedidoLayout.createSequentialGroup()
                .addGroup(PnlEditarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlEditarPedidoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(PnlEditarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LblCodCampus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblIdFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(LblNome, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlEditarPedidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BrnSalvar)
                        .addGap(44, 44, 44)))
                .addGroup(PnlEditarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlEditarPedidoLayout.createSequentialGroup()
                        .addComponent(BtnApagar)
                        .addGap(17, 17, 17)
                        .addComponent(BtnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancelar))
                    .addGroup(PnlEditarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TxtIdFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addComponent(TxtCodCampus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlEditarPedidoLayout.setVerticalGroup(
            PnlEditarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlEditarPedidoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PnlEditarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNome))
                .addGap(18, 18, 18)
                .addGroup(PnlEditarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblIdFuncionario)
                    .addComponent(TxtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlEditarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCodCampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCodCampus))
                .addGap(18, 18, 18)
                .addGroup(PnlEditarPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BrnSalvar)
                    .addComponent(BtnLimpar)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnApagar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlEditarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlEditarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeActionPerformed

    private void TxtIdFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdFuncionarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrnSalvar;
    private javax.swing.JButton BtnApagar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JLabel LblCodCampus;
    private javax.swing.JLabel LblIdFuncionario;
    private javax.swing.JLabel LblNome;
    private javax.swing.JPanel PnlEditarPedido;
    private javax.swing.JTextField TxtCodCampus;
    private javax.swing.JTextField TxtIdFuncionario;
    private javax.swing.JTextField TxtNome;
    // End of variables declaration//GEN-END:variables
}
