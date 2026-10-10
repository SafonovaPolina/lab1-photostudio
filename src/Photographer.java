public class Photographer {
    private String name;
    private int experienceYears; // Стаж в годах

    public Photographer(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public String getName() { return name; }
    public int getExperienceYears() { return experienceYears; }
}