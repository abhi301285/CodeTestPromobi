package code.test.promobi.data.rest.response;

import java.io.Serializable;

import code.test.promobi.data.model.ArticleRepo;

public class ArticleResponse implements Serializable {
    String copyright;
    ArticleRepo response;

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public ArticleRepo getResponse() {
        return response;
    }

    public void setResponse(ArticleRepo response) {
        this.response = response;
    }
}
