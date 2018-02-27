using System;
using System.Collections.Generic;
using System.Text;

namespace TaxApp
{
    class FullTimerEmployee:Employee
    {

        protected double bonus;
        public static double grossBonus(params double[] b)
        {
            double bon = 0;
            foreach (double e in b)
            {
               bon += e;
            }

            return bon;
        }

        public override void ShowInfo()
        {
            Console.WriteLine("Name: " + this.Name);
            Console.WriteLine("ID " + this.Id);
            Console.WriteLine("Gross Basic Salary: " + (this.grossSalary * 0.6));
            Console.WriteLine("Gross Bonus: " + this.bonus);
        }

        public override void payableIncomeTax()
        {
            this.ShowInfo();
            Console.WriteLine("Net Payable Income Tax: " + ((this.grossSalary*0.2)+(this.bonus*0.15)));
        }
    }
}
