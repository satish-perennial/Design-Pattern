package com.design.patterns;

import com.design.patterns.Singlton.SingleTonConcept;
import com.design.patterns.builder.Mobile;
import com.design.patterns.decorator.AlarmDecorator;
import com.design.patterns.decorator.Bike;
import com.design.patterns.decorator.ElectricDecorator;
import com.design.patterns.decorator.RoadBike;
import com.design.patterns.factory.Db;
import com.design.patterns.factory.DbFactory;
import com.design.patterns.factory.DbType;
import com.design.patterns.factory2.DatabaseFactory;
import com.design.patterns.factory2.Package;
import com.design.patterns.factory2.PackageType;
import com.design.patterns.prototype.GameRegistry;
import com.design.patterns.prototype.GameType;
import com.design.patterns.prototype.Ludo;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("SingleTon : 1 ");
        System.out.println("Factory : 2 ");
        System.out.println("Factory 2 Example : 3 ");
        System.out.println("Prototype : 4 ");
        System.out.println("Builder : 5 ");
        System.out.println("Decorator : 6");
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        switch (s) {
            case 1 -> singleTonExample();
            case 2 -> factoryExample();
            case 3 -> factoryExample2();
            case 4 -> prototypeExample();
            case 5 -> builderExample();
            case 6 -> decoratorExample();
        }
//gg

    }

    private static void decoratorExample() {
        System.out.println("Decorator Example Runnning ");
       /* Bike bike=new RoadBike("Road Bike");
        bike.showDetails();*/


        Bike bike=new ElectricDecorator(new AlarmDecorator(new RoadBike("Hero")));
        bike.showDetails();


        /*
        Bike bikeElectric=new ElectricDecorator(new AlarmDecorator(new RoadBike("Hero")));
        bikeElectric.showDetails();*/
    }

    private static void builderExample() {
        System.out.println("Builder Example Runnning ");
        Mobile mobile=new Mobile.Builder().setName("Real Me").setColor("Red").setProcessor("Octa core").setRam("8 GB").setPrice("20000").build();
        System.out.println(mobile);

        Mobile mobile1=new Mobile.Builder().setName("JIO").build();
        System.out.println(mobile1);

    }

    private static void prototypeExample() throws CloneNotSupportedException {
        System.out.println("Prototype Example Runnning ");

        GameRegistry gameRegistry = new GameRegistry();
        Ludo ludo = (Ludo) gameRegistry.getGame(GameType.LUDO);

        ludo.setName("Ludo Change?");
        System.out.println(ludo);

        Ludo ludo2 = (Ludo) gameRegistry.getGame(GameType.LUDO);

        System.out.println(ludo2);


        /*Without Registry You Can achieve Below Way*/


       /* Ludo ludo=new Ludo();
        ludo.setName("ludo");

        Ludo cloned= (Ludo) ludo.clone();
        System.out.println(cloned);
        cloned.setName("Change?");

        Ludo cloned2=(Ludo) ludo.clone();
        System.out.println(cloned2);*/
    }

    private static void singleTonExample() {
        System.out.println(SingleTonConcept.getInstance());
        System.out.println(SingleTonConcept.getInstance());
    }

    private static void factoryExample() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("MYSQL  : 1 ");
        System.out.println("NO SQL : 2 ");
        System.out.println("ORACLE : 3 ");
        int n = scanner.nextInt();
        if (n < 0 || n > 3) {
            throw new InvalidParameterException("Invalid arguments");
        } else {

            Db db = DbFactory.getDbObject(DbType.values()[n - 1]);
            db.displayDetails();
        }

    }

    private static void factoryExample2() {

        Package noSQLPackage = DatabaseFactory.getPackage(PackageType.NOSQL);
        System.out.println(noSQLPackage);

        Package sqlPackage = DatabaseFactory.getPackage(PackageType.SQL);
        System.out.println(sqlPackage);




       /* Scanner scanner = new Scanner(System.in);
        System.out.println("MYSQL  : 1 ");
        System.out.println("NO SQL : 2 ");
        System.out.println("ORACLE : 3 ");
        int n = scanner.nextInt();
        if (n < 0 || n > 3) {
            throw new InvalidParameterException("Invalid arguments");
        } else {

            Db db = DbFactory.getDbObject(DbType.values()[n - 1]);
            db.displayDetails();
        }*/

    }
}
