class Student {

//    public static void main(String[] args) {
//        System.out.println("Start at Student class");
//    }


    private String name;
    private int points;
    private char index = 'C';
    private float avgPoints;

    public Student(String newName, int newPoints) {
        // arg name never be the same as class prop name
        name = newName;
        points = newPoints;
    }

    public String getName() {
        return name;
    }

    public void setIndex() {
        if (points > 0 && points < 20) {
            index = 'C';
            System.out.println("Save complete. User index: " + index);
        } else if (points > 20 && points < 60) {
            index = 'B';
            System.out.println("Save complete. User index: " + index);
        } else if (points > 60 && points <= 100) {
            index = 'A';
            System.out.println("Save complete. User index: " + index);
        }
    }

    public int sumNum(int a, int b) {
        return a + b;
    }

    public float getAvgPoints(float totalPoints) {
        return totalPoints/9;
    }

    public float getIntDevidedWithFloat(int a, float b) {
        return a/b;
    }

    public boolean getANDbool(boolean a, boolean b) {
        return a && b;
    }

    public boolean getORbool(boolean a, boolean b) {
        return a || b;
    }

    public String concatString(String a, String b) {
        return Math.random() + a + b;
    }
}
