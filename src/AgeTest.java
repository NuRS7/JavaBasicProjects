public class AgeTest {
    public void testAge(){
        int age = 0;
        age = age + 7;
        System.out.println(age);
    }

    public static void main(String[] args) {
        AgeTest test = new AgeTest();
        test.testAge();
    }
}
