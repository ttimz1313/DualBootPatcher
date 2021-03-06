// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FileWriteRequest extends Table {
  public static FileWriteRequest getRootAsFileWriteRequest(ByteBuffer _bb) { return getRootAsFileWriteRequest(_bb, new FileWriteRequest()); }
  public static FileWriteRequest getRootAsFileWriteRequest(ByteBuffer _bb, FileWriteRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public FileWriteRequest __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int data(int j) { int o = __offset(6); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int dataLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer dataAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }

  public static int createFileWriteRequest(FlatBufferBuilder builder,
      int id,
      int dataOffset) {
    builder.startObject(2);
    FileWriteRequest.addData(builder, dataOffset);
    FileWriteRequest.addId(builder, id);
    return FileWriteRequest.endFileWriteRequest(builder);
  }

  public static void startFileWriteRequest(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(0, id, 0); }
  public static void addData(FlatBufferBuilder builder, int dataOffset) { builder.addOffset(1, dataOffset, 0); }
  public static int createDataVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startDataVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static int endFileWriteRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

