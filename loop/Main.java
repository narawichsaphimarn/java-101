package loop;

public class Main {
    public static void main(String[] args) {
        // While loop
        {
            int i = 0;
            while (i < 10) {
                print(i);
                i++;
            }
        }

        // Do While loop
        {
            int i = 0;
            do {
                print(i);
                i++;
            } while (i < 5);
        }

        // For loop
        {
            for (int i = 0; i < 10; i++) {
                print(i);
            }
        }

        // For each
        {
            String[] obj = { "Apple", "Orange" };
            for (String s : obj) {
                print(s);
            }
        }
    }

    private static void print(Object obj) {
        System.out.println(obj);
    }
}
