import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.biz.addContactTroopView.TroopCardSameCity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.statistics.ReportController;
import java.util.List;
import tencent.im.troop_search_searchtab.searchtab.Item2;

public class hgg
  implements AdapterView.OnItemClickListener
{
  public hgg(TroopCardSameCity paramTroopCardSameCity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (searchtab.Item2)this.a.jdField_a_of_type_JavaUtilList.get(paramInt);
    this.a.a(paramAdapterView.str_transfer_url.get());
    ReportController.b(this.a.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "P_CliOper", "Grp_find", "", "grptab", "Clk_localac", 0, 0, "", "", "", "");
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\hgg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */