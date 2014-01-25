package clojure;

import clojure.lang.*;

public final class core_unchecked_long extends clojure.lang.AFunction {
 static {
 }
 public core_unchecked_long() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Numbers.num(clojure.lang.RT.uncheckedLongCast(((java.lang.Object)x1)));
 }
}
