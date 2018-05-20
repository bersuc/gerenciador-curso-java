package com.gerenciador.Model.AulaAluno;

import com.gerenciador.Model.Model;
import java.sql.ResultSet;
import java.sql.SQLException;

abstract public class AulaAlunoDAO  extends Model {
    
    private Integer id;
    private Integer fkAluno;
    private Integer fkAula;
    
    /**
     *
     * @throws SQLException
     */
    public AulaAlunoDAO(Integer fkAluno, Integer fkAula) throws SQLException {
        super();
        this.fkAluno = fkAluno;
        this.fkAula = fkAula;
        TABELA = "aula-aluno";
        setCampos();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFkAluno() {
        return fkAluno;
    }

    public void setFkAluno(Integer fkAluno) {
        this.fkAluno = fkAluno;
    }

    public Integer getFkAula() {
        return fkAula;
    }

    public void setFkAula(Integer fkAula) {
        this.fkAula = fkAula;
    }

    /**
     *
     * @throws SQLException
     */
    @Override
    public void insert() throws SQLException {
        String query = getQueryInsert();
        statement = connection.prepareStatement(query);
        statement.setInt(1, getFkAula());
        statement.setInt(2, getFkAluno());
        statement.execute();
    }

    @Override
    public void update() throws SQLException {
        String query = getQueryUpdate();
        statement = connection.prepareStatement(query);
        statement.setInt(1, getFkAula());
        statement.setInt(2, getFkAluno());
        statement.setInt(3, getId());
        statement.execute();
    }

    @Override
    public void setById(Integer id) throws SQLException {
        ResultSet res = findById(id);
        while (res.next()) {
            setAll(res);
        }
    }

    @Override
    protected void setCampos() {
        colunasBD.add("fkAula");
        colunasBD.add("fkAluno");
    }
    
    /**
     *
     * @param res
     * @throws SQLException
     */
    protected void setAll(ResultSet res) throws SQLException {
        setFkAula(res.getInt("fkAula"));
        setFkAluno(res.getInt("fkAluno"));
        setId(res.getInt("id"));
    }
    
}
