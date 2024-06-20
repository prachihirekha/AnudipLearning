package lab.conditional_satament.lab41;

    public class VowelChecker {
        // main class

        public static void main(String[] args) {
            try { // try block
                checkForVowels("hello");// check vowels
                checkForVowels("sky");// vowels
            } catch (NoVowelException e) {// catch block
                System.out.println(e.getMessage());
            }
        }

        public static void checkForVowels(String input) throws NoVowelException {// method
            if (!containsVowel(input)) {//if condition
                throw new NoVowelException("The string does not contain any vowels: " + input);
            }
            System.out.println("The string contains at least one vowel: " + input);
        }
// create method
        private static boolean containsVowel(String input) {
            String vowels = "aeiouAEIOU";
            for (char c : input.toCharArray()) {// for loop
                if (vowels.indexOf(c) != -1) {
                    return true;
                }
            }
            return false;
        }
    }

    class NoVowelException extends Exception {
        public NoVowelException(String message) {
            super(message);// super key word
        }
    }


