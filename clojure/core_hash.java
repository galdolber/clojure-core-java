package clojure;

import clojure.lang.*;

public final class core_hash extends clojure.lang.AFunction {
 static {
 }
 public core_hash() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Integer.valueOf(clojure.lang.Util.hasheq(((java.lang.Object)x1)));
 }
}
