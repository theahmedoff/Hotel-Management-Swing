/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Worker;

/**
 *
 * @author Ahmedov
 */
public interface WorkerDAO {
    
    List<Worker> getAllWorker();
    boolean removeWorkerTableRow(int id);
    boolean createWorker(Worker w);
    boolean updateWorker(int id);
}
