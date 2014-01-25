package clojure;

import clojure.lang.*;

public final class core_chunk_append extends clojure.lang.AFunction {
 static {
 }
 public core_chunk_append() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object b1, java.lang.Object x2) {
  ((clojure.lang.ChunkBuffer)b1).add(((java.lang.Object)x2));
  return null;
 }
}
