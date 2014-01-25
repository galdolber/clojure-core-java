package clojure;

import clojure.lang.*;

public final class core_alength extends clojure.lang.AFunction {
 static {
 }
 public core_alength() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object array1) {
  return Reflector.invokeStaticMethod(clojure.lang.RT.class, "alength", new Object[]{array1});
 }
}
