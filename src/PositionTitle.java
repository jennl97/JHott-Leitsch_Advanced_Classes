public enum PositionTitle {
    ADMINISTRATION("Administration"), PRODUCTION("Production"), SALES("Sales"), MAINTENANCE("Maintenance"), TECHNICAL("Technical"), SECRETARIAL("Secretarial");

    private String title;

    PositionTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
