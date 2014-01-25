package clojure;

import clojure.lang.*;

public final class core_generate_class_fn__5622 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 Object super_pclasses92;
 Object rt_type48;
 int local104;
 Object nth_method103;
 Object gen97;
 public core_generate_class_fn__5622(final Object super_pclasses92, final Object rt_type48, final int local104, final Object nth_method103, final Object gen97) {
  super();
  this.super_pclasses92 = super_pclasses92;
  this.rt_type48 = rt_type48;
  this.local104 = local104;
  this.nth_method103 = nth_method103;
  this.gen97 = gen97;
 }
 public java.lang.Object invoke(java.lang.Object p1__5553_SHARP_1) {
  ((clojure.asm.commons.GeneratorAdapter)this.gen97).loadLocal((int)local104);
  ((clojure.asm.commons.GeneratorAdapter)this.gen97).push((int)clojure.lang.RT.intCast(((java.lang.Object)p1__5553_SHARP_1)));
  ((clojure.asm.commons.GeneratorAdapter)this.gen97).invokeStatic((clojure.asm.Type)((clojure.asm.Type)this.rt_type48), (clojure.asm.commons.Method)((clojure.asm.commons.Method)this.nth_method103));
  return ((java.lang.String)clojure.lang.Compiler.HostExpr.emitUnboxArg((clojure.lang.Compiler.ObjExpr)((clojure.lang.Compiler.ObjExpr)null), (clojure.asm.commons.GeneratorAdapter)((clojure.asm.commons.GeneratorAdapter)this.gen97), (java.lang.Class)((java.lang.Class)((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)this.super_pclasses92), (int)RT.intCast(p1__5553_SHARP_1)))), (java.lang.String)((java.lang.String)((IFn)const__2.getRawRoot()).invoke("RT.nth(", "found", ", ", p1__5553_SHARP_1, ")"))));
 }
}
