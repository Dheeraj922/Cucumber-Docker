package enums;

public enum AppTab {

    HOTELS("HOTELS"),
    FLIGHTS("FLIGHTS"),
    BOATS("BOATS"),
    RENTALS("RENTALS"),
    TOURS("TOURS"),
    CARS("CARS"),
    VISA("VISA");

    private String label;

    AppTab(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
