package com.example.importantquestions.ooppract;
interface Person{
    public String profession();
}
class Teacher implements Person{
    @Override
    public String profession() {
        return "Teaching";
    }
}
class Engineer implements Person{
    @Override
    public String profession() {
        return "Engineering";
    }
}

public class interfaceimplementation {
    public static void main(String[] args) {
        Person p = new Teacher();
        System.out.println(p.profession());
        Person p1 = new Engineer();
        System.out.println(p1.profession());
    }
}
