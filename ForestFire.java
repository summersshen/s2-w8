import java.util.*;
import java.io.*;

public class ForestFire {
    public static void main(String[] args) {
        // Step 1: Read in the data file (forests.csv) and create Forest objects.
        //   - Open the CSV file.
        //   - Skip/read the header row.
        //   - Parse each line into fields and construct a Forest.
        //   - Store forests in an ArrayList: ArrayList<Forest> forests = ...
        ArrayList<Forest> forests = new ArrayList<Forest>();
        Scanner scanner = new Scanner("/Users/summerss27/s2-w8/forests.csv");
        if(scanner.hasNextLine()) {
            scanner.nextLine();
        }
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String name = parts[0];
            String type = parts[1];
            String vegetarian = parts[2];
            double area_sq_mi = Double.parseDouble(parts[3]);
            double cell_area_sq_mi = Double.parseDouble(parts[4]);
            int grid_rows = Integer.parseInt(parts[5]);
            int grid_cols = Integer.parseInt(parts[6]);
            double burn_rate = Double.parseDouble(parts[7]);
            int initial_tree_count = Integer.parseInt(parts[8]);
            int burn_duration = Integer.parseInt(parts[9]);


        }




        // Step 2: Pick one forest to run the simulation.
        //   - Choose by index.
        //   - Start at least one burning tree to begin the fire.

        // Step 3: Run the simulation.
        //   - Repeat spreadFire() for a fixed number of steps (or until fire ends).
        //   - At the end, print percentBurned() and summary stats.
        //   - At the end of each simulation step, you should write the current state of the Tree[][] grid to a file

        // Step 4: We will vibe code our way to visualization

    }

}
