package dci.exercise;

/**
 * Main class is used for demonstrating a parameterized main.
 */
public class ParameterizedMain {
    /**
     * A method printing strings provided to it.
     * @param args not being used in this method
     */
    public static void main(String[] args) {
        final String argsContent = "Content of args array: ";
        System.out.println(argsContent + args[0]);
        System.out.println(argsContent + args[1]);
        System.out.println(argsContent + args[2]);
        System.out.println(argsContent + args[3]);
        System.out.println(argsContent + args[4]);
        System.out.println(argsContent + args[5]);
    }
}
