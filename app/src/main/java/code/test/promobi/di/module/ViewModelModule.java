package code.test.promobi.di.module;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import javax.inject.Singleton;

import code.test.promobi.di.util.ViewModelKey;
import code.test.promobi.ui.article.ArticleViewModel;
import code.test.promobi.ui.book.BookViewModel;
import code.test.promobi.util.ViewModelFactory;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Singleton
@Module
public abstract class ViewModelModule {

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);

    @Binds
    @IntoMap
    @ViewModelKey(ArticleViewModel.class)
    abstract ViewModel bindArticleViewModel(ArticleViewModel articleViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(BookViewModel.class)
    abstract ViewModel bindBookViewModel(BookViewModel bookViewModel);
}
