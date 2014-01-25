package clojure;

import clojure.lang.*;

public final class core_long extends clojure.lang.AFunction {
 static {
 }
 public core_long() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Numbers.num(clojure.lang.RT.longCast(((java.lang.Object)x1)));
 }
}
