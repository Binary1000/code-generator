package com.cnqisoft.codegenerator;

import org.aspectj.util.FileUtil;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class GenerateController {

    public static void main(String[] args) throws IOException {
        File file = ResourceUtils.getFile("classpath:controller-template.txt");
        String controllerStr = FileUtil.readAsString(file).replace("${packageRoot}", "com.cnqisoft.codegenerator").replace("${Entity}", "File").replace("${entity}", "file");
        URL resource = GenerateController.class.getResource("");
        File file1 = new File("C:\\Users\\Binary\\Desktop\\code-generator\\src\\main\\java\\com\\cnqisoft\\codegenerator", "FileController.java");
        file1.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        fileOutputStream.write(controllerStr.getBytes());
        fileOutputStream.flush();
    }
}
