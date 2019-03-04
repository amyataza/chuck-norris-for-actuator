package guru.springframework.chucknorrisforactuator.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImp implements JokeService {
    private final ChuckNorrisQuotes ChuckNorrisQuotes;

    public JokeServiceImp() {
        this.ChuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return ChuckNorrisQuotes.getRandomQuote();
    }
}
