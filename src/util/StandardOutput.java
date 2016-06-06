package util;


/*************************************************************************
 *  Compilation:  javac StdOut.java
 *  Execution:    java StdOut
 *
 *  Writes data of various types to standard output.
 *
 *************************************************************************/

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/**
 *  <i>Standard Output</i>. This class provides methods for writing strings
 *  and numbers to standard output.
 *
 *  @author Pratiyush Kumar Singh
 *  @version 1.0 
 *  @since 23-Feb-2014
 */
public final class StandardOutput {

    // force Unicode UTF-8 encoding; otherwise it's system dependent
    private static final String CHARSET_NAME = "UTF-8";

    // assume language = English, country = US for consistency with StdIn
    private static final Locale LOCALE = Locale.US;

    // send output here
    private static PrintWriter out;

    // this is called before invoking any methods
    static {
        try {
            out = new PrintWriter(new OutputStreamWriter(System.out, CHARSET_NAME), true);
        }
        catch (UnsupportedEncodingException e) { System.out.println(e); }
    }

    // don't instantiate
    private StandardOutput() { }

    // close the output stream (not required)
   /**
     * Close standard output.
     */
    public static void close() {
        out.close();
    }

    /* Methods that do terminate lines */
    
   /**
     * Terminate the current line by printing the line separator string.The
     * line separator string is defined by the system property
     * <code>line.separator</code>, and is not necessarily a single newline
     * character (<code>'\n'</code>).
     */
    public static void println() {
        out.println();
    }

   /**
     * Prints an Object and then terminate the line.
     * @param x  The <code>Object</code> to be printed
     */
    public static void println(Object x) {
        out.println(x);
    }

   /**
     * Prints a boolean and then terminate the line.
     * @param x  The <code>boolean</code> to be printed
     */
    public static void println(boolean x) {
        out.println(x ? "true" : "false");
    }

   /**
     * Prints a character and then terminate the line.
     * @param x  The <code>char</code> to be printed.
     */
    public static void println(char x) {
        out.println(x);
    }

   /**
     * Prints a double and then terminate the line.
     * @param x  The <code>double</code> to be printed.
     */
    public static void println(double x) {
        out.println(x);
    }


   /**
     * Prints a long and then terminate the line. 
     * @param x  a The <code>long</code> to be printed.
     */
    public static void println(long x) {
        out.println(x);
    }

    /**
     * Prints a float and then terminate the line.
     * @param x  The <code>float</code> to be printed.
     */
    public static void println(float x) {
        out.println(x);
    }
    
    /**
     * Prints an integer and then terminate the line.
     * @param x  The <code>int</code> to be printed.
     */
    public static void println(int x) {
        out.println(x);
    }
    
    /**
     * Prints an short and then terminate the line.
     * @param x  The <code>short</code> to be printed.
     */
    public static void println(short x) {
        out.println(x);
    }
    
    /**
     * Prints an byte and then terminate the line.
     * @param x  The <code>byte</code> to be printed.
     */
    public static void println(byte x) {
        out.println(x);
    }
    /**
     * Prints a String and then terminate the line. 
     * @param x  The <code>String</code> to be printed.
     */
    public static void println(String x) {
        out.println(x);
    }
    
    /**
     * Prints a char array and then terminate the line. 
     * @param x  an array of chars to print.
     */
    public static void println(char x[]) {
        out.println(x);
    }
    
   /**
     * Flush standard output.
     */
    public static void print() {
        out.flush();
    }

   /**
     * Prints an Object and flush standard output.
     * @param      obj   The <code>Object</code> to be printed
     */
    public static void print(Object x) {
        out.print(x);
        out.flush();
    }

    /**
     * Prints an double and flush standard output.
     * @param      obj   The <code>double</code> to be printed
     */
    public static void print(double x) {
        out.print(x);
        out.flush();
    }

    /**
     * Prints an long and flush standard output.
     * @param      obj   The <code>long</code> to be printed
     */
    public static void print(long x) {
        out.print(x);
        out.flush();
    }
    
    /**
     * Prints an float and flush standard output.
     * @param      obj   The <code>float</code> to be printed
     */
    public static void print(float x) {
        out.print(x);
        out.flush();
    }

    /**
     * Prints an int and flush standard output.
     * @param      obj   The <code>int</code> to be printed
     */
    public static void print(int x) {
        out.print(x);
        out.flush();
    }
    
    /**
     * Prints an short and flush standard output.
     * @param      obj   The <code>short</code> to be printed
     */
    public static void print(short x) {
        out.print(x);
        out.flush();
    }

    /**
     * Prints an byte and flush standard output.
     * @param      obj   The <code>byte</code> to be printed
     */
    public static void print(byte x) {
        out.print(x);
        out.flush();
    }

    /**
     * Prints an boolean and flush standard output.
     * @param      obj   The <code>boolean</code> to be printed
     */
    public static void print(boolean x) {
        out.print(x);
        out.flush();
    }
    
    /**
     * Prints a char array and then terminate the line. 
     * @param x  an array of chars to print.
     */
    public static void print(String x[]) {
        out.println(x);
    }
    
    /**
     * Prints a char array and then terminate the line. 
     * @param x  an array of chars to print.
     */
    public static void print(char x[]) {
        out.println(x);
    }
    
    /**
     * Prints an char and flush standard output.
     * @param      obj   The <code>char</code> to be printed
     */
    public static void print(char x) {
        out.print(x);
        out.flush();
    }

    /**
     * Print a formatted string to standard output using the specified
     * format string and arguments, and flush standard output.
     */
    public static void printf(String format, Object... args) {
        out.printf(LOCALE, format, args);
        out.flush();
    }

   /**
     * Print a formatted string to standard output using the specified
     * locale, format string, and arguments, and flush standard output.
     */
    public static void printf(Locale locale, String format, Object... args) {
        out.printf(locale, format, args);
        out.flush();
    }

    // This method is just here to test the class
    public static void main(String[] args) {

        // write to stdout
    	StandardOutput.println("Test");
    	StandardOutput.println(17);
    	StandardOutput.println(true);
    	StandardOutput.printf("%.6f\n", 1.0/7.0);
    }

}