using System;
using System.Collections.Generic;
using System.Text;

namespace TaxApp
{
    class PartTimeEmployee:Employee
    {
        public PartTimeEmployee(double salary)
        {
            this.grossSalary = salary;
        }

        public override void ShowInfo()
        {
            Console.WriteLine("Name: " + this.Name);
            Console.WriteLine("ID " + this.Id);
            Console.WriteLine("Gross Basic Salary: " + ((this.grossSalary) * 0.6));
        }

        public override void payableIncomeTax()
        {
            this.ShowInfo();
            Console.WriteLine("Net Payable Income Tax: " + ((this.grossSalary) * 0.2));
        }
    }
}
