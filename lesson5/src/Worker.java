public class Worker {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;
    public Worker(String _name, String _position, String _email, String _phone, int _salary,   int _age) {
        name = _name;
        position = _position;
        email=_email;
        phone=_phone;
        salary=_salary;
        age = _age;
    }
    public static void main(String[] args) {
        Worker worker1 = new Worker("Ivanov", "director", "ivanov@mail.ru", "8978900000", 50000, 35);
        Worker worker2 = new Worker("Petrov", "accountant", "petrov@mail.ru", "896789999999", 45000, 30);
        Worker worker3 = new Worker("Sidorov", "engineer", "sidorov@mail.ru", "87890556666", 40000, 40);
        Worker worker4 = new Worker("Fokin", "manager", "fokin@mail.ru", "89669999999", 35000, 25);
        Worker worker5 = new Worker("Maslov", "hr", "maslov@mail.ru", "89345655555", 30000, 45);
        System.out.println("Worker1 name: " + worker1.name + " position: " + worker1.position + " email: " + worker1.email + " phone: " + worker1.phone + " salary: " + worker1.salary + " age: " + worker1.age);
        System.out.println("Worker2 name: " + worker2.name + " position: " + worker2.position + " email: " + worker2.email + " phone: " + worker2.phone + " salary: " + worker2.salary + " age: " + worker2.age);
        System.out.println("Worker3 name: " + worker3.name + " position: " + worker3.position + " email: " + worker3.email + " phone: " + worker3.phone + " salary: " + worker3.salary + " age: " + worker3.age);
        System.out.println("Worker4 name: " + worker4.name + " position: " + worker4.position + " email: " + worker4.email + " phone: " + worker4.phone + " salary: " + worker4.salary + " age: " + worker4.age);
        System.out.println("Worker5 name: " + worker5.name + " position: " + worker5.position + " email: " + worker5.email + " phone: " + worker5.phone + " salary: " + worker5.salary + " age: " + worker5.age);


    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        if (age > 40)
            this.age = age;
        else
            System.out.println("Введен некорректный возраст");
    }
}
