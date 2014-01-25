package clojure;

import clojure.lang.*;

public final class core_generate_proxy_fn__5293 extends clojure.lang.AFunction {
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
 Object meth98;
 Object super_type16;
 public core_generate_proxy_fn__5293(final Object meth98, final Object super_type16) {
  super();
  this.meth98 = meth98;
  this.super_type16 = super_type16;
 }
 public java.lang.Object invoke(java.lang.Object gen1, java.lang.Object m2) {
  ((clojure.asm.commons.GeneratorAdapter)gen1).loadThis();
  ((clojure.asm.commons.GeneratorAdapter)gen1).loadArgs();
  clojure.lang.Compiler.emitSource((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke("return ", "super.", ((java.lang.String)((java.lang.reflect.Method)this.meth98).getName()), "(", ((IFn)const__1.getRawRoot()).invoke(const__0.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(", ", ((IFn)const__3.getRawRoot()).invoke(new clojure.core_generate_proxy_fn__5293_fn__5294(), ((IFn)const__4.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)((java.lang.Class[])((java.lang.reflect.Method)this.meth98).getParameterTypes())))))))), ");")));
  ((clojure.asm.MethodAdapter)gen1).visitMethodInsn((int)clojure.asm.Opcodes.INVOKESPECIAL, (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.Type)this.super_type16).getInternalName())), (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.commons.Method)m2).getName())), (java.lang.String)((java.lang.String)((java.lang.String)((clojure.asm.commons.Method)m2).getDescriptor())));
  return null;
 }
}
