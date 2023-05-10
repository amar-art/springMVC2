package com.ghazalatc.springmvc;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/nom")
public class ClientController {



 public List<Personne> getList(){
     List<Personne> personnes=new ArrayList<>();
     personnes.add(new Personne("ammar","ragad",30));
     personnes.add(new Personne("ali","maghraoui",40));
     personnes.add(new Personne("mohamed","smati",40));


     return personnes;
 }

 @GetMapping
    public String getname(){

     return "amar ragad";
 }
 @GetMapping("/listepersonne")

    public List<Personne> getMyList(){

      List<Personne> mylist=getList();
     return mylist;
 }
 @PostMapping

    public List<Personne> ajouter(@RequestBody Personne p){

     List<Personne> personnes=getList();
     personnes.add(p);
     return personnes;
 }
 @DeleteMapping("/delete/{index}")

    public List<Personne> supprimer(@PathVariable int index){

     List<Personne>  mylist=getList();
     mylist.remove(index);
     return mylist;

 }
    @DeleteMapping("/deleteage/{age}")
    public  List<Personne> supprimerAge(@PathVariable int age) {
     List<Personne> mylist = getList();
       /* List<Personne> mylist1=new ArrayList<>();
        for (Personne personne:mylist) {
            if (personne.getAge() == age)
                mylist1.add(personne);
        }
        mylist.removeAll(mylist1);*/

        mylist.removeIf(personne -> personne.getAge()==age);


        return mylist;
 }
 @PutMapping("/update/{index}")
    public List<Personne> update(@RequestBody Personne p,@PathVariable int index){

             List<Personne> mylist=getList();
            /*  Personne personne=mylist.get(index);
            */

     for (Personne personne:mylist) {
         if (mylist.indexOf(personne)==index)
         {
             p.setFirstName(personne.getFirstName());
             p.setLastName(personne.getLastName());
             p.setAge(personne.getAge());
             mylist.add(p);
             break;
         }

     }

              return mylist;

 }


}
