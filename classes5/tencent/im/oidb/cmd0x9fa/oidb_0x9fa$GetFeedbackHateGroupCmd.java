package tencent.im.oidb.cmd0x9fa;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;

public final class oidb_0x9fa$GetFeedbackHateGroupCmd
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16 }, new String[] { "page_no", "page_size" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0) }, GetFeedbackHateGroupCmd.class);
  public final PBInt32Field page_no = PBField.initInt32(0);
  public final PBInt32Field page_size = PBField.initInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x9fa\oidb_0x9fa$GetFeedbackHateGroupCmd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */