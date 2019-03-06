package com.smartzig.smartzjokes;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class SmartJokes {

    private List<String> list;

    public SmartJokes() {
        list = asList(
                "Two ints and a Float in a bar. They spot an attractive Double on her own. " +
                        "The first int walks up to her. 'Hey, baby', he says, 'my VM or yours?'. " +
                        "She slaps him and he walks back dejected.",

                "The second int walks over. 'Hey, cute-stuff, can I cook you Beans for breakfast?'. " +
                        "After a quick slapping, he too walks back.",

                "The Float then ambles over casually. 'Were those two primitive types bothering you?', he remarks.",

                "'Yes. I'm so glad you're here', she says. 'They just had no Class!'"

        );
    }

    public String getJoke(){
        Random random = new Random();

        return  list.get(random.nextInt(list.size()));
    }
}
