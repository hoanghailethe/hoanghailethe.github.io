public class _804_UniqueMorse {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String[] trans2Morse = new String[words.length];

        for (String word : words) {       
            StringBuilder morse = new StringBuilder();
            for(int j = 0; j < word.length(); j++) {

                int i = word.charAt(j) - 'a';
                morse.append(morseCode[i]) ;

            }
            trans2Morse[i] = morse.toString();
        }

        Set<String> result = new HashSet();
        for (String string : trans2Morse) {
            result.add(string);
        }

        return result.size();
    }
}
