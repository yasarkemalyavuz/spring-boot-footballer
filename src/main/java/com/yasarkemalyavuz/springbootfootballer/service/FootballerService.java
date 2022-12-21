package com.yasarkemalyavuz.springbootfootballer.service;


import com.yasarkemalyavuz.springbootfootballer.entity.Footballer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FootballerService {

    private static List<Footballer> footballerList = new ArrayList<>();

    public List<Footballer> getFootballers(){

        return footballerList;
    }

    public List<Footballer> createFootballer(Footballer footballer){

        footballerList.add(footballer);
        return footballerList;
    }

    public ResponseEntity<String> updateFootballer(Footballer footballer){
        if (footballer.getName() == "" || footballer.getTeam() == "") {
            return new ResponseEntity<>("Boş Alanları Doldur", HttpStatus.BAD_REQUEST);
        }

        // users Listesi 10 tane USER
        //0 eleman -  user.getId=1 burak kutbay
        // user.getId= 1 burak yavuz
        // user.getId=3
        // user.getId=4 ahmet
        for (int i = 0; i < footballerList.size(); i++) {


            if (footballerList.get(i).getId() == footballer.getId()) {

                if (footballerList.get(i).getName() != footballer.getName()) {
                    footballerList.get(i).setName(footballer.getName());
                }

                if (footballerList.get(i).getTeam() != footballer.getTeam()) {
                    footballerList.get(i).setTeam(footballer.getTeam());
                }

            }

        }
        return new ResponseEntity<>("Alanlar Başarılı Şekilde Güncellendi", HttpStatus.ACCEPTED);
    }

    public List<Footballer> deleteFootballer(int id){

        for (int i = 0; i < footballerList.size(); i++) {
            if (footballerList.get(i).getId() == id) {

                footballerList.get(i).setTeam(null);
                footballerList.get(i).setName(null);
            }
        }

        return footballerList;
    }
}
