package br.com.senai.infob.backend.projeto_comercio.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="usuario")

public class Usuario {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column (name= "id")
    private Integer id;

    @Column (name= "nome")
    private Integer nome;

    @Column (name= "email")
    private Integer email;

    @Column (name= "senha")
    private Integer senha;

    public Usuario() {
    }

    public Usuario(Integer email, Integer id, Integer nome, Integer senha) {
        this.email = email;
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNome() {
        return nome;
    }

    public void setNome(Integer nome) {
        this.nome = nome;
    }

    public Integer getEmail() {
        return email;
    }

    public void setEmail(Integer email) {
        this.email = email;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }
}

