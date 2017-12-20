package lenovo.example.com.gouwucheqqqq;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Lenovo on 2017/12/20.
 */

public class XQModel implements XQjieKou {
    @Override
    public void getXQ(int pid, String str, final CGSB<XQBean> cgsb) {
        Flowable<XQBean> flowable = RetrofitHepler.getSerViceAPI().getXQ(pid, str);
        flowable.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<XQBean>() {
                    @Override
                    public void accept(XQBean xqBean) throws Exception {
                        cgsb.chengGong(xqBean);
                    }
                });
    }
    public void getTJ(int uid, int pid, String str, final CGSB<Tianjia> cgsb){
        Flowable<Tianjia> flowable = RetrofitHepler.getSerViceAPI().getMsg(uid, pid, str);
        flowable.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<Tianjia>() {
                    @Override
                    public void accept(Tianjia tianjia) throws Exception {
                        cgsb.chengGong(tianjia);
                    }
                });
    }}