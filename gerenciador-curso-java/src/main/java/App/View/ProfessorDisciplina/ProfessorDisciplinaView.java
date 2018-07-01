package App.View.ProfessorDisciplina;

import App.Controller.Aluno.AlunoController;
import App.Controller.Professor.ProfessorController;
import App.Model.Aluno.IAluno;
import App.Model.Disciplina.Disciplina;
import App.Model.Disciplina.IDisciplina;
import App.View.Aluno.AlunoView;
import App.View.Aula.AulaView;
import App.View.Disciplina.DisciplinaView;
import App.View.Professor.ProfessorView;
import App.View.Relatorio.RelatorioView;
import java.awt.Color;
import java.awt.Point;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class ProfessorDisciplinaView extends javax.swing.JFrame {

    private int idProfessor;
    private String nomeProfessorByViewProfessor;

    public void setId(int id) {
        this.idProfessor = id;
    }

    public void setNomeProfessorByProfessorView(String nomeProfessorByViewProfessor) {
        this.nomeProfessorByViewProfessor = nomeProfessorByViewProfessor;
        this.nomeProfessor.setText(nomeProfessorByViewProfessor);
    }

    /**
     * Creates new form ContactEditorUI
     */
    public ProfessorDisciplinaView() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        mensagem = new javax.swing.JLabel();
        nomeProfessor = new javax.swing.JLabel();
        disciplinas = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        alunoMenu = new javax.swing.JMenu();
        professorMenu = new javax.swing.JMenu();
        disciplinaMenu = new javax.swing.JMenu();
        aulaMenu = new javax.swing.JMenu();
        relatorioMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("Professor:");

        jLabel2.setText("Disciplina:");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Conteúdo", "Carga Horária", "Tipo", "Ação"
            }
        ));
        tabela.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        nomeProfessor.setText("jLabel4");

        disciplinas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                disciplinasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        disciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disciplinasActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(disciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(nomeProfessor)
                    .addComponent(disciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaAncestorAdded

        ProfessorController controller = new ProfessorController();
        try {
            for (IDisciplina item : controller.getDisciplinasByProfessor(idProfessor)) {
                DefaultTableModel model = (DefaultTableModel) tabela.getModel();
                model.addRow(
                        new Object[]{
                            item.getCodigo(),
                            item.getConteudo(),
                            item.getCargaHoraria(),
                            item.getTipo(),
                            "Excluir"
                        }
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlunoController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tabelaAncestorAdded

    private void disciplinasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_disciplinasAncestorAdded

        DefaultComboBoxModel<String> newItem = new javax.swing.DefaultComboBoxModel<>();

        ProfessorController professor = new ProfessorController();

        try {
            for (IDisciplina disciplina : professor.disciplinas()) {
                newItem.addElement(disciplina.getCodigo());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDisciplinaView.class.getName()).log(Level.SEVERE, null, ex);
        }

        disciplinas.setModel(newItem);
    }//GEN-LAST:event_disciplinasAncestorAdded

    private void disciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disciplinasActionPerformed

    }//GEN-LAST:event_disciplinasActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String codigoDisciplina = disciplinas.getSelectedItem().toString();

        ProfessorController controller = new ProfessorController();
        try {
            controller.addProfessorDisciplinaByCodigo(idProfessor, codigoDisciplina);

            ProfessorDisciplinaView pd = new ProfessorDisciplinaView();
            pd.setId(idProfessor);
            pd.setNomeProfessorByProfessorView(nomeProfessorByViewProfessor);
            pd.setVisible(true);

            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDisciplinaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        Point point = evt.getPoint();
        int coluna = tabela.columnAtPoint(point);
        int linha = tabela.rowAtPoint(point);
        ProfessorController controller = new ProfessorController();
        int idDisciplina = 0;
        try {
            ArrayList<Disciplina> disciplinas = controller.getDisciplinasByProfessor(idProfessor);
            idDisciplina = disciplinas.get(linha).getIdProfessorDisciplina();
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDisciplinaView.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (coluna == 4 && idDisciplina != 0) {
            try {
                controller.excluir(idDisciplina);

                ProfessorDisciplinaView pd = new ProfessorDisciplinaView();
                pd.setId(idProfessor);
                pd.setNomeProfessorByProfessorView(nomeProfessorByViewProfessor);
                pd.setVisible(true);

                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(ProfessorDisciplinaView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_tabelaMouseClicked

    private void alunoMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunoMenuMouseClicked
          new AlunoView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_alunoMenuMouseClicked

    private void professorMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_professorMenuMouseClicked
        new ProfessorView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_professorMenuMouseClicked

    private void disciplinaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disciplinaMenuMouseClicked
        new DisciplinaView().setVisible(true);
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
            java.util.logging.Logger.getLogger(ProfessorDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfessorDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfessorDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfessorDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfessorDisciplinaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu alunoMenu;
    private javax.swing.JMenu aulaMenu;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JMenu disciplinaMenu;
    private javax.swing.JComboBox<String> disciplinas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mensagem;
    private javax.swing.JLabel nomeProfessor;
    private javax.swing.JMenu professorMenu;
    private javax.swing.JMenu relatorioMenu;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
