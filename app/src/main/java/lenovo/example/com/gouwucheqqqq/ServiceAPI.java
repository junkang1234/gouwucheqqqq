package lenovo.example.com.gouwucheqqqq;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Lenovo on 2017/12/20.
 */

public interface ServiceAPI {
    @GET("getProductDetail")
    Flowable<XQBean> getXQ(@Query("pid")int pid, @Query("source")String str);
    @GET("addCart")
    Flowable<Tianjia> getMsg(@Query("uid")int uid, @Query("pid")int pid, @Query("source")String str);
    @GET("getCarts")
    Flowable<CartBean> getCart(@Query("uid")int uid, @Query("source")String str);
}