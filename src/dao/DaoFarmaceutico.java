/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.ConexaoMySql;
import javax.swing.JOptionPane;
import model.ModelFarmaceutico;

/**
 *
 * @author Joshua
 */
public class DaoFarmaceutico extends ConexaoMySql {

    public int saveFarmaceuticoDAO(ModelFarmaceutico modelFarmaceutico) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbFarmaceutico ("
                    + "nomeCompleto,"
                    + "telefone,"
                    + "email,"
                    + "sexo,"
                    + "estadoCivil,"
                    + "anoNasc,"
                    + "statusFarmaceutico,"
                    //+ "caminhoImage,"
                    //+ "imagen) VALUES ("
                    + "caminhoImage) VALUES ("
                    + "'" + modelFarmaceutico.getNomeCompleto() + "',"
                    + " '" + modelFarmaceutico.getTelefone() + "',"
                    + "'" + modelFarmaceutico.getEmail() + "',"
                    + "'" + modelFarmaceutico.getSexo() + "',"
                    + "'" + modelFarmaceutico.getEstadoCivil() + "',"
                    + "'" + modelFarmaceutico.getAnoNasc() + "',"
                    + "'" + modelFarmaceutico.getStatusFarmaceutico() + "',"
                    //+ "'" + modelFarmaceutico.getCaminhoImage()+ "',"
                    //+ "'" + modelFarmaceutico.getImagen()+ "')"
                    + "'" + modelFarmaceutico.getCaminhoImage()+ "')"
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

}
