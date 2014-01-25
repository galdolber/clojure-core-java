package clojure;

import clojure.lang.*;

public final class core_chunk_buffer extends clojure.lang.AFunction {
 static {
 }
 public core_chunk_buffer() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object capacity1) {
  return new clojure.lang.ChunkBuffer((int)RT.intCast(capacity1));
 }
}
