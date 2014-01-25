package clojure;

import clojure.lang.*;

public final class core_aclone extends clojure.lang.AFunction {
 static {
 }
 public core_aclone() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object array1) {
  return Reflector.invokeStaticMethod(clojure.lang.RT.class, "aclone", new Object[]{array1});
 }
}
