package clojure;

import clojure.lang.*;

public final class core_byte extends clojure.lang.AFunction {
 static {
 }
 public core_byte() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return Byte.valueOf(clojure.lang.RT.byteCast(((java.lang.Object)x1)));
 }
}
