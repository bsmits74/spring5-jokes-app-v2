package guru.springframework.ChuckQuotes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckQuotes implements QuoteService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckQuotes() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getQuote(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
