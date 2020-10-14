public class StringExperiment {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = s1;

        String s4 = "FUN";

        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s4=="FUN");

        String s5 = String.format("Showing 2 decimal places $%.2f", 7.74832);
        System.out.printf("");
        System.out.println(s5);

        String name = "Wright, Jaret";
        int firstNameStartIndex = name.indexOf(", ")+2;
        System.out.println(firstNameStartIndex);
        String firstName = name.substring(firstNameStartIndex);
        System.out.println(firstName);

        StringBuilder sb = new StringBuilder("Neat");
        sb.append(" Here is another String attached");
        System.out.println(sb.toString());

    }
}
