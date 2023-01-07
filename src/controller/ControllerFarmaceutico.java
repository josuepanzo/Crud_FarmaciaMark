/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoFarmaceutico;
import model.ModelFarmaceutico;

/**
 *
 * @author Joshua
 */
public class ControllerFarmaceutico {
    
    private DaoFarmaceutico daoFarmaceutico = new DaoFarmaceutico();
    
    public int saveFarmaceuticoController(ModelFarmaceutico modelFarmaceutico) {
        return daoFarmaceutico.saveFarmaceuticoDAO(modelFarmaceutico);
    }
    
}
