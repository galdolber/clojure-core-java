package clojure;

import clojure.lang.*;

public final class core_chunk_cons extends clojure.lang.AFunction {
 static {
 }
 public core_chunk_cons() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object chunk1, java.lang.Object rest2) {
  if (clojure.lang.Numbers.isZero((long)clojure.lang.RT.count(((java.lang.Object)chunk1)))) {
   return rest2;
  } else {
   return new clojure.lang.ChunkedCons((clojure.lang.IChunk)((clojure.lang.IChunk)chunk1), (clojure.lang.ISeq)((clojure.lang.ISeq)rest2));
  }
 }
}
