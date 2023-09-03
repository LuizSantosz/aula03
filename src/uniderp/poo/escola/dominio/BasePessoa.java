package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public abstract class BasePessoa {
    protected int codigo;
    protected String nome;
    protected String telefone;
    protected String emal;
    protected LocalDate dataNascimento;
    protected String registro;
    protected String usuario;
    protected String senha;
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmal() {
        return emal;
    }
    public void setEmal(String emal) {
        this.emal = emal;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public BasePessoa(int codigo, String nome, String telefone, String emal, LocalDate dataNascimento, String registro,
            String usuario, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.emal = emal;
        this.dataNascimento = dataNascimento;
        this.registro = registro;
        this.usuario = usuario;
        this.senha = senha;
    }
}