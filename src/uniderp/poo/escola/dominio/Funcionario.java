package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Funcionario extends BasePessoa{
    private String contaCorrente;
    private String cracha;
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public Funcionario(int codigo, String nome, String telefone, String emal, LocalDate dataNascimento, String registro,
            String usuario, String senha, String contaCorrente, String cracha) {
        super(codigo, nome, telefone, emal, dataNascimento, registro, usuario, senha);
        this.contaCorrente = contaCorrente;
        this.cracha = cracha;
    }
}