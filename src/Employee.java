import java.text.DecimalFormat;

public class Employee {
       //Declare member variables

        public String firstName;
        public String lastName;
        public PositionTitle employeePosition;
        public String startDate;
        public Boolean employeeSalary;
        public Double employeePayRate;
        public Integer employeeShift;


        //Declare Method
        public Employee(String firstName, String lastName, PositionTitle employeePosition, String startDate, Boolean employeeSalary, Double employeePayRate, int employeeShift){
            this.firstName = firstName;
            this.lastName = lastName;
            this.employeePosition = employeePosition;
            this.startDate = startDate;
            this.employeeSalary = employeeSalary;
            this.employeePayRate = employeePayRate;
            this.employeeShift = employeeShift;
        }
        //Overloading the method
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public PositionTitle getEmployeePosition() { return employeePosition; }

        public void setEmployeePosition(PositionTitle employeePosition) { this.employeePosition = employeePosition; }

        public String getStartDate() { return startDate; }

        public void setStartDate(String startDate) { this.startDate = startDate; }

        public Boolean getEmployeeSalary() { return employeeSalary; }

        public void setEmployeeSalary(Boolean employeeSalary) { this.employeeSalary = employeeSalary; }

        public Double getEmployeePayRate() { return employeePayRate; }

        public void setEmployeePayRate(Double employeePayRate) { this.employeePayRate = employeePayRate; }

        public int getEmployeeShift() {
            return employeeShift;
        }

        public void setEmployeeShift(int employeeShift) {
            this.employeeShift = employeeShift;
        }

        public void printEmployee(){
            System.out.println("Employee: " + firstName + " " + lastName + "\nEmployee Position: " + employeePosition + " " + "\nEmployee Salaried: " + employeeSalary + "\nEmployee Shift: " + employeeShift  + "\nEmployee Pay Rate: " + employeePayRate);
        }

        //create calculate method
        public void calculate (double hoursIn){
            double totalPay = 0.0;
            DecimalFormat df = new DecimalFormat("#.00");
            if (employeeSalary){
                totalPay = employeePayRate * 40;
            } else {
                switch (employeeShift){
                    case 1:
                        if (hoursIn <= 40){
                            totalPay = hoursIn * employeePayRate;
                        } else {
                            totalPay = (40 * employeePayRate) + ((hoursIn - 40) * (employeePayRate * 1.5));
                        }
                        break;

                    case 2:
                        double shiftPay = employeePayRate * 1.05;
                        if (hoursIn <= 40){
                            totalPay = hoursIn * shiftPay;
                        } else {
                            totalPay = (40 * shiftPay) + ((hoursIn - 40) * (shiftPay * 1.5));
                        }
                        break;

                    case 3:
                        double shiftPay2 = employeePayRate * 1.10;
                        if (hoursIn <= 40){
                            totalPay = hoursIn * shiftPay2;
                        } else {
                            totalPay = (40 * shiftPay2) + ((hoursIn - 40) * (shiftPay2 * 1.5));
                        }
                        break;

                    default:
                        break;
                }
            }
            System.out.println("This employee made " + df.format(totalPay) + " this week.");

    }

    }

