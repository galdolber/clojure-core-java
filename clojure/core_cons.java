package clojure;

import clojure.lang.*;

public final class core_cons extends clojure.lang.AFunction {
 static {
 }
 public core_cons() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object seq2) {
  return ((clojure.lang.ISeq)clojure.lang.RT.cons(((java.lang.Object)x1), ((java.lang.Object)seq2)));
 }
}
