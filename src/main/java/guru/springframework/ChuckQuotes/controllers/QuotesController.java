package guru.springframework.ChuckQuotes.controllers;

import guru.springframework.ChuckQuotes.services.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuotesController {

    private final QuoteService quoteService;

    public QuotesController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping({"/", ""})
    public String getQuote(Model model) {
        model.addAttribute("quote", quoteService.getQuote());

        return "quote";
    }
}
