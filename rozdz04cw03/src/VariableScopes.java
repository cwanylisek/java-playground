public class VariableScopes {
    // atrybut klasy
    String globalVariable = "Global variable (in class)";

    // konstruktor
    public VariableScopes(String globalVariable) {
        System.out.println(this.globalVariable);
        this.globalVariable = globalVariable;
    }

    // konstruktor
    public VariableScopes() {
        System.out.println(globalVariable);
    }

    // metoda
    public void printVariable() {
        System.out.println(globalVariable);
        // System.out.println(localVariable); /* błąd - zmienna niedostępna */
    }

    // metoda
    public void method() {
        String localVariable = "Local variable (in method)";
        System.out.println(localVariable);

        // blok kodu
        {
            String blockVariable = "Local variable (in block)";
            localVariable = blockVariable;
            System.out.println(blockVariable);
        }

        System.out.println(localVariable);
        // System.out.println(blockVariable); /* błąd - zmienna niedostępna */
    }

    // metoda główna
    public static void main(String[] args) {
        VariableScopes vars = new VariableScopes("New text");
        vars.method();
        vars.printVariable();
    }
}
