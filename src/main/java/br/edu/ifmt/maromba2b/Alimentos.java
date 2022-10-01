/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifmt.maromba2b;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author geekaia
 */
public class Alimentos extends javax.swing.JFrame {

    /**
     * Creates new form Alimentos
     */
    ConexaoDB con;
    public Alimentos() {
        initComponents();
        con = new ConexaoDB();
        con.connect();
        fillTable(); // coloque aqui
    }
    
    public void fillTable(){
        
       String col[] = {"ID","DESCRIÇÃO","UNIDADE", "PROTEÍNAS", "CALORIAS"};
       
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
         
         for (Object[] al: con.ListarAlimentos()) {
              tableModel.addRow(al);
         }
         
          jTable1.setModel(tableModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnInserir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbUnidade = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtQuantProt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQuantCalo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setFocusable(false);
        btnInserir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInserir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnInserir);

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setFocusable(false);
        btnAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAtualizar);

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setFocusable(false);
        btnRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRemover);

        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        btnRelatorio.setText("Relatório");
        btnRelatorio.setFocusable(false);
        btnRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRelatorio);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setFocusable(false);
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNovo);

        jLabel1.setText("Pesquisar");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Descrição do alimento");

        txtDescricao.setEnabled(false);

        jLabel3.setText("Unidade");

        cbUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbUnidade.setEnabled(false);

        jLabel4.setText("Quant. proteína");

        txtQuantProt.setEnabled(false);

        jLabel5.setText("Quant. calorias");

        txtQuantCalo.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPesquisar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(cbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtQuantProt, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtQuantCalo))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantProt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantCalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        
    txtDescricao.setText("");
    cbUnidade.setSelectedIndex(0);
    txtQuantProt.setText("");
    txtQuantCalo.setText("");
    
    txtDescricao.setEnabled(true);
    cbUnidade.setEnabled(true);
    txtQuantProt.setEnabled(true);
    txtQuantCalo.setEnabled(true);
    
    
    
    
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
    
        con.inserir(txtDescricao.getText(), 
                cbUnidade.getSelectedItem().toString(), 
                txtQuantProt.getText(), 
                txtQuantCalo.getText());
        
        
    txtDescricao.setEnabled(false);
    cbUnidade.setEnabled(false);
    txtQuantProt.setEnabled(false);
    txtQuantCalo.setEnabled(false);
    
    
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
         txtDescricao.setEnabled(false);
    cbUnidade.setEnabled(false);
    txtQuantProt.setEnabled(false);
    txtQuantCalo.setEnabled(false);
    
 //   (String descricao, String unid, 
   //         String valprot, String valcal, String id) 
            String identrada = JOptionPane.showInputDialog("ID: ");
    con.atualizar(txtDescricao.getText(), 
            cbUnidade.getSelectedItem().toString(), 
            txtQuantProt.getText(), 
            txtQuantCalo.getText(), identrada);
    
    
    
    
    
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
         txtDescricao.setEnabled(false);
    cbUnidade.setEnabled(false);
    txtQuantProt.setEnabled(false);
    txtQuantCalo.setEnabled(false);
    
         int rows = jTable1.getSelectedRow(); 
        
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       
       String idremove="-1"; 
        for (int i = 0; model.getRowCount() > i; i++) {
            if (rows == i) {
                idremove = (String) model.getValueAt(i, 0);
            } 
        }
        con.remover(idremove);
        fillTable();

    
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        // TODO add your handling code here:
        Object[] opcoes = {"CSV","TXT","PDF"};
        Object res = JOptionPane.showInputDialog(null, 
                "Tipo de arquivo" , 
                "Relatório " ,

                JOptionPane.PLAIN_MESSAGE , null ,
                opcoes,"");

        System.out.println("OPÇÃO SELECIONADA: "+res.toString());
        String opcSel = res.toString();
        
        String data="";
        for (Object[] al: con.ListarAlimentos()) {
              if (opcSel.equals("TXT"))
                 data += al[0] +" "+al[1] +"\n";
              else if(opcSel.equals("CSV"))
                  data += al[0] +";"+al[1] +"\n";
         }
        String arquivoSaida="relatorio.txt"; 
         if(opcSel.equals("CSV"))
             arquivoSaida="relatorio.csv";         
        File file = new File(arquivoSaida);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } 
        String progSaida="notepad.exe"; 
        if(opcSel.equals("CSV"))
            progSaida="calc"; // pressione CTRL+V AQUI 
        try {
             Process process; 
            process = Runtime.getRuntime()
            .exec(String.format(progSaida+" %s", arquivoSaida));

        } catch (Exception e) {
            e.printStackTrace();
        }
  
        
    }//GEN-LAST:event_btnRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(Alimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alimentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cbUnidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtQuantCalo;
    private javax.swing.JTextField txtQuantProt;
    // End of variables declaration//GEN-END:variables
}
