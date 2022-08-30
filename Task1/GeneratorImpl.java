// Implementation of Generator interface for generating random numbers
public class GeneratorImpl implements Generator {
    @Override
    public int generate() {
        return (int) (Math.random()*100);
    }
}
