package models;

import java.util.List;

public class Newsapiresponse {
    String status;
    int totalResults;
    List<news_headlines> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<news_headlines> getArticles() {
        return articles;
    }

    public void setArticles(List<news_headlines> articles) {
        this.articles = articles;
    }
}
