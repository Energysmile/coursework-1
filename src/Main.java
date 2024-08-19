public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов И.И.", 1, 10000.0);
        employees[1] = new Employee("Петров П.П.", 2, 15000.0);
        employees[2] = new Employee("Сидоров С.С.", 3, 20000.0);
        employees[3] = new Employee("Васильев В.В.", 4, 25000.0);
        employees[4] = new Employee("Федоров Ф.Ф.", 5, 30000.0);
        employees[5] = new Employee("Иванов А.А.", 3, 70000);
        employees[6] = new Employee("Петров A.A.", 2, 15000.0);
        employees[7] = new Employee("Сидоров А.А.", 3, 20000.0);
        employees[8] = new Employee("Васильев A.A.", 4, 25000.0);
        employees[9] = new Employee("Федоров A.A.", 5, 30000.0);


        getAllEmployeesInfo(employees);

        System.out.println("Сумма затрат на зарплату в месяц: " + getMonthlySalarySum(employees));
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой: " + getMinSalary(employees).toString());
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой: " + getMaxSalary(employees).toString());
        System.out.println();
        System.out.println("Средняя зарплата в нашей компании: " + getAvgSalary(employees));
        System.out.println();
        getEmployeesList(employees);
    }

    public static void getAllEmployeesInfo(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }
    public static void getEmployeesList(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println("Employee: " + e.getName());
        }
    }

    public static double getMonthlySalarySum(Employee[] employees) {
        double salarySumMonth = 0;
        for (Employee e : employees) {
            salarySumMonth = salarySumMonth + e.getSalary();
        }
        return salarySumMonth;
    }

    public static Employee getMinSalary(Employee[] employees) {
        double minSalary = Integer.MAX_VALUE;
        Employee emp = null;
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
                emp = employees[i];
            }
        }
        return emp;
    }

    public static Employee getMaxSalary(Employee[] employees) {
        double maxSalary = Integer.MIN_VALUE;
        Employee emp = null;
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
                emp = employees[i];
            }
        }
        return emp;
    }

    public static double getAvgSalary(Employee[] employees) {
        return getMonthlySalarySum(employees) / employees.length;
    }
}