package net.xaviersala.model;

public class Article {

  String nom;
  int quantitat;

  public Article(String nom, int quantitat) {
     this.nom = nom;
     this.quantitat = quantitat;
  }

  /**
   * @return the nom
   */
  public String getNom() {
    return nom;
  }

  /**
   * @param nom the nom to set
   */
  public void setNom(String nom) {
    this.nom = nom;
  }

  /**
   * @return the quantitat
   */
  public int getQuantitat() {
    return quantitat;
  }

  /**
   * @param quantitat the quantitat to set
   */
  public void setQuantitat(int quantitat) {
    this.quantitat = quantitat;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "[" + nom + "-" + quantitat + "]";
  }



}
