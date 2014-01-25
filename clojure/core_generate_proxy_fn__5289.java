package clojure;

import clojure.lang.*;

public final class core_generate_proxy_fn__5289 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "interpose");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "range");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "count");
 }
 Object super_type16;
 Object meth94;
 public core_generate_proxy_fn__5289(final Object super_type16, final Object meth94) {
  super();
  this.super_type16 = super_type16;
  this.meth94 = meth94;
 }
 public java.lang.Object invoke(java.lang.Object gen1, java.lang.Object m2) {
  ((clojure.asm.commons.GeneratorAdapter)gen1).loadThis();
  ((clojure.asm.commons.GeneratorAdapter)gen1).loadArgs();
  clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke("return ", "super.", ((java.lang.String)((java.lang.reflect.Method)this.meth94).getName()), "(", ((IFn)const__1.getRawRoot()).invoke(const__0.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(", ", ((IFn)const__3.getRawRoot()).invoke(new clojure.core_generate_proxy_fn__5289_fn__5290(), ((IFn)const__4.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)((java.lang.Class[])((java.lang.reflect.Method)this.meth94).getParameterTypes())))))))), ");")));
  ((clojure.asm.MethodAdapter)gen1).visitMethodInsn((int)clojure.asm.Opcodes.INVOKESPECIAL, (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.Type)this.super_type16).getInternalName())), (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.commons.Method)m2).getName())), (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.commons.Method)m2).getDescriptor())));
  return null;
 }
}
