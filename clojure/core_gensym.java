package clojure;

import clojure.lang.*;

public final class core_gensym extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "gensym");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public core_gensym() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object prefix_string1) {
  return ((clojure.lang.Symbol)clojure.lang.Symbol.intern((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(prefix_string1, ((IFn)const__1.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.nextID()))))));
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke("G__");
 }
}
