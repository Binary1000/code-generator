package com.cnqisoft.codegenerator.service;

import com.cnqisoft.codegenerator.entity.File;

import java.util.List;

/**
 * @author Binary
 */
public interface FileService {

    List<File> queryById(Integer id);

    List<File> queryAll();

    File insert(File file);

    boolean delete(Integer id);

    File update(File file);
}
