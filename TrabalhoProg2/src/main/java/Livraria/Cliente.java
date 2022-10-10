/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livraria;

/**
 *
 * @author LRodrigues
 */
public class Cliente  {
  
         private String nome;
         private String sobrenome;
         private String cpf;
         private String email;
         private String dataNasc;
         private String endereco;
                 
                 
    public Cliente(String nome, String sobrenome, String cpf,
            String email, String dataNasc, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", sobrenome=" + sobrenome +
                ", cpf=" + cpf + ", email=" + email + ", dataNasc=" + dataNasc + 
                ", endereco=" + endereco + '}';
    }


}

 



 
    

