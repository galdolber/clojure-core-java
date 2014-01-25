package clojure;

import clojure.lang.*;

public final class core_generate_class_fn__5684 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
 }
 Object pclasses181;
 public core_generate_class_fn__5684(final Object pclasses181) {
  super();
  this.pclasses181 = pclasses181;
 }
 public java.lang.Object invoke(java.lang.Object p1__5560_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)this.pclasses181), (int)RT.intCast(p1__5560_SHARP_1)))))), " p", p1__5560_SHARP_1);
 }
}
