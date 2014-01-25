package clojure;

import clojure.lang.*;

public final class core_chunk_rest extends clojure.lang.AFunction {
 static {
 }
 public core_chunk_rest() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return ((clojure.lang.ISeq)((clojure.lang.IChunkedSeq)s1).chunkedMore());
 }
}
