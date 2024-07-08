import acm.util.RandomGenerator;
import acm.program.*;

public class Main extends ConsoleProgram {   //ConsoleProgram {

    public static void main(String[] args) {
        new Main().start(args);
    }

    public void run() {
        for (int i = 0; i < N_TRIALS; i++) {
            DartThrow dt = new DartThrow(
                    rg.nextDouble(-1.0, 1.0),
                    rg.nextDouble(-1.0, 1.0)
            );
            if ( i == (N_TRIALS - 1) ) {
                println("PI - 3.14 - expected:\n" +
                        "4 * ( number of darts in circle / N_TRIALS) =\n" +
                        "4 * ( " + dt.getInCircleCounter() + " / " + N_TRIALS + " ) =\n" +
                        4 * ( (dt.getInCircleCounter() * 1.0) / (N_TRIALS * 1.0) ));
            }
        }
    }

    /* Named constants e.g. class variables*/
    private static final int N_TRIALS = 1000;//000;

    /* instance variables */
    private RandomGenerator rg = RandomGenerator.getInstance();
}