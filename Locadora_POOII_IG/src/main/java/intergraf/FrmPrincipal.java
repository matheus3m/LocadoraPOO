/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package intergraf;


import gerTarefas.GerenciadorInterGraf;
/**
 *
 * @author Matheus Milbratz
 */
public class FrmPrincipal extends javax.swing.JFrame {

    GerenciadorInterGraf gerIG;
    
    public FrmPrincipal(GerenciadorInterGraf novoGerIG) {        
        initComponents();
        gerIG = novoGerIG;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuCadCLiente = new javax.swing.JMenuItem();
        MenuCadPedido = new javax.swing.JMenuItem();
        MenuCadFilme = new javax.swing.JMenuItem();
        MenuConsulta = new javax.swing.JMenu();
        MenuConsultaCliente = new javax.swing.JMenuItem();
        MenuConsultaFilme = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/retrofilms (512 × 512 px).png"))); // NOI18N
        lblIcon.setText("jLabel1");

        MenuCadastro.setText("Cadastro");

        MenuCadCLiente.setText("Cliente");
        MenuCadCLiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadCLienteActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadCLiente);

        MenuCadPedido.setText("Pedido");
        MenuCadPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadPedidoActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadPedido);

        MenuCadFilme.setText("Filme");
        MenuCadFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadFilmeActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadFilme);

        MenuPrincipal.add(MenuCadastro);

        MenuConsulta.setText("Consultas");

        MenuConsultaCliente.setText("Cliente");
        MenuConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultaClienteActionPerformed(evt);
            }
        });
        MenuConsulta.add(MenuConsultaCliente);

        MenuConsultaFilme.setText("Filme");
        MenuConsultaFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultaFilmeActionPerformed(evt);
            }
        });
        MenuConsulta.add(MenuConsultaFilme);

        MenuPrincipal.add(MenuConsulta);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadCLienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadCLienteActionPerformed
        gerIG.abrirCadCliente();
    }//GEN-LAST:event_MenuCadCLienteActionPerformed

    private void MenuCadPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadPedidoActionPerformed
        gerIG.abrirCadPedido();
    }//GEN-LAST:event_MenuCadPedidoActionPerformed

    private void MenuCadFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadFilmeActionPerformed
        gerIG.abrirCadFilme();
    }//GEN-LAST:event_MenuCadFilmeActionPerformed

    private void MenuConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultaClienteActionPerformed
        gerIG.abrirPesqCliente();
    }//GEN-LAST:event_MenuConsultaClienteActionPerformed

    private void MenuConsultaFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultaFilmeActionPerformed
        gerIG.abrirPesqFilme();
    }//GEN-LAST:event_MenuConsultaFilmeActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCadCLiente;
    private javax.swing.JMenuItem MenuCadFilme;
    private javax.swing.JMenuItem MenuCadPedido;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenu MenuConsulta;
    private javax.swing.JMenuItem MenuConsultaCliente;
    private javax.swing.JMenuItem MenuConsultaFilme;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JLabel lblIcon;
    // End of variables declaration//GEN-END:variables
}