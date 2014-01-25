package clojure;

import clojure.lang.*;

public final class core_find_protocol_method extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "find-protocol-impl");
 }
 public core_find_protocol_method() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object protocol1, java.lang.Object methodk2, java.lang.Object x3) {
  return ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(protocol1, x3)), ((java.lang.Object)methodk2)));
 }
}
