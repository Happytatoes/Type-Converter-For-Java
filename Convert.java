public class Convert {
   
    // converts strings to integers 
    // example: "1" => 1
    // strings without integer values will return 0
    public static int StringToInt (String word) {
        try {
            return Integer.parseInt(word);
        }
        catch (Exception except) {
            return 0;
        }
    }

    // converts integers to strings
    // example: 1 => "1"
    public static String IntToString (int number) {
        return Integer.toString(number);
    }

    // converts 1 => true 
    // converts 0 => false
    // integers that are not 1 or 0 return false
    public static boolean IntToBool (int number) {
        return number == 1 ? true : false;
    }
    
    // converts true => 1
    // converts false => 0
    public static int BoolToInt (boolean bool) {
        return bool == true ? 1 : 0;
    }

    // converts "true" => true
    // converts "false" => false
    // words that are not "true" or "false" will return false
    public static boolean StringToBool (String word) {
        return word == "true" ? true : false;
    }

    // converts true => "true"
    // converts false => "false"
    public static String BoolToString (boolean bool) {
        return bool == true ? "true" : "false";
    }

    // // // // //
    // TESTING! //
    // // // // //
    public static void main (String args[]) {    
        System.out.println();
        System.out.println(StringToInt("50"));  
        System.out.println(StringToInt("bad"));
        System.out.println();
        System.out.println(IntToString(100)); 
        System.out.println();
        System.out.println(IntToBool(1)); 
        System.out.println(IntToBool(0));
        System.out.println(IntToBool(666));
        System.out.println();
        System.out.println(BoolToInt(false)); 
        System.out.println(BoolToInt(true)); 
        System.out.println();
        System.out.println(StringToBool("true"));
        System.out.println(StringToBool("false"));
        System.out.println(StringToBool("bad"));
        System.out.println();
        System.out.println(BoolToString(true)); 
        System.out.println(BoolToString(false)); 
        System.out.println();         
    }
    
}