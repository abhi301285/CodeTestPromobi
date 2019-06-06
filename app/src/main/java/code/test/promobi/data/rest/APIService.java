package code.test.promobi.data.rest;

import code.test.promobi.data.rest.response.ArticleResponse;
import code.test.promobi.data.rest.response.BookListOverviewResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIService {

    @GET("archive/v1/{year}/{month}.json?")
    Observable<ArticleResponse> getArticles(@Path("year") int year,
                                            @Path("month") int month,
                                            @Query("api-key") String apiKey);

    @GET("books/v3/lists/overview.json?")
    Observable<BookListOverviewResponse> getBookListOverview(@Query("api-key") String apiKey);
}
