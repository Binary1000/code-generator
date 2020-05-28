package ${packageRoot}.controller;

import ${packageRoot}.entity.${Entity};
import ${packageRoot}.service.${Entity}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ${Entity}Controller {

    @Autowired
    ${Entity}Service ${entity}Service;

    @GetMapping("/${entity}/{id}")
    List<${Entity}> queryById(@PathVariable Integer id) {
        return ${entity}Service.queryById(id);
    }

    @GetMapping("/${entity}")
    List<${Entity}> queryAll() {
        return ${entity}Service.queryAll();
    }

    @PostMapping("/${entity}")
    ${Entity} insert(${Entity} ${entity}) {
        return ${entity}Service.insert(${entity});
    }

    @DeleteMapping("/${entity}/{id}")
    boolean delete(@PathVariable Integer id) {
        return ${entity}Service.delete(id);
    }

    @PutMapping("/file")
    ${Entity} update(${Entity} ${entity}) {
        return ${entity}Service.update(${entity});
    }

}
