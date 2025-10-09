package org.AutoWiring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// As we've discussed injecting the dependencies using @Autowired i.e.,
// 1.) Constructor Injection(use this as default)
// 2.) Setter Injection(use this when dependencies are optional and can be considered for change)
// 3.) Field Injection(Verbose, Avoid)
@Configuration
@ComponentScan("org.AutoWiring")
public class AutowiringTypes {

}
