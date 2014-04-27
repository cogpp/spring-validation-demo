package com.mac.graeme.phillipson.springvalidation;


import org.hibernate.validator.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;

@Validated
public interface DemoService {

    @NotNull @NotBlank String sayHello(@NotNull @NotBlank String message,
                                       @NotNull @Size(min=1) Collection<String> people);
}
