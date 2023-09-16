package classes;

import java.util.Date;

/**
 *
 * @author Erica
 */
public class Cliente {

    private String idCliente;
    private int idTipo;
    private String nome;
    private String snome;
    private String endereco;
    private String telefone;
    private int idCidade;
    private Date nascimento;
    private Date data;

    public Cliente(String idCliente, int idTipo, String nome, String snome, String endereco, String telefone, int idCidade, Date nascimento, Date data) {
        this.idCliente = idCliente;
        this.idTipo = idTipo;
        this.nome = nome;
        this.snome = snome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idCidade = idCidade;
        this.nascimento = nascimento;
        this.data = data;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSnome() {
        return snome;
    }

    public void setSnome(String snome) {
        this.snome = snome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String email) {
        this.endereco = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return idCliente + "|"
                + idTipo + "|"
                + nome + "|"
                + snome + "|"
                + endereco + "|"
                + telefone + "|"
                + idCidade + "|"
                + Utilidades.formatDate(nascimento) + "|"
                + Utilidades.formatDate(data) ;
    }

}
