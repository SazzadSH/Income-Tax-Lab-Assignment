using System;
using System.Collections.Generic;
using System.Text;

namespace TaxApp
{
    public abstract class Employee
    {
        protected double grossSalary;
        private string name, id;
        
        public string Name
        {
            get; set;
        }
        public string Id
        {
            get; set;
        }
        public static double grossBasicSalary(params double[] sal)
        {
            double salary = 0;
            foreach (double e in sal)
            {
                salary += e;
            }

            return (salary*0.6);
        }



        public abstract void ShowInfo();

        public abstract void payableIncomeTax();
    }
}
