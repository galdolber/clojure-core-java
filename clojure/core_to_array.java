package clojure;

import clojure.lang.*;

public final class core_to_array extends clojure.lang.AFunction {
 static {
 }
 public core_to_array() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  return ((java.lang.Object[])clojure.lang.RT.toArray(((java.lang.Object)coll1)));
 }
}
