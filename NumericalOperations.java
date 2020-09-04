public class NumericalOperations{
  public static void main (String args[]){
    //challenge 1
    double d1 = 37.9;
    double d2 = 1004.128;
    int i1 = 12;
    int i2 = 18;

    double p1 = 57.2*(i1/i2)+1;
    double p2 = 57.2*((double)i1/i2)+1;
    double p3 = 15-i1*(d1*3)+4;
    double p4 = 15-i1*((int)d1*3)+4;
    double p5 = 15-i1*(int)(d1*3)+4;


    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
    System.out.println(p5);


    //challenge 2
    int num = 1234;

    //Getting the R

    int first = num % 10;
    num = num / 10;

    int second = num % 10;
    num = num / 10;

    int third = num % 10;
    num = num / 10;

    int fourth = num % 10;
    num = num / 10;


    //Putting in order

    first = first * 1000;

    second = second * 100;

    third = third * 10;

    System.out.print(first+second+third+fourth);

  }
}