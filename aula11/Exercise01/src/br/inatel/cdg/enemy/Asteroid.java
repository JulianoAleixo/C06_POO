package br.inatel.cdg.enemy;

public class Asteroid {
    // Attributes
    private String name;
    private String asteroidType;

    // Methods
    public void destroy() {
        System.out.printf("%s explodiu!", this.name);
    }

    // Constructor
    public Asteroid(String name, String asteroidType) {
        this.name = name;
        this.asteroidType = asteroidType;
    }

    // Getters and Setters
    public String getAsteroidType() {
        return asteroidType;
    }
}
