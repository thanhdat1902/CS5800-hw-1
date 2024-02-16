package org.example;

import org.example.course.Course;
import org.example.course.Instructor;
import org.example.course.Textbook;
import org.example.employee.*;
import org.example.folder.File;
import org.example.folder.Folder;
import org.example.ship.CargoShip;
import org.example.ship.CruiseShip;
import org.example.ship.Ship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static void inheritanceProgram() {
        ArrayList<Employee> listEmployees = getEmployees();
        System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "First name", "Last name", "Social Sec #", "Weekly Salary", "Wage", "Hours worked", "Commission Rate", "Gross Salary", "Base Salary");

        for (Employee employeeI : listEmployees) {
            if (employeeI instanceof SalariedEmployee) {
                System.out.format("%-15s%-15s%-15s$%-15s%-15s%-15s%-15s%-15s%-15s\n", employeeI.getFirstName(), employeeI.getLastName() , employeeI.getSocialSecurityNumber(), ((SalariedEmployee) employeeI).getWeeklySalary(), "", "", "", "", "");
            } else if (employeeI instanceof HourlyEmployee) {
                System.out.format("%-15s%-15s%-15s%-15s$%-15s%-15s%-15s%-15s%-15s\n", employeeI.getFirstName(), employeeI.getLastName() , employeeI.getSocialSecurityNumber(), "", ((HourlyEmployee) employeeI).getWage(), ((HourlyEmployee) employeeI).getHoursWork(), "", "", "");
            } else if (employeeI instanceof CommisionEmployee) {
                System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s%%%-15s$%-15s%-15s\n", employeeI.getFirstName(), employeeI.getLastName() , employeeI.getSocialSecurityNumber(), "", "", "", ((CommisionEmployee) employeeI).getCommissionRate(), ((CommisionEmployee) employeeI).getGrossSales(), "");
            }else if (employeeI instanceof BaseEmployee) {
                System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s$%-15s\n", employeeI.getFirstName(), employeeI.getLastName() , employeeI.getSocialSecurityNumber(), "", "", "", "", "", ((BaseEmployee) employeeI).getBaseSalary());
            }
        }
    }

    private static ArrayList<Employee> getEmployees() {
        Employee employee1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        Employee employee2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25,32);
        Employee employee3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        Employee employee4 = new CommisionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        Employee employee5 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        Employee employee6 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        Employee employee7 = new CommisionEmployee("Mahnaz", "Vaziri ", "777-77-7777", 22, 40000);
        return new ArrayList<Employee>(Arrays.asList(employee1, employee2,employee3,employee4,employee5,employee6,employee7));
    };

    private static void polymorphismProgram() {
        Ship normalShip = new Ship("Alpha", "1900");
        Ship cruise = new CruiseShip("Titanic", "1898", 2000);
        Ship cargoShip = new CargoShip("Trask", "2020", 50);
        ArrayList<Ship> listShips = new ArrayList<>(Arrays.asList(normalShip, cruise, cargoShip));
        for(Ship shipI : listShips) {
            shipI.print();
        }
    }
    private static void aggregationProgram() {
        Instructor instructor = new Instructor("Nima", "Davarpana",  "3-2636");
        Textbook textbook = new Textbook("Clean Code", "Robert Cecil Martin", "Goodreads");
        ArrayList<Instructor> instructors = new ArrayList<Instructor>();
        ArrayList<Textbook> textbooks = new ArrayList<Textbook>();
        instructors.add(instructor);
        textbooks.add(textbook);

        Instructor instructor_2 = new Instructor("Tingting", "Chen",  "3-11");
        Textbook textbook_2 = new Textbook("Design Patterns", "Gang of four", "Pearson");
        instructors.add(instructor_2);
        textbooks.add(textbook_2);

        Course course = new Course("Advanced Software Engineering", instructors, textbooks);
        course.print();



    }
    private static void compositionProgram() {
        System.out.println("######## Folder structure #########");

        File file = new File(".htaccess");
        File file2 = new File(".htrouter.php");
        File file3 = new File("index.html");
        ArrayList<File> listFiles = new ArrayList<File>(Arrays.asList(file, file2, file3));

        Folder demo1 = new Folder("demo");
        Folder publicf = new Folder("public");
        Folder cache = new Folder("cache");
        Folder SourceFile = new Folder("Source File");

        Folder app = new Folder("app");

        Folder config = new Folder("config");
        Folder controller = new Folder("controller");
        File draft = new File("draft.txt");

        controller.addFile(new ArrayList<File>(List.of(draft)));

        app.addFolder(new ArrayList<Folder>(Arrays.asList(config, controller)));
        SourceFile.addFolder(new ArrayList<Folder>(Arrays.asList(app, cache, publicf)));
        demo1.addFile(listFiles);
        demo1.addFolder(new ArrayList<Folder>(List.of(SourceFile)));

        demo1.print(null, 0);


        System.out.println("######## Folder after deleting folder 'app' and file 'htaccess' #########");
        demo1.deleteFile(file);
        SourceFile.deleteFolder(app);
        demo1.print(null, 0);


    }


    public static void main(String[] args) {
        // Inheritance
        System.out.println("-------------------------Inheritance Question----------------------");
        inheritanceProgram();

        // Polymorphism
        System.out.println("-------------------------Polymorphism Question----------------------");
        polymorphismProgram();

        // Aggregation
        System.out.println("-------------------------Aggregation Question----------------------");
        aggregationProgram();

        // Composition
        System.out.println("-------------------------Composition Question----------------------");
        compositionProgram();
    }




}