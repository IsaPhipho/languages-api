package br.com.alura.languagesapi;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class LanguageController {
  @Autowired
  private LanguageRepository repository;

  @GetMapping("/languages")
  public List<Language> getLanguages() {
    List<Language> languages = repository.findAll();
    return languages;
  }
}

