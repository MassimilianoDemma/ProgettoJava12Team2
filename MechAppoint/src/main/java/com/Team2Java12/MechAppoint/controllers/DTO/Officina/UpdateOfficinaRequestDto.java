package com.Team2Java12.MechAppoint.controllers.DTO.Officina;

public class UpdateOfficinaRequestDto {

    private String nome;
    private String nomeSostituto;
    private String indirizzo;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeSostituto() {
        return nomeSostituto;
    }

    public void setNomeSostituto(String nomeSostituto) {
        this.nomeSostituto = nomeSostituto;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
