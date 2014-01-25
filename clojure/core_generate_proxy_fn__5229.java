package clojure;

import clojure.lang.*;

public final class core_generate_proxy_fn__5229 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
 }
 Object pclasses38;
 public core_generate_proxy_fn__5229(final Object pclasses38) {
  super();
  this.pclasses38 = pclasses38;
 }
 public java.lang.Object invoke(java.lang.Object p1__5195_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(Reflector.invokeNoArgInstanceMember(((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)this.pclasses38), (int)RT.intCast(p1__5195_SHARP_1))), "getCanonicalName"), " p", p1__5195_SHARP_1);
 }
}
