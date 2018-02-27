using System;

namespace TaxApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Employee e1 = new Executives(Employee.grossBasicSalary(2000, 2000, 2000, 2500, 3000), FullTimerEmployee.grossBonus(2000, 1500));
            e1.Name = "Executive Name 1";
            e1.Id = "A-1231";
            e1.payableIncomeTax();

            Console.WriteLine();

            Employee e2 = new Salesman(Employee.grossBasicSalary(1500, 2000, 2000, 2000, 2000, 2000, 2100, 2200, 2200), FullTimerEmployee.grossBonus(1000, 500), Salesman.grossCommission(1500, 2000, 3000));
            e2.Name = "Salesman Name 1";
            e2.Id = "S-123123";
            e2.payableIncomeTax();

            Console.WriteLine();

            Employee e3 = new PartTimeEmployee(Employee.grossBasicSalary(1500, 2000, 2000, 2000));
            e3.Name = "Part Time Employee 1";
            e3.Id = "P-123123";
            e3.payableIncomeTax();

            Console.WriteLine();

            Employee e4 = new Executives(Employee.grossBasicSalary(2000, 2000, 2000, 2500, 3000), FullTimerEmployee.grossBonus(2500, 1000));
            e4.Name = "Executive Name 1";
            e4.Id = "A-1231";
            e4.payableIncomeTax();

            Console.WriteLine();

            Employee e5 = new Salesman(Employee.grossBasicSalary(1500, 2000, 2000, 2000, 2000, 2000, 7800, 2312), FullTimerEmployee.grossBonus(1000, 500), Salesman.grossCommission(1500, 200));
            e5.Name = "Salesman Name 1";
            e5.Id = "S-123123";
            e5.payableIncomeTax();

            Console.WriteLine();

            Employee e6 = new PartTimeEmployee(Employee.grossBasicSalary(1500, 2000, 2000, 2000));
            e6.Name = "Part Time Employee 1";
            e6.Id = "P-123123";
            e6.payableIncomeTax();
        }
    }
}
