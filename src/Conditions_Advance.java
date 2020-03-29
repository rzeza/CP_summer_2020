public class Conditions_Advance {
    public static void main(String[] args) {
        int a = 2;
        String astr = a > 3 ? "A greater than 3": "A is not greater than 3";
        System.out.println(astr);

        String myVar = "A";

        switch (myVar) {
            case "A":
                System.out.println("var is A");
            case "B":
                System.out.println("var is B");
            default:
                System.out.println("var is default");
        }

    }

}
