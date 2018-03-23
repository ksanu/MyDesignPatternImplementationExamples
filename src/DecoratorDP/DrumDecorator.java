package DecoratorDP;

/**
 * This is the drum decorator.
 * It can give the musician an additional functionality of playing the drum.
 */
public class DrumDecorator extends InstrumentDecorator {

    public DrumDecorator(MusicMakingObjectLCD inner) {
        super(inner);
    }

    @Override
    public String makeSound() {
        return super.makeSound() + makeDrumSound();
    }

    public String makeDrumSound()
    {
        return "[...drum's drumming...]";
    }
}
