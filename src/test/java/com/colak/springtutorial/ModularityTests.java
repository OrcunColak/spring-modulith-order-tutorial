package com.colak.springtutorial;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

class ModularityTests {

    @Test
    void verifyModularity() {
        ApplicationModules applicationModules = ApplicationModules.of(SpringTutorialApplication.class);
        applicationModules.forEach(System.out::println);
        applicationModules.verify();
    }

    @Test
    void createModuleDocumentation() {
        ApplicationModules applicationModules = ApplicationModules.of(SpringTutorialApplication.class);
        new Documenter(applicationModules).writeDocumentation();
    }

}