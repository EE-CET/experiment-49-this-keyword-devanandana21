import java.util.Scanner;

class ThisDemo {
    int value;

    void setValue(int value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputValue = sc.nextInt();
        ThisDemo obj = new ThisDemo();
        obj.setValue(inputValue);
        obj.display();
        sc.close();
    }
}
