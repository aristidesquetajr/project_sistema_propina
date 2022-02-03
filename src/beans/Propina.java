package beans;

/**
 *
 * @author kashiki
 */
public class Propina {
    private int idPropina;
    private Aluno fkAluno;
    private Utilizador fkUtilizador;
    private float val;
    private int multa;

    public int getIdPropina() {
        return idPropina;
    }

    public void setIdPropina(int idPropina) {
        this.idPropina = idPropina;
    }

    public Aluno getFkAluno() {
        return fkAluno;
    }

    public void setFkAluno(Aluno fkAluno) {
        this.fkAluno = fkAluno;
    }

    public Utilizador getFkUtilizador() {
        return fkUtilizador;
    }

    public void setFkUtilizador(Utilizador fkUtilizador) {
        this.fkUtilizador = fkUtilizador;
    }

    public float getVal() {
        return val;
    }

    public void setVal(float val) {
        this.val = val;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }
    
    
}
