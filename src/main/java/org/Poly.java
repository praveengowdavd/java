package org;

class Vehicle124
{
    void color()
    {
        System.out.println("Red color");
    }
    void wheels()
    {
        System.out.println("4 no fo wheels");
    }
}
class car124 extends Vehicle124
{
    void color()
    {
        System.out.println("blue color");
    }
    void capacity()
    {
        System.out.println("5 no capacity");
    }
}

public class Poly {
    public static void main(String[] args)
    {
//        car124 c = new car124();
//        c.color();
//
//        Vehicle124 v = new Vehicle124();
//        v.color();

            Vehicle124 v = new car124();
            v.color();
            v.wheels();
//            v.capacity(); capacity cannot be accesed because it is in car class


    }

}
