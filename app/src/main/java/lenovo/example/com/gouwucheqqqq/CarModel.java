package lenovo.example.com.gouwucheqqqq;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Lenovo on 2017/12/20.
 */

public class CarModel {
    public void getCart(int uid, String str, final CGSB<CartBean> cgsb){
        Flowable<CartBean> flowable = RetrofitHepler.getSerViceAPI().getCart(uid,str);
        flowable.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<CartBean>() {
                    @Override
                    public void accept(CartBean cartBean) throws Exception {
                        cgsb.chengGong(cartBean);
                    }
                });
    }
}