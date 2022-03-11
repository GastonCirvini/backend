
package com.springprueba.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter @Setter
public class Persona {
   
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String nombre;
   private String apellido;
   private int edad;

    public Persona() {
    }

   
   
    public Persona(String nombre, String apellido, int edad, Long id) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

   
   

   
    
   
}
