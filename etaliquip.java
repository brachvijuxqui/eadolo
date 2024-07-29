public class SwitchExample {

    enum ColumnType {
        ColTitle,
        ColAuthor,
        ColYear
    }

    public static void handleColumn(ColumnType column) {
        switch (column) {
            case ColTitle:
                System.out.println("Handling title column");
                break;
            case ColAuthor:
                System.out.println("Handling author column");
                break;
            case ColYear:
                System.out.println("Handling year column");
                break;
            default:
                System.out.println("Unknown column type");
                break;
        }
    }

    public static void main(String[] args) {
        handleColumn(ColumnType.ColTitle);
        handleColumn(ColumnType.ColAuthor);
        handleColumn(ColumnType.ColYear);
    }
}
