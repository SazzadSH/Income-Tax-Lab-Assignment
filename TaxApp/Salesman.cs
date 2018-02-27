using System;
using System.Collections.Generic;
using System.Text;

namespace TaxApp
{
    class Salesman:FullTimerEmployee
    {
        protected double commission = 0;

        public Salesman(double salary, double bonus, double commission)
        {
            this.grossSalary = salary;
            this.bonus = bonus;
            this.commission = commission;
        }

       

        public static double grossCommission(params double[] c)
        {
            double com = 0;
            foreach (double e in c)
            {
                com += e;
            }

            return com;
        }

        public override void ShowInfo()
        {
            Console.WriteLine("Name: " + this.Name);
            Console.WriteLine("ID " + this.Id);
            Console.WriteLine("Gross Basic Salary: " + (this.grossSalary * 0.6));
            Console.WriteLine("Gross Bonus: " + this.bonus);
            Console.WriteLine("Gross Commission: " + this.commission);
        }

        public override void payableIncomeTax()
        {
            this.ShowInfo();
            Console.WriteLine("Net Payable Income Tax: " + ((this.grossSalary * 0.2) + (this.bonus * 0.15) + (this.commission*0.1)));
        }
    }
}
