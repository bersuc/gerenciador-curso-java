/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.View.Relatorio;

import App.View.Disciplina.*;
import App.View.Aluno.*;
import App.Controller.Aluno.AlunoController;
import App.Controller.Disciplina.DisciplinaController;
import App.Model.Aluno.IAluno;
import App.Model.Disciplina.IDisciplina;
import App.View.Aula.AulaView;
import App.View.Professor.ProfessorView;
import java.awt.Color;
import java.awt.Point;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernanda
 */
public class RelatorioView extends javax.swing.JFrame {

    /**
     * Creates new form ContactEditorUI
     */
    public RelatorioView() {
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

        jPanel1 = new javax.swing.JPanel();
        mensagem = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        alunoMenu = new javax.swing.JMenu();
        professorMenu = new javax.swing.JMenu();
        disciplinaMenu = new javax.swing.JMenu();
        aulaMenu = new javax.swing.JMenu();
        relatorioMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerenciar Disciplina", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addGap(457, 457, 457))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        alunoMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        alunoMenu.setText("Aluno");
        alunoMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alunoMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(alunoMenu);

        professorMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        professorMenu.setText("Professor");
        professorMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                professorMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(professorMenu);

        disciplinaMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        disciplinaMenu.setText("Disciplina");
        disciplinaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disciplinaMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(disciplinaMenu);

        aulaMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aulaMenu.setText("Aula");
        aulaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aulaMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(aulaMenu);

        relatorioMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        relatorioMenu.setText("Relatórios");
        relatorioMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relatorioMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(relatorioMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Disciplinas");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alunoMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunoMenuMouseClicked
        new AlunoView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_alunoMenuMouseClicked

    private void professorMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_professorMenuMouseClicked
        new ProfessorView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_professorMenuMouseClicked

    private void disciplinaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disciplinaMenuMouseClicked
        new RelatorioView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_disciplinaMenuMouseClicked

    private void aulaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aulaMenuMouseClicked
        new AulaView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_aulaMenuMouseClicked

    private void relatorioMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorioMenuMouseClicked
        new RelatorioView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_relatorioMenuMouseClicked

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
            java.util.logging.Logger.getLogger(RelatorioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu alunoMenu;
    private javax.swing.JMenu aulaMenu;
    private javax.swing.JMenu disciplinaMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensagem;
    private javax.swing.JMenu professorMenu;
    private javax.swing.JMenu relatorioMenu;
    // End of variables declaration//GEN-END:variables
}
