package App.Model.Aula;

import App.Model.Aluno.Aluno;
import App.Model.Disciplina.IDisciplina;
import App.Model.Professor.IProfessor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface IAula {

    /**
     *
     * @return @throws SQLException
     */
    public ResultSet findAll() throws SQLException;

    public boolean existe(String valor, String campo) throws SQLException;

    /**
     *
     * @param id
     * @throws SQLException
     */
    public void removeById(Integer id) throws SQLException;

    public Integer getId();

    public void setId(Integer id);

    public IDisciplina getDisciplina();

    public IProfessor getProfessor();

    public String getData();

    public void setData(String data);

    /**
     *
     * @throws SQLException
     */
    public void insert() throws SQLException;

    public void update() throws SQLException;

    /**
     *
     * @param id
     * @throws SQLException
     */
    public void setById(Integer id) throws SQLException;

    public List<Aluno> getAlunos() throws SQLException;

    /**
     *
     * @return @throws SQLException
     */
    public List<Aula> getAll() throws SQLException;

    public void setDisciplina(IDisciplina disciplina);

    public void setProfessor(IProfessor professor);

}