package DecoratorDP;

/**
 * This is the decorator class - an optional wrapper.
 */
public class InstrumentDecorator implements MusicMakingObjectLCD {
    private MusicMakingObjectLCD core;

    public InstrumentDecorator(MusicMakingObjectLCD inner)
    {
        this.core = inner;
    }

    @Override
    public String makeSound() {
        return core.makeSound();
    }
}
