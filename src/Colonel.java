class Colonel extends General implements Printable {
    private String regiment;

    public Colonel(String name, int yearsOfService, String regiment) {
        super(name, yearsOfService);
        this.regiment = regiment;
    }

    public String getRegiment() {
        return regiment;
    }

    @Override
    public void print() {
        System.out.println("Colonel [Name=" + getName() + ", Years of Service=" + getYearsOfService() +
                ", Regiment=" + regiment + "]");
    }
}