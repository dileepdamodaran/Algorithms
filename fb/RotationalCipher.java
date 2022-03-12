package fb;

public class RotationalCipher {

    public static void main(String arggs[]){
        String s = "Zebra-493";
        for(char c : s.toCharArray()){
            System.out.println((char)(c+2));
        }



    }

    String rotationalCipher(String input, int rotationFactor) {
        // Write your code here
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        char[] newCharacters = new char[input.length()];
        for(int i=0; i <input.length(); i++){
            newCharacters[i] = shiftCharacter(input.charAt(i), alphabet , number , rotationFactor);
        }

        return new String(newCharacters);
    }

    private static Character shiftCharacter(Character c , String alphabet , String number , int shift){
        if(Character.isAlphabetic(c) || Character.isDigit(c)){
            int newCharacterIndex = (Character.isAlphabetic(c) ? alphabet.indexOf(Character.toLowerCase(c)):number.indexOf(c)) + shift;
            return Character.isAlphabetic(c)? getShiftedCharacter(alphabet, newCharacterIndex, c) :getShiftedNumber(number, newCharacterIndex);
        }

        return c;
    }

    private static Character getShiftedNumber(String number, int newCharacterIndex) {
        return number.charAt(newCharacterIndex%10);
    }

    private static Character getShiftedCharacter(String alphabet, int newCharacterIndex, Character c) {
        Character newCharacter = alphabet.charAt(newCharacterIndex%26);
        return Character.isUpperCase(c) ? Character.toUpperCase(newCharacter):newCharacter;
    }
}
