package clojure;

import clojure.lang.*;

public final class core_generate_class_fn__5620 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 Object pclasses91;
 Object gen97;
 public core_generate_class_fn__5620(final Object pclasses91, final Object gen97) {
  super();
  this.pclasses91 = pclasses91;
  this.gen97 = gen97;
 }
 public java.lang.Object invoke(java.lang.Object p1__5552_SHARP_1) {
  ((clojure.asm.commons.GeneratorAdapter)this.gen97).loadArg((int)RT.intCast(p1__5552_SHARP_1));
  return ((java.lang.String)clojure.lang.Compiler.HostExpr.emitBoxReturn((clojure.lang.Compiler.ObjExpr)((clojure.lang.Compiler.ObjExpr)null), (clojure.asm.commons.GeneratorAdapter)((clojure.asm.commons.GeneratorAdapter)this.gen97), (java.lang.Class)((java.lang.Class)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)this.pclasses91), (int)RT.intCast(p1__5552_SHARP_1)))), (java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke("p", p1__5552_SHARP_1))));
 }
}
