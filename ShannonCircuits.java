import java.util.*;

public class ShannonCircuits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of gates
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String[]> gates = new HashMap<>();

        // Read gate configurations
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("=");
            String gateName = parts[0].trim();
            String[] dependencies = parts[1].trim().split("[(), ]+");
            gates.put(gateName, dependencies);
        }

        // Read number of cycles
        int cycles = Integer.parseInt(scanner.nextLine());
        Map<String, int[]> values = new HashMap<>();

        // Read initial values or target gate
        while (true) {
            String input = scanner.nextLine();
            if (input.matches("[a-zA-Z]+")) {
                calculateOutput(gates, values, input.trim(), cycles);
                break;
            }

            String[] parts = input.split(" ");
            String gateName = parts[0];
            int[] gateValues = Arrays.stream(parts, 1, parts.length).mapToInt(Integer::parseInt).toArray();
            values.put(gateName, gateValues);
        }
    }

    private static void calculateOutput(Map<String, String[]> gates, Map<String, int[]> values, String target, int cycles) {
        Map<String, int[]> outputs = new HashMap<>();
        for (String gate : gates.keySet()) {
            outputs.put(gate, new int[cycles]);
        }

        for (int cycle = 1; cycle < cycles; cycle++) {
            for (String gate : gates.keySet()) {
                String[] dependencies = gates.get(gate);
                String operation = dependencies[0];
                String input1 = dependencies[1];
                String input2 = dependencies[2];

                int value1 = getValue(input1, outputs, values, cycle - 1);
                int value2 = getValue(input2, outputs, values, cycle - 1);

                outputs.get(gate)[cycle] = performOperation(operation, value1, value2);
            }
        }

        int[] result = outputs.get(target);
        for (int i = 0; i < cycles; i++) {
            System.out.print(result[i] + (i == cycles - 1 ? "" : " "));
        }
    }

    private static int getValue(String input, Map<String, int[]> outputs, Map<String, int[]> values, int cycle) {
        return values.containsKey(input) ? values.get(input)[cycle] : outputs.get(input)[cycle];
    }

    private static int performOperation(String operation, int value1, int value2) {
        switch (operation) {
            case "AND": return value1 & value2;
            case "OR": return value1 | value2;
            case "NAND": return ~(value1 & value2) & 1;
            case "NOR": return ~(value1 | value2) & 1;
            case "XOR": return value1 ^ value2;
            default: return 0;
        }
    }
}