package upbit.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.ArrayList;
import java.util.List;

public class MinuteCandleValidator implements Validator {
    private List<Integer> allowUnites = new ArrayList<>();

    public MinuteCandleValidator() {
        allowUnites.add(1);
        allowUnites.add(3);
        allowUnites.add(5);
        allowUnites.add(10);
        allowUnites.add(15);
        allowUnites.add(30);
        allowUnites.add(60);
        allowUnites.add(240);
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(Integer.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Integer unit = (Integer) target;

        if (!allowUnites.contains(unit)) {
            errors.rejectValue("unit","invalid unit");
        }
    }
}
