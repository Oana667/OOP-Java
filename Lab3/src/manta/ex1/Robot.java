package manta.ex1;

public class Robot {
    int x;

    //constructor
    Robot() {
        x = 1;
    }
    void change(int k){
      if(k>=1){x+=k;}
    }
    public int show(){
        return x;
    }


    public static void main(String[] args) {
        Robot r1 = new Robot();
        r1.change(1);
        r1.change(2);
        r1.show();

    }}


