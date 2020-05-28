package com.cnqisoft.codegenerator.service.impl;

import com.cnqisoft.codegenerator.dao.FileDAO;
import com.cnqisoft.codegenerator.entity.File;
import com.cnqisoft.codegenerator.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    FileDAO fileDAO;

    @Override
    public List<File> queryById(Integer id) {
        return fileDAO.queryById(id);
    }

    @Override
    public List<File> queryAll() {
        return fileDAO.queryAll();
    }

    @Override
    public File insert(File file) {
        return fileDAO.insert(file);
    }

    @Override
    public boolean delete(Integer id) {
        return fileDAO.delete(id);
    }

    @Override
    public File update(File file) {
        return fileDAO.update(file);
    }
}
