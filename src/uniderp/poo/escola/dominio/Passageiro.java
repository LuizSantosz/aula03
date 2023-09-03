package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Passageiro extends BasePessoa{

    private String numeroCartao;
    private String documento;
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public Passageiro(int codigo, String nome, String telefone, String emal, LocalDate dataNascimento, String registro,
            String usuario, String senha, String numeroCartao, String documento) {
        super(codigo, nome, telefone, emal, dataNascimento, registro, usuario, senha);
        this.numeroCartao = numeroCartao;
        this.documento = documento;
    }
}