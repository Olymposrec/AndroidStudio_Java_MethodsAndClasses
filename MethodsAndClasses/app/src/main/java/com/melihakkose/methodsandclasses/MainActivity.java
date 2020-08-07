package com.melihakkose.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("On Create Called.");
        TestMethod();
        System.out.println(Value(3,5));
        System.out.println(newMethod("Test Method: "));
        username="";
        MakePlayers();
        MakeCoach();

    }

    public void MakePlayers(){
        //Instance
        FootballPlayers player=new FootballPlayers("Mohammed Salah","Forward",28);
        System.out.println(player.name+" "+player.age+" " +player.position);


    }
    public void MakeCoach(){
        //Instance
        //All Attribute are Public name,age,country; Protected team
        Coach td=new Coach("Jürgen Klopp",53,"Germany");
        System.out.println(td.name+" "+td.age+" "+td.country+" "+td.team);
        td.age=60;
        //td.team="Test Team";
        //We can't access Coach Class Attribute = Private td.Salary
        //We can access td.team but we can' t change the value

        //Private Attribute
        Random rand=new Random();
        int gnrId=rand.nextInt(999);
        int gnrSalary=rand.nextInt(100000);
        int gnrAchieve=rand.nextInt(100);


        System.out.println("Private Datum:");

        //Random Data
        td.setId(gnrId);
        td.setAchievements(gnrAchieve);
        td.setSalary(gnrSalary);

        //SOUT
        System.out.println("ID:"+td.getId());
        System.out.println("Salary:"+td.getSalary()+"$");
        System.out.println("Achievements:"+td.getAchievements()+"Cups");


    }



    public void TestMethod(){
        int x=4+4;
        System.out.println("Value of x:"+x);
        username="vega";
    }
    public int Value(int a, int b){
        username="kirk";
        return a+b;
    }
    public String newMethod(String string){
        username="darius";
        return string+" 'newMethod' Called.";
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("On Resume Called.");
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("On Stop Called.");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("On Pause Called.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("On Destroy Called.");
    }
}