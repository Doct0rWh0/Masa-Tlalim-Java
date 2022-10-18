public enum Month {
    JAN (10),
    FEB (20),
    MAR (30),
    APR (40),
    MAY (50),
    JUN (60),
    JUL (70),
    AUG (80),
    SEP (90),
    OCT (100),
    NOV (110),
    DEC (120);
    private final int index;
    private int[] MonthTemp= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public static int getTemperature(Month month){
            return month.MonthTemp[(month.index) / 10 - 1];
    }
    public static void setTemperature(Month month, int temperature){
        month.MonthTemp[(month.index) / 10 - 1] = temperature;
    }
    public int getIndex() {
        return index;
    }

    Month(int index) {
        this.index = index;
    }
}
