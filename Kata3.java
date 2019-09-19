package uk.ac.wlv.cs5006.kata3;

/**
 * 
 * @author Dinindu Chandimal Marasinghe 
 *
 */
public class Kata3 {

    // Array of all valid alpha characters
    private static String[] alphanumeric = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
        "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "};

    // Array of all valid Morse code characters
    private static String[] morsecode = {"._", "_...", "_._.", "_..", ".", ".._.", "__.", "....",
        "..", ".___", "_._", "._..", "__", "_.", "___", ".__.", "__._", "._.", "...", "_", ".._",
        "..._", ".__", "_.._", "_.__", "__..", "|"};

    public static void main(final String[] args) {}
    
    public static String translateToMorseCode(String alphanumericWord) {
        String morsecodeValue = "";
        
        // isString function take word as first parameter and type as second parameter for skip checking blank space in morse code
        if(isStringFine(alphanumericWord, 'A')) {
            alphanumericWord = alphanumericWord.toLowerCase();
            char[] alphanumeric_array = alphanumericWord.toCharArray();
            
            for (int i = 0; i < alphanumeric_array.length; i++){
                for (int x = 0; x < alphanumeric.length; x++){
                    if (alphanumeric_array[i] == alphanumeric[x].charAt(0)){
                        morsecodeValue = morsecodeValue + morsecode[x] + " ";  
                    }
                }
            }
        }

        return morsecodeValue;
        
    }
    
    public static String translateFromMorseCode(String morsecodeValue) {
        String alphanumericWord = "";
        
        // isString function take word as first parameter and type as second parameter for skip checking blank space in morse code
        if(isStringFine(morsecodeValue, 'M')) {
            String[] morsecode_array = morsecodeValue.split(" ");
            for (int i = 0; i < morsecode_array.length; i++){
                for (int x = 0; x < morsecode.length; x++){
                    
                    if (morsecode_array[i].equals(morsecode[x])){
                        
                        alphanumericWord = alphanumericWord + alphanumeric[x];  
                    }
                }
            }
        }
        System.out.println(alphanumericWord);
        return alphanumericWord;
    }
    
    private static boolean isStringFine(String str, char type) {
        if(str != null && str != "") {
            int stringLength = str.length();

            for(int i = 0; i < stringLength; i++) {
                if(str.charAt(i) == ' ' && type == 'A') {
                    return false;
                }
                if(Character.isDigit(str.charAt(i))) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
        
    }

}
