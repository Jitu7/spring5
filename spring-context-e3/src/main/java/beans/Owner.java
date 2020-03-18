package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.StringJoiner;

@Component
public class Owner {

    /**
     *  @Autowired(required = false) //but not recommended
     * private Dog dog;
     */
    private final Dog dog;

    @Autowired
    public Owner(@Qualifier("dog2") Dog dog) {
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }

    /**
     * can do this but in this case can't make instance variable as final
     */
    // @Autowired
//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }
    @Override
    public String toString() {
        return new StringJoiner(", ", Owner.class.getSimpleName() + "[", "]")
                .add("dog=" + dog)
                .toString();
    }
}
