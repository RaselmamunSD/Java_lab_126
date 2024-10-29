
public class classnotfound {
        public static void main(String[] args) {
            try {
                Class<?> clazz = Class.forName("com.example.NonExistentClass");
                System.out.println("Class loaded: " + clazz.getName());
            } catch (ClassNotFoundException e) {
                System.err.println("Class not found: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


