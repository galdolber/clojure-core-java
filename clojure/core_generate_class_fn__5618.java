package clojure;

import clojure.lang.*;

public final class core_generate_class_fn__5618 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
 }
 Object pclasses91;
 public core_generate_class_fn__5618(final Object pclasses91) {
  super();
  this.pclasses91 = pclasses91;
 }
 public java.lang.Object invoke(java.lang.Object p1__5551_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)this.pclasses91), (int)RT.intCast(p1__5551_SHARP_1)))))), " p", p1__5551_SHARP_1);
 }
}
