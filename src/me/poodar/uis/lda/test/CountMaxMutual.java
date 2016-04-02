package me.poodar.uis.lda.test;

import me.poodar.uis.lda.conf.PathConfig;
import me.poodar.uis.lda.util.Documents;
import me.poodar.uis.social.lda.util.GeneralizedPolyaMetric;

public class CountMaxMutual {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Documents documents = new Documents();
    documents.readDocs(PathConfig.followerPath);
    documents.readDocs(PathConfig.followeePath);
    GeneralizedPolyaMetric gpm = new GeneralizedPolyaMetric(documents);
    System.out.println(gpm.getMax());
  }
  
}
