import java.util.*;

class Bank {
    double rate;
 public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        sbi.get1(8.4); 
        icici.get2(7.3);
        axis.get3(9.7);
}
}

class SBI extends Bank {
    void get1(double r1) {
        rate = r1;
        System.out.println("Rate of Interest from SBI: " + rate+ "%");
    }
}

class ICICI extends Bank {
    void get2(double r2) {
        rate = r2;
        System.out.println("Rate of Interest from ICICI: " + rate+ "%");
    }
}

class AXIS extends Bank {
    void get3(double r3) {
        rate = r3;
        System.out.println("Rate of Interest from AXIS: " + rate+ "%");
  }

}

   

