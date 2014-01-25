package clojure;

import clojure.lang.*;

public final class pprint_compile_raw_string_fn__8168 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print");
 }
 Object s1;
 public pprint_compile_raw_string_fn__8168(final Object s1) {
  super();
  this.s1 = s1;
 }
 public java.lang.Object invoke(java.lang.Object _1, java.lang.Object a2, java.lang.Object _3) {
  ((IFn)const__0.getRawRoot()).invoke(this.s1);
  return a2;
 }
}
