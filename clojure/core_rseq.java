package clojure;

import clojure.lang.*;

public final class core_rseq extends clojure.lang.AFunction {
 static {
 }
 public core_rseq() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object rev1) {
  return ((clojure.lang.ISeq)((clojure.lang.Reversible)rev1).rseq());
 }
}
