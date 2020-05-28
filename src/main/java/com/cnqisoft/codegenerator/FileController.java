package com.cnqisoft.codegenerator;

import com.cnqisoft.codegenerator.entity.File;
import com.cnqisoft.codegenerator.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileService fileService;

    @GetMapping("/file/{id}")
    List<File> queryById(@PathVariable Integer id) {
        return fileService.queryById(id);
    }

    @GetMapping("/file")
    List<File> queryAll() {
        return fileService.queryAll();
    }

    @PostMapping("/file")
    File insert(File file) {
        return fileService.insert(file);
    }

    @DeleteMapping("/file/{id}")
    boolean delete(@PathVariable Integer id) {
        return fileService.delete(id);
    }

    @PutMapping("/file")
    File update(File file) {
        return fileService.update(file);
    }

}
