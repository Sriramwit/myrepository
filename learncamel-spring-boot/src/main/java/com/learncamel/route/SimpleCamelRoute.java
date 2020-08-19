package com.learncamel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SimpleCamelRoute extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        from("{{startRoutee}}")
                .log("Timer invoked NOW")
                .pollEnrich("{{fromRoute}}")
                .to("{{toRoute1}}");
    }
}
