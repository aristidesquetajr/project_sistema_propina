package beans;

/**
 *
 * @author kashiki
 */
public class Mensalidade {
    private int idMensalidade;
    private Propina fkPropina;
    private String mes;

    public int getIdMensalidade() {
        return idMensalidade;
    }

    public void setIdMensalidade(int idMensalidade) {
        this.idMensalidade = idMensalidade;
    }

    public Propina getFkPropina() {
        return fkPropina;
    }

    public void setFkPropina(Propina fkPropina) {
        this.fkPropina = fkPropina;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    
}
