package com.tencent.mobileqq.search.model;

import android.app.Activity;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.tencent.mobileqq.activity.selectmember.SelectMemberActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.qphone.base.util.BaseApplication;
import java.util.ArrayList;
import java.util.List;

public class ContactSearchModelCreateDiscussion
  extends IContactSearchModel
{
  String jdField_a_of_type_JavaLangString;
  List jdField_a_of_type_JavaUtilList;
  private long b;
  
  public ContactSearchModelCreateDiscussion(QQAppInterface paramQQAppInterface, int paramInt, String paramString, List paramList)
  {
    super(paramQQAppInterface, paramInt, 0L);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaLangString = paramString;
    this.jdField_a_of_type_JavaUtilList = paramList;
  }
  
  private CharSequence f()
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    localSpannableStringBuilder.append("邀请:");
    int i = 0;
    while (i < this.jdField_a_of_type_JavaUtilList.size())
    {
      if (i != 0) {
        localSpannableStringBuilder.append("、");
      }
      localSpannableStringBuilder.append(((IContactSearchModel)this.jdField_a_of_type_JavaUtilList.get(i)).e());
      i += 1;
    }
    return localSpannableStringBuilder;
  }
  
  public int a()
  {
    return 9889987;
  }
  
  protected long a(String paramString)
  {
    return 0L;
  }
  
  public CharSequence a()
  {
    return f();
  }
  
  public Object a()
  {
    return Integer.valueOf(9889987);
  }
  
  public String a()
  {
    return String.valueOf(9889987);
  }
  
  public void a(View paramView)
  {
    long l = System.currentTimeMillis();
    if (l - this.b < 1500L) {
      return;
    }
    this.b = l;
    Intent localIntent = new Intent(paramView.getContext(), SelectMemberActivity.class);
    localIntent.putExtra("param_type", 3000);
    localIntent.putExtra("param_subtype", 0);
    localIntent.putExtra("param_from", 1002);
    localIntent.putExtra("param_min", 2);
    localIntent.putExtra("param_max", 99);
    ArrayList localArrayList = new ArrayList();
    int j = 0;
    Object localObject;
    String str1;
    String str2;
    int i;
    if (j < this.jdField_a_of_type_JavaUtilList.size())
    {
      localObject = (IContactSearchModel)this.jdField_a_of_type_JavaUtilList.get(j);
      str1 = ((IContactSearchModel)localObject).a();
      str2 = ((IContactSearchModel)localObject).e().toString();
      if ((localObject instanceof ContactSearchModelDiscussionMember))
      {
        localObject = ((ContactSearchModelDiscussionMember)localObject).e();
        i = 2;
      }
    }
    for (;;)
    {
      localArrayList.add(SelectMemberActivity.a(str1, str2, i, (String)localObject));
      j += 1;
      break;
      if ((localObject instanceof ContactSearchModelFriend))
      {
        localObject = "-1";
        i = 0;
        continue;
        localIntent.putExtra("param_done_button_wording", this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getString(2131370179));
        localIntent.putExtra("param_done_button_highlight_wording", this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface.a().getString(2131370180));
        localIntent.putExtra("param_selected_records_for_create_discussion", localArrayList);
        ((Activity)paramView.getContext()).startActivityForResult(localIntent, 1300);
        ReportController.b(this.jdField_a_of_type_ComTencentMobileqqAppQQAppInterface, "CliOper", "", "", "0X800635F", "0X800635F", 0, 0, "", "", "", "");
      }
      else
      {
        localObject = "-1";
        i = 0;
      }
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  public int b()
  {
    return 9889987;
  }
  
  public CharSequence b()
  {
    return "";
  }
  
  public String b()
  {
    return this.jdField_a_of_type_JavaLangString;
  }
  
  public CharSequence c()
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    if (this.jdField_a_of_type_JavaUtilList != null) {}
    for (int i = this.jdField_a_of_type_JavaUtilList.size();; i = 0)
    {
      localSpannableStringBuilder.append("已选择").append("" + i).append("人");
      return localSpannableStringBuilder;
    }
  }
  
  public String c()
  {
    return f().toString();
  }
  
  public CharSequence d()
  {
    return null;
  }
  
  public String d()
  {
    return "";
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\mobileqq\search\model\ContactSearchModelCreateDiscussion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */