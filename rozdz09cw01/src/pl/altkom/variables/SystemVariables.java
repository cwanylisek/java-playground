package pl.altkom.variables;

import java.util.Properties;

public class SystemVariables {
    public static void main(String[] args) {
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
