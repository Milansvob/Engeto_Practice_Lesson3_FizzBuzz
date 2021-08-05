package engeto.DU.FizzBuzz;

public enum FizzBuzz {
    FIZZ("fizz"), BUZZ("buzz"), FIZZBUZZ("fizzbuzz");

    final String Description;


    FizzBuzz(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return  Description;
    }
}