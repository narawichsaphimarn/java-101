package variables;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello world!"; // Create a string variable
        int num1 = 1; // Create an integer variable
        float float1 = 1.5f;
        long long1 = 123456L;
        print(str1);
        print(num1);
        print(float1);
        print(long1);

        {
            String str2;
            str2 = "Hello world!"; // Create a variable without assigning the value, and assign the value later
            print(str2);
            str2 = "My name is NS."; // Overwrite an existing variable value
            print(str2);

            int num2;
            num2 = 3;
            print(num2);
            num2 = 1;
            print(num2);

            float float2;
            float2 = 1.1f;
            print(float2);
            float2 = 1.2f;
            print(float2);

            long long2;
            long2 = 654321L;
            print(long2);
            long2 = 123456L;
            print(long2);
        }

        final String str3 = "String final"; // Create a final variable (unchangeable and read-only)
        // str3 = "Overwrite is error"
        print(str3);

        print("Hello" + str1); // Combine text and a variable on display

        print(str3 + str1); // Add a variable to another variable

        int x = 1, y = 2, z = 3; // Declare many variables of the same type with a comma-separated list
        print(x);
        print(y);
        print(z);
    }

    private static void print(Object obj) {
        System.out.println(obj);
    }
}
