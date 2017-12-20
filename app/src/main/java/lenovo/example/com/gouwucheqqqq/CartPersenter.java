package lenovo.example.com.gouwucheqqqq;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2017/12/20.
 */

public class CartPersenter {
    private ICart iCart;
    private final CarModel cartModel;

    public CartPersenter(ICart iCart) {
        this.iCart = iCart;
        cartModel = new CarModel();

    }
    public void getCart(){
        cartModel.getCart(3043,"android",new CGSB<CartBean>(){

            @Override
            public void chengGong(CartBean cartBean) {
                List<CartBean.DataBean> grouplist = cartBean.getData();
                List<List<CartBean.DataBean.ListBean>> childlist = new ArrayList<>();
                for (int i = 0; i < grouplist.size(); i++) {
                    CartBean.DataBean dataBean = grouplist.get(i);
                    List<CartBean.DataBean.ListBean> list = dataBean.getList();
                    childlist.add(list);
                }
                iCart.showlist(grouplist,childlist);
            }
        });
    }

}
