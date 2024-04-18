import java.util.Comparator;

public class Employee implements Comparable<Employee>
{
    String imie;
    String nazwisko;
    EmployeeCondition stan_pracownika;
    int rok_urodzenia;
    double wynagrodzenie;

    Employee( String d1, String d2,EmployeeCondition d3, int d4, double d5)
    {imie =d1;nazwisko=d2;stan_pracownika=d3;rok_urodzenia=d4;wynagrodzenie=d5;}

    public void Print()
    {
        System.out.println(" imie oraz nazwisko: "+ imie + " " +  nazwisko);
        System.out.println(" stan_pracownika: " +stan_pracownika );
        System.out.println(" rok_urodzenia: "+ rok_urodzenia);
        System.out.println(" wynagrodzenie: " +wynagrodzenie );

    };
    @Override
    public int compareTo(Employee pracownik1)
    {
        int results = this.nazwisko.compareTo(pracownik1.nazwisko);
            return results;
    }



}
