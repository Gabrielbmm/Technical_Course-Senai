package br.senai.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity (name = "funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    @Size(max = 100)
    @NotNull
    private String nome;
    @Size(max = 15)
    private String Cpf;
    @Size (max = 100)
    private String email;
    @Size(max = 30)
    private String telefone;

    //getter and setter
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getCPF() {return Cpf;}
    public void setCPF(String CPF) {this.Cpf = CPF;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    @Override
    public String toString() {
        return "Funcionario{" +
                "id: " + id +
                ", nome: " + nome  +
                ", CPF: " + Cpf +
                ", email: " + email  +
                ", telefone: " + telefone;
    }
}
