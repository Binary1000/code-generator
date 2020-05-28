package com.cnqisoft.codegenerator.dao;

import com.cnqisoft.codegenerator.entity.File;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileDAO {

    List<File> queryById(Integer id);

    List<File> queryAll();

    File insert(File file);

    boolean delete(Integer id);

    File update(File file);

}
