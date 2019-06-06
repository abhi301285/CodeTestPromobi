package code.test.promobi.data.rest;

import javax.inject.Inject;

import code.test.promobi.data.rest.response.ArticleResponse;
import code.test.promobi.data.rest.response.BookListOverviewResponse;
import io.reactivex.Observable;

public class ApiRepository {

    private final APIService APIService;

    @Inject
    public ApiRepository(APIService APIService) {
        this.APIService = APIService;
    }

    public Observable<ArticleResponse> getArticles(int year, int month, String apiKey) {
        return APIService.getArticles(year, month, apiKey);
    }

    public Observable<BookListOverviewResponse> getBookListOverview(String apiKey) {
        return APIService.getBookListOverview(apiKey);
    }

}
