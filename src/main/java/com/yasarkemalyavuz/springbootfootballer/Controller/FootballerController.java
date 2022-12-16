package com.yasarkemalyavuz.springbootfootballer.Controller;

import com.yasarkemalyavuz.springbootfootballer.Entity.Footballer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FootballerController {

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
