class Major extends General implements Printable {
    private boolean isSpecialForces;

    public Major(String name, int yearsOfService, boolean isSpecialForces) {
        super(name, yearsOfService);
        this.isSpecialForces = isSpecialForces;
    }

    public boolean isSpecialForces() {
        return isSpecialForces;
    }

    @Override
    public void print() {
        System.out.println("Major [Name=" + getName() + ", Years of Service=" + getYearsOfService() +
                ", Special Forces=" + isSpecialForces + "]");
    }
}