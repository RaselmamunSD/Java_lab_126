public class negative_array_size {
    public static void main(String[] args) {
        try {
            int[] array = new int[-5];
        } catch (NegativeArraySizeException nase){
            System.out.println("Continuing execution...");
        }
    }
}

