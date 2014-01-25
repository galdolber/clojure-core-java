package clojure;

import clojure.lang.*;

public final class core_iterator_seq extends clojure.lang.AFunction {
 static {
 }
 public core_iterator_seq() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object iter1) {
  return ((clojure.lang.IteratorSeq)clojure.lang.IteratorSeq.create((java.util.Iterator)((java.util.Iterator)iter1)));
 }
}
