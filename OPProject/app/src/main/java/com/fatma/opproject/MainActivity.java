package com.fatma.opproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*user myUser=new user();
        myUser.name="fatma";
        myUser.job="ogretmen";

        user newUser= new user();
        newUser.name="Tan";
        newUser.job="Music";*/
        user myUser= new user("fatma","ogretmen");
        System.out.println(myUser.information());
        System.out.println(myUser.name);
        Musician Fuat=new Musician("Fuat","Guitar",75);
        Fuat.setAge(52,"fatma");
        System.out.println(Fuat.getAge());

        SuperMusician Mashar= new SuperMusician("mashar","saz",65);
        System.out.println(Mashar.sing());

        Mathematic mathematic= new Mathematic();
        System.out.println(mathematic.sum());
        System.out.println(mathematic.sum(2,5));
        System.out.println(mathematic.sum(3,85,9));

        Animal myAnimal= new Animal();
        myAnimal.sing();
        Dog myDog= new Dog();
        myDog.test();
        myDog.sing();
        Piano myPiano=new Piano();
        myPiano.brand="Yamaha";
        myPiano.digital=true;
        myPiano.info();



    }
}