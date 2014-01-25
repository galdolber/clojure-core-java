package clojure;

import clojure.lang.*;

public final class core_boolean extends clojure.lang.AFunction {
 static {
 }
 public core_boolean() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return (clojure.lang.RT.booleanCast(((java.lang.Object)x1)) ? Boolean.TRUE : Boolean.FALSE);
 }
}
