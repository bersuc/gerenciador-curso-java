package App.View.Aula;

import App.Controller.Aula.AulaController;
import App.View.Professor.*;
import App.Model.Aula.IAula;
import App.Model.Disciplina.IDisciplina;
import App.Model.Professor.IProfessor;
import App.View.Aluno.AlunoView;
import App.View.AulaAluno.AulaAlunoView;
import App.View.Disciplina.DisciplinaView;
import App.View.ProfessorDisciplina.ProfessorDisciplinaView;
import App.View.Relatorio.RelatorioView;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import java.awt.Point;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernanda
 */
public class AulaView extends javax.swing.JFrame {

    /**
     * Creates new form ContactEditorUI
     */
    public AulaView() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        data = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        mensagem = new javax.swing.JLabel();
        disciplina = new javax.swing.JLabel();
        disciplinas = new javax.swing.JComboBox<>();
        professores = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        alunoMenu = new javax.swing.JMenu();
        professorMenu = new javax.swing.JMenu();
        menuDisciplina = new javax.swing.JMenu();
        aulaMenu = new javax.swing.JMenu();
        relatorioMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerenciar Aula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("Professor:");

        jLabel3.setText("Data:");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Professor", "Disciplina", "Data", "Alunos", "Realizar aula", "Status", "Excluir"
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

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        disciplina.setText("Disciplina: ");

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

        professores.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                professoresAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        professores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(professores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(disciplina)
                .addGap(18, 18, 18)
                .addComponent(disciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(disciplina)
                            .addComponent(disciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(professores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
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

        menuDisciplina.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuDisciplina.setText("Disciplina");
        menuDisciplina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDisciplinaMouseClicked(evt);
            }
        });
        menuDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDisciplinaActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuDisciplina);

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
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String novoProfessor = professores.getSelectedItem().toString();
        String novaDisciplina = disciplinas.getSelectedItem().toString();
        
        AulaController novo = new AulaController(novoProfessor, novaDisciplina, data.getText());
        try {
            novo.addAula();
        } catch (SQLException ex) {
            Logger.getLogger(AulaView.class.getName()).log(Level.SEVERE, null, ex);
        }

        mensagem.setForeground(Color.GREEN);
        mensagem.setText("Professor cadastrado com sucesso");

        data.setText(null);

        new AulaView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void menuDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDisciplinaActionPerformed

    }//GEN-LAST:event_menuDisciplinaActionPerformed

    private void tabelaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaAncestorAdded

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        AulaController aulas = new AulaController();
        try {
            for (IAula aula : aulas.aulas()) {
                String statusAula = "Aula realizada";
                if (aula.isStatus()) {
                    statusAula = "Aula não realizada";
                }
                model.addRow(
                        new Object[]{
                            aula.getProfessor().getNome(),
                            aula.getDisciplina().getCodigo(),
                            aula.getData(),
                            "Alunos",
                            "Realizar aula",
                            statusAula,
                            "Excluir"
                        }
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(AulaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelaAncestorAdded

    private void alunoMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunoMenuMouseClicked
        new AlunoView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_alunoMenuMouseClicked

    private void professorMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_professorMenuMouseClicked
        new ProfessorView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_professorMenuMouseClicked

    private void menuDisciplinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDisciplinaMouseClicked
        new DisciplinaView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuDisciplinaMouseClicked

    private void aulaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aulaMenuMouseClicked
        new AulaView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_aulaMenuMouseClicked

    private void disciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disciplinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disciplinasActionPerformed

    private void disciplinasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_disciplinasAncestorAdded
        DefaultComboBoxModel<String> newItem = new javax.swing.DefaultComboBoxModel<>();

        AulaController itens = new AulaController();

        try {
            for (IDisciplina item : itens.disciplinas()) {
                newItem.addElement(item.getCodigo());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDisciplinaView.class.getName()).log(Level.SEVERE, null, ex);
        }

        disciplinas.setModel(newItem);
    }//GEN-LAST:event_disciplinasAncestorAdded

    private void professoresAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_professoresAncestorAdded
        DefaultComboBoxModel<String> newItem = new javax.swing.DefaultComboBoxModel<>();

        AulaController itens = new AulaController();

        try {
            for (IProfessor item : itens.professores()) {
                newItem.addElement(item.getMatricula());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDisciplinaView.class.getName()).log(Level.SEVERE, null, ex);
        }

        professores.setModel(newItem);
    }//GEN-LAST:event_professoresAncestorAdded

    private void professoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professoresActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

        Point point = evt.getPoint();
        // Captura o numero da coluna
        int coluna = tabela.columnAtPoint(point);
        // Captura o número da linha
        int linha = tabela.rowAtPoint(point);

        AulaController controller = new AulaController();

        // Verifica qual foi o número da coluna e realiza alguma ação 
        switch (coluna) {
            case 3:
                this.dispose();
                // Crio uma nova tela
                AulaAlunoView viewAluno = new AulaAlunoView();
                 {
                    try {
                        viewAluno.setAula(controller.aulas().get(linha).getData());
                        viewAluno.setIdAula(controller.aulas().get(linha).getId());
                    } catch (SQLException ex) {
                        Logger.getLogger(AulaView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                // Exibo essa nova tela.
                viewAluno.setVisible(true);
                break;
            case 4: {
                try {
                    controller.realizarAula(controller.aulas().get(linha).getId());
                } catch (SQLException ex) {
                    Logger.getLogger(AulaView.class.getName()).log(Level.SEVERE, null, ex);
                }
                // Crio uma nova tela
                AulaView view = new AulaView();
                // Exibo essa nova tela.
                view.setVisible(true);
                // Fecha a antiga tela
                this.dispose();
            }
            break;
            // Se a coluna for excluir 
            case 6:
                // Crio uma nova tela
                AulaView view = new AulaView();
                // Exibo essa nova tela.
                view.setVisible(true);
                 {
                    try {
                        // Excluir o registro 
                        view.mensagem.setText(controller.excluir(controller.aulas().get(linha).getId()));

                    } catch (SQLException ex) {
                        Logger.getLogger(AlunoView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                // Fecha a antiga tela
                this.dispose();

                /**
                 * view.setVisible(true); this.dispose();
                 *
                 * São utilizados para atualizar a tela.
                 */
                break;
        }

    }//GEN-LAST:event_tabelaMouseClicked

    private void relatorioMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorioMenuMouseClicked
        new RelatorioView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_relatorioMenuMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AulaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu alunoMenu;
    private javax.swing.JMenu aulaMenu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField data;
    private javax.swing.JLabel disciplina;
    public static javax.swing.JComboBox<String> disciplinas;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mensagem;
    private javax.swing.JMenu menuDisciplina;
    private javax.swing.JMenu professorMenu;
    private javax.swing.JComboBox<String> professores;
    private javax.swing.JMenu relatorioMenu;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
