package clojure;

import clojure.lang.*;

public final class core_generate_proxy_to_types__5205 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final java.lang.Object const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "into-array");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "make-array");
  const__5 = (java.lang.Object)clojure.asm.Type.class;
  const__6 = (java.lang.Object)0L;
 }
 Object totype14;
 public core_generate_proxy_to_types__5205(final Object totype14) {
  super();
  this.totype14 = totype14;
 }
 public java.lang.Object invoke(java.lang.Object cs1) {
  if (clojure.lang.Numbers.isPos((long)clojure.lang.RT.count(((java.lang.Object)cs1)))) {
   return ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(this.totype14, cs1));
  } else {
   return ((IFn)const__4.getRawRoot()).invoke(const__5, const__6);
  }
 }
}
