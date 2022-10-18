public class Employee {
    int salary, work;
    String name;
    //string array
    // fill using scanner


    public void getInfo(){
        System.out.println(name + "\nSalary: " + salary + "$\nWork hours per day: " + work);
    }
    public void AddSal(){
        if (salary < 500)
            salary += 10;
        // check salary
        // if less 500 -> salary += 10;

    }
    public void AddWork(){
        if (work > 5)
            salary += 5;
    }
}
