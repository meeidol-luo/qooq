package tencent.im.oidb.cmd0x435;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class oidb_0x435$GetAllPKItemsReqBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8 }, new String[] { "uint32_pk_item_id" }, new Object[] { Integer.valueOf(0) }, GetAllPKItemsReqBody.class);
  public final PBUInt32Field uint32_pk_item_id = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x435\oidb_0x435$GetAllPKItemsReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */