package code.test.promobi.di.module;

import code.test.promobi.ui.article.ArticleActivity;
import code.test.promobi.ui.book.BookActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {


    @ContributesAndroidInjector
    abstract ArticleActivity bindArticleActivity();

    @ContributesAndroidInjector
    abstract BookActivity bindBookActivity();

}
