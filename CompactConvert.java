public class CompactConvert {
    public static int StringToInt (String word) {
        try {
            return Integer.parseInt(word);
        } 
        catch (Exception except) {
            return 0;
        }
    } 
    public static String IntToString (int number) {
        return Integer.toString(number);
    } 
    public static boolean IntToBool (int number) {
        return number == 1 ? true : false;
    } 
    public static int BoolToInt (boolean bool) {
        return bool == true ? 1 : 0;
    } 
    public static boolean StringToBool (String word) {
        return word == "true" ? true : false;
    }
    public static String BoolToString (boolean bool) {
        return bool == true ? "true" : "false";
    } 
    public static void main (String args[]) {    
        System.out.println(StringToInt("50"));  
        System.out.println(IntToString(100)); 
        System.out.println(IntToBool(0)); 
        System.out.println(BoolToInt(true));  
        System.out.println(StringToBool("false"));
        System.out.println(BoolToString(true));     
    } 
}
