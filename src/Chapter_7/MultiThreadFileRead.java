import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultiThreadFileRead {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() { 
            public void run() {
                System.out.print("The thread - 1");
                try {
                    Scanner sc1 = new Scanner(new File("C:\\copy_customers_and_contacts.txt"));
                    while(sc1.hasNextLine()){

                        System.out.println(sc1.nextLine() + " : thread 1");
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() { 
            @Override
            public void run() {
                System.out.println("The thread -2");
                try {
                    Scanner sc1 = new Scanner(new File("C:\\customers_and_contacts.txt"));
                    while(sc1.hasNextLine()){
                        System.out.println(sc1.nextLine() + " : thread 2");
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        
        thread1.start();
        thread2.start();

    }

}
