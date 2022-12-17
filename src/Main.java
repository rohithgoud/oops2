public class Main {
    public static void main(String[] args) {
        human one = new human();
        one.gender = "male";
        one.isMarried = false;
        one.age = 22;
        System.out.println(one.gender+" "+one.isMarried+" "+ one.age);
        Main obj = new Main();
        obj.greeting();


    }
    void greeting(){
        fun();
    System.out.println("Hello World!");
}
void fun(){
    System.out.println("All fun");
}

}
