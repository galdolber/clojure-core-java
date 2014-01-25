package clojure;

import clojure.lang.*;

public final class core_count extends clojure.lang.AFunction {
 static {
 }
 public core_count() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  return Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)coll1)));
 }
}
