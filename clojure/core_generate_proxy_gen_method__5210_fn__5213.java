package clojure;

import clojure.lang.*;

public final class core_generate_proxy_gen_method__5210_fn__5213 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
 }
 Object pclasses3;
 public core_generate_proxy_gen_method__5210_fn__5213(final Object pclasses3) {
  super();
  this.pclasses3 = pclasses3;
 }
 public java.lang.Object invoke(java.lang.Object p1__5192_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(Reflector.invokeNoArgInstanceMember(((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)this.pclasses3), (int)RT.intCast(p1__5192_SHARP_1))), "getCanonicalName"), " p", p1__5192_SHARP_1);
 }
}
