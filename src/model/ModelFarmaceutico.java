/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author Joshua
 */
public class ModelFarmaceutico {

    private int idFarmaceutico;
    private String nomeCompleto;
    private int telefone;
    private String email;
    private String sexo;
    private String estadoCivil;
    private Date anoNasc;
    private String statusFarmaceutico;
    private String caminhoImage;
    //private Image imagen;

    public int getIdFarmaceutico() {
        return idFarmaceutico;
    }

    public String getCaminhoImage() {
        return caminhoImage;
    }

    public void setCaminhoImage(String caminhoImage) {
        this.caminhoImage = caminhoImage;
    }

    /*public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }*/

    public void setIdFarmaceutico(int idFarmaceutico) {
        this.idFarmaceutico = idFarmaceutico;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(Date anoNasc) {
        this.anoNasc = anoNasc;
    }

    public String getStatusFarmaceutico() {
        return statusFarmaceutico;
    }

    public void setStatusFarmaceutico(String statusFarmaceutico) {
        this.statusFarmaceutico = statusFarmaceutico;
    }

}
