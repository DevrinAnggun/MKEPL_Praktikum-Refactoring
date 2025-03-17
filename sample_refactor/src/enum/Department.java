package department;

public enum Department {
    HRD("Human Resources Department"),
    IT("Information Technology"),
    FINANCE("Finance Department");

    private final String description;

    // Constructor untuk menyimpan deskripsi departemen
    Department(String description) {
        this.description = description;
    }

    // Getter untuk mendapatkan deskripsi departemen
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name() + " (" + description + ")";
    }
}
