public class Example1 {
    public static void main(String[] args) {
        int myInt = 5;
        ++myInt;// myInt becomes 6
        System.out.println(myInt);
        myInt++;   // myInt becomes 7
        System.out.println(myInt);
        --myInt;  // myInt becomes 6
        System.out.println(myInt);
        myInt--;  // myInt becomes 5
        System.out.println(myInt);

        int i = 3;
        int a = i++; // a = 3, i = 4
        int b = ++a; // b = 4, a = 4
        System.out.println("a= " + a + " and b=" + b);



    }
}


