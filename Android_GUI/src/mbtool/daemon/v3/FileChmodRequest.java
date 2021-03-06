// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FileChmodRequest extends Table {
  public static FileChmodRequest getRootAsFileChmodRequest(ByteBuffer _bb) { return getRootAsFileChmodRequest(_bb, new FileChmodRequest()); }
  public static FileChmodRequest getRootAsFileChmodRequest(ByteBuffer _bb, FileChmodRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public FileChmodRequest __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public long mode() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0; }

  public static int createFileChmodRequest(FlatBufferBuilder builder,
      int id,
      long mode) {
    builder.startObject(2);
    FileChmodRequest.addMode(builder, mode);
    FileChmodRequest.addId(builder, id);
    return FileChmodRequest.endFileChmodRequest(builder);
  }

  public static void startFileChmodRequest(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(0, id, 0); }
  public static void addMode(FlatBufferBuilder builder, long mode) { builder.addInt(1, (int)mode, 0); }
  public static int endFileChmodRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

