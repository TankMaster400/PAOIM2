import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Employee Pracownik1 = new Employee("Wojciech", "Zub",EmployeeCondition.obecny ,2002,2500.0);
        Pracownik1.Print();

        Employee Pracownik2 = new Employee("Wojciech", "Zub",EmployeeCondition.obecny ,2001,2500.0);
        Pracownik2.Print();
        int x = Pracownik2.compareTo(Pracownik1);
        System.out.println(x);

        ClassEmployee klas1 = new ClassEmployee("Gr1",12);
        klas1.addEmployee(Pracownik1);
        klas1.addEmployee(Pracownik2);

     //   klas1.addSalary(Pracownik1, 200);
    //    klas1.summary();
     //   klas1.removeEmployee(Pracownik2);

        klas1.changeCondition(Pracownik1, EmployeeCondition.delegacja);
      //  klas1.summary();
     //  klas1.search("Zub");
      //  klas1.search("Kowal");

       Employee Pracownik3 = new Employee("Adam", "Kowal",EmployeeCondition.obecny ,2001,3500.0);
        Employee Pracownik4 = new Employee("Karol", "Kozubek",EmployeeCondition.obecny ,2001,2400.0);
        Employee Pracownik5 = new Employee("Wojciech", "Malanowski" ,EmployeeCondition.obecny ,2001,2500.0);
        klas1.addEmployee(Pracownik3);
        klas1.addEmployee(Pracownik4);
        klas1.addEmployee(Pracownik5);

        klas1.searchPartial("ub");
        klas1.searchPartial("Wojciech");

        klas1.sortByName();
        klas1.sortBySalary();



        klas1.countByCondition(EmployeeCondition.obecny);
        klas1.countByCondition(EmployeeCondition.delegacja);

        klas1.max();


        ClassContainer Kont = new ClassContainer();
        Kont.addClass("Gr2", 8.);
        Kont.addClass("Gr3", 8.);
        Kont.addClass("Gr4", 12.);
        Kont.summary();
        Kont.removeClass("Gr3");
        Kont.summary();
        Kont.Grupy.get("Gr2").lista_pracownikow.add(Pracownik3);
        Kont.Grupy.get("Gr2").lista_pracownikow.add(Pracownik4);
        Kont.findEmpty();
        Kont.summary();


    }
}