package clojure;

import clojure.lang.*;

public final class core_generate_class_emit_forwarding_method__5594_fn__5599 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 Object pclasses9;
 Object gen15;
 public core_generate_class_emit_forwarding_method__5594_fn__5599(final Object pclasses9, final Object gen15) {
  super();
  this.pclasses9 = pclasses9;
  this.gen15 = gen15;
 }
 public java.lang.Object invoke(java.lang.Object p1__5549_SHARP_1) {
  ((clojure.asm.commons.GeneratorAdapter)this.gen15).loadArg((int)RT.intCast(p1__5549_SHARP_1));
  return ((java.lang.String)clojure.lang.Compiler.HostExpr.emitBoxReturn((clojure.lang.Compiler.ObjExpr)((clojure.lang.Compiler.ObjExpr)null), (clojure.asm.commons.GeneratorAdapter)((clojure.asm.commons.GeneratorAdapter)this.gen15), (java.lang.Class)((java.lang.Class)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)this.pclasses9), (int)RT.intCast(p1__5549_SHARP_1)))), (java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke("p", p1__5549_SHARP_1))));
 }
}
