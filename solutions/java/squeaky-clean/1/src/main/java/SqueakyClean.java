class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder finalStr = new StringBuilder();

        char[] charArray = identifier.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            
            if (Character.isWhitespace(ch)) {
                finalStr.append('_');
            } else if (ch == '-') {
                if (i + 1 < charArray.length) {
                finalStr.append(Character.toUpperCase(charArray[i+1]));
                i++;    
                }
            } else {
                char replacement = switch (ch) {
                    case '4' -> 'a';
                    case '3' -> 'e';
                    case '0' -> 'o';
                    case '1' -> 'l';
                    case '7' -> 't';
                    default  -> ch;
                };

                if (Character.isLetter(replacement)) {
                    finalStr.append(replacement);
                }
            }
        }

        return finalStr.toString();
    }
}
