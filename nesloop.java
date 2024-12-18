public class nesloop {

        public static void main(String[] args) {
            String word = "NEPAL";
            int length = word.length();
            
            // Loop to handle the number of rows (which is equal to the length of the word)
            for (int i = 0; i < length; i++) {
                // Print spaces for alignment
                for (int j = length - i - 1; j > 0; j--) {
                    System.out.print(" ");
                }
                
                // Print characters from the word
                for (int k = 0; k <= i; k++) {
                    System.out.print(word.charAt(k));
                }
                
                // Move to the next line after printing each row
                System.out.println();
            }
        }
    }
    

