package fileSys;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    // Java file system object
    private static JavaFileSystem fs;
    public static void main(String[] args) {
        // Declare file system
        fs = new JavaFileSystem();
        // Buffered reader initialize
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        
    }
    // Help list
    private static void help() {
        System.out.println("\tformat size iSize");
        System.out.println("\tshutdown");
        System.out.println("\tcreate");
        System.out.println("\topen inum");
        System.out.println("\tinumber fd");
        System.out.println("\tread fd size");
        System.out.println("\twrite fd pattern size");
        System.out.println("\tseek fd offset whence");
        System.out.println("\tclose fd");
        System.out.println("\tdelete inum");
        System.out.println("\tquit");
        System.out.println("\tvars");
        System.out.println("\thelp");
    }
}