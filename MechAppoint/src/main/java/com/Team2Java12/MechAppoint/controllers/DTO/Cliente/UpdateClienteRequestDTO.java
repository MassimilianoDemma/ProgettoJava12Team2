package com.Team2Java12.MechAppoint.controllers.DTO.Cliente;

public class UpdateClienteRequestDTO {
    private String username;
    private String password;
    private String email;
    private Integer cellulare;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCellulare() {
        return cellulare;
    }

    public void setCellulare(Integer cellulare) {
        this.cellulare = cellulare;
    }
}