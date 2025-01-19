public class NigerianFlagSingleLoop2 {
    public static void main(String[] args) {
        String[] flagPattern = {
                "* * * * = = = = = = =",
                "* * * * = = = = = = =",
                "* * * * = = = = = = =",
                "= = = = = = = = = = =",
                "= = = = = = = = = = =",
                "= = = = = = = = = = =",
        };

        for (int i = 0; i < flagPattern.length; i++){
            System.out.println(flagPattern[i]);
        }
    }
}
