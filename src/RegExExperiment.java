public class RegExExperiment {
    public static void main(String[] args) {
        String validPhone ="(705) 555-1234";
        String invalidPhone = "123-456-7890";
        String regExPhone = "\\(?[2-9]\\d{2}\\)?[-\\s]?[2-9]\\d{2}[-\\s]?\\d{4}";
        System.out.printf("%s is valid: %b%n",validPhone,validPhone.matches(regExPhone));
        System.out.printf("%s is valid: %b%n",invalidPhone, invalidPhone.matches(regExPhone));

        System.out.println("BettyLou  :"+"BettyLou".matches("[A-Z][a-zA-Z \\-\\s]*"));
        System.out.println("Betty-Lou :"+"Betty-Lou".matches("[A-Z][a-zA-Z\\-\\s]*"));
        System.out.println("Betty Lou :"+"Betty Lou".matches("[A-Z][a-zA-Z\\-\\s]*"));
        System.out.println("Betty     :"+"Betty".matches("[A-Z][a-zA-Z\\-\\s]*"));
        System.out.println("betty     :"+"betty".matches("[A-Z][a-zA-Z\\-\\s]*"));
        System.out.println("O'Toole     :"+"O'Toole".matches("[A-Z][a-zA-Z\\-\\s']*"));



    }
}
