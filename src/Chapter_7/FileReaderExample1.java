package Chapter_7;


public class FileReaderExample1 {

    public static void main(String args[]) {
        MyThread a = new MyThread("E:\\a.txt", "Thread A");
        MyThread b = new MyThread("E:\\b.txt", "Thread B");
        a.start();
        b.start();
    }
}
