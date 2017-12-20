package lenovo.example.com.gouwucheqqqq;

import java.util.List;

/**
 * Created by Lenovo on 2017/12/20.
 */

public interface ICart{
    void showlist(List<CartBean.DataBean> grouplist, List<List<CartBean.DataBean.ListBean>> childlist);
}