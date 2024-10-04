class LieutenantColonel extends General implements Printable {
    private int numberOfBattles;

    public LieutenantColonel(String name, int yearsOfService, int numberOfBattles) {
        super(name, yearsOfService);
        this.numberOfBattles = numberOfBattles;
    }

    public int getNumberOfBattles() {
        return numberOfBattles;
    }

    @Override
    public void print() {
        System.out.println("LieutenantColonel [Name=" + getName() + ", " +
                "Years of Service=" + getYearsOfService() +
                ", Number of Battles=" + numberOfBattles + "]");
    }
}