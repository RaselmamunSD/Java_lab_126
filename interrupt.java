public class interruptException {
        public static void main(String[] args) {
            Thread thread = new Thread(() -> {
                try {
                    System.out.println("Thread is going to sleep for 5 seconds.");
                    Thread.sleep(5000);
                    System.out.println("Thread woke up after sleep.");
                } catch (InterruptedException e) {
                    System.err.println("Thread was interrupted while sleeping: " + e.getMessage());
                    Thread.currentThread().interrupt();
                }
            });

            thread.start();

            try {
                Thread.sleep(2000);
                System.out.println("Main thread is interrupting the sleeping thread.");
                thread.interrupt();
            } catch (InterruptedException e) {
                System.err.println("Main thread was interrupted.");
            }
        }
    }


