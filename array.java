public class array_store_exception {

        public static void main(String args[])
        {


            try {

                Object a[] = new Double[2];
                a[0] = 4;
            }

            catch (ArrayStoreException e) {

                System.out.println("ArrayStoreException found");
            }
        }
    }


