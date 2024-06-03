
interface Interface1 {
    void display1();
}


interface Interface2 {
    void display2();
}


class A {
    void display3() {
        System.out.println("I am inside class A");
    }
}


class B extends A implements Interface1, Interface2 {
    public void display1() {
        System.out.println("I am inside Interface1");
    }

    public void display2() {
        System.out.println("I am inside Interface2");
    }
}


