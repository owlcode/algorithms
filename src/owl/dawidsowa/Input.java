package owl.dawidsowa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
    public void constructor(String args[]) {
    }

    public String read() {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;

        try {
            while ((s = in.readLine()) != null) {
                return s;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
}
