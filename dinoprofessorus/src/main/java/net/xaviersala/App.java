package net.xaviersala;

import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;
import static spark.Spark.get;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import net.xaviersala.model.Article;
import net.xaviersala.model.Camio;

/**
 * Servidor de camions de Dinoprofessorus.
 *
 * // src/test/resources/spark/template/freemarker
 */
public class App
{

  static Random aleatori = new Random();

  static String[] conductors = {
      "Manel",
      "Marcel",
      "Frederic",
      "Lluis",
      "Bernat",
      "Birba",
      "Joan Roig",
      "Pitu Sort",
      "Capelito",
      "Magnesi",
      "Met Miravitlles"
    };

  static String[] llistaArticles = {
      "Helleborus",
      "Margarites verdes",
      "Margarites grogues",
      "25gr de Gimnospermas",
    };

    public static void main( String[] args )
    {
        Spark.port(9090);
        Spark.staticFiles.location("/public");

        get("/camio", (request, response) -> {
          Map<String, Object> attributes = new HashMap<>();
          attributes.put("camio", generaCamio());
          return new ModelAndView(attributes, "camio.ftl");
      }, new FreeMarkerEngine());

    }

    private static Camio generaCamio() {
      Camio c = new Camio();
      c.setNumero(aleatori.nextInt(5000));
      c.setConductor(conductors[aleatori.nextInt(conductors.length)]);
      List<Article> articles = new ArrayList<>();

      for(int i=0; i<aleatori.nextInt(150); i++) {
          int triaArticle = aleatori.nextInt(llistaArticles.length);
          articles.add(new Article(llistaArticles[triaArticle], aleatori.nextInt(6)+1));
      }
      c.setArticles(articles);
      return c;
    }
}
