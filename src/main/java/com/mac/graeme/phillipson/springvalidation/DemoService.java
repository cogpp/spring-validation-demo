package com.mac.graeme.phillipson.springvalidation;


import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Collection;

@Validated
public interface DemoService {

    public static final String NOT_BLANK = "^(?=\\s*\\S).*$";

    @NotNull @Pattern(regexp = NOT_BLANK) String sayHello(@NotNull @Pattern(regexp= NOT_BLANK) String message,
                                                          @NotNull @Size(min=1) Collection<String> people);
}
