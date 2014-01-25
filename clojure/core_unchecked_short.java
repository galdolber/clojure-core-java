package clojure;

import clojure.lang.*;

public final class core_unchecked_short extends clojure.lang.AFunction {
 static {
 }
 public core_unchecked_short() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Short.valueOf(clojure.lang.RT.uncheckedShortCast(((java.lang.Object)x1)));
 }
}
