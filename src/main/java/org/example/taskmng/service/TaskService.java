package org.example.taskmng.service;


import org.example.taskmng.entities.ISPtask;
import org.example.taskmng.repositories.IspTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final IspTaskRepository taskRepository;

    @Autowired
    public TaskService(IspTaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    public ISPtask createTask(ISPtask task) {
        return taskRepository.save(task);
    }


    public ISPtask getTaskById(int id) {
        return taskRepository.findById(id).orElse(null);
    }

    public List<ISPtask> getAllTasks() {
        return taskRepository.findAll();
    }


    public ISPtask editTask(int id, ISPtask newTaskData) {
        ISPtask existingTask = taskRepository.findById(id).orElse(null);
        if (existingTask != null) {
            existingTask.setIspTask(newTaskData.getIspTask());
            existingTask.setEngineerAssigned(newTaskData.getEngineerAssigned());
            existingTask.setStatus(newTaskData.isStatus());

            return taskRepository.save(existingTask);
        }
        return null;
    }

    public boolean deleteTask(int id) {
        ISPtask existingTask = taskRepository.findById(id).orElse(null);
        if (existingTask != null) {
            taskRepository.delete(existingTask);
            return true;
        }
        return false;
    }
}