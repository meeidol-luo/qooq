import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mobileqq.activity.QQBrowserActivity;
import com.tencent.mobileqq.activity.aio.AIOUtils;
import com.tencent.mobileqq.activity.aio.item.VIPDonateMsgItemBuilder;
import com.tencent.mobileqq.data.MessageForVIPDonate;
import com.tencent.mobileqq.data.VIPDonateMsg;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.qphone.base.util.QLog;

public class nsg
  implements View.OnClickListener
{
  public nsg(VIPDonateMsgItemBuilder paramVIPDonateMsgItemBuilder)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(View paramView)
  {
    if (VIPDonateMsgItemBuilder.a(this.a)) {
      return;
    }
    paramView = (MessageForVIPDonate)((nsh)AIOUtils.a(paramView)).a;
    Object localObject = paramView.donateMsg;
    if ((localObject != null) && (!TextUtils.isEmpty(((VIPDonateMsg)localObject).jumpUrl)))
    {
      paramView = paramView.donateMsg.jumpUrl;
      localObject = new Intent(VIPDonateMsgItemBuilder.a(this.a), QQBrowserActivity.class);
      ((Intent)localObject).putExtra("url", paramView);
      VIPDonateMsgItemBuilder.a(this.a).startActivity((Intent)localObject);
      return;
    }
    QLog.e(VIPDonateMsgItemBuilder.b, 1, "donatemsg jumpurl empty");
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\nsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */