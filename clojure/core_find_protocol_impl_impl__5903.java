package clojure;

import clojure.lang.*;

public final class core_find_protocol_impl_impl__5903 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "impls");
 }
 Object protocol1;
 public core_find_protocol_impl_impl__5903(final Object protocol1) {
  super();
  this.protocol1 = protocol1;
 }
 public java.lang.Object invoke(java.lang.Object p1__5902_SHARP_1) {
  return ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)RT.get(this.protocol1, Keyword.intern(null, "impls"))), ((java.lang.Object)p1__5902_SHARP_1)));
 }
}
