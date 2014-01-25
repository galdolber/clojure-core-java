package clojure;

import clojure.lang.*;

public final class core_generate_class_emit_forwarding_method__5594_fn__5595 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
 }
 Object pclasses9;
 public core_generate_class_emit_forwarding_method__5594_fn__5595(final Object pclasses9) {
  super();
  this.pclasses9 = pclasses9;
 }
 public java.lang.Object invoke(java.lang.Object p1__5547_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(((java.lang.String)clojure.lang.Compiler.printClass(((java.lang.Object)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)this.pclasses9), (int)RT.intCast(p1__5547_SHARP_1)))))), " p", p1__5547_SHARP_1);
 }
}
