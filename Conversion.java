
/**
 * Write a description of class Conversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Conversion
{
    public static void main(String [] args){
        
        // binary to dec
        
        String b = "10101";
        int d = Integer.parseInt(b,2);
        System.out.println(b + " to " + d);
        // dec to binary
        String b2 = Integer.toBinaryString(d);
        System.out.println(d + " to " +b2);
        
        // hex to dec
        
        String h = "a";
        int d2 = Integer.parseInt(h,16);
        System.out.println(h + " to " + d2);
        
        // dec to hex
        
        String h2 = Integer.toHexString(d2);
        System.out.println(d2 + " to " + h2);
        
        // octal to dec
        
        String o = "121";
        int d3 = Integer.parseInt(o,8);
        System.out.println(o + " to " + d3);
        
        // dec to hex
        
        String o2 = Integer.toOctalString(d3);
        System.out.println(d3 + " to " + o2);
    
    }
}
