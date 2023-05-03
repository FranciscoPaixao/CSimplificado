/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.sou.dev.csimplificado;

import br.sou.dev.classes.Controlador;
import br.sou.dev.classes.DescSimbolo;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class TelaMain extends javax.swing.JFrame {

    Controlador controlador;
    String caminhoArquivo;

    /**
     * Creates new form TelaTeste2
     */
    public TelaMain() {
        initComponents();
        caminhoArquivo = null;
        controlador = new Controlador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        sp_Tabela = new javax.swing.JScrollPane();
        tb_TabelaDeSimbolos = new javax.swing.JTable();
        sp_CodigoFonte = new javax.swing.JScrollPane();
        tp_CodigoFonte = new javax.swing.JTextPane();
        bt_SelecionarArquivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_CaminhoArquivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bt_AnaliseLexica = new javax.swing.JButton();
        sp_Erros = new javax.swing.JScrollPane();
        tp_Erros = new javax.swing.JTextPane();

        fileChooser.setFileFilter(new filtroCustomizado());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(879, 542));
        setSize(new java.awt.Dimension(879, 542));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_TabelaDeSimbolos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Lexema", "TOKEN", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sp_Tabela.setViewportView(tb_TabelaDeSimbolos);
        if (tb_TabelaDeSimbolos.getColumnModel().getColumnCount() > 0) {
            tb_TabelaDeSimbolos.getColumnModel().getColumn(0).setResizable(false);
            tb_TabelaDeSimbolos.getColumnModel().getColumn(1).setResizable(false);
            tb_TabelaDeSimbolos.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(sp_Tabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 430, 400));

        sp_CodigoFonte.setToolTipText("");

        tp_CodigoFonte.setEditable(false);
        tp_CodigoFonte.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sp_CodigoFonte.setViewportView(tp_CodigoFonte);

        getContentPane().add(sp_CodigoFonte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 380, 240));

        bt_SelecionarArquivo.setText("Selecionar arquivo");
        bt_SelecionarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SelecionarArquivoActionPerformed(evt);
            }
        });
        getContentPane().add(bt_SelecionarArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel1.setText("Codigo Fonte:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setText("Erros:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        tf_CaminhoArquivo.setEditable(false);
        getContentPane().add(tf_CaminhoArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 220, -1));

        jLabel3.setText("Arquivo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        bt_AnaliseLexica.setText("Iniciar Análise Léxica e Sintatica");
        bt_AnaliseLexica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_AnaliseLexicaMouseClicked(evt);
            }
        });
        getContentPane().add(bt_AnaliseLexica, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        sp_Erros.setViewportView(tp_Erros);

        getContentPane().add(sp_Erros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 380, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_SelecionarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SelecionarArquivoActionPerformed

        fileChooser.showOpenDialog(null);
        if (fileChooser.getSelectedFile() != null) {
            File arquivo = fileChooser.getSelectedFile();
            this.caminhoArquivo = arquivo.getAbsolutePath();
            tf_CaminhoArquivo.setText(caminhoArquivo);
        }

    }//GEN-LAST:event_bt_SelecionarArquivoActionPerformed

    private void bt_AnaliseLexicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AnaliseLexicaMouseClicked
        if (this.caminhoArquivo != null) {
            try {
                controlador.LerArquivo(caminhoArquivo);
            } catch (IOException ex) {
                Logger.getLogger(TelaMain.class.getName()).log(Level.SEVERE, null, ex);
            }

            controlador.FazerAnalise();
            tp_CodigoFonte.setText(controlador.ObterCodigoFonte());
            tp_Erros.setText(controlador.obterErrosTexto());
            atualizarTabela();
        }
    }//GEN-LAST:event_bt_AnaliseLexicaMouseClicked

    class filtroCustomizado extends javax.swing.filechooser.FileFilter {

        @Override
        public boolean accept(File file) {
            return file.isDirectory() || file.getAbsolutePath().endsWith(".c");
        }

        @Override
        public String getDescription() {
            return "C documents (*.c)";
        }
    }

    public void atualizarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaDeSimbolos.getModel();
        modelo.setNumRows(0);
        for (DescSimbolo ds : controlador.ObterTabelaDeSimbolos()) {
            modelo.addRow(new Object[]{ds.lexema, ds.token, ds.descricao});
        }
    }

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
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_AnaliseLexica;
    private javax.swing.JButton bt_SelecionarArquivo;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane sp_CodigoFonte;
    private javax.swing.JScrollPane sp_Erros;
    private javax.swing.JScrollPane sp_Tabela;
    private javax.swing.JTable tb_TabelaDeSimbolos;
    private javax.swing.JTextField tf_CaminhoArquivo;
    private javax.swing.JTextPane tp_CodigoFonte;
    private javax.swing.JTextPane tp_Erros;
    // End of variables declaration//GEN-END:variables
}
