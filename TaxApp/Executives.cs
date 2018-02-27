using System;
using System.Collections.Generic;
using System.Text;

namespace TaxApp
{
    class Executives:FullTimerEmployee
    {
        public Executives(double salary, double bonus)
        {
            this.grossSalary = salary;
            this.bonus = bonus;
        }
        
    }
}
