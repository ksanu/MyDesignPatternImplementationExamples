package DecoratorDP;

/**
 * This is the core class. A musician can just stand and sing alone, but it's good to give him some instruments
 * as "decoration".
 */
public class MusicianCore implements MusicMakingObjectLCD {

    @Override
    public String makeSound() {
        return "[...musisian's singing...]";
    }
}
