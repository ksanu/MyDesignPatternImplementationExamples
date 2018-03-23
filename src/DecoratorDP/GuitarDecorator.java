package DecoratorDP;

/**
 * This is the guitar decorator.
 * It can give the musician an additional functionality of playing the guitar.
 */
public class GuitarDecorator extends InstrumentDecorator {


    public GuitarDecorator(MusicMakingObjectLCD inner) {
        super(inner);
    }

    @Override
    public String makeSound() {
        return super.makeSound() + this.makeGuitarSound() ;
    }

    public String makeGuitarSound()
    {
        return "[...guitar playing...]";
    }
}
