package de.codecentric.apifirstspringboot;

import com.intuit.karate.junit5.Karate;

class NewsRunner {

    @Karate.Test
    Karate testNewsAvailability() {
        return Karate.run("availability").relativeTo(getClass());
    }
}
