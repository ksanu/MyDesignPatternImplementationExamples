package DecoratorDP;

/**
 * This is the violin decorator.
 * It can give the musician an additional functionality of playing the violin.
 */
public class ViolinDecorator extends InstrumentDecorator{
    public ViolinDecorator(MusicMakingObjectLCD inner) {
        super(inner);
    }

    @Override
    public String makeSound() {
        return super.makeSound() + this.makeViolinSound();
    }

    public String makeViolinSound()
    {
        return "[...violin playing...]";
    }
}
