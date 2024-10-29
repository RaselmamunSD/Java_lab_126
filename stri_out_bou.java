public class string_outof_bound {
        public static void main(String args[]) {
            String str = "My String";
            try {
                System.out.println(str.charAt(9));
            } catch(StringIndexOutOfBoundsException e) {
                System.out.println("String index out of bounds. String length: " + str.length());
            }
        }
    }

