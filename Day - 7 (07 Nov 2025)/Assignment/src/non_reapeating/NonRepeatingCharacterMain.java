package non_reapeating;

import java.util.HashMap;

public class NonRepeatingCharacterMain {

    public static char getFirstNonRepeatingCharacter(String str){

        HashMap<Character, Integer> characterMap = new HashMap<>();
        for(char c : str.toCharArray()){
            characterMap.put(c, characterMap.getOrDefault(c, 0) + 1);
        }
        for(char c: str.toCharArray()){
            if(characterMap.get(c) == 1){
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String input = "Deepak Kumar";
        char result = getFirstNonRepeatingCharacter(input);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }

}
