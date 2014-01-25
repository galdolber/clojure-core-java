package clojure;

import clojure.lang.*;

public final class core_peek extends clojure.lang.AFunction {
 static {
 }
 public core_peek() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  return ((java.lang.Object)clojure.lang.RT.peek(((java.lang.Object)coll1)));
 }
}
