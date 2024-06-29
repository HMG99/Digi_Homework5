package model;

public class VideoGame {
    private String name;
    private String genre;
    private String developer;
    private String platform;
    private boolean firstPerson;
    private int releaseDateYear;
    private int releaseDateMonth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean isFirstPerson() {
        return firstPerson;
    }

    public void setFirstPerson(boolean firstPerson) {
        this.firstPerson = firstPerson;
    }

    public int getReleaseDateYear() {
        return releaseDateYear;
    }

    public void setReleaseDateYear(int releaseDateYear) {
        this.releaseDateYear = releaseDateYear;
    }

    public int getReleaseDateMonth() {
        return releaseDateMonth;
    }

    public void setReleaseDateMonth(int releaseDateMonth) {
        this.releaseDateMonth = releaseDateMonth;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Developer: " + developer);
        System.out.println("Firstperson: " + firstPerson);
        System.out.println("ReleaseDateYear: " + releaseDateYear);
        System.out.println("ReleaseDateMonth: " + releaseDateMonth);
        System.out.print("Platform: " + platform);

    }
}