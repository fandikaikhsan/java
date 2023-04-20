public class Main {
    public static void main(String[] args) {
        hello();
    }
    private static void hello() {
        Student fandika = new Student("Dika", 80);

        System.out.println(fandika.getName());

        fandika.setIndex();

        int sum = fandika.sumNum(1, 2);
        System.out.println(sum);

        // if int divided by float, then return "integer-float looks" like: 8.0 (it supposed to be 8.9)
        System.out.println(fandika.getAvgPoints(80));

        System.out.println(fandika.getANDbool(true, true));
        System.out.println(fandika.getORbool(false, false));
        System.out.println(fandika.getIntDevidedWithFloat(50, 11.0f));
        System.out.println(fandika.concatString("fandika", "ikhsan"));
    }
}