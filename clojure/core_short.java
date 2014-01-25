package clojure;

import clojure.lang.*;

public final class core_short extends clojure.lang.AFunction {
 static {
 }
 public core_short() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Short.valueOf(clojure.lang.RT.shortCast(((java.lang.Object)x1)));
 }
}
