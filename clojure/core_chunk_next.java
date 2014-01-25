package clojure;

import clojure.lang.*;

public final class core_chunk_next extends clojure.lang.AFunction {
 static {
 }
 public core_chunk_next() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return ((clojure.lang.ISeq)((clojure.lang.IChunkedSeq)s1).chunkedNext());
 }
}
