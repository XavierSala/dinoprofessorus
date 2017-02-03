package net.xaviersala.model;

import java.util.ArrayList;
import java.util.List;

public class Camio {

  int numero;
  String conductor;
  List<Article> articles;

  public Camio() {
    numero = 1;
    conductor = "Manel";
    articles = new ArrayList<Article>();
  }

  /**
   * @return the numero
   */
  public int getNumero() {
    return numero;
  }
  /**
   * @param numero the numero to set
   */
  public void setNumero(int numero) {
    this.numero = numero;
  }
  /**
   * @return the condutor
   */
  public String getConductor() {
    return conductor;
  }
  /**
   * @param condutor the condutor to set
   */
  public void setConductor(String condutor) {
    this.conductor = condutor;
  }
  /**
   * @return the articles
   */
  public List<Article> getArticles() {
    return articles;
  }
  /**
   * @param articles the articles to set
   */
  public void setArticles(List<Article> articles) {
    this.articles = articles;
  }



}
