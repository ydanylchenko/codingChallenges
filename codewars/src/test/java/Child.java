public class Child extends Parent {
    @Override
    public void do1() {
        System.out.println("do21");
    }

//    @Override
    public void do2() {
        System.out.println("do22");
    }

    public void do3() {
        System.out.println("do22");
    }

    public void do4() {
        System.out.println("do22");
        return;
    }

    public static void main(String[] args) {
        String tag = "a";
        String value = " Logout";
        String xpath = "descendant::" + tag + "[text()='" + value + "']";
        Parent parent = new Parent();
        parent.do1();
        parent.do2();
//        ((Child)parent).do3();
        Child child = new Child();
        child.do1();
        child.do2();
        ((Parent) child).do1();
        ((Parent) child).do2();
        Parent p = new Child();
        p.do1();
        p.do2();
    }
}
