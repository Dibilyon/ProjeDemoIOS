package Utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SimulatorStart {
    static String runSimulator() {
        String runSimulator = "";
        String shellCommand = "open -a Simulator.app";
        try
        {
            ProcessBuilder builder = new ProcessBuilder("open", "-n", "/Applications/Utilities/Terminal.app", shellCommand);
            builder.redirectErrorStream(true);
            Process prc = builder.start();
            BufferedReader output = new BufferedReader(new InputStreamReader(prc.getInputStream()));
            runSimulator = output.readLine();
            prc.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return runSimulator;
    }
}
