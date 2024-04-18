import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.*;

public class ClassEmployee implements Comparator<String>
{
    String nazwa_grupy;
    List<Employee>  lista_pracownikow;
    double max_p;

    ClassEmployee(String nazwa, double x)
    {
        nazwa_grupy = nazwa;
        max_p = x;
        lista_pracownikow = new ArrayList<>();
    }
    public void addEmployee(Employee nowy_p)
    {
        if(lista_pracownikow.size() < max_p)
        {
            for (int i = 0; i < lista_pracownikow.size(); i++)
            {
                if(nowy_p.compareTo(lista_pracownikow.get(i)) == 0)
                {
                    System.out.println(" Pracownik o takich danych już istnieje");
                }
            }

            lista_pracownikow.add(nowy_p);
        }
        else
        {
            System.out.println(" Grupa pełna, nie mozna dodać nowego pracownika");
        }
    }
    public void addSalary(Employee prac, double wart)
    {
        System.out.println(" Wyplata przed podywzka " + prac.wynagrodzenie);
        prac.wynagrodzenie +=wart;
        System.out.println(" Wyplata po podywzce " + prac.wynagrodzenie);

    }
    public void removeEmployee(Employee prac)
    {
                lista_pracownikow.remove(prac);
    }
    public void changeCondition(Employee prac, EmployeeCondition con)
    {
        prac.stan_pracownika = con;
    }
    public void  search(String dane)
    {
        for (int i = 0; i < lista_pracownikow.size(); i++)
        {

            if( compare(dane, lista_pracownikow.get(i).nazwisko) == 0)
            {
                System.out.println(" znaleziono");
                lista_pracownikow.get(i).Print();
            }
            else
            {
                System.out.println(" nie znaleziono ");
            }
        }
    }
    public void   searchPartial(String dane)
    {
        for (int i = 0; i < lista_pracownikow.size(); i++)
        {
            if( lista_pracownikow.get(i).nazwisko.contains(dane))
            {
                lista_pracownikow.get(i).Print();
            }
            if( lista_pracownikow.get(i).imie.contains(dane))
            {
                lista_pracownikow.get(i).Print();
            }

        }
    }
    public void   countByCondition (EmployeeCondition x)
    {
        int wyn =0;
        for (int i = 0; i < lista_pracownikow.size(); i++)
        {

            if(x == lista_pracownikow.get(i).stan_pracownika)
            {

            wyn += 1;
            }
        }

        System.out.println(" Znaleziono " + wyn + " pracownikow w takim stanie");
    }
    public void  summary()
    {
        for (int i = 0; i < lista_pracownikow.size(); i++)
        {
            lista_pracownikow.get(i).Print();
        }
    }
    public void  sortByName()
    {
        Collections.sort(lista_pracownikow);
        for(Employee prac : lista_pracownikow){prac.Print();}

    }
    public void sortBySalary()
    {
        Collections.sort(lista_pracownikow, new Sort_salary());
        for(Employee prac : lista_pracownikow){prac.Print();}
    }
    public void   max()
    {
        Employee temp = Collections.max(lista_pracownikow);
        System.out.println("Max value is:");
        temp.Print();

    }


    public int compare(String a, String b)
    {
        if(a == b )
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

}
