package com.Team2Java12.MechAppoint.controllers.DTO;

public class GetVeicoloDTO {

    private String tipoVeicolo;
    private String targa;
    private String dataImmatricolazione;
    private String proprietario;

    public String getTipoVeicolo() {
        return tipoVeicolo;
    }

    public void setTipoVeicolo(String tipoVeicolo) {
        this.tipoVeicolo = tipoVeicolo;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getDataImmatricolazione() {
        return dataImmatricolazione;
    }

    public void setDataImmatricolazione(String dataImmatricolazione) {
        this.dataImmatricolazione = dataImmatricolazione;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
}