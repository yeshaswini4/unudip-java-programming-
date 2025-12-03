class MarksResult {
    public static void main(String[] args) {
        
        int m = 88;   // you can change this value

        if (m >= 91 && m <= 100)
            System.out.println("Distinction");
        else if (m >= 81 && m <= 90)
            System.out.println("Distinction");
        else if (m >= 61 && m <= 80)
            System.out.println("First Class");
        else if (m >= 41 && m <= 60)
            System.out.println("Second Class");
        else if (m >= 35 && m <= 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}