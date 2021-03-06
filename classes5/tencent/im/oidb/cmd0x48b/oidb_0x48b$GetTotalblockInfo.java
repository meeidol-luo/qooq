package tencent.im.oidb.cmd0x48b;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class oidb_0x48b$GetTotalblockInfo
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_mobile = PBField.initBytes(ByteStringMicro.EMPTY);
  public final PBUInt32Field uint32_account_type = PBField.initUInt32(0);
  public final PBUInt64Field uint64_block_qcall_id = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 26 }, new String[] { "uint32_account_type", "uint64_block_qcall_id", "bytes_mobile" }, new Object[] { Integer.valueOf(0), Long.valueOf(0L), localByteStringMicro }, GetTotalblockInfo.class);
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x48b\oidb_0x48b$GetTotalblockInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */