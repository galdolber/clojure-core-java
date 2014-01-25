package clojure;

import clojure.lang.*;

public final class core_chunk extends clojure.lang.AFunction {
 static {
 }
 public core_chunk() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object b1) {
  return ((clojure.lang.IChunk)((clojure.lang.ChunkBuffer)b1).chunk());
 }
}
