package clojure;

import clojure.lang.*;

public final class core_hash_combine extends clojure.lang.AFunction {
 static {
 }
 public core_hash_combine() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object y2) {
  return Integer.valueOf(clojure.lang.Util.hashCombine((int)RT.intCast(x1), (int)clojure.lang.Util.hash(((java.lang.Object)y2))));
 }
}
