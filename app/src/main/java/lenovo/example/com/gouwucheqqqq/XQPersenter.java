package lenovo.example.com.gouwucheqqqq;

/**
 * Created by Lenovo on 2017/12/20.
 */

public class XQPersenter {
    private final XQModel xqModel;
    private Iview iview;
    public XQPersenter(Iview iview) {
        xqModel = new XQModel();
        this.iview=iview;
    }
    public void getXQ(){
        xqModel.getXQ(12, "android", new CGSB<XQBean>() {
            @Override
            public void chengGong(XQBean xqBean) {
                iview.showBean(xqBean);
            }
        });
    }
    public void getTJ(){
        xqModel.getTJ(3043, 12, "android", new CGSB<Tianjia>() {
            @Override
            public void chengGong(Tianjia tianjia) {
                iview.showStr(tianjia.getMsg());
            }
        });
    }
}