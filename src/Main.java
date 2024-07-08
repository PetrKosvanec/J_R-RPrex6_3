import acm.util.RandomGenerator;
import acm.program.*;

public class Main extends ConsoleProgram {   //ConsoleProgram {

    public static void main(String[] args) {
        new Main().start(args);
    }

    public void run() {
        int nInCircle = 0;

        for (int i = 0; i < N_TRIALS; i++) {
            DartThrow dt_i = new DartThrow(
                    rg.nextDouble(-1.0, 1.0),
                    rg.nextDouble(-1.0, 1.0)
            );
            if ( dt_i.isInCircle() ) {
                nInCircle++;
            }
        }
        println("nInCircle = " + nInCircle + "\n" + "N_TRIALS = " + N_TRIALS);
        println("PI expected: 4 * ( (nInCircle * 1.0) / (N_TRIALS * 1.0) = " +
                4 * ( (nInCircle * 1.0) / (N_TRIALS * 1.0) ));
    }

    /* Named constants e.g. class variables*/
    private static final int N_TRIALS = 10000;

    /* instance variables */
    private RandomGenerator rg = RandomGenerator.getInstance();
}