package clojure;

import clojure.lang.*;

public final class core_generate_class_fn__5637 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 Object nth_method128;
 Object rt_type48;
 Object gen122;
 int local129;
 Object super_pclasses117;
 public core_generate_class_fn__5637(final Object nth_method128, final Object rt_type48, final Object gen122, final int local129, final Object super_pclasses117) {
  super();
  this.nth_method128 = nth_method128;
  this.rt_type48 = rt_type48;
  this.gen122 = gen122;
  this.local129 = local129;
  this.super_pclasses117 = super_pclasses117;
 }
 public java.lang.Object invoke(java.lang.Object p1__5553_SHARP_1) {
  ((clojure.asm.commons.GeneratorAdapter)this.gen122).loadLocal((int)local129);
  ((clojure.asm.commons.GeneratorAdapter)this.gen122).push((int)clojure.lang.RT.intCast(((java.lang.Object)p1__5553_SHARP_1)));
  ((clojure.asm.commons.GeneratorAdapter)this.gen122).invokeStatic((clojure.asm.Type)((clojure.asm.Type)this.rt_type48), (clojure.asm.commons.Method)((clojure.asm.commons.Method)this.nth_method128));
  return ((java.lang.String)clojure.lang.Compiler.HostExpr.emitUnboxArg((clojure.lang.Compiler.ObjExpr)((clojure.lang.Compiler.ObjExpr)null), (clojure.asm.commons.GeneratorAdapter)((clojure.asm.commons.GeneratorAdapter)this.gen122), (java.lang.Class)((java.lang.Class)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)this.super_pclasses117), (int)RT.intCast(p1__5553_SHARP_1)))), (java.lang.String)((java.lang.String)((IFn)const__2.getRawRoot()).invoke("RT.nth(", "found", ", ", p1__5553_SHARP_1, ")"))));
 }
}
