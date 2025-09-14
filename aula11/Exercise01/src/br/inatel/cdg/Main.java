package br.inatel.cdg;

import br.inatel.cdg.enemy.Asteroid;
import br.inatel.cdg.player.Spaceship;

public class Main {
    public static void main(String[] args) {
        Asteroid asteroid = new Asteroid("B-612", "Grande");
        Spaceship spaceship = new Spaceship("Millenium Falcon", 100, "Explosivo");

        spaceship.shoot(asteroid);
    }
}
