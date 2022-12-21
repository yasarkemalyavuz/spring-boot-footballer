package com.yasarkemalyavuz.springbootfootballer.controller;

import com.yasarkemalyavuz.springbootfootballer.entity.Footballer;
import com.yasarkemalyavuz.springbootfootballer.service.FootballerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crud")
public class FootballerController {


    @Autowired
    FootballerService footballerService;

    @GetMapping("")
    public List<Footballer> getFootballers() {
        return  footballerService.getFootballers();
    }

    @PostMapping("/save")
    public List<Footballer> createFootballer(@RequestBody Footballer footballer) {
        return  footballerService.createFootballer(footballer);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateFootballer(@RequestBody Footballer footballer) {
        return footballerService.updateFootballer(footballer);
    }


    // localhost:8080/crud/delete/2
    @DeleteMapping("/delete/{id}")
    public List<Footballer> deleteFootballer(@PathVariable(value = "id") int id) {

        return footballerService.deleteFootballer(id);
    }
/*
  //getter metotda var
    /**
     * Setter injection
     * @param userService
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
 */










    @GetMapping("/path1/{input1}/{input2}")
    public String footballer1(@PathVariable()String input1, @PathVariable()String input2  ){

        Footballer footballer = new Footballer(1,30, input1,input2);
        return footballer.getId()+"      "+footballer.getName()+"   "+ footballer.getTeam()+ "   "+ footballer.getAge();

        //http://localhost:8080/path1/casemiro/manu
        //1 casemiro manu 30
    }

    @GetMapping("/path2/{x}/{y}/ok")
    public double footballer2(@PathVariable() String x , @PathVariable() String y){

        Footballer footballer = new Footballer(2,25,x,y);
        return 0.8;
    }

}
