package clojure;

import clojure.lang.*;

public final class core_generate_interface_fn__5734 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
 }
 Object pclasses33;
 public core_generate_interface_fn__5734(final Object pclasses33) {
  super();
  this.pclasses33 = pclasses33;
 }
 public java.lang.Object invoke(java.lang.Object p1__5719_SHARP_1) {
  Object __r3678 = null;
  {
   Object c2 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)this.pclasses33), (int)RT.intCast(p1__5719_SHARP_1)));
   __r3678 = ((java.lang.String)clojure.lang.Compiler.HostExpr.tagToCanonical(((java.lang.Object)c2)));
  }
  return ((IFn)const__0.getRawRoot()).invoke(__r3678, " p", p1__5719_SHARP_1);
 }
}
