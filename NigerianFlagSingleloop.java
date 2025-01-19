public class NigerianFlagSingleloop {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;

        for (int i = 0; i < rows; i++) {
            StringBuilder flagRow = new StringBuilder();

            for (int j = 0; j < columns; j++){
                flagRow.append("* ");
            }
            flagRow.append("= = = = ");
            for (int j = 0; j < columns; j++) {
                flagRow.append("* ");
            }

            System.out.println(flagRow.toString());
        }
    }
}
