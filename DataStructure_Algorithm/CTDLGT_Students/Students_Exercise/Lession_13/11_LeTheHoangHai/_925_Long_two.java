public class _925_Long_two {
    public boolean isLongPressedName(String name, String typed) {
        int namePointer = 0;
        char prev = '#';
        
        for (int typedPointer = 0; typedPointer < typed.length(); typedPointer++) {
            if (namePointer < name.length() && typed.charAt(typedPointer) == name.charAt(namePointer)) {
                prev = typed.charAt(typedPointer);
                namePointer++;
            } else if (typed.charAt(typedPointer) != prev)
                return false;
        }
        return namePointer == name.length();
    }
}
