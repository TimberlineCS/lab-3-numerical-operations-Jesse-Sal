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
    String number ="1234";
    String a = number.substring(0,1);
    String b = number.substring(1,2);
    String c = number.substring(2,3);
    String d = number.substring(3,4);
    System.out.print(d);
    System.out.print(c);
    System.out.print(b);
    System.out.print(a);
  }
}