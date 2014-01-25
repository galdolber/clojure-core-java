package clojure;

import clojure.lang.*;

public final class core_generate_interface_fn__5724 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "asm-type");
 }
 public core_generate_interface_fn__5724() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__5718_SHARP_1) {
  return ((java.lang.String)((clojure.asm.Type)((IFn)const__0.getRawRoot()).invoke(p1__5718_SHARP_1)).getInternalName());
 }
}
