package br.com.saecatalao.sae30;

public class Users {
    String nome, email, sobrenome, entrega, vencimento;
    int telefone, celular, matricula;

    public Users(String n, String sn, String e, String ent, String v, int t, int c, int m){
        nome = n;
        sobrenome = sn;
        email = e;
        telefone = t;
        celular = c;
        matricula = m;
        entrega = ent;
        vencimento = v;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /*
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }*/
}
