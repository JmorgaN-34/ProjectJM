public class TestsRunner {

    public static void main(String[] args) {

        // create object of Tests class
        Tests test1 = new Tests();

        // collect scores and calculate average
        test1.getAverage();

        // print results
        System.out.println(test1.toString());
    }
}