package UnitTests;

import DecoratorDP.*;
import org.junit.Assert;
import org.junit.Test;

public class MusicianUnitTests {
     @Test
    public void MusicianAloneShouldOnlySing()
     {
         MusicMakingObjectLCD testObject = new MusicianCore();
         String res = testObject.makeSound();
         Assert.assertEquals("[...musisian's singing...]", res );
     }

    @Test
    public void MusicianAloneWithDecoratorWrapperShouldOnlySing()
    {
        MusicMakingObjectLCD testObject = new InstrumentDecorator(new MusicianCore());
        String res = testObject.makeSound();
        Assert.assertEquals("[...musisian's singing...]", res );
    }

    @Test
    public void MusicianWithGuitarShouldSingAndPlayGuitar()
    {
        MusicMakingObjectLCD testObject = new GuitarDecorator(new MusicianCore());
        String res = testObject.makeSound();
        Assert.assertEquals("[...musisian's singing...]" + "[...guitar playing...]", res );
    }

    @Test
    public void MusicianWithGuitarAndDrumShouldSingPlayGuitarAndDrum()
    {
        MusicMakingObjectLCD testObject = new DrumDecorator(new GuitarDecorator(new MusicianCore()));
        String res = testObject.makeSound();
        Assert.assertEquals("[...musisian's singing...]" + "[...guitar playing...]"
                + "[...drum's drumming...]", res );
    }

    @Test
    public void MusicianWithGuitarViolinAndDrumShouldSingPlayGuitarViolinAndDrum()
    {
        MusicMakingObjectLCD testObject = new DrumDecorator(
                new ViolinDecorator(new GuitarDecorator(new MusicianCore())));
        String res = testObject.makeSound();
        Assert.assertEquals("[...musisian's singing...]" + "[...guitar playing...]" + "[...violin playing...]"
                + "[...drum's drumming...]", res );
    }

}
