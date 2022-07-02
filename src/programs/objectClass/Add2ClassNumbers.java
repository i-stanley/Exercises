package programs.objectClass;
// creating a class named Add2ClassNumbers
// and passing it into a function add().

public class Add2ClassNumbers {
   double real;
   double imag;

    public Add2ClassNumbers(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
      Add2ClassNumbers n1 = new Add2ClassNumbers(1.2,3.4),
                       n2 = new Add2ClassNumbers(2.1,7.4),
          temp;
          temp = add(n1,n2);

          System.out.printf("The sum is: %.1f + %.1f",temp.real,temp.imag);
    }

    public static Add2ClassNumbers add(Add2ClassNumbers n1, Add2ClassNumbers n2) {
        Add2ClassNumbers temp = new Add2ClassNumbers(0.0,0.0);
        temp.real = n1.real+n2.real;
        temp.imag = n1.imag+n1.imag;
        return (temp);
    }
}
