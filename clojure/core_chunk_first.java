package clojure;

import clojure.lang.*;

public final class core_chunk_first extends clojure.lang.AFunction {
 static {
 }
 public core_chunk_first() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return ((clojure.lang.IChunk)((clojure.lang.IChunkedSeq)s1).chunkedFirst());
 }
}
