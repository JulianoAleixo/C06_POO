package br.inatel.cdg.player;

import br.inatel.cdg.enemy.Asteroid;

public class Spaceship {
    // Attributes
    private String name;
    private double life;
    private String shootType;

    // Methods
    public void shoot(Asteroid asteroid) {
        if (this.shootType == "Explosivo") {
            asteroid.destroy();
        } else {
            if (asteroid.getAsteroidType() == "Grande") {
                System.out.print("Não é possível destruir o asteroide grande com o tiro normal.");
            } else {
                asteroid.destroy();
            }
        }
    }

    // Constructor
    public Spaceship(String name, double life, String shootType) {
        this.name = name;
        this.life = life;
        this.shootType = shootType;
    }
}